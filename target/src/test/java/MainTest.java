import org.example.entity.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {

    Task task1;
    Task task2;
    Task task3;
    TaskData taskData;
    Set<Task> taskSet1;
    Set<Task> taskSet2;
    Set<Task> taskSet3;

    @BeforeEach
    void setUp() {
        task1 = new Task("Java Collections", "Write List Interface",
                        "Ann", Priority.LOW, Status.IN_QUEUE);
        task2 = new Task("Java Collections", "Write Set Interface",
                        "Ann", Priority.MED, Status.ASSIGNED);
        task3 = new Task("Java Collections", "Write Map Interface",
                        "Bob", Priority.HIGH, Status.IN_QUEUE);

        taskSet1 = new HashSet<>();
        taskSet1.add(task1);

        taskSet2 = new HashSet<>();
        taskSet2.add(task2);

        taskSet3 = new HashSet<>();
        taskSet3.add(task3);

        taskData = new TaskData(taskSet1, taskSet2, taskSet3, new HashSet<>());
    }

    @DisplayName("Task sınıfı doğru access modifiers sahip mi")
    @Test
    public void testTaskAccessModifiers() throws NoSuchFieldException {
        assertEquals(Modifier.PRIVATE, task1.getClass().getDeclaredField("assignee").getModifiers());
        assertEquals(Modifier.PRIVATE, task1.getClass().getDeclaredField("description").getModifiers());
        assertEquals(Modifier.PRIVATE, task1.getClass().getDeclaredField("project").getModifiers());
        assertEquals(Modifier.PRIVATE, task1.getClass().getDeclaredField("priority").getModifiers());
        assertEquals(Modifier.PRIVATE, task1.getClass().getDeclaredField("status").getModifiers());
    }

    @DisplayName("TaskData getUnion method doğru çalışıyor mu ?")
    @Test
    public void testGetUnionMethod() {
        Set<Task> totals = taskData.getUnion(taskSet1, taskSet2);
        assertEquals(2, totals.size());
    }

    @DisplayName("TaskData getIntersection() method doğru çalışıyor mu ?")
    @Test
    public void testGetIntersectMethod() {
        Set<Task> taskSet = new HashSet<>(Set.of(task1, task2));
        Set<Task> taskSet2 = new HashSet<>(Set.of(task2));

        Set<Task> intersections = taskData.getIntersection(taskSet, taskSet2);
        assertEquals(1, intersections.size());
        assertEquals(task2, intersections.iterator().next());
    }

    @DisplayName("TaskData getDifference() method doğru çalışıyor mu ?")
    @Test
    public void testGetDifferenceMethod() {
        Set<Task> taskSet = new HashSet<>(Set.of(task1, task2));
        Set<Task> taskSet2 = new HashSet<>(Set.of(task2));

        Set<Task> differences = taskData.getDifference(taskSet, taskSet2);
        assertEquals(1, differences.size());
        assertEquals(task1, differences.iterator().next());
    }

    @DisplayName("findUniqueWords doğru çalışıyor mu ?")
    @Test
    public void testFindUniqueWordsMethod() {
        assertEquals(143, StringSet.findUniqueWords().size());

        List<String> results = StringSet.findUniqueWords().stream().collect(Collectors.toList());
        assertEquals("a", results.get(0));
        assertEquals("wrote", results.get(results.size() - 1));
    }
}

#  Java Sets

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

### 1-)Set Challenge

 * org.example.entity paketi altında İki tane sınıfımız olucak. ```Task``` ve ```TaskData```
 * ```Task``` sınıfı içerisinde 5 tane ```instance variable``` olmalı. ```project``` => string ```description``` => string ```assignee``` => string
 * ```priority``` org.example.entity paketi altında Priority şeklinde bir Enum tipinde olmalı. Priority{HIGH, MED, LOW} şeklinde oluşturabilirsiniz.
 * ```status``` org.example.entity paketi altında Status şeklinde bir Enum tipinde olmalı. Status{IN_QUEUE, ASSIGNED, IN_PROGRESS} şeklinde oluşturabilirsiniz.
 * Task'ın eşsizliğini ```project``` ve ```description``` değerleri birlikte belirler.
 * TaskData sınıfı 4 tane değişkene sahip olmalı  ```annsTasks => Set<Task>```   ```bobsTasks => Set<Task>```  ```carolsTasks => Set<Task>``` ```unassignedTasks => Set<Task>``` Bu 4 değerde constructor vasıtasıyla set edilebilmeli.
 * TaskData sınıfı ```getTasks()``` adlı bir metoda sahip olmalı. method parametre olarak bir String almalı. Bu 4 değerden herhangi birini alabilir. ("ann", "bob", "carol", "all") Metodun dönüş değeri ```Set<Task>``` olmalı.
 
### Senaryo

* Şöyle bir senaryomuz var. Sen şirketteki yeni bir yöneticisin ve ekibinde 3 tane çalışanın var.
* Ann, Bob, Carol 3'ü de senin çalışanların.
* Üç yazılımcı da farklı task sahipleri.
* Siz bütün yazılımcılara ellerindeki taskları yollamalarını istediniz.
* Bunlar bir ```set``` içerisinde tutulabilir. Sende bu taskları kendi müdürüne raporluyorsun.

 Müdürüne şu soruların cevabını verebilmelisin:
* Tüm çalışanlarının üzerindeki tasklar nelerdir ?
* Her bir çalışanın üzerindeki tasklar nelerdir ?
* Herhangi bir çalışana atanması yapılmamış olan tasklar nelerdir ?
* Birden fazla çalışana atanmış task var mı ? Varsa bunlar hangileri ?

* Bu görevleri yapabilmek TaskData sınıfı altında aşağıdaki metodları içerisinde aşağıdaki metodları yazmalısın,
* ```getUnion()``` metodu bir set listesi alır ve aldığı tüm set değerlerini union ile birleştirip döner.
* ```getIntersect()``` metodu iki tane set alır ve aralarındaki kesişim kümesini bulup döner.
* ```getDifference()``` metodu iki tane set alır ve ikinci set içerisindeki verileri ilk set içerisindeki verilerden çıkarır.

### 2-) Challenge

* Elimizde aşağıdaki gibi bir text mevcut.
* org.example.entity paketi altında StringSet adında bir sınıf tanımlayın.
* StringSet sınıfı içerisinde ```findUniqueWords()``` adında static bir method tanımlayınız.
* İçerisinde aşağıdaki işlemleri yapmalasınız.
* "Carroll began writing the manuscript of the story the next day, although that earliest version is lost. " +
                "The girls and Carroll took another boat trip a month later, when he elaborated the plot to the story of Alice, " +
                "and in November he began working on the manuscript in earnest. To add the finishing touches he researched " +
                "natural history in connection with the animals presented in the book and then had the book examined " +
                "by other children—particularly those of George MacDonald. Though Carroll did add his own illustrations " +
                "to the original copy, on publication he was advised to find a professional illustrator so the pictures " +
                "were more appealing to its audiences. He subsequently approached John Tenniel to reinterpret " +
                "Carroll's visions through his own artistic eye, telling him that the story had been well liked by the" +
                " children.\n" +
                "\n" +
                "Carroll began planning a print edition of the Alice story in 1863. " +
                "He wrote on 9 May 1863 that MacDonald's family had suggested he publish Alice." +
                " A diary entry for 2 July says that he received a specimen page of the print edition around that date. " +
                "On 26 November 1864, Carroll gave Alice the manuscript of Alice's Adventures Under Ground, with illustrations " +
                "by Carroll, dedicating it as a Christmas Gift to a Dear Child in Memory of a Summer's Day." +
                " The published version of Alice's Adventures in Wonderland is about twice the length of " +
                "Alice's Adventures Under Ground and includes episodes, such as the Mad Tea-Party, " +
                "that did not appear in the manuscript. The only known manuscript copy of Under Ground " +
                "is held in the British Library. Macmillan published a facsimile of the manuscript in 1886."
  
* İlgili texti bir String değişkenine atayınız
* String içerisindeki ```.,!,?"``` karakterlerini temizleyiniz.
* İstenen text içerisindeki unique kelime sayısını bulmanızdır.
* Daha sonrasında bu unique kelimeleri alfabetik şekilde sıralanacak biçimde return ediniz.
  

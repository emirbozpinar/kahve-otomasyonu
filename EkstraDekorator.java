package KahvePackage;

//Ekstra Eklentiler İçin Dekoratör Sınıfı
abstract class EkstraDekorator extends Kahve { //EkstraDekorator sınıfı, Kahve sınıfını genişleten soyut bir sınıftır.
	//Dekoratör Tasarım Deseni: Bu sınıf, kahveye ekstra özellikler eklemek için bir temel sağlar.
	//Örneğin, laktozsuz süt veya ekstra shot gibi eklemeler bu sınıfı kullanarak gerçekleştirilir.

 protected Kahve kahve;//Ekstra özelliklerin temel kahve üzerinde uygulanabilmesi için bir Kahve nesnesi referansı saklanır.
 //Bu, dekoratörlerin mevcut bir kahveye özellik eklemesine olanak tanır.
}
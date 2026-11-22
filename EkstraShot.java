package KahvePackage;

//Belirli Ekstra Sınıflar
class EkstraShot extends EkstraDekorator {//EkstraShot, EkstraDekorator adlı bir üst sınıftan türemiştir.
	//Bu, Ekstra Shot nesnesinin, EkstraDekorator sınıfında tanımlanan davranışları genişlettiği anlamına gelir.
	//Bu yapı, Decorator Pattern'in bir parçasıdır.

 public EkstraShot(Kahve kahve) {//EkstraShot sınıfı, bir Kahve nesnesi alarak oluşturulur.
     this.kahve = kahve;//this.kahve = kahve; ile temel kahve nesnesi, Ekstra Shot dekorasyonuna bağlanır.
     
 //    Bu, temel kahve üzerine ekstra özellikler eklemek için bir başlangıç noktası oluşturur.

 }

 @Override
 public String getTanim() {//kahve.getTanim(): Temel kahvenin mevcut açıklamasını alır.
	
	 
     return kahve.getTanim() + ", Ekstra Shot";  //+ ", Ekstra Shot": Bu açıklamaya "Ekstra Shot" ekler.
     //Örnek:Kahve açıklaması "Americano" ise, sonuç "Americano, Ekstra Shot" olur.
 }

 @Override
 public double fiyat() {
     return kahve.fiyat() + 15.0;//kahve.fiyat(): Temel kahvenin fiyatını alır.
     //+ 15.0: Kahve fiyatına sabit bir ekstra shot ücreti ekler.
 }
}

package KahvePackage;

//Kahve Türleri Sınıfları
class Espresso extends Kahve {//Espresso sınıfı, Kahve sınıfından türetilmiştir.
	//Bu, kalıtım (inheritance) kullanılarak Kahve sınıfının temel özelliklerini devralır.

 public Espresso() {// Espresso nesnesi oluşturulduğunda, tanim değişkeni "Espresso" değeriyle başlatılır.

     tanim = "Espresso";
 }
 
 @Override//@Override: Kahve sınıfındaki fiyat() metodunu geçersiz kılar ve Espresso'nun fiyatını 70 TL olarak belirler.
 //Polimorfizm: Farklı kahve türleri için farklı fiyatların dinamik olarak tanımlanmasını sağlar.
 public double fiyat() {
     return 70.0;
 }
}
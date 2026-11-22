package KahvePackage;

class Americano extends Kahve {//Americano sınıfı, Kahve sınıfından türetilmiştir (kalıtım kullanılmıştır).
	//Kalıtım: Americano, Kahve sınıfının özelliklerini devralarak kendine özgü özellikler ekler.

    public Americano() {
        tanim = "americano";// tanim, Americano kahvesini tanımlamak için "americano" değerine atanmıştır.
        //Bu, sipariş detaylarında kahvenin ismini belirlemek için kullanılır.

    }
  
    
    @Override
    public double fiyat() {//@Override: Kahve sınıfındaki fiyat() metodunu geçersiz kılar ve Americano'nun fiyatını 80 TL olarak belirler.
    //	Polimorfizm: Bu metod sayesinde her kahve türü için farklı fiyatlar tanımlanabilir.
        return 80.0;
    }
}
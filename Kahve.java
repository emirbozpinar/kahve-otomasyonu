package KahvePackage;//Bu satır, Kahve sınıfının proje1deneme adlı bir pakete ait olduğunu belirtir. Paketler, projenin düzenlenmesi
//ve sınıfların organize edilmesi için kullanılır.


abstract class Kahve {//Kahve, soyut (abstract) bir sınıftır.
	//Bu sınıf, türetilen alt sınıflar için temel bir çerçeve sağlar.
	//Kahve türlerini (örneğin, Espresso, Americano) temsil eden sınıflar, bu sınıftan türetilir.

    protected String tanim = "Bilinmeyen Kahve";// Bu alan, bu sınıftan türeyen alt sınıflar tarafından erişilebilir, ancak dışarıdan erişim yasaktır.

    
    public String getTanim() {//Bu metot, kahve nesnesinin açıklamasını döner.
    	//Alt sınıflar, tanim alanını değiştirerek farklı kahve türleri için özelleştirme yapabilir.

        return tanim;
    }
    
    public abstract double fiyat();//fiyat() soyut bir metottur ve bir gövdesi yoktur.
   // Bu metot, alt sınıflarda uygulanmak zorundadır.
  //  Her kahve türünün kendine özgü bir fiyat hesaplaması olması beklenir.
}

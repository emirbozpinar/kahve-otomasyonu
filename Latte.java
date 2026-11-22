package KahvePackage;

class Latte extends Kahve {//Latte sınıfı, Kahve adlı bir üst sınıftan türetilmiştir. Bu, kalıtım (inheritance) kullanılarak oluşturulmuş bir yapı.
	//Latte, bir kahve türünü temsil eder ve Kahve sınıfından belirli özellikleri veya metotları miras alır.

    public Latte() {//Bu, Latte sınıfının yapıcı metodudur. Nesne oluşturulurken çağrılır.

        tanim = "Latte";
      //  tanim değişkenine "Latte" değeri atanıyor. Bu değişken Kahve sınıfında tanımlıdır ve kahve türünün açıklaması olarak kullanılır.
    }
    
    @Override //Bu anotasyon, metot geçersiz kılma işlemini açıkça belirtir ve derleme sırasında kontrol yapılır.
  
    public double fiyat() {//fiyat() metodu, Kahve sınıfında tanımlı bir metodu geçersiz kılar (override)
    	//Bu metodun amacı, Latte kahvesinin fiyatını belirtmektir. Dönen değer sabittir
        return 90.0;
    }
}

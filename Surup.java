package KahvePackage;

class Surup extends EkstraDekorator {//Surup, EkstraDekorator adlı bir üst sınıfı genişletir. {
    private String tat;

    public Surup(Kahve kahve, String tat) //tat, şurubun türünü tutan bir metin (string) değişkendir.
 {
        this.kahve = kahve;
        this.tat = tat; 
        //Surup sınıfı, iki parametre alarak oluşturulur:
        //kahve: Üzerine şurup eklenecek kahve nesnesi.
        //tat: Şurubun türünü belirleyen bir string.
       

    }

    @Override
    public String getTanim() {
        return kahve.getTanim() + ", " + tat + " Şurubu"; 
        //Kahve nesnesinin mevcut tanımını alır (kahve.getTanim()).
        //Üzerine şurubun tat türünü ekler (tat + " Şurubu").
    }

    @Override
    public double fiyat() {
        return kahve.fiyat() + 15.0;
    } //Mevcut kahve fiyatını alır (kahve.fiyat()).
      // Sabit bir şurup fiyatı olan 15.0 ekler.
}
package KahvePackage;

// LaktozsuzSut sinifi, kahvelere laktozsuz süt ekleyen bir dekoratördür.
class LaktozsuzSut extends EkstraDekorator {
    
    // LaktozsuzSut nesnesi, bir Kahve nesnesi alarak dekorasyon yapar.
    public LaktozsuzSut(Kahve kahve) {
        this.kahve = kahve; // Kahve nesnesini saklar.
    }

    @Override
    public String getTanim() {
        // Kahvenin mevcut tanımına "Laktozsuz Süt" ifadesini ekler.
        return kahve.getTanim() + ", Laktozsuz Süt";
    }

    @Override
    public double fiyat() {
        // Kahvenin mevcut fiyatına laktozsuz süt için 15.0 TL ekler.
        return kahve.fiyat() + 15.0;
    }
}

package KahvePackage;

import javax.swing.*; // Swing bileşenlerini içeren kütüphane
import java.awt.*; // GUI düzeni ve renkler için gerekli kütüphane
import java.awt.event.ActionEvent; // ActionEvent sınıfı için
import java.awt.event.ActionListener; // ActionListener arabirimi için
import java.util.ArrayList; // Liste kullanımı için ArrayList sınıfı

public class GUI {
    private JFrame pencere; // Ana pencere
    private JComboBox<String> kahveSecimi; // Kullanıcının kahve seçimi yapacağı menü
    private JCheckBox ekstraShot; // Ekstra shot seçeneği
    private JCheckBox laktozsuzSut; // Laktozsuz süt seçeneği
    private JCheckBox vanilyaSurubu; // Vanilya şurubu seçeneği
    private JCheckBox karamelSurubu; // Karamel şurubu seçeneği
    private JTextArea siparisDetaylari; // Sipariş detaylarının gösterileceği alan
    private JButton siparisButonu; // Sipariş onaylama butonu
    private JButton kahveEkleButonu; // Kahve ekleme butonu

    private ArrayList<String> siparisler; // Tüm siparişlerin tutulduğu liste
    private ArrayList<Kahve> aktifSiparisKahveleri; // Aktif sipariş için kahve listesi
    private int siparisNumarasi; // Sipariş numarası

    public GUI() {
        kahveDukkaniEkrani();  // Başlangıç ekranını oluşturma çağrısı
    }
    
    private void kahveDukkaniEkrani() {
        // Kahve dükkanı ekranını oluşturur
        pencere = new JFrame("Kahve Dükkanı"); // Pencere başlığı
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Çıkış işlemini tanımlar
        pencere.setSize(600, 400); // Pencere boyutlarını ayarlar
        pencere.setLayout(new BorderLayout()); // Pencere düzenini ayarlar

        siparisler = new ArrayList<>(); // Siparişler listesini başlatır
        aktifSiparisKahveleri = new ArrayList<>(); // Aktif sipariş kahve listesini başlatır
        siparisNumarasi = 1; // Sipariş numarasını başlatır

        // Kahve Seçimi Paneli
        JPanel kahvePanel = new JPanel(); // Yeni panel oluşturur
        kahvePanel.setLayout(new GridLayout(6, 1)); // Panel düzenini ayarlar

        kahveSecimi = new JComboBox<>(new String[]{"Espresso", "Latte", "Americano"}); // Kahve seçeneklerini oluşturur
        ekstraShot = new JCheckBox("Ekstra Shot"); // Ekstra shot seçeneği oluşturur
        laktozsuzSut = new JCheckBox("Laktozsuz Süt"); // Laktozsuz süt seçeneği oluşturur
        vanilyaSurubu = new JCheckBox("Vanilya Şurubu"); // Vanilya şurubu seçeneği oluşturur
        karamelSurubu = new JCheckBox("Karamel Şurubu"); // Karamel şurubu seçeneği oluşturur

        kahvePanel.add(new JLabel("Kahvenizi Seçin:")); // Panelde başlık ekler
        kahvePanel.add(kahveSecimi); // Kahve seçimini panelde gösterir
        kahvePanel.add(ekstraShot); // Ekstra shot seçeneğini ekler
        kahvePanel.add(laktozsuzSut); // Laktozsuz süt seçeneğini ekler
        kahvePanel.add(vanilyaSurubu); // Vanilya şurubu seçeneğini ekler
        kahvePanel.add(karamelSurubu); // Karamel şurubu seçeneğini ekler

        pencere.add(kahvePanel, BorderLayout.CENTER); // Paneli pencerenin ortasına ekler

        // Sipariş Detayları Paneli
        siparisDetaylari = new JTextArea(); // Sipariş detaylarını göstermek için alan oluşturur
        siparisDetaylari.setEditable(false); // Kullanıcı düzenlemesini devre dışı bırakır
        siparisDetaylari.setPreferredSize(new Dimension(250, 400)); // Boyut ayarı
        pencere.add(new JScrollPane(siparisDetaylari), BorderLayout.EAST); // Kaydırma özelliğiyle sağ tarafa ekler

        // Kahve Ekle Butonu
        kahveEkleButonu = new JButton("Kahve Ekle"); // Kahve ekleme butonu oluşturur
        pencere.add(kahveEkleButonu, BorderLayout.NORTH); // Butonu üst tarafa ekler

        // Sipariş Butonu
        siparisButonu = new JButton("Siparişi Onayla"); // Sipariş onaylama butonu oluşturur
        pencere.add(siparisButonu, BorderLayout.SOUTH); // Butonu alt tarafa ekler

        // Kahve Ekleme İşlemi
        kahveEkleButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kahveEkle(); // Kahve ekleme fonksiyonunu çağırır
            }
        });

        // Sipariş Onaylama İşlemi
        siparisButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                siparisiOlustur(); // Sipariş oluşturma fonksiyonunu çağırır
                JOptionPane.showMessageDialog(pencere, "Siparişiniz Alındı!"); // Bilgilendirme mesajı gösterir
                guncelleSiparisDetaylari(); // Sipariş detaylarını günceller
            }
        });

        pencere.setVisible(true); // Pencereyi görünür yapar
    }

    private void kahveEkle() {
        Kahve kahve; // Kahve nesnesi tanımlanır
        switch (kahveSecimi.getSelectedItem().toString()) { // Kullanıcının seçtiği kahveye göre işlem yapar
            case "Espresso":
                kahve = new Espresso(); // Espresso nesnesi oluşturur
                break;
            case "Latte":
                kahve = new Latte(); // Latte nesnesi oluşturur
                break;
            case "Americano":
                kahve = new Americano(); // Americano nesnesi oluşturur
                break;
            default:
                return; // Geçersiz seçimde işlemi sonlandırır
        }

        if (ekstraShot.isSelected()) {
            kahve = new EkstraShot(kahve); // Ekstra shot ekler
        }
        if (laktozsuzSut.isSelected()) {
            kahve = new LaktozsuzSut(kahve); // Laktozsuz süt ekler
        }
        if (vanilyaSurubu.isSelected()) {
            kahve = new Surup(kahve, "Vanilya"); // Vanilya şurubu ekler
        }
        if (karamelSurubu.isSelected()) {
            kahve = new Surup(kahve, "Karamel"); // Karamel şurubu ekler
        }

        aktifSiparisKahveleri.add(kahve); // Kahveyi aktif sipariş listesine ekler
        guncelleSiparisDetaylari(); // Sipariş detaylarını günceller
    }

    private void siparisiOlustur() {
        StringBuilder siparis = new StringBuilder("Sipariş No: " + siparisNumarasi + "\n"); // Sipariş başlığı oluşturur

        double toplamFiyat = 0; // Toplam fiyat değişkeni tanımlanır
        for (Kahve kahve : aktifSiparisKahveleri) { // Her bir kahve için işlem yapar
            siparis.append(kahve.getTanim()).append("\n"); // Kahve tanımını ekler
            toplamFiyat += kahve.fiyat(); // Kahve fiyatını toplar
        }

        siparis.append("Toplam: ").append(toplamFiyat).append(" TL\n"); // Toplam fiyatı siparişe ekler
        siparisler.add(siparis.toString()); // Siparişi listeye ekler
        siparisNumarasi++; // Sipariş numarasını artırır

        aktifSiparisKahveleri.clear(); // Aktif sipariş listesini temizler
        guncelleSiparisDetaylari(); // Sipariş detaylarını günceller
    }

    private void guncelleSiparisDetaylari() {
        StringBuilder detaylar = new StringBuilder("Tüm Siparişler:\n\n"); // Sipariş detaylarını başlatır
        for (String siparis : siparisler) { // Her sipariş için işlem yapar
            detaylar.append(siparis).append("\n"); // Sipariş detaylarını ekler
        }
        siparisDetaylari.setText(detaylar.toString()); // Detayları arayüze yansıtır
    }
}
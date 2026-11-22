package KahvePackage;

import javax.swing.*; // Swing bileşenleri için kütüphane
import java.awt.*; // GUI düzeni ve renkler için gerekli kütüphane
import java.awt.event.ActionEvent; // ActionEvent sınıfı için
import java.awt.event.ActionListener; // ActionListener arabirimi için

public class HoşgeldinizEkrani {
    private JFrame pencere; // Ana pencere

    public HoşgeldinizEkrani() {
        pencere = new JFrame("Kahve Dükkanı"); // Pencere başlığı
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Uygulamadan çıkış için temel ayar
        pencere.setSize(600, 400); // Pencere boyutları
        pencere.setLayout(new BorderLayout()); // Pencere düzeni

        // Hoşgeldiniz Mesajı
        JPanel mesajPaneli = new JPanel(); // Mesaj çin panel oluştur
        JLabel hosgeldinizLabel = new JLabel("Hoşgeldiniz!", SwingConstants.CENTER); // Hoşgeldiniz yazısı
        hosgeldinizLabel.setFont(new Font("Arial", Font.BOLD, 30)); // Yazı tipi ve boyutu
        hosgeldinizLabel.setForeground(new Color(153, 101, 21)); // Kahverengi tonunda renk ayarı
        mesajPaneli.add(hosgeldinizLabel); // Mesajı panele ekle

        // Kahve Fotoğafı
        JPanel logoPaneli = new JPanel(); // Fotoğaf için panel oluştur
        JLabel kahveResimLabel = new JLabel(); // Resim tutucu etiket
        ImageIcon kahveFoto = new ImageIcon("kahve.jpg"); // Fotoğraf proje klasöründe (kahve.jpg)
        Image kahveFotoScaled = kahveFoto.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH); // Fotoğafı boyutlandır
        kahveFoto = new ImageIcon(kahveFotoScaled); // Boyutlandırılmış fotoğafı yeni simgeye ata
        kahveResimLabel.setIcon(kahveFoto); // Resmi etikete ekle
        logoPaneli.add(kahveResimLabel); // Resmi panele ekle

        // Başla Butonu
        JPanel butonPaneli = new JPanel(); // Buton için panel oluştur
        JButton baslaButonu = new JButton("Başla"); // "Başla" butonu oluştur
        baslaButonu.setFont(new Font("Arial", Font.BOLD, 20)); // Buton yazı tipi ve boyutu
        baslaButonu.setBackground(new Color(50, 205, 50)); // Buton arka planı (yeşil ton)
        baslaButonu.setForeground(Color.WHITE); // Yazı rengi beyaz
        baslaButonu.setPreferredSize(new Dimension(150, 50)); // Buton boyutları
        baslaButonu.addActionListener(new ActionListener() { // Tıklama olayını dinlemek için ActionListener ekle
            @Override
            public void actionPerformed(ActionEvent e) {
                pencere.dispose(); // Hoşgeldiniz ekranını kapat
                new GUI(); // Ana menüyü başlat
            }
        });

        butonPaneli.add(baslaButonu); // Butonu panele ekle

        // Hoşgeldiniz ekranı düzenini oluştur
        pencere.add(mesajPaneli, BorderLayout.NORTH); // Mesaj panelini pencerenin üstüne ekle
        pencere.add(logoPaneli, BorderLayout.CENTER); // Resim panelini pencerenin ortasına ekle
        pencere.add(butonPaneli, BorderLayout.SOUTH); // Buton panelini pencerenin altına ekle

        pencere.setVisible(true); // Pencereyi görünür yap
    }

    public static void main(String[] args) {
        // Hoşgeldiniz ekranını başlat
        new HoşgeldinizEkrani(); // Yeni Hoşgeldiniz ekranı nesnesi oluştur
    }
}
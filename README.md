# ☕ Kahve Otomasyonu

Java Swing ile geliştirilmiş, grafik arayüzlü (GUI) bir kahve dükkanı sipariş otomasyonu. Proje, **Decorator (Dekoratör) tasarım deseni** kullanılarak yazılmıştır.

## Özellikler

- Karşılama (hoş geldiniz) ekranı
- Kahve seçimi: **Espresso**, **Americano**, **Latte**
- Ekstralar: **Ekstra Shot**, **Laktozsuz Süt**, **Vanilya Şurubu**, **Karamel Şurubu**
- Bir siparişe birden fazla kahve ekleme
- Sipariş numarası ve toplam fiyatla sipariş detaylarını gösterme

## Tasarım

| Sınıf | Görevi |
|---|---|
| `Kahve` | Tüm kahveler için soyut temel sınıf (`getTanim()`, `fiyat()`) |
| `Espresso`, `Americano`, `Latte` | Somut kahve türleri |
| `EkstraDekorator` | Ekstralar için soyut dekoratör sınıfı |
| `EkstraShot`, `LaktozsuzSut`, `Surup` | Kahveye fiyat ve açıklama ekleyen dekoratörler |
| `GUI` | Sipariş ekranı (Swing) |
| `HoşgeldinizEkrani` | Karşılama ekranı |
| `Main` | Programın giriş noktası |

## Çalıştırma

**Eclipse:** Projeyi `File → Import → Existing Projects into Workspace` ile içe aktarın ve `Main.java` dosyasını çalıştırın.

**Komut satırı (JDK 8+):**

```bash
javac -encoding UTF-8 -d bin *.java
java -cp bin KahvePackage.Main
```

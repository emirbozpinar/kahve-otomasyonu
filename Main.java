package KahvePackage;
public class Main{ //Main sınıfı, programın giriş noktasıdır.
	//public erişim belirteci, bu sınıfın diğer paketlerden erişilebilir olmasını sağlar.

	  public static void main(String[] args) { //main metodu, Java programlarının çalışmaya başladığı yerdir.
		 
	        new GUI(); //  Ana kahve sipariş ekranını başlatır.
	        new HoşgeldinizEkrani(); //  Kullanıcıya karşılama mesajı ve görsel bir arayüz sunar.
	    }
	}

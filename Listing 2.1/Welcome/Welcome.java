//Program untuk menampilkan sapaan
//Nama : Stefanus Rico Pandapotan Situngkir
//NIM : 221511030

public class Welcome {
    public static void main(String[] args) {
            String greeting = "Welcome to Core Java!";
            System.out.println(greeting);
            for(int i = 0; i < greeting.length(); i++)  //menggunakan method length(), untuk menghitung setiap karakter (termasuk spasi) yang terdapat dalam variabel greeting 
                System.out.println("=");
            System.out.println();
    }
}
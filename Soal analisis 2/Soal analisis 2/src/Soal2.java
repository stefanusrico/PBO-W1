//Program Soal Analisis 2
//Nama : Stefanus Rico Pandapotan Situngkir
//NIM : 221511030

public class Soal2 {
    public static void main(String[] args) {
        int i = 42;
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        System.out.println(s);
    }
}
//jika nilai i < 40, maka nilai s menjadi life, jika i tidak kurang dari 40 maka pindah ke pengecekan i>50.
//Jika i benar lebih dari 50 maka nilai s menjadi universe.
//Namun jika nilai i < 40 salah dan i > 50 salah maka nilai s menjadi everything

//output everything
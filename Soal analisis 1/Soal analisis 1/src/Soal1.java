//Program Soal Analisis 1
//Nama : Stefanus Rico Pandapotan Situngkir
//NIM : 221511030

public class Soal1 {
    public static void main(String[] args) {
            byte angka1 = 125;
            byte angka2 = 6;
            byte hasil = (byte) (angka1+angka2); //pada saat operasi penjumlahan angka1+angka2 tipe datanya menjadi integer. Oleh karena itu dicasting kembali ke tipe data byte.
            System.out.println("Hasil 1 "+hasil);
    }
}

//output Hasil 1 -125
//Outputnya adalah -125 karena ketika operasi penjumlahan didapatkan nilainya adalah 131 dalam tipe data integer, namun karena dicasting ke tipe data byte dan tipe data byte hanya dapat menampung dari range -128 sampai 127
//Oleh karena itu ketika hasil dari penjumlahannya 131 sedangkan byte paling besar hanya dapat menampung 127, masih tersisa 4 untuk mencapai 131 maka ambil 1 nilai dari 4 maka akan kembali ke range awal yaitu -128 karena overflow.
//Setelah diperoleh -128 maka sisanya menjadi 3, lalu tambahkan sisanya dengan range awalnya menjadi -128 + 3 yaitu -125.

package calculator;

import java.util.Scanner;

    public class Calculator {
        int angkaawal,angkasecond;
        int SCAN;
        Scanner SCANN = new Scanner (System.in);
      
        
        public static void main(String[] args){
  Calculator RUN = new Calculator();
  RUN.Input();
    }
        public void Input(){
            System.out.print("Masukan angka awal : ");
            angkaawal = SCANN.nextInt();
            System.out.print("Masukan Angka akhir : ");
            angkasecond = SCANN.nextInt();
        Final
        ();
        }
        public void Final(){
            
            kalkuator k = new kalkuator();

            k.setAngka1(angkaawal);
k.setAngka2(angkasecond);

int tambah = k.getAngka1()+k.getAngka2();
int kurang = k.getAngka1()-k.getAngka2();
int kali = k.getAngka1() * k.getAngka2();
int bagi =k.getAngka1() / k.getAngka2();
            System.out.println(" ");
            System.out.println("Hasil Penjumlahan = " + tambah);
            System.out.println("Hasil Pengurangan = " + kurang);
            System.out.println("Hasil Perkalian = " + kali);
            System.out.println("Hasil Pembagian = " + bagi);
        }
    }

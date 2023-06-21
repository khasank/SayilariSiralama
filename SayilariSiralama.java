package Giris;

import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        int a , b , c ; // Değişkenler tanımlanıyor.
        Scanner input = new Scanner(System.in); //Scanner sınıfı değişken tanımlanıyor.

        // Kullanıcıdan sayılar alınıyor.
        System.out.print("1. Sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        b = input.nextInt();
        System.out.print("3. Sayıyı giriniz : ");
        c = input.nextInt();

        // Hesaplama işlemleri yapılıyor.
        if (a > b && a > c ) {
            if (b > c ) {
                System.out.println("Sıralama : " + a + " > "+ b+ " > " + c);
            }else System.out.println("Sıralama : " + a + " > " + c + " > " + b);
        } else if ( b > a && b > c ) {
            if (a > c) {
                System.out.println("Sıralama : " + b + " > " + a + " > "+ c);
            } else System.out.println("Sıralama : " + b + " > " + c + " > " + a);
        } else  {
            if ( a > b ) {
                System.out.println("Sıralamanız : " + c + " > " + a + " > " + b);
            } else System.out.println("Sıralamanız : " + c + " > " + b + " > " + a );
        }
    }
}

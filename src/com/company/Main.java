package com.company;
import java.util.Scanner;

public class Main {

    double harga, totalprice, bayar, kembalian;
    int brg, jumlah;

    double hitungTotal(int jml) {
        jumlah = jml;
        switch (brg) {
            case 0:
                System.exit(0);
                break;
            case 1:
                harga = 42000;
                totalprice = totalprice+(harga*jml);
                break;
            case 2:
                harga = 35000;
                totalprice = totalprice+(harga*jml);
                break;
            case 3:
                harga = 25000;
                totalprice = totalprice+(harga*jml);
                break;
            case 4:
                harga = 30000;
                totalprice = totalprice+(harga*jml);
                break;
            case 5:
                harga = 28000;
                totalprice = totalprice+(harga*jml);
                break;
            case 9:
                break;
            default:
                System.out.println("Error: input yang anda masukkan salah. Mohon diperbaiki! ");
                break;
        }
        return totalprice;
    }

    void viewTotal(){
        System.out.println("\n======(PEMBAYARAN======)");
        System.out.println("Total: Rp" + totalprice);
    }

    double hitungKembalian(double byr){
        bayar = byr;
        kembalian = byr-totalprice;
        return kembalian;
    }

    void viewKembalian(){
        System.out.println("Kembalian: Rp" + kembalian);
        System.out.println("======(SELESAI, TERIMAKASIH SUDAH DATANG======)");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main in = new Main ();
        System.out.println("===================================================================");
        System.out.println("Selamat datang di Zoe's CoffeeBean");
        System.out.println("===================================================================");

        do {
            System.out.println("Daftar Menu: ");
            System.out.println("1. Le Pigeon Burger (Rp 42.000)");
            System.out.println("2. Greek Salad (Rp 35.000)");
            System.out.println("3. Pineapple Lemonade (Rp 25.000)");
            System.out.println("4. Vanilla Latte (Rp 30.000)");
            System.out.println("5. Espresso (Rp 28.000)");
            System.out.println("\n9. Selesai dan Hitung Pesanan");
            System.out.println("0. Keluar Program");
            System.out.println("===================================================================");
            System.out.print("Masukkan nomor menu pesananmu(1/2/3/4/5), jika selesai memesan(9): ");
            in.brg = input.nextInt();
            if(in.brg >= 1 && in.brg <= 5) {
                System.out.print("Masukkan jumlah pesanan yang dibeli: ");
                in.jumlah = input.nextInt();
            }else{
            }
            in.hitungTotal(in.jumlah);
        } while (in.brg!=9);
        in.viewTotal();
        System.out.print("Bayar: Rp");
        in.bayar = input.nextDouble();
        in.hitungKembalian(in.bayar);
        in.viewKembalian();
    }
}

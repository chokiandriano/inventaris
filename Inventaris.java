package inventaris;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Inventaris {

    Scanner run = new Scanner(System.in);
    int semua;

    int[] kodebarang = new int[50];
    int[] harga = new int[50];
    int[] stok = new int[50];
    int[] nilai = new int[50];
    String[] nama = new String[50];

    public Inventaris(){

    }
    public void masukkanData(){
        try{
            for(int i=0;i < semua;i++){
                System.out.println("Produk Nomor"+(i+1));
                System.out.println("Nama Produk \t \ttekan 0 jika tidak jadi : ");

                run.nextLine();
                kodebarang[i]=i+1;
                nama[i] = run.nextLine();

                if (nama[i].equals("0")){
                    break;
                }

                System.out.println("Harga Produk : ");
                harga[i]= run.nextInt();
                System.out.println("Stok Produk : ");
                stok[i]= run.nextInt();
                nilai[i]=stok[i]*harga[i];
            }
        }catch (InputMismatchException e){
            System.out.println("Nomor yang anda masukkan harus angka ");
            run.nextLine();
            menu();
        }
    }
    public void menu(){
        do{
            System.out.println("Masukkan Nomor Produk : ");
            semua = run.nextInt();

            if (semua <= 0){
                System.out.println("Yang Anda Masukkan Lebih dari 0");
            }else {
                masukkanData();
            }
        }while (semua <= 0);
    }
    public void getnilaidata(){
        for (int i =0; i < semua; i++){
            System.out.println("Nomer Produk : "+kodebarang[i]);
            System.out.println("Nama Produk : "+ nama[i]);
            System.out.println("Harga Produk : "+harga[i]);
            System.out.println("Stok Produk : "+stok[i]);
            System.out.println("Nilai Produk : "+nilai[i]);
        }
    }

}

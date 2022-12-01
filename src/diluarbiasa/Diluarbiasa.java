/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diluarbiasa;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Diluarbiasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int satu,dua,tiga,papat,limo;
        System.out.print("Masukkan nilai pertama: ");
        satu = in.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        dua = in.nextInt();
        System.out.print("Masukkan nilai ketiga: ");
        tiga = in.nextInt();
        System.out.print("Masukkan nilai kePAPAT: ");
        papat = in.nextInt();
        System.out.print("Masukkan nilai kelima: ");
        limo = in.nextInt();
        
        if(satu<=60){
            System.out.println("Nilai "+satu+" kurang bang");
        }else if(satu<=70){
            System.out.println("Nilai "+satu+" cukupan");
        }else if(satu<=80){
            System.out.println("Nilai "+satu+" baiklah");
        }else if(satu<=100){
            System.out.println("Nilai "+satu+ " luwar biasa");
        }else{
            System.out.println("Silahkan masukkan nilai dari 1-100");
        }
        if(dua<=60){
            System.out.println("Nilai "+dua+" kurang bang");
        }else if(dua<=70){
            System.out.println("Nilai "+dua+" cukupan");
        }else if(dua<=80){
            System.out.println("Nilai "+dua+" baiklah");
        }else if(dua<=100){
            System.out.println("Nilai "+dua+ " luwar biasa");
        }else{
            System.out.println("Silahkan masukkan nilai dari 1-100");
        }
        if(tiga<=60){
            System.out.println("Nilai "+tiga+" kurang bang");
        }else if(tiga<=70){
            System.out.println("Nilai "+tiga+" cukupan");
        }else if(tiga<=80){
            System.out.println("Nilai "+tiga+" baiklah");
        }else if(tiga<=100){
            System.out.println("Nilai "+tiga+ " luwar biasa");
        }else{
            System.out.println("Silahkan masukkan nilai dari 1-100");
        }
        if(papat<=60){
            System.out.println("Nilai "+papat+" kurang bang");
        }else if(papat<=70){
            System.out.println("Nilai "+papat+" cukupan");
        }else if(papat<=80){
            System.out.println("Nilai "+papat+" baiklah");
        }else if(papat<=100){
            System.out.println("Nilai "+papat+ " luwar biasa");
        }else{
            System.out.println("Silahkan masukkan nilai dari 1-100");
        }
        if(limo<=60){
            System.out.println("Nilai "+limo+" kurang bang");
        }else if(limo<=70){
            System.out.println("Nilai "+limo+" cukupan");
        }else if(limo<=80){
            System.out.println("Nilai "+limo+" baiklah");
        }else if(limo<=100){
            System.out.println("Nilai "+limo+ " luwar biasa");
        }else{
            System.out.println("Silahkan masukkan nilai dari 1-100");
        }
        System.out.println("Sekian dari saya, jika ada salah koding dan semacamnya saya mohon maaf. Terimakasih.");
    }
}
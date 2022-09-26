/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipedata;

import java.util.Scanner;

/**
 *
 * @author M Anhar Tamim
 */
public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int saldo = 100000;
        int jmlUang;

        System.out.println("Selamat Datang di Bank Unan");
        System.out.println("Saldo saat ini: " + "Rp. " + saldo);

        // simpan uang di saldo ++
        System.out.print("Simpan Uang: Rp. ");
        jmlUang = sc.nextInt();
        saldo += jmlUang;
        System.out.println("Saldo saat ini: " + "Rp. " + saldo);

        // ambil uang dari saldo --
        System.out.print("Ambil Uang: Rp. ");
        jmlUang = sc.nextInt();
        saldo -= jmlUang;
        System.out.println("Saldo saat ini: " + "Rp. " + saldo);

    }
}

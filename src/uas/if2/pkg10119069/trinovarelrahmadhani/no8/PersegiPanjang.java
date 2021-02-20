package uas.if2.pkg10119069.trinovarelrahmadhani.no8;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Tanggal  : Sabtu, 20-02-2021
 * No Soal  : 8
 */
public class PersegiPanjang {
    private int luas;
    private final int panjang, lebar;
    
    public PersegiPanjang(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void hitungLuas()
    {
        luas = panjang * lebar;
        
        System.out.println("Luas Persegi Panjang : " + luas);
    }
}

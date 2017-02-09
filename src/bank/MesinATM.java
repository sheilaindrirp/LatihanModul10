/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.HashSet;

/**
 *
 * @author Sheila indri
 */
public class MesinATM {
    public MesinATM() {
        
    }
    
    void tampilMenuBahasa(){
        Bahasa idn = new Bahasa();
        idn.setNamaBahasa("Indonesia");
        Bahasa eng = new Bahasa();
        eng.setNamaBahasa("English");
        
        System.out.println("Pilih Bahasa/Select Languange:");
        System.out.println("=============================");
        System.out.println("1. " + idn.getNamaBahasa() );
        System.out.println("2. " + eng.getNamaBahasa() );
        System.out.println("=============================");
    }
    
    void tampilInputPin(){
        if(Nasabah.noBahasaPilihan == 1){
            tampilInputPinIN();
        }else if(Nasabah.noNasabahPilihan == 2){
            tampilInputPinEN();
        }
    }
    
    void tampilInputPinIN(){
        System.out.println("Masukkan Pin Anda: ");
    }
    
  void tampilInputPINEN(){
      System.out.println("Insert Your Password: ");
  }
  
  void tampilMenu(){
      if(Nasabah.noBahasaPilihan == 1){
          tampilMenuIN();
      }else if(Nasabah.noBahasaPilihan == 2){
          tampilMenuEN();
      }
    }
  
  void tampilMenuIN(){
      Menu INcekSaldo = new Menu();
      INcekSaldo.setNamaMenu("Cek Saldo");
      Menu INtransfer = new Menu();
      INtransfer.setNamaMenu("Transfer");
      Menu INtarikTunai = new Menu();
      INtarikTunai.setNamaMenu("Tarik Tunai");
      Menu INgantiPin = new Menu();
      INgantiPin.setNamaMenu("Ganti Pin");
      
      System.out.println("Pilih Menu Transaksi");
      System.out.println("=====================");
      
  }

}

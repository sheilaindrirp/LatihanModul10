/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Sheila indri
 */
public class ATMProject {
    public static void main(String[] args) {
        
        MesinATM atm = new MesinATM();
        Nasabah sheila = new Nasabah();
        sheila.setNamaNasabah("Sheila Indri");
        sheila.setNoRekening("387301001529506");
        sheila.setPin(1234);
        sheila.setSaldo(50000);
        sheila.setBlocked(false);
        
        atm.tampilMenuBahasa();
        sheila.memilihBahasa();
        atm.tampilInputPin();
        
        sheila.memasukkanPin();
        if(Nasabah.isBlocked()==false){
            atm.tampilMenu();
            sheila.memilihMenu();
        }
    }
    
    public void mulai(){
        
    }
}

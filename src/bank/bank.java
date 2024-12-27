/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Risat Dumatubun
 */
public class bank {
      int saldo;
    
    public bank(int saldo){
        this.saldo = saldo;
    }
    
    void getSaldo(){
        System.out.println("SELAMAT DATANG DI BANK INDONESIA");
        System.out.println("SALDO ANDA SEKARANG: " + saldo);
    }
    
    void simpanSaldo(int simpan){
        saldo += simpan;
        System.out.println("\nSIMPAN UANG ANDA SEBESAR: " + simpan);
        System.out.println("SALDO ANDA SEKARANG: " + saldo);
    }
    
    void ambilSaldo(int ambil){
        saldo -= ambil;
        System.out.println("\nAMBIL UANG ANDA SEBESAR: " + ambil);
        System.out.println("SALDO ANDA SEKARANG: " + saldo);
    }
    
}

    


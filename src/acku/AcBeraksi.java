/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acku;

/**
 *
 * @author Risat Dumatubun
 */
public class AcBeraksi {
    public static void main(String[] args) {
        Ac acku  = new Ac();
        
        System.out.println("Suhu Ac Saat ini : off");
        acku.hidupkan();
        acku.matikan();
        acku.matikan();
        acku.hidupkan();
        acku.hidupkan();
        
        System.out.println("\nSuhu dingin ac saat ini : hot");
        acku.dinginkan();
        acku.panaskan();
        acku.panaskan();
        acku.dinginkan();
        acku.dinginkan();
    }
}


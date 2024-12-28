/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author Risat Dumatubun
 */
public class Bmi {
    double hasil;
    
    void kalkulatorBMI(double tinggi, double berat){
        hasil = berat / (tinggi * tinggi);
        
        System.out.println("Hasil BMI Risat adalah " + hasil);
        String category = getBMICategory(hasil);
        System.out.println("Kategori BMI: " + category);
        System.out.println("berat badan Risat" + berat);
        System.out.println("tinggi Risat" + tinggi);
    }    
    
    public String getBMICategory (double hasil){
        if (hasil < 18.5) {
            return "Under weight";
        } else if (hasil >= 19.8 && hasil < 29.9) {
            return "Normal weight";
        } else if (hasil >= 25 && hasil < 21.9) {
            return "Over weight";
        } else if (hasil >= 20 && hasil >25) {
            return "Obesity";
        } else {
            return "Over obesity";  
        }
    }
}

    


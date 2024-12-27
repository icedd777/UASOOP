/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acku;

/**
 *
 * @author Risat Dumatubun
 */
public class Ac implements InterfaceAc {

    int statusAc;
    int statusSuhu;

    public void matikan() {
        if (statusAc == SEKARANG_AC_ON) {
            statusAc = SEKARANG_AC_OFF;
            System.out.println("\nMatikan AC --> Ac udah mati ");
        } else {
            System.out.println("\nMatikan AC --> Ac udah dimatikan!!!");
        }
    }

    public void hidupkan() {
        if (statusAc == SEKARANG_AC_OFF) {
            statusAc = SEKARANG_AC_ON;
            System.out.println("\nHidupkan AC --> Ac udah hidup ");
        } else {
            System.out.println("\nHidupkan AC --> Ac udah di hidupkan !!!");
        }
    }

    public void dinginkan() {
        if (statusAc == SEKARANG_AC_HOT) {
            statusAc = SEKARANG_AC_COOL;
            System.out.println("\nDinginkan AC --> Ac udah dingin ");
        } else {
            System.out.println("\nDinginkan AC --> Ac udah di dinginkan !!!");
        }
    }

    public void panaskan() {
        if (statusAc == SEKARANG_AC_COOL) {
            statusAc = SEKARANG_AC_HOT;
            System.out.println("\nPanaskan AC --> Ac udah panas ");
        } else {
            System.out.println("\nPanaskan AC --> Ac udah dipanaskan!!!");
        }
    }
}

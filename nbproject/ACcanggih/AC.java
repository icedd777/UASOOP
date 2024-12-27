/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACcanggih;

/**
 *
 * @author Risat Dumatubun
 */
public class AC implements InterfaceAC {

    int statusACcanggih;
    int statusSuhu;

    public void matikan() {
        if (statusACcanggih == KEADAAN_HIDUP_AC) {
            statusACcanggih = KEADAAN_MATI_AC;
            System.out.println("\nMatikan AC --> AC telah dimatikan");
        } else {
            System.out.println("\nMatikan AC --> AC sudag di matikan kok!!!!");
        }
    }

    public void hidupkan() {
        if (statusACcanggih == KEADAAN_MATI_AC) {
            statusACcanggih = KEADAAN_HIDUP_AC;
            System.out.println("\nHidupkan AC --> AC telah dihidupkan ");
        } else {
            System.out.println("\nHidupkan AC --> AC sudah dihidupkan kok!!!");
        }
    }

    public void dinginkan() {
        if (statusACcanggih == KEADAAN_PANAS_AC) {
            statusACcanggih = KEADAAN_DINGIN_AC;
            System.out.println("\nDinginkan AC --> AC telah di dinginkan");
        } else {
            System.out.println("\nDinginkan AC --> AC sudah di dinginkan kok!!!");
        }
    }

    public void panaskan() {
        if (statusACcanggih == KEADAAN_DINGIN_AC) {
            statusACcanggih = KEADAAN_PANAS_AC;
            System.out.println("\nPanaskan AC --> AC telah dipanaskan");
        } else {
            System.out.println("\nPanaskan AC --> AC sudah dipanaskan kok!!!");
        }
    }

}

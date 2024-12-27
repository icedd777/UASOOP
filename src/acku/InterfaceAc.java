/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package acku;

/**
 *
 * @author Risat Dumatubun
 */
public interface InterfaceAc {

    public static int SEKARANG_AC_OFF = 0;
    public static int SEKARANG_AC_ON = 1;
    public static int SEKARANG_AC_COOL = 0;
    public static int SEKARANG_AC_HOT = 1;

    public abstract void matikan();
    public abstract void hidupkan();
    public abstract void dinginkan();
    public abstract void panaskan();
}

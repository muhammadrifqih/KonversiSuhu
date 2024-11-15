/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisuhu;

public class Fahrenheit extends SatuanSuhu {

    public Fahrenheit(String s) {
        super(s);
    }

    public Fahrenheit(SatuanSuhu other) {
        super(other);
        switch (other) {
            case Celcius c ->
                nilai = (c.nilai * 9 / 5) + 32;
            case Kelvin k ->
                nilai = (k.nilai - 273.15) * 9 / 5 + 32;
            case Reamur r ->
                nilai = (r.nilai * 9 / 4) + 32;
            default -> {
            }
        }
    }

}

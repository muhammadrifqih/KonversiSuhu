/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisuhu;

public class Celcius extends SatuanSuhu {

    public Celcius(String s) {
        super(s);
    }

    public Celcius(SatuanSuhu other) {
        super(other);
        switch (other) {
            case Fahrenheit f ->
                nilai = (f.nilai - 32) * 5 / 9;
            case Kelvin k ->
                nilai = k.nilai - 273.15;
            case Reamur r ->
                nilai = r.nilai * 5 / 4;
            default -> {
            }
        }
    }

}

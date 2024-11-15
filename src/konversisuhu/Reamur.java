/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisuhu;

public class Reamur extends SatuanSuhu {

    public Reamur(String s) {
        super(s);
    }

    public Reamur(SatuanSuhu other) {
        super(other);
        switch (other) {
            case Celcius c ->
                nilai = c.nilai * 4 / 5;
            case Fahrenheit f ->
                nilai = (f.nilai - 32) * 4 / 9;
            case Kelvin k ->
                nilai = (k.nilai - 273.15) * 4 / 5;
            default -> {
            }
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisuhu;

public class Kelvin extends SatuanSuhu {

    public Kelvin(String s) {
        super(s);
    }

    public Kelvin(SatuanSuhu other) {
        super(other);
        switch (other) {
            case Celcius c ->
                nilai = c.nilai + 273.15;
            case Fahrenheit f ->
                nilai = (f.nilai - 32) * 5 / 9 + 273.15;
            case Reamur r ->
                nilai = r.nilai * 5 / 4 + 273.15;
            default -> {
            }
        }
    }

}

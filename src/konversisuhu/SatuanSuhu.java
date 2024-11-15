/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konversisuhu;

/**
 *
 * @author ASUS
 */
public class SatuanSuhu {
    protected double nilai;
    
    public SatuanSuhu(String s){
        nilai = Double.parseDouble(s);
    }
    
    public SatuanSuhu(SatuanSuhu other){
        nilai= other.nilai;
    }

    @Override
    public String toString() {
        return "SatuanSuhu{" + "nilai=" + nilai + '}';
    }
    
    
}

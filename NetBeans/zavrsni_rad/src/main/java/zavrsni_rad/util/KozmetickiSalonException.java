/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni_rad.util;


/**
 *
 * @author Ana
 */
public class KozmetickiSalonException extends Exception {
    
    private String poruka;

    public KozmetickiSalonExceptionporuka) {
        super(poruka);
        this.poruka = poruka;
    }

    public KozmetickiSalonException(String entitet_je_null) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPoruka() {
        return poruka;
    }


    
    
    
    
}


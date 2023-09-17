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

    public KozmetickiSalonException(String poruka) {
        super(poruka);
        this.poruka = poruka;
    }


    public String getPoruka() {
        return poruka;
    }


    
    
    
    
}


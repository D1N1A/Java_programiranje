/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import org.hibernate.Session;
import zavrsnirad.model.Entitet;
import zavrsnirad.util.HibernateUtil;
import zavrsnirad.util.KozmetickiSalonException;

/**
 *
 * @author Ana
 */
public abstract class Obrada<T extends Entitet>{
    
    protected T entitet;
    protected Session sesssion;
    public abstract List<T> read();
    protected abstract void kontrolaUnos() throws KozmetickiSalonException;
    protected abstract void kontrolaPromjena() throws KozmetickiSalonException;
    protected abstract void kontrolaBrisanje() throws KozmetickiSalonException;
    
    public Obrada(){
        sesssion = HibernateUtil.getSession();
    }
    
    public Obrada(T entitet){
        this();
        this.entitet=entitet;
    }
    
    public void create() throws KozmetickiSalonException{
        kontrolaNull();
        entitet.setSifra(null);
        kontrolaUnos();
        persist();
    }
    
    public void update() throws KozmetickiSalonException{
        kontrolaNull();
        kontrolaPromjena();
        persist();
    }
    
    public void delete() throws KozmetickiSalonException{
        kontrolaNull();
        kontrolaBrisanje();
        sesssion.beginTransaction();
        sesssion.remove(entitet);
        sesssion.getTransaction().commit();
    }
    
    private void persist(){
        sesssion.beginTransaction();
        sesssion.persist(entitet);
        sesssion.getTransaction().commit();
        
    }
    
    private void kontrolaNull() throws KozmetickiSalonException{
       if(entitet==null){
            throw new KozmetickiSalonException("Entitet je null");
        } 
       
    }
    
    

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
    
     public void refresh(){
        if(entitet!=null){
            sesssion.refresh(entitet);
        }
    }


    
    
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import entity.Cuenta;
import fade.InversorFacade;
import entity.Inversor;
import fade.CuentaFacade;
import javax.inject.Named;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
/**
 *
 * @author astrid
 */
@ManagedBean
@Named(value = "block")
@ViewScoped
public class Block {
    
    @EJB 
     private CuentaFacade cuentaFacade;

    @EJB
     private InversorFacade inversorFacade;
    
   
    private Inversor inverso;
    
    
    private Cuenta cuenta;
    /**
     *
     */
  
    public void crear(){}
    /**
     *
     */
    public void crearInversor(){
       Inversor inversor = new Inversor(1,"pablo");
       inversorFacade.create(inversor);
       
    } 

    /**
     *
     */
    public void CrearCuenta(){
        Inversor inversor = new InversorFacade().find(1);
        Cuenta cuenta =new Cuenta(3,"132435",inversor); 
        cuentaFacade.create(cuenta);    
    
    }

    /**
     *
     */
    public void CrearAmbos(){
        Inversor inversor = new InversorFacade().find(1);
        Cuenta cuenta =new Cuenta(3,"132435",inversor); 
        inversor.setCuenta(cuenta);
        cuentaFacade.create(cuenta);        
    
    }

    /**
     *
     */
    public void EditarInversor(){
        Inversor inversor = new InversorFacade().find(1);
        inversor.setNombre("sol");
        inversor.getCuenta().setNumero("784544307");
        inversorFacade.edit(inversor);
    }
    
    public void Eliminar (){
        Inversor inversor = new InversorFacade().find(1);
        inversorFacade.remove(inversor);
    }    

    public CuentaFacade getCuentaFacade() {
        return cuentaFacade;
    }

    public void setCuentaFacade(CuentaFacade cuentaFacade) {
        this.cuentaFacade = cuentaFacade;
    }

    public InversorFacade getInversorFacade() {
        return inversorFacade;
    }

    public void setInversorFacade(InversorFacade inversorFacade) {
        this.inversorFacade = inversorFacade;
    }

    public Inversor getInverso() {
        return inverso;
    }

    public void setInverso(Inversor inverso) {
        this.inverso = inverso;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

}
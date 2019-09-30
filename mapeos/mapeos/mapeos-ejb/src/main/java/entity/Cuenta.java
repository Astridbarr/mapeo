/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import fade.InversorFacade;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author astrid
 */

@Entity
@Table(name = "cuenta")
public class Cuenta implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @NotNull
    @Column(name = "id")
    private int id;
    
    @Column(name = "numero")
    private String numero;
    
    @Column(name = "inversor_id")
    private int inversoId;
    
    @OneToOne
    @PrimaryKeyJoinColumn
    private Inversor inversor;

    /**
     *
     * @param id
     * @param numero
     * @param inversoId
     */
    public Cuenta(int id, String numero, int inversoId) {
        this.id = id;
        this.numero = numero;
        this.inversoId = inversoId;
    }

    /**
     *constuctor vacio
     */
    public Cuenta() {
    }

    /**
     *constructores 
     * @param id
     * @param numero
     * @param inversoId
     * @param inversor
     */
    public Cuenta(int id, String numero, int inversoId, Inversor inversor) {
        this.id = id;
        this.numero = numero;
        this.inversoId = inversoId;
        this.inversor = inversor;
    }

    /**
     *
     * @param id
     * @param numero
     * @param inversor
     */
    public Cuenta(int id, String numero, Inversor inversor) {
        this.id = id;
        this.numero = numero;
        this.inversor = inversor;
    }
    
    /**
     *Metodo get
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *metodo set
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *Metodo get
     * @return
     */
    public String getNumero() {
        return numero;
    }

    /**
     *metodo set
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     *Metodo get
     * @return
     */
    public int getInversoId() {
        return inversoId;
    }

    /**
     *metodo set
     * @param inversoId
     */
    public void setInversoId(int inversoId) {
        this.inversoId = inversoId;
    }

    /**
     *Metodo get
     * @return
     */
    public Inversor getInversor() {
        return inversor;
    }

    /**
     *Metodo set 
     * @param inversor
     */
    public void setInversor(Inversor inversor) {
        this.inversor = inversor;
    }           
    
    
}

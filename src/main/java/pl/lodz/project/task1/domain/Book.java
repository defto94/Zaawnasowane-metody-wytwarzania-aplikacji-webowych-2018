/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.project.task1.domain;

import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author defto
 */
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String TITLE;
    private String AUTHOR;
    private int ID_USER;
    
    
    //private User ID_USER;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getAUTHOR() {
        return AUTHOR;
    }

    public void setAUTHOR(String AUTHOR) {
        this.AUTHOR = AUTHOR;
    }

    /**
     * @return the ID_USER
     */
    public int getID_USER() {
        return ID_USER;
    }

    /**
     * @param ID_USER the ID_USER to set
     */
    public void setID_USER(int ID_USER) {
        this.ID_USER = ID_USER;
    }
    



    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.project.task1.domain;

/**
 *
 * @author defto
 */
public class User {
    private int ID;
    private String NAME;
    private String EMAIL;

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public String getName() {
        return NAME;
    }

    public void setName(String name) {
        this.NAME = name;
    }

    public String getEmail() {
        return EMAIL;
    }

    public void setEmail(String email) {
        this.EMAIL = email;
    }
    
    
    
}

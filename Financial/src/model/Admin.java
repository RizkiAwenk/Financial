/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.strategy.*;

/**
 *
 * @author Novak
 */
public class Admin extends Orang {
    
    public Admin(String nama, String username, String password) {
        super(nama, username, password);
        super.setB(new BAdmin());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.unicolombo.lac.main;

import main.java.com.unicolombo.lac.models.DB;
import main.java.com.unicolombo.lac.models.User;
import main.java.com.unicolombo.lac.views.Welcome;

/**
 *
 * @author macbook
 */
public class Main {
    public static DB db = new DB();
    public static User user = new User();
    
    public static void main(String[] args) {
        User newUser = new User();
        newUser.id = 1;
        newUser.name = "Juan";
        newUser.lastName = "Navarro";
        newUser.document = 123;
        
        db.users.add(newUser);
        
        //System.out.println(db.users.get(0).document);
    
        Welcome.main(args);
    }
}

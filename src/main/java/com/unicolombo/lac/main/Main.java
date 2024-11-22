/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.unicolombo.lac.main;

import main.java.com.unicolombo.lac.models.DB;
import main.java.com.unicolombo.lac.models.User;
import main.java.com.unicolombo.lac.storage.DBController;
import main.java.com.unicolombo.lac.views.Welcome;

/**
 *
 * @author macbook
 */
public class Main {

    public static DB db; // = new DB();
    public static User user = new User();

    public static void main(String[] args) throws Exception {
        if (DBController.checkFile("DB")) {
            try {
                db = DBController.read("DB");
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        } else {
            user.id = 1;
            user.name = "Juan";
            user.lastName = "García";
            user.document = 1369;

            db = new DB();
            db.users.add(user);

            try {
                DBController.create(db, "DB");
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }

        }

        //System.out.println(db.users.get(0).document);
        Welcome.main(args);
        
        System.out.println(DBController.path());
    }
}

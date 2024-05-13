/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.unicolombo.lac.models;

import java.io.Serializable;

/**
 *
 * @author macbook
 */
public class User implements Serializable{
    public int id;
    public int document;
    public String name;
    public String lastName;
    public int id_rol;
    public int id_major;
    public int id_department;
    public String otherDepartment = "";
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.unicolombo.lac.models;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author macbook
 */
public class Answer implements Serializable{
    public int id;
    public int id_user;
    public int id_finality;
    public String otherFinality;
    public int id_pqrs;
    public LocalDateTime created_at;
}

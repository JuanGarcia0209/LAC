/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.unicolombo.lac.models;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class DB {
    public ArrayList<User> users = new ArrayList<>();
    public ArrayList<Answer> answers = new ArrayList<>();
    public ArrayList<Pqrs> pqrses = new ArrayList<>();
    public String roles[] = { "Estudiante", "Docente", "Administrativo" };
    public String departments[] = { "Colombo", "Unicolombo", "Otro" };
    public String finalities[] = { "Uso del computador", "Sala de estudio", "Leer", "Esperar", "Otro" };
    public String majors[] = { "Licenciatura En Bilingüismo Con Énfasis En Inglés", "Contaduría Pública",
                    "Administración De Empresas", "Derecho", "Ingeniería Industrial", "Ingeniería De Sistemas",
                    "Administración De Empresas Turísticas Y Hoteleras", "Tecnología En Sistemas De Gestión De Calidad",
                    "Tecnología En Desarrollo De Sistemas De Información Y De Software",
                    "Tecnología En Gestión De Servicios Turísticos Y Hoteleros",
                    "Especialización en Enseñanza del Idioma Inglés",
                    "Curso de creación de contenido de redes sociales", "Diplomado en Justicia Digital",
                    "Diplomando Full Stack", "Diplomado en Actualización Tributaria",
                    "Diplomado en Conciliación Extrajudicial", "Diplomado en logística y suministro",
                    "Diplomando Gestión Estratégica de Negocio", "No aplica" };

    private User findUserById(int id) {
        for (User user : users) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }

    private Answer findAnswerById(int id) {
        for (Answer answer : answers) {
            if (answer.id == id) {
                return answer;
            }
        }
        return null;
    }

    private Pqrs findPqrsById(int id) {
        for (Pqrs pqrs : pqrses) {
            if (pqrs.id == id) {
                return pqrs;
            }
        }
        return null;
    }
}

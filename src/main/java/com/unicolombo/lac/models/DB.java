/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.unicolombo.lac.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class DB implements Serializable {

    public ArrayList<User> users = new ArrayList<>();
    public ArrayList<Answer> answers = new ArrayList<>();
    public ArrayList<Pqrs> pqrses = new ArrayList<>();
    public String roles[] = {"Estudiante", "Docente", "Administrativo"};
    public String departments[] = {"Colombo", "Unicolombo", "Otro"};
    public String finalities[] = {"Uso del computador", "Sala de estudio", "Leer", "Esperar", "Otro"};
    public String majors[] = {"Licenciatura En Bilingüismo Con Énfasis En Inglés", "Contaduría Pública",
        "Administración De Empresas", "Derecho", "Ingeniería Industrial", "Ingeniería De Sistemas",
        "Administración De Empresas Turísticas Y Hoteleras", "Tecnología En Sistemas De Gestión De Calidad",
        "Tecnología En Desarrollo De Sistemas De Información Y De Software",
        "Tecnología En Gestión De Servicios Turísticos Y Hoteleros",
        "Especialización en Enseñanza del Idioma Inglés",
        "Curso de creación de contenido de redes sociales", "Diplomado en Justicia Digital",
        "Diplomando Full Stack", "Diplomado en Actualización Tributaria",
        "Diplomado en Conciliación Extrajudicial", "Diplomado en logística y suministro",
        "Diplomando Gestión Estratégica de Negocio", "No aplica"};

    public User findUserById(int id) {
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

    public String getUser(int id, int version) {
        User user = findUserById(id);

        if (user != null) {
            if (version == 1) {
                return "\n\tID: " + user.id
                        + "\n\tNúmero de identificación: " + user.document
                        + "\n\tNombre: " + user.name
                        + "\n\tApellidos: " + user.lastName
                        + "\n\tRol: " + roles[user.id_rol]
                        + "\n\tPrograma académico: " + majors[user.id_major]
                        + "\n\tDepartamento/Institución: " + (user.id_department == 2 ? user.otherDepartment : departments[user.id_department]);
            } else if (version == 2) {
                return "\n\t\tID: " + user.id
                        + "\n\t\tNúmero de identificación: " + user.document
                        + "\n\t\tNombre: " + user.name
                        + "\n\t\tApellidos: " + user.lastName
                        + "\n\t\tRol: " + roles[user.id_rol]
                        + "\n\t\tPrograma académico: " + majors[user.id_major]
                        + "\n\t\tDepartamento/Institución: " + (user.id_department == 2 ? user.otherDepartment : departments[user.id_department]);
            } else {
                return "\n\t\t\tID: " + user.id
                        + "\n\t\t\tNúmero de identificación: " + user.document
                        + "\n\t\t\tNombre: " + user.name
                        + "\n\t\t\tApellidos: " + user.lastName
                        + "\n\t\t\tRol: " + roles[user.id_rol]
                        + "\n\t\t\tPrograma académico: " + majors[user.id_major]
                        + "\n\t\t\tDepartamento/Institución: " + (user.id_department == 2 ? user.otherDepartment : departments[user.id_department]);
            }

        } else {
            return null;
        }

    }

    public String getPqrs(int id, int version) {
        Pqrs pqrs = findPqrsById(id);

        if (pqrs != null) {
            if (version == 1) {
                return "\n\tID: " + pqrs.id
                        + "\n\tTítulo: " + pqrs.title
                        + "\n\tDescripción: " + pqrs.description
                        + "\n\n\tUsuario: " + getUser(pqrs.id_usuario, 2);
            } else {
                return "\n\t\tID: " + pqrs.id
                        + "\n\t\tTítulo: " + pqrs.title
                        + "\n\t\tDescripción: " + pqrs.description
                        + "\n\n\t\tUsuario: " + getUser(pqrs.id_usuario, 3);
            }
        } else {
            return null;
        }

    }

    public String getAnswer(int id) {
        Answer answer = findAnswerById(id);

        if (answer != null) {
            return "\n\n\tID: " + answer.id
                    + "\n\n\tUsuario: " + getUser(answer.id_user, 2)
                    + "\n\n\tFinalidad: " + (answer.id_finality == 4 ? answer.otherFinality : finalities[answer.id_finality])
                    + "\n\n\tPQRS: " + (answer.id_pqrs == 0 ? "No" : getPqrs(id, 2))
                    + "\n\n\tFecha de Creación: " + answer.created_at;
        } else {
            return null;
        }
    }
}

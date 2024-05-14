/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.unicolombo.lac.storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import main.java.com.unicolombo.lac.models.DB;

/**
 *
 * @author Juan García
 */
public class DBController {

    public static String basePath = path();

    public static String path() {
        String basePath = System.getProperty("sun.java.command");

        String[] parts = basePath.split("\\.");

        StringBuilder subString = new StringBuilder();
        String separator = System.getProperty("file.separator");

        for (int i = 0; i < parts.length - 2; i++) {
            subString.append(parts[i]).append(separator);
        }

        //subString.deleteCharAt(subString.length() - 1);
        return System.getProperty("user.dir") + separator + "src" + separator + subString.toString() + "storage";
    }

    public static boolean checkFile(String fileName) {
        File file = new File(basePath, fileName + ".txt");
        if (!file.exists()) {
            return false;
        } else {
            return true;
        }
    }

    public static void create(DB db, String fileName) throws Exception {
        try {
            File file = new File(basePath, fileName + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileOutputStream fileWriter = new FileOutputStream(file);
            ObjectOutputStream objectWriter = new ObjectOutputStream(fileWriter);

            objectWriter.writeObject(db);

            objectWriter.close();

        } catch (FileNotFoundException ex) {
            throw new Exception("Archivo no encontrado.");
        } catch (IOException ex) {
            throw new Exception("Error al guardar.");
        } catch (Exception ex) {
            throw new Exception("Error desconocido al guardar.");
        }
    }

    public static DB read(String fileName) throws Exception {
        try {
            File file = new File(basePath, fileName + ".txt");
            if (!file.exists()) {
                throw new Exception("Archivo no encontrado.");
            }

            FileInputStream fileReader = new FileInputStream(file);
            ObjectInputStream objectReader = new ObjectInputStream(fileReader);

            return (DB) objectReader.readObject();

        } catch (FileNotFoundException ex) {
            throw new Exception("Archivo no encontrado.");
        } catch (IOException ex) {
            throw new Exception("Error al leer el archivo.");
        } catch (Exception ex) {
            throw new Exception("Error desconocido al leer el archivo.");
        }
    }
}

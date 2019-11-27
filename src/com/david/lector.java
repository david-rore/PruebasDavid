package com.david;

import java.io.BufferedReader;
import java.io.FileReader;

public class lector {

    public static String leerTxt(String path){
        String texto = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            StringBuilder temp = new StringBuilder();
            String bfRead;

            while ((bfRead = br.readLine() )!= null ){    //ReadLine devuelve un String
                temp.append(bfRead); //concatenar el archivo
                temp.append('\n');
            }
            texto = temp.toString();

        } catch (Exception e1){
            System.err.println("Error al leer el archivo, no se ha encontrado" + e1);
        }

        return texto;
    }
}

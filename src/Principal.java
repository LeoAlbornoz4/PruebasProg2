
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */
public class Principal {
    public static void main(String[] args) {
        int unEntero = 4;
        float unFlotante = 8.4f;
        double unDoble = 12.44;
        String unaCadena = "Esta es la cadena";
        System.out.println(unEntero);
        System.out.println(unFlotante);
        System.out.println(unDoble);
        System.out.println(unaCadena);
        ArrayList<Float> listaReales = new ArrayList<>();
        listaReales.add(1.4f);
        listaReales.add(2.8f);
        listaReales.add(4.6f);
        listaReales.add(8.3f);
        System.out.println(listaReales);
        int contador = 0;
        float suma = 0f;
        for (float x : listaReales){
            suma = suma + x;
            contador++;
        }
        float promedio = suma / contador;
        System.out.println(promedio);
        
    }
}

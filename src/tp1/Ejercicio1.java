/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;


import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */


public class Ejercicio1 {
    // Inicio Metodo Ejercicio 1
    public static int mayor(int a, int b, int c) {
        int m;
        if(a>=b){
            m=a;
        }
        else{
            m=b;
        }
        if(m<=c){
            m=c; 
        }
        return(m);
    }
    // Fin Metodo Ejercicio 1
    
    // Inicio Metodo Ejercicio 2
       public static float prom(int [] listaNum ) {
           float result=0;
           int a=listaNum.length;
            for(int i=0;i<a;i++){
                result=listaNum[i]+result;
            }
           result=result/a;
           return result;    
    }
     // Fin Metodo Ejercicio 2
       
          // Inicio Metodo Ejercicio 3
       
         // Fin Metodo Ejercicio 2
       
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) { 
        //Inicio Ejercicio 1
        int a=1;
        int b=5;
        int c=8;
        System.out.println("El numero mayor es:"+mayor(a,b,c));
        //Fin ejercicio 1
        
        //Inicio Ejercicio 2
        float result;
            int [] listaNum = new int [5];
            a=6;
            for(int i=0;i<5;i++){
                listaNum[i]=a;
                a++;
            }
            result=prom(listaNum);
            if(result<6){
                System.out.println("No alcanzo, Su promedio es:"+result);
            }
            else if((result>=6) && (result<=7)){
                System.out.println("Obtuviste un 4");
            }
            else if(result>7 &&result<=7.5){
                System.out.println("Obtuviste un 5");
            }
            else if(result>7.5 && result<=8){
                System.out.println("Obtuviste un 6");
            }
            else if(result >8 && result<=8.5){
                System.out.println("Obtuviste un 7");
            }
             else if(result >8.5 && result<=9){
                System.out.println("Obtuviste un 8");
            }
            else if(result >9 && result<=9.5){
                System.out.println("Obtuviste un 9");
            }
            else if(result >9 && result<=10){
                System.out.println("Obtuviste un 10");
            }
        // Fin Ejercicio 2
        
        //Inicio Ejercicio 3
        
            Scanner entrada = new Scanner(System.in);
            int aux=-32000;
                for (int i=0;i<listaNum.length;i++){
                    listaNum[i]= Integer.parseInt(entrada.nextLine());
                    if(i==0){
                        aux=listaNum[i];
                    }
                    else if(aux < listaNum[i]){
                    aux=listaNum[i];
                    }
                }
                    System.out.println("El numero mayor es:"+aux);
        // Fin Ejercicio 3
        
        //Inicio Ejercicio 4
        long acu=0;
        int [] numeros = new int [10];
        int [] cuadrados = new int [10];
        for(int i=0;i<numeros.length;i++){
            numeros[i]= Integer.parseInt(entrada.nextLine());
            cuadrados[i]= numeros[i]*numeros[i];
            acu+=cuadrados[i];
        }
        System.out.print("El vector numeros:");
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i]);
        }
        System.out.println("");
        System.out.print("El vector cuadrados:");
        for(int i=0;i<cuadrados.length;i++){
            System.out.print(cuadrados[i]);
        }
        System.out.println("");
        System.out.println("El resultado es:"+acu);
    //  Fin Ejercicio 4
    //Inicio Ejercicio 5
        
        List <String> lista = new ArrayList();
        
        String palabra = null;
        System.out.print("Ingrese una palabra:");
        for (int i = 0; i < 10; i++) {
            lista.add(entrada.nextLine());
        }
       
         for (int i = 0; i < 10; i++) {
              if(i==0){
                  palabra=lista.get(i);
              }
              else if(palabra.length() < lista.get(i).length()) {
                  palabra=lista.get(i);
              }
         }
         System.out.println("La palabra mas larga es:"+palabra);
    //  Fin Ejercicio 5
        
    }
    
}

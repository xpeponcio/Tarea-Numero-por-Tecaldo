package Ejercicio1;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Lista listaNumeros = new Lista();
        int i = -1;
        Scanner sc = new Scanner(System.in);
        while(i < 1){
            System.out.println("Introduce un numero para la Cola: ");
            i = sc.nextInt();

            if(i >= 0){
                listaNumeros.encolar(i);
            }else{

                while(listaNumeros.numeroElementos() == 0){
                    listaNumeros.desencolar();
                }
            }
        }
    }
}

import javax.swing.*;
import java.math.*;
import java.lang.Math;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HelloWorld {
    public static void main(String[] args) {

        // your code goes here
        String values;
        Integer N;
        Integer P;
        Integer J;
        String[] splitValue;
        Scanner in = new Scanner(System.in);
        values = in.nextLine();
        splitValue = values.split(" ");

        N = Integer.valueOf(splitValue[0]);
        P = Integer.valueOf(splitValue[1]);
        J = Integer.valueOf(splitValue[2]);
        Scanner ain = new Scanner(System.in);
        values = ain.nextLine();

        String[] arr = values.split(" ");


        boolean seguir = false;
        seguir = (1<= N && N<= Math.pow(10, 5));
        seguir = ( seguir && ( 1 <= J && J <= Math.pow(10,5)) );
        Integer arrV;
        for (Integer i = 0; i < N; i ++) {
            arrV = Integer.valueOf(arr[i]) ;
            seguir = (seguir && (Math.pow(-10,9) <= arrV && arrV <= Math.pow(10,9))) ;
        }


        if (seguir) {
            System.out.println("todo ok");
            Double newP = Double.valueOf(P);
            if (J > 0) {
                newP = Math.pow((P+J), 2);
            }
            boolean winner = true;
            for (Integer i = 0; i < N; i ++) {
                arrV = Integer.valueOf(arr[i]) ;


                winner = ( winner && ( arrV <= newP) ) ;
                if (arrV <= newP) {
                    P = P + arrV;
                    newP = Double.valueOf(P);
                    if (J > 0) {
                        newP = Math.pow((P+J), 2);
                    }

                }
            }
            if (winner) {
                System.out.println("Si");
            } else {
                System.out.println("No");
            }

        }

    }





}
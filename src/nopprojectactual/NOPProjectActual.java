/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nopprojectactual;

/**
 *
 * @author user3
 */
import java.util.Scanner;

public class NOPProjectActual {

    
    public static int szokoev(int year) {
        int szokoeve = 0;
        if (year % 400 == 0 || year % 100 == 0 || year % 4 == 0) {  //kiszámoljuk hogy szökőév van 
            szokoeve++;
        }
        return szokoeve;
    }
    
     public static String szamforditas(String szam) {
        String fordit = "";
        for (int i = 0; i< szam.length(); i++)
        {
            fordit = szam.charAt(i)+fordit;
        }
         return fordit;
     }
    
    public static void sorminta() {
        System.out.println("*******************************************************************************************************************************************************************************");
    }

    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy évszámot: ");
        int szam = bill.nextInt();
        sorminta();
        if (szokoev(szam) == 1) {
            System.out.println("Szökőév");
        } else{
            System.out.println("Nem szökőév");
        }
        sorminta();
        String szam1 = String.valueOf(szam);
        System.out.println(szamforditas(szam1));
        sorminta();
        
    }
}

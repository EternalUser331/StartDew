/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test5try;

import java.util.Random;

/**
 *
 * @author user
 */
public class Test5try {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
        {System.out.println("----??????? ????? 5----");
        System.out.println("??????? ?????????? ??????  ?? 10?5 ????? ???? int, \\n????????? ??? ?????????? ??????? ? ??????? \\n??? ???????? ? ?????"); 

        int[][] a = new int[10][5];
        int max, min;
        Random ran = new Random();
        
        for (int i=0;i < a.length;i++) {
            for (int j=0;j < a[i].length;j++) {
                a[i][j]=ran.nextInt(10) + 1;
            }
        }
        
        for (int i=0;i < a.length;i++,System.out.println()) {
            for (int j=0;j < a[i].length;j++) {
                System.out.print(a[i][j]+" ");
            }
        }
    }
}

    


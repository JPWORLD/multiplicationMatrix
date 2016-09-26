/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationmatrix;
import java.util.Scanner;
/**
 *
 * @author jprakash4
 */
public class MatrixMultiplication {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        int i, j, k, columns, rows, p;
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        rows = s.nextInt();
        System.out.print("Please enter the number of columns: ");
        columns = s.nextInt();
        int a[][] = new int[rows][columns];    
        int b[][] = new int[rows][columns];    
        int c[][] = new int[rows][columns];    
        System.out.println("Please Enter the first matrix");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Please enter the second matrix");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                b[i][j] = s.nextInt();
            }
        }
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                c[i][j] = 0;
                for (k = 0; k < rows; k++) {
                    c[i][j] = a[i][k] * b[k][j] + c[i][j];
                }
            }
        }
        System.out.println("First Matrix is: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix is: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
       System.out.println("Multiplication matrix is: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
 
    }

}

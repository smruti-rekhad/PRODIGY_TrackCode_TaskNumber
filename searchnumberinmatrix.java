// to print an matrix and search the number in that matrix
import java.util.Scanner;
public class dsa2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int columns = sc.nextInt();
        int matrix [][]= new int[rows][columns];
        //rows
        for (int i = 0;i<rows;i++){
            //columns
            for (int j=0;j<columns;j++){
                
                matrix[i][j]=sc.nextInt();
            }
        }
            int x= sc.nextInt();
            for (int i=0;i<rows;i++){
                for (int j=0;j<columns;j++){
                    if (matrix[i][j]==x){
                        System.out.println("The number found at index"+ i+","+ j);
                    }
                }
            }

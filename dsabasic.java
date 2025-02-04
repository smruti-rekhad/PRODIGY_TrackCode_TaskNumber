import java.util.Scanner;
public class dsa1 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter the number");
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int x= sc.nextInt();
        for(int i =0;i<size;i++){
            if(array[i]==x){
                System.out.println("X found at index "+i);
            }
            
        }
        
    }
}

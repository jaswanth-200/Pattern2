import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();
    int columns;
    int spaces;
    for(int i=0;i<n*2;i++)
    {   
    if(i>n)
    {
        columns=2*n-i;
        spaces=i-n;
        for(int s=0;s<spaces;s++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<columns;j++)
        {
            System.out.print("* ");
        }
    }
    else{
        columns=i;
        spaces=n-i;
        for(int s=0;s<spaces;s++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<columns;j++)
        {
            System.out.print("* ");
        }
    }
        System.out.println(" ");
    }
    }
}










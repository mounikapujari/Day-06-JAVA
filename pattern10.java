/*
* * * * *
    *
    *
    *
* * * * *
*/import java.util.*;
public class pattern10{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-1 || j==n/2 || i==0)
                    System.out.print("*"+" ");
                    else{
                        System.out.print( " "+" ");
                    }
                }
                System.out.println();
                }
            }
        }
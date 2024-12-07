import java.util.Scanner;

public class Arrayunique{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            ans^=a[i];
           }
           System.out.println(ans);
    }
}
        

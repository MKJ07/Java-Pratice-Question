import java.util.Scanner;

public class Fillthebucketcc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int k=sc.nextInt();
            int x=sc.nextInt();
            int s=0;
            s=k-x;
            System.out.println(s);
        }
        sc.close();
    }
    
}

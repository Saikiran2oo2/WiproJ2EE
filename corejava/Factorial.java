import java.util.Scanner;

class Sai{
    public int fac(int n){
        int fat=1;

        for(int i=1;i<=n;i++){
        
        fat=fat*i;
        }
        return fat;

    }

}
    public class Factorial {
        public static void main(String[] args)  
        {
            Sai obj= new Sai();
            Scanner sc= new Scanner(System.in);
            int num=sc.nextInt();
            int result=obj.fac(num);
            System.out.println(result);

            sc.close();
        }

    
}


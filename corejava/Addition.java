 class Sai{
    public int add(int a, int b){
        return a+b;
    }    
}
public class Addition{
    public static void main(String[] args){
        Sai obj= new Sai();
        int result =obj.add(5,6);
       System.out.println(result);  
    }
}

import java.util.Scanner;

public class Binary{
    public static void binar(int a){
        int b;
        String temp = "";
        while(a !=0){
            b = a%2;
            temp = b + temp;
            a = a/2;
        }
        if (temp.equals("10")){
            temp = "0" + temp;
            System.out.println(temp);
        }
        if (temp.equals("11")){
            temp = "0" + temp;
            System.out.println(temp);
        }
        if (temp.equals("1")){
            temp = "00" + temp;
            System.out.println(temp);
        }
        else {
            System.out.println(temp);
        }
    }
    public static void decToBin(int n){
        if(n==0){
            return;
        }
        else{
            decToBin(n/2);
            System.out.print(n%2);
        }
    }
    public static  void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("number for binary ");
        int  c =  sc.nextInt();
        decToBin(100);
        //binar(c);
    }
}
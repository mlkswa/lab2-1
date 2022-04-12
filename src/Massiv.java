import java.util.Scanner;
public class Massiv {
    static Scanner sc;
    public static void fillArr(int[] mas,int i){
        if(i!=mas.length){
            mas[i++] = sc.nextInt();
            fillArr(mas,i);
        }
    }
    public static void printArr(int[] mas,int i){
        if(i!=mas.length){
            System.out.println("mas[" + i + "] = " + mas[i]);
            printArr(mas,++i);
        }
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Заполните массив");
        int mas[] = new int[5];
        fillArr(mas, 0);
        printArr(mas,0);
    }
}
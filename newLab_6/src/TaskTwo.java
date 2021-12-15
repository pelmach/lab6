import java.util.Scanner;

public class TaskTwo {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String string = input.nextLine();
        char one = '1';
        char zero = '0';
        if (string.length()>0){
            int k = 0;//счетчик
            for (int i = 0; i < string.length(); i++) {
                if(string.charAt(i) == one || string.charAt(i) == zero){
                    k++;
                } else {
                    System.out.println("Введенно число не в двоичной системе исчесления");
                    System.out.println("Повторите ввод");
                    string = input.nextLine();
                    i = 0;
                }
            }
            if(k == string.length()){
                seven(string);

            }
        } else {
            System.out.println("Строка не введена"+"\t"+"Повторите ввод");
            string = input.nextLine();
        }
    }
    public static void seven(String string){
        int num = 0;
        int n0 = string.length();
        for (int i = n0; i > 0; i--) {
            if(string.charAt(i) == '1'){
                num += Math.pow(2,i);
            }
        }
        int seven = 0;
        int k = 0;
        int n = (num/7 + 1);
        double[] answers = new  double[n];
        while (num > 0){
            seven = num % 7;
            num = num / 7;
            answers[n-k-1] = seven;
            k++;
        }
        for (double el: answers){
            System.out.print(el+" ");
        }
    }
}

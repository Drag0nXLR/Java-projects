package lesson1;
public class Main {
    public static void main(String[] args) {
        byte num=0;

        while (num<10){
            num += 1;
            if(num==5){
                System.out.println("Half of 10");
                System.out.println(num);
            }
            else{
                System.out.println(num);
            }
        }
    }
}
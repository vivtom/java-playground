import java.util.Scanner;

public class Greet
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String b = sc.nextLine();
        Hello a = new Hello(b);
        a.sayhello();
    }
}
class Hello{
    String name;
    Hello(String name) {
        this.name = name;
    }
    void sayhello(){
        System.out.println("Hello\n" + name);

    }
}
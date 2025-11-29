import java.util.Scanner;

public class Integer
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            int i = sc.nextInt();
            System.out.print("Integer");
        }
        catch(Exception e){
            System.out.println("Not an Integer");
        }
    }
}

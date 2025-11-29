import java.util.Scanner;

public class KmToM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        Convert b = new Convert(a);
        System.out.println(b.conversion());

    }}
class Convert{
    double km;
    Convert(double km){
        this.km = km;
    }
    double conversion(){
        return (km/1.609) ;
    }

}

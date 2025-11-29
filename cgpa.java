public class CGPA {
    public static void main(String[] args) {
        FinalCgpa a = new FinalCgpa(56,62,79);
        System.out.println(a.calcgpa());
    }
}
class FinalCgpa{
    double marks1 ;
    double marks2 ;
    double marks3 ;
    FinalCgpa(double marks1, double marks2, double marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    double calcgpa(){
        double a = ((marks1+marks2+marks3)/300)*10;
        return Math.round(a*100)/100.0;
    }
}
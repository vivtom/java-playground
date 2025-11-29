public class encrypt
{
    public static void main(String[] args) {
        char grade = 'C';

        //encrypt
        grade = (char)(grade+8);
        System.out.println(grade);

        //decrypt
        grade = (char)(grade-8);
        System.out.println(grade);
    }
}

public class AddNum {
    public static void main(String[] args) {
        AddNums a = new AddNums(3,5);
        System.out.println(a.result());
    }
}
class AddNums{
    int num1;
    int num2;
    AddNums(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int result(){
        return num1 +  num2;
    }
}
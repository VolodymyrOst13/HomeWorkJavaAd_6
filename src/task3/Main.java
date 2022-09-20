package task3;

public class Main extends Class{
    public static void main(String[] args) {
        Class a= new Class();
        a.print();
    }

    @Override
    @Deprecated
    @My_Anno
    public void print() {
        System.out.println("print B");;
    }
}

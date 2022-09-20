package task2;

public class Method {
    @My_Calculator(a = 2, b = 3)
    int sum(int a, int b){
        int res = a + b;
        return res;
    }

    @My_Calculator(a = 4, b = 2)
    int minus(int a, int b){
        int res = a - b;
        return res;
    }

    @My_Calculator(a = 2, b = 3)
    int mull(int a, int b){
        int res = a*b;
        return res;
    }

    @My_Calculator( a=6, b=3)
    int div(int a ,int b){
        int res = a/b;
        return res;
    }
}

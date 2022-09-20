package task2;

import java.lang.annotation.Documented;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        task2.Method m = new task2.Method();
        Class<?> cl = task2.Method.class;
        try {
            java.lang.reflect.Method method = cl.getDeclaredMethod("sum", int.class, int.class);
            My_Calculator  anno = method.getAnnotation(My_Calculator.class);
            System.out.println(m.sum(anno.a(), anno.b()));
            java.lang.reflect.Method[] metods = cl.getDeclaredMethods();
            /**
             * methodshow
             */
            for (Method met : metods) {
                System.out.println(met);
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

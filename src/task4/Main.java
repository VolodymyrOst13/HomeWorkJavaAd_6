package task4;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Sum obj = new Sum();
        Class<?> cl = Sum.class;
        try {
            Method m = cl.getDeclaredMethod("sum", int.class, int.class);
            Math anno = m.getAnnotation(Math.class);
            obj.sum(anno.i(), anno.j());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

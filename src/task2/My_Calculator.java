package task2;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface My_Calculator {
    int a() default 0;
    int b() default 0;
}

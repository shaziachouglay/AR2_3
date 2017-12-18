package customAnnotations;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SparkInsert {

String OS() default "MacOS" ;
int version() default 22;
int size() default 10;
}

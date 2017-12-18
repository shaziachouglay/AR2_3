package customAnnotations;

import java.lang.annotation.Annotation;

/**
 * this is for demo purpose only . can be removed or deleled . has no effect in the framework .
 *
 */
@SparkInsert
public class DoAnno {

    DoAnno(String g, int i, int e){
        System.out.println(" Invoking the DoAnno Constructor");
    }

    public void getAnnotationValues(Object c){
        Class cl = c.getClass();
        Annotation annotation = (Annotation) c;
    }
    public static void main(String[] args) {
        DoAnno da = new DoAnno("mac", 23, 55);
        Class c = da.getClass();
        Annotation aa = (SparkInsert)da;
        System.out.println(((SparkInsert) da).OS());
        System.out.println(((SparkInsert) da).version());
        System.out.println(((SparkInsert) da).OS());
    }

}

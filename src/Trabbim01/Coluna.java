package Trabbim01;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Coluna {

	String nome() default "";
	
	int taanho() default -1;
	
	boolean pk() default false;
}

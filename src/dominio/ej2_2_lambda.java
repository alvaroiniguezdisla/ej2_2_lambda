package dominio;
import java.util.stream.Stream;

public class ej2_2_lambda {
    public static int factorial(int n){
        return Stream.iterate(1,i->i+1).limit(n).reduce(1,(a,b)->a*b);
    }
}

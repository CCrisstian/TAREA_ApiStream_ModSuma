import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Tarea_Main {
    public static void main(String[] args) {

        System.out.println("Tarea: Modificar flujo y devolver la suma");

        AtomicInteger aux = new AtomicInteger(0);

        Stream<Integer> Stream_1 = Stream.generate(aux::incrementAndGet).limit(100) /*Generar 100 elementos*/
        .filter(u -> (u % 10 != 0));    /*Filtrar - Eliminar elementos divisibles por 10*/



        Stream<Double> Stream_2 = Stream_1.map(u -> u*1.0)  /*Convertir cada elemento 'int' en 'double'*/
                .map(u -> u/2); /*Dividir cada elemento por 2*/

        Optional<Double> resultado = Stream_2.reduce(Double::sum);  /*Sumar todos los elementos*/

        System.out.println("Resultado final: " + resultado.get());
    }
}
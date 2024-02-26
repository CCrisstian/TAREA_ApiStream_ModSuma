<h1 align="center">Tarea: Modificar flujo y devolver la suma</h1>
<p>Modificar flujo y devolver la suma</p>

<h2>Instrucciones de tarea</h2>
<p>Como desafió consiste en un arreglo de 100 elementos del 1 al 100, del tipo int, utilizando el api stream se pide:</p> 

-  eliminar los divisibles en 10
-  convertir los elementos restante del flujo en tipo double y dividirlos en 2
-  finalmente devolver la suma total de todos ellos usando el operador terminal reduce.

<p>El resultado debería ser <b>2250.0</b></p>

<h2 align="center">Respuesta del Profesor</h2>

```java
import java.util.Arrays;
public class ProyectoJava8Stream {
    public static void main(String[] args) {

        int[] arreglo = new int[100];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i+1;
        }

        double total = Arrays.stream(arreglo)
                .filter(e -> e % 10 != 0)
                .mapToDouble(e -> (double) e / 2)
                .reduce(0, (ac, e) -> ac + e);
        
        System.out.println(total); // 2250.0
    }
}
```

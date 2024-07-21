// Tarea Modulo 2 Ema Gomez.

package recurso;

public class Principal {

    public static void main(String[] args) {
        Recurso recursos = new Recurso();

        // Llamar al primer método
        recursos.imprimirMensaje();

        // Llamar al segundo método
        int edad = 15; 
        recursos.verificarEdad(edad);

        // Llamar al tercer método
        int a = 5;
        int b = 10;
        int resultadoMultiplicacion = recursos.multiplicar(a, b);
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);

        // Llamar al cuarto método
        int x = 10; 
        recursos.imprimirLista(x);
    }
}
// Tarea Modulo 2 Ema Gomez.

package recurso;

public class Recurso {

    // Primer método:
    void imprimirMensaje() {
        System.out.println("Programacion Orientada a Objetos 2021");
    }

    // Segundo método: 
    void verificarEdad(int edad) {
        if (edad >= 15) {
            System.out.println("Menor de edad");
        } else {
            System.out.println("Mayor de edad");
        }
    }

    // Tercer método:
    int multiplicar(int a, int b) {
        return a * b;
    }

    // Cuarto método: 
    void imprimirLista(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Recurso recurso = new Recurso();

        // Llamar al primer método
        recurso.imprimirMensaje();

        // Llamar al segundo método
        int edad = 20; 
        recurso.verificarEdad(edad);

        // Llamar al tercer método
        int a = 5;
        int b = 10;
        int resultadoMultiplicacion = recurso.multiplicar(a, b);
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);

        // Llamar al cuarto método
        int x = 10; 
        recurso.imprimirLista(x);
    }
}

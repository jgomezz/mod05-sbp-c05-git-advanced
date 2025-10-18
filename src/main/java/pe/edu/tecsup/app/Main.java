package pe.edu.tecsup.app;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int suma = obtenerSuma(5);
        System.out.println(suma);

    }
    */
    public static int obtenerSuma(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }

        int suma = 0;
        for (int i = 1; i <= n; i++) {
                suma += i;
        }
        return suma;
    }

    public static int obtenerFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
                factorial *= i;
        }
        return factorial;
    }

}

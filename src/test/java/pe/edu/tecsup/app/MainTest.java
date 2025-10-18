package pe.edu.tecsup.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void obtenerSuma() {

        int VALOR_ESP = 14;

        Main main = new Main();

        int resultado = main.obtenerSuma(5);

        assertEquals(VALOR_ESP, resultado);

    }
}
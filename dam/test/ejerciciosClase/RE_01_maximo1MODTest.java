package ejerciciosClase;

import org.junit.Test;

import static org.junit.Assert.*;

public class RE_01_maximo1MODTest {

    @Test
    public void devuelveMaximoCuandoDistintos() {
        assertEquals(5, RE_01_maximo1MOD.maximo(1, 3, 5));
    }

    @Test
    public void devuelveMaximoCuandoDosIgualesMaximo() {
        assertEquals(7, RE_01_maximo1MOD.maximo(7, 7, 4));
        assertEquals(7, RE_01_maximo1MOD.maximo(4, 7, 7));
    }

    @Test
    public void devuelveMaximoCuandoTodosIguales() {
        assertEquals(2, RE_01_maximo1MOD.maximo(2, 2, 2));
    }

    @Test
    public void manejaNumerosNegativos() {
        assertEquals(-1, RE_01_maximo1MOD.maximo(-5, -1, -3));
    }

    @Test
    public void mezclaPositivoNegativoCero() {
        assertEquals(10, RE_01_maximo1MOD.maximo(0, -2, 10));
        assertEquals(0, RE_01_maximo1MOD.maximo(-1, 0, -5));
    }
}

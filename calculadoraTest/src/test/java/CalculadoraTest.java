import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Variable para almacenar la instancia de Calculadora
    Calculadora calc;

    // Este método se ejecuta ANTES de cada prueba (@Test)
    @BeforeEach
    void setup() {
        System.out.println("Iniciando prueba...");
        // Creamos una nueva instancia de la calculadora antes de cada prueba
        calc = new Calculadora();
    }

    // Este método se ejecuta DESPUÉS de cada prueba (@Test)
    @AfterEach
    void cleanup() {
        System.out.println("Prueba finalizada!");
    }

    // Prueba unitaria para el método sumar
    @Test
    void testSumar() {
        System.out.println("Ejecutando testSumar...");
        int resultado = calc.sumar(3, 4);
        System.out.println("Resultado: " + resultado);
        assertEquals(7, resultado, "La suma debe ser 7");
    }

    // Prueba unitaria para el método dividir
    @Test
    void testDividir() {
        System.out.println("Ejecutando testDividir...");
        int resultado = calc.dividir(12, 4);
        System.out.println("Resultado: " + resultado);
        assertEquals(3, resultado, "La división debe ser 3");
    }

    // -----------------NUEVOS MÉTODOS------------------ //

    // Prueba unitaria para división por cero
    @Test
    void testDividirPorCero() {
        System.out.println("Ejecutando testDividirPorCero...");
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }

    // Prueba unitaria para restar con números positivos
    @Test
    void testRestarPositivos() {
        System.out.println("Ejecutando testRestarPositivos...");
        assertEquals(2, calc.restar(5, 3));
    }

    // Prueba unitaria para restar con números negativos
    @Test
    void testRestarNegativos() {
        System.out.println("Ejecutando testRestarNegativos...");
        assertEquals(-8, calc.restar(-5, 3));
    }

    // Prueba unitaria para multiplicar números positivos
    @Test
    void testMultiplicarPositivos() {
        System.out.println("Ejecutando testMultiplicarPositivos...");
        assertEquals(20, calc.multiplicar(4, 5));
    }

    // Prueba unitaria para multiplicar por cero
    @Test
    void testMultiplicarPorCero() {
        System.out.println("Ejecutando testMultiplicarPorCero...");
        assertEquals(0, calc.multiplicar(4, 0));
    }

    // Prueba unitaria para porcentaje con valores normales
    @Test
    void testPorcentajeNormal() {
        System.out.println("Ejecutando testPorcentajeNormal...");
        assertEquals(50.0, calc.porcentaje(50, 100));
    }

    // Prueba unitaria para porcentaje con total igual a cero
    @Test
    void testPorcentajeConTotalCero() {
        System.out.println("Ejecutando testPorcentajeConTotalCero...");
        assertThrows(ArithmeticException.class, () -> calc.porcentaje(10, 0));
    }

    // -----------------EXTRA------------------ //


    // Prueba unitaria para raíz cuadrada con número positivo
    @Test
    void testRaizCuadradaPositivo() {
        System.out.println("Ejecutando testRaizCuadradaPositivo...");
        assertEquals(4.0, calc.raizCuadrada(16));
    }

    // Prueba unitaria para raíz cuadrada con número negativo
    @Test
    void testRaizCuadradaNegativo() {
        System.out.println("Ejecutando testRaizCuadradaNegativo...");
        assertThrows(IllegalArgumentException.class, () -> calc.raizCuadrada(-9));
    }
}
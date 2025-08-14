public class Calculadora {

    public int sumar(int a, int b) {
        System.out.println("Método sumar() llamado con a = " + a + ", b = " + b);
        int resultado = a + b;
        System.out.println("Resultado de sumar: " + resultado);
        return resultado;
    }

    public int dividir(int a, int b) {
        System.out.println("Método dividir() llamado con a = " + a + ", b = " + b);
        if (b == 0) {
            System.out.println("⚠️ Error: intento de división por cero.");
            throw new ArithmeticException("No se puede dividir por cero");
        }
        int resultado = a / b;
        System.out.println("Resultado de dividir: " + resultado);
        return resultado;
    }

    // -----------------NUEVOS MÉTODOS------------------ //


    // Método para restar dos números
    public int restar(int a, int b) {
        System.out.println("Método restar() llamado con a = " + a + ", b = " + b);
        int resultado = a - b;
        System.out.println("Resultado de restar: " + resultado);
        return resultado;
    }

    // Método para multiplicar dos números
    public int multiplicar(int a, int b) {
        System.out.println("Método multiplicar() llamado con a = " + a + ", b = " + b);
        int resultado = a * b;
        System.out.println("Resultado de multiplicar: " + resultado);
        return resultado;
    }

    // Método para calcular el porcentaje (lanza excepción si total = 0)
    public double porcentaje(int parte, int total) {
        System.out.println("Método porcentaje() llamado con parte = " + parte + ", total = " + total);
        if (total == 0) {
            System.out.println("⚠️ Error: total es cero, no se puede calcular porcentaje.");
            throw new ArithmeticException("El total no puede ser 0");
        }
        double resultado = (parte * 100.0) / total;
        System.out.println("Resultado de porcentaje: " + resultado);
        return resultado;
    }

    // -----------------EXTRA------------------ //
    // Método para calcular la raíz cuadrada (lanza excepción si x < 0)
    public double raizCuadrada(double x) {
        System.out.println("Método raizCuadrada() llamado con x = " + x);
        if (x < 0) {
            System.out.println("⚠️ Error: número negativo.");
            throw new IllegalArgumentException("No se puede calcular raíz cuadrada de número negativo");
        }
        double resultado = Math.sqrt(x);
        System.out.println("Resultado de raizCuadrada: " + resultado);
        return resultado;
    }

}
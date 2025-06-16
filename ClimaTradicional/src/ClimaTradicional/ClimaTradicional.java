import java.util.Scanner;

public class ClimaTradicional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        System.out.println("=== Clima semanal - Versión Tradicional ===");

        for (int i = 0; i < dias.length; i++) {
            System.out.print("Ingrese la temperatura del " + dias[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }

        double promedio = suma / temperaturas.length;
        System.out.printf("El promedio semanal es: %.2f°C%n", promedio);
    }
}
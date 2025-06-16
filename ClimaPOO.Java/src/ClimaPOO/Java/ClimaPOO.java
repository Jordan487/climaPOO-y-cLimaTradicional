import java.util.ArrayList;
import java.util.Scanner;

class ClimaDia {
    private String dia;
    private double temperatura;

    public ClimaDia(String dia, double temperatura) {
        this.dia = dia;
        this.temperatura = temperatura;
    }

    public String getDia() {
        return dia;
    }

    public double getTemperatura() {
        return temperatura;
    }
}

class SemanaClimatica {
    private ArrayList<ClimaDia> dias;

    public SemanaClimatica() {
        dias = new ArrayList<>();
    }

    public void agregarDia(String dia, double temperatura) {
        dias.add(new ClimaDia(dia, temperatura));
    }

    public void mostrarTemperaturas() {
        for (ClimaDia dia : dias) {
            System.out.println(dia.getDia() + ": " + dia.getTemperatura() + "°C");
        }
    }

    public double calcularPromedio() {
        double suma = 0;
        for (ClimaDia dia : dias) {
            suma += dia.getTemperatura();
        }
        return dias.isEmpty() ? 0 : suma / dias.size();
    }
}

public class ClimaPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SemanaClimatica semana = new SemanaClimatica();
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        System.out.println("=== Clima semanal - Versión POO ===");

        for (String dia : diasSemana) {
            System.out.print("Ingrese la temperatura del " + dia + ": ");
            double temperatura = scanner.nextDouble();
            semana.agregarDia(dia, temperatura);
        }

        System.out.println("\nTemperaturas registradas:");
        semana.mostrarTemperaturas();

        double promedio = semana.calcularPromedio();
        System.out.printf("\nEl promedio semanal es: %.2f°C%n", promedio);
    }
}
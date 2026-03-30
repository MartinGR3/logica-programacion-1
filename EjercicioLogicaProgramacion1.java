import java.util.Scanner;

public class EjercicioLogicaProgramacion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame 3 números separados por espacio: ");
        String entrada = sc.nextLine();

        String[] numerosStr = entrada.split(" ");
        int[] numeros = new int[numerosStr.length];

        // Convertir a enteros
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }

        int max = numeros[0];
        int min = numeros[0];
        int mid = 0;

        // Primer for: obtener max y min
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) continue;

            if (numeros[i] > max) {
                max = numeros[i];
            } else if (numeros[i] < min) {
                min = numeros[i];
            } else {
                System.out.println("Los números son iguales");
                mid = numeros[i];
            }
        }

        // Segundo for: obtener el valor del medio
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != max && numeros[i] != min) {
                mid = numeros[i];
            }
        }

        System.out.printf("Mayor a menor: %d %d %d%n", max, mid, min);
        System.out.printf("Menor a mayor:%d %d %d%n", min, mid, max);
    }
}

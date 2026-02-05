import java.util.Scanner;

public class OperacionesM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[2][3];
        int[][] suma = new int[2][3];
        int[][] resta = new int[2][3];
        int[][] multiplicacion = new int[2][3];

        System.out.println("Ingrese los valores de la Matriz A:\n");
        completarMatrices(matrizA, sc);

        System.out.println("\nIngrese los valores de la Matriz B:\n");
        completarMatrices(matrizB, sc);

        sumaMatriz(matrizA, matrizB, suma);
        restaMatriz(matrizA, matrizB, resta);
        multiplicacionMatriz(matrizA, matrizB, multiplicacion);

        System.out.println("\nMatriz A:");
        mostrarResultado(matrizA);

        System.out.println("\nMatriz B:");
        mostrarResultado(matrizB);

        System.out.println("\nSuma de matrices:");
        mostrarResultado(suma);

        System.out.println("\nResta de matrices:");
        mostrarResultado(resta);

        System.out.println("\nMultiplicación de matrices:");
        mostrarResultado(multiplicacion);
    }

    // Función para completar matrices
    public static void completarMatrices(int[][] matriz, Scanner sc) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    // Función para sumar matrices
    public static void sumaMatriz(int[][] A, int[][] B, int[][] suma) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    // Función para restar matrices
    public static void restaMatriz(int[][] A, int[][] B, int[][] resta) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                resta[i][j] = A[i][j] - B[i][j];
            }
        }
    }

    // Función para multiplicar matrices
    public static void multiplicacionMatriz(int[][] A, int[][] B, int[][] multi) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                multi[i][j] = A[i][j] * B[i][j];
            }
        }
    }

    // Función para mostrar resultados
    public static void mostrarResultado(int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
 public class InvertirArreglo {
     public static void main(String[] args) {
         int[] numeros = {10, 20, 30, 40, 50};
         System.out.println("Arreglo original:");
         mostrarArreglo(numeros);
         invertir(numeros);
         System.out.println("Arreglo invertido:");
         mostrarArreglo(numeros);
     }
     public static void invertir(int[] arr) {
         int inicio = 0;
         int fin = arr.length - 1;
         while (inicio < fin) {
             int temp = arr[inicio];
             arr[inicio] = arr[fin];
             arr[fin] = temp;
             inicio++;
             fin--;
         }
     }
     public static void mostrarArreglo(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
         }
         System.out.println();
     }
 }
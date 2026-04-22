 public class NumeroMayor {
     public static void main(String[] args) {
         int a = 45;
         int b = 78;
         int c = 56;
         int mayor = encontrarMayor(a, b, c);
         System.out.println("El número mayor es: " + mayor);
     }
     public static int encontrarMayor(int x, int y, int z) {
         if (x >= y && x >= z) {
             return x;
         } else if (y >= z) {
             return y;
         } else {
             return z;
         }
     }
 }
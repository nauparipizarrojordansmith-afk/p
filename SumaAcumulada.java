public class SumaAcumulada {
     public static void main(String[] args) { 
         int suma = 0; 
         int i = 1; 
         while (i <= 100) { 
             suma += i; 
             i++; 
             }
         System.out.println("La suma del 1 al 100 es: " + suma); 
     }
}
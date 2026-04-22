 public class BuscarElemento {
     public static void main(String[] args) {
         int[] numeros = {5, 12, 8, 20, 15};
         int buscar = 20;
         boolean encontrado = false;
         for (int i = 0; i < numeros.length; i++) {
             if (numeros[i] == buscar) {
                 System.out.println("Número " + buscar + " encontrado en posición " + i);
                 encontrado = true;
                 break;
            }
         }
         if (!encontrado) {
             System.out.println("Número no encontrado");
         }
     }
 }
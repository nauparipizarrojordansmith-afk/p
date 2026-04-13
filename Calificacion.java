public class Calificacion {
    public static void main(String[] args) {
        int nota = 16;
        if (nota >= 18) { 
            System.out.println("Excelente"); 
         } else if (nota >= 14) { 
            System.out.println("Bueno");
         } else if (nota >= 11) {
            System.out.println("Regular"); 
         } else { 
            System.out.println("Desaprobado");
         }
    }
}
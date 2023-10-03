import java.util.Scanner;
public class App {
    static Scanner x=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //Metodos
        //Que no requieren datos de entrada ni devuleven de salida
        // que no requieren datos de entrada pero devuelven de salida
        //Requieren datos de entrada pero no devuelven datos de salida
        //Requieren datos de entrada y devuelven datos de entrada

        //Metodos sobrecargados(Sobrecarga de metodos)
        //Consiste en reutilizar el nombre de un metodo pero con distintos parametros de entradas

        //Declaracion de metodos

        mostrarHora(); 
        mostrarHora(2, 15, 36);
        mostrarHora(2, 0);
    }
      public static void mostrarHora(){ //version sin parametros de entrada
        System.out.print("Horas: ");
        int hr=x.nextInt();
        System.out.print("Minutos: ");
        int min=x.nextInt();
        System.out.print("Segundos: ");
        int seg=x.nextInt();
        System.out.println("La hora es: "+hr+" : "+min+" : "+seg +": ");
        }

        //Sobrecargar el metodo mostrarHora
        public static void mostrarHora(int hr, int min, int seg){
          System.out.println("La hora es: "+hr+" : "+min+" : "+seg +": ");
        }

        public static void mostrarHora(int hr, int min){
            int seg=46;
          System.out.println("La hora es: "+hr+" : "+min+" : "+seg);
        }
}

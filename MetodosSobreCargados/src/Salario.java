import java.util.Scanner;
 
public class Salario {
    static final double IR=0.156;
    static final double Inss=0.07,InssPatronal=0.225;
     static double Monto,Antiguedad,AfilacionDeSindicato,DeduccionIr,IngresoTotal,DeduccionInss,TotalDeduc,Patronal,Neto;
     
    public static Scanner x=new Scanner(System.in);

    public static double leerEntradas(){
        System.out.println("Digite su monto mensual");
        Monto=x.nextDouble();   
        return Monto;
    }

    public static double calcularAntiguedad(){
       Antiguedad=Monto*0.15;
       return Antiguedad;
    }

    public static double TotalDeducciones(){
     IngresoTotal=Monto+Antiguedad;

     DeduccionIr=IngresoTotal*IR;
     DeduccionInss=IngresoTotal*Inss;
     AfilacionDeSindicato=Monto*0.01;
     TotalDeduc=DeduccionInss+DeduccionIr+AfilacionDeSindicato; 

     Patronal=IngresoTotal*InssPatronal;    
     return TotalDeduc;  

    }

    public static void MostrarResultados(){
        Neto=IngresoTotal-TotalDeduc;
        Patronal=IngresoTotal*0.225;
        
    }

    


}

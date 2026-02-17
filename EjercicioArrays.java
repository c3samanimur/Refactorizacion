package ProblemaArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioArrays {
    
    public static void main(String[] args) {
        int numAlumnos = 40;
        int[] control = new int[numAlumnos];
		int[] practicas;
		float[] calificaciones;
        int maxNota;
        int minNota;
        int indMinNota = 0;
        int indMaxNota = 0;
        double[] calif;
        
        

        for(int i=0; i < control.length; i++){
            control[i] = (int)(Math.random()*11);
        }
        
        minNota = 11;
        maxNota = -1;
        for(int i = 0; i < control.length; i++) {
        	if(control[i] < minNota) {
        		minNota = control[i];
        	} 
        	if(control[i] > maxNota) {
        		maxNota = control[i];
        	}
        }
      
        
     
        for(int i = 0; i < control.length; i++) {
        	if(control[i] == minNota) {
        		indMinNota = i +1;
        	}
        	if(control[i] == maxNota) {
        		indMaxNota = i +1;
        	}
        }

       
        System.out.println("Mínimo es: " + minNota);
        System.out.println("Máximo es: " + maxNota);
        System.out.println("Indice del mínimo es : " + indMinNota);
        System.out.println("Indice del máximo es : " + indMaxNota);
       
        practicas = new int[numAlumnos];
        for(int i=0; i < practicas.length; i++){
            practicas[i] = (int)(Math.random()*11);
        }
      
        calificaciones = new float[numAlumnos];
        for(int i = 0; i<control.length; i++){
            calificaciones[i] = 
                    (((float) control[i] 
                    + (float) practicas[i]) 
                    / 2);
        }
        System.out.println("Prácticas      :" + Arrays.toString(practicas));
        System.out.println("Calificaciones :" + Arrays.toString(calificaciones));
        
        int[] contador = new int[10]; 

        for (float nota : calificaciones) {
            
            int num = (int)Math.min(Math.floor(nota), 9); //por si acaso es 10, que no se quede fuera
            if (nota >= 0) {
                contador[num]++;
            }
        }

        System.out.println("\n--- ESTADISTICA ---");
        for (int i = 0; i < 10; i++) {
            double porcentaje = (contador[i] / (double)numAlumnos) * 100;
            
   
            System.out.println("Porcentaje: " + porcentaje);
        }
        
        ArrayList<Integer> listaAprobados = new ArrayList<>();
        ArrayList<Integer> listaSuspensos = new ArrayList<>();

        for (int j = 0; j < calificaciones.length; j++) {
            if (calificaciones[j] >= 5) {
                listaAprobados.add(j + 1); 
            } else {
                listaSuspensos.add(j + 1);
            }
        }

        System.out.println("Resumen de aprobados (nº lista): " + listaAprobados);
        System.out.println("Resumen de suspensos (nº lista): " + listaSuspensos);
        
        calif = new double[40];
        for (int j=0; j<31; j++){
            calif[j] = (int)(Math.random()*11);
        }
        System.out.println("Nota antigua alumno nº4: " + calif[3]); 
        calif[3] = 6;
        System.out.println("Nota nueva   alumno nº4: " + calif[3]);
    }
}

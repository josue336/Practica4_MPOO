package p4ej;

public class P4ej2_1 {
	double promedio=0, max=0, min=0, calificaciones[]; int ap;
	final double calificacion_min=6.0;
	
	public void calificacion(double calificacion[]) { //La función de este método es poder asignar los valores de las calificaciones de la otra clase al arreglo de esta
		this.calificaciones=calificacion;
	}
	
	public void promedio(){
		int n; double suma=0;
		for(n=0;n<calificaciones.length;n++) {
			suma=suma+calificaciones[n];
		}
		promedio=suma/calificaciones.length;
	}
	
	public void maximo(){
		max=calificaciones[0];  //Se asigna el valor inicial al arreglo para evitar que se pierdan valores al momento de evaluar en el if
		for(int n=0;n<calificaciones.length;n++) {
			if(calificaciones[n]>max) {
				max=calificaciones[n];
			}
		}
	}
	public void minimo(){
		min=calificaciones[0]; //Se asigna el valor inicial al arreglo para evitar que se pierdan valores al momento de evaluar en el if
		for(int n=0;n<calificaciones.length;n++) {
			if(calificaciones[n]<min) {
				min=calificaciones[n];
			}
		}
	}
	public void aprobado() {
		ap=0;
		for(int n=0;n<calificaciones.length;n++) {
			if(calificaciones[n]>=calificacion_min) {
				ap++;
			}
		}
	}
	public void impresion() {
		System.out.print("Las calificaciones son las siguientes: ");
		for(int n=0; n<calificaciones.length;n++) {
			System.out.print(calificaciones[n] + ", ");
		}
		System.out.println("");
		System.out.println("El promedio es el siguiente: " + promedio);
		System.out.println("La calificación máxima es de: " + max);
		System.out.println("La calificación mínima es de: " + min);
		System.out.println("Aprobaron un total de " + ap + " alumnos");
		
	}
}

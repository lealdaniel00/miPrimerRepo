public class Carro{
	int kilometraje = 0;
	public void avanzar(int a){
		if(a>0){
			kilometraje=kilometraje+a;
		}else{
			System.out.println("Oiga, no se pueden sumar kilometros negativos");
		}
	}
	public int obtenerKilometraje(){
		return kilometraje;
	}
}
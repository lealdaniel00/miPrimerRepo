public class MiTercerEjercicio{
	public static void main(String[] arg){
		// Calculadora texas = new Calculadora();
		// System.out.println(texas.sumar(4,5));
		Carro kia = new Carro();
		Carro chevrolet = new Carro();
		
		kia.avanzar(100);
		System.out.println(kia.obtenerKilometraje());
		
		chevrolet.avanzar(-100);
		System.out.println(chevrolet.obtenerKilometraje());	
		
		// El estado del KIA es diferente al estado de Chevrolet

	}
}
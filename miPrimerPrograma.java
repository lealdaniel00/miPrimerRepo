public class miPrimerPrograma{
	public static void main(String[] arg){
		System.out.println("Hola Mundo");

		Carro renault4 = new Carro();

		renault4.avanzar();

		renault4.frenar();

		Calculadora casio =new Calculadora();
		
		casio.sumar(3,5);
		casio.restar(10,6);
		casio.multiplicar(2,3,4);

		Celular nokia = new Celular();
		nokia.apagar();
		nokia.encender();
		nokia.instalarAplicacion();
	}
}
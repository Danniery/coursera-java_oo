package week01;


public class Principal {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente(98, 1.82);		
		System.out.println("Paciente 01");
		System.out.printf("IMC: %.2f%n", paciente1.calcularIMC());
		System.out.println("Diagnóstico: " + paciente1.diagnostico());
		System.out.println("------------------------------------------");
		
		Paciente paciente2 = new Paciente(32, 1.55);		
		System.out.println("Paciente 02");
		System.out.printf("IMC: %.2f%n", paciente2.calcularIMC());
		System.out.println("Diagnóstico: " + paciente2.diagnostico());
		System.out.println("------------------------------------------");
		
		Paciente paciente3 = new Paciente(108, 1.63);
		System.out.println("Paciente 03");
		System.out.printf("IMC: %.2f%n", paciente3.calcularIMC());
		System.out.println("Diagnóstico: " + paciente3.diagnostico());
		System.out.println("------------------------------------------");
	}
}
package week01;

public class Paciente {
	private double peso;
	private double altura;
	private double imc;
	
	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public double getImc() {
		return imc;
	}

	// Método construtor
	public Paciente(double peso, double altura){ 
		this.peso = peso;
		this.altura = altura;
	}
	
	// Método para calcular o IMC
	double calcularIMC(){
		return imc = peso / Math.pow(altura, 2);
	}
	
	// Método que retorna o diagnóstico, conforme o IMC calculado
	public String diagnostico(){ 
		String diag = "";
		
		if(imc < 16){
			diag = "Baixo peso muito grave";
		}
		
		if(imc >= 16 && imc < 17){
			diag = "Baixo peso grave";				
		}
		
		if(imc >= 17 && imc < 18.45){
			diag = "Baixo peso";
		}
		
		if(imc >= 18.50 && imc < 25){
			diag = "Peso normal";
		}
		
		if(imc >= 25 && imc < 30){
			diag = "Sobrepeso";							
		}
		
		if(imc >= 30 && imc < 35){
			diag = "Obesidade grau I";								
		}
		
		if(imc >= 35 && imc < 40){
			diag = "Obesidade grau II";
		}
		
		if(imc >= 40){
			diag = "Obesidade grau III (obesidade mórbida)";
		}
		
		return diag;
		
	}
}


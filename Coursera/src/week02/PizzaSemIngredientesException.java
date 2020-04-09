package week02;

public class PizzaSemIngredientesException extends Exception {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "Não pode haver pizza sem ingredientes.";
	}

}


package week02;

public class CarrinhoDeCompras {
	
	private double total = 0.0;

	public void adicionaPizza(Pizza pizza) throws PizzaSemIngredientesException {
		if(pizza.semIngredientes()){
			throw new PizzaSemIngredientesException();
		}
		total += pizza.getPreco();
	}

	public double pegaTotal() {
		return total;
	}

}

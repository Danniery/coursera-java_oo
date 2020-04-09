package week02;

public class Principal {
	
	public static void main(String[] args) throws PizzaSemIngredientesException {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Molho de tomate");
		pizza1.adicionaIngrediente("Muçarela");
		carrinho.adicionaPizza(pizza1);
		
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Molho de tomate");
		pizza2.adicionaIngrediente("Muçarela");
		pizza2.adicionaIngrediente("Calabresa");
		pizza2.adicionaIngrediente("Cebola");
		carrinho.adicionaPizza(pizza2);

		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Molho de tomate");
		pizza3.adicionaIngrediente("Muçarela");
		pizza3.adicionaIngrediente("Ovo");
		pizza3.adicionaIngrediente("Presunto");
		pizza3.adicionaIngrediente("Bacon");
		pizza3.adicionaIngrediente("Azeitona");
		carrinho.adicionaPizza(pizza3);
		
		System.out.println("Total do carrinho (R$): " + carrinho.pegaTotal());
		System.out.println("Quantidade dos ingredientes: " + Pizza.pegaIngredientesContabilizados());
	}

}


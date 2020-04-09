package week02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
	private List<String> ingredientes = new ArrayList<String>();
	private static Map<String, Integer> ingredientesContabilizados = new HashMap<String, Integer>();

	public double getPreco() {
		if (ingredientes.size() <= 2) {
			return 15;
		}

		if (ingredientes.size() > 2 && ingredientes.size() <= 5) {
			return 20;
		} else {
			return 23;
		}
	}

	public void adicionaIngrediente(String ingrediente) {
		ingredientes.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}

	private static void contabilizaIngrediente(String ingrediente) {
		Integer contabilizacao = ingredientesContabilizados.get(ingrediente);
		if (contabilizacao == null) {
			ingredientesContabilizados.put(ingrediente, 1);
		} else {
			ingredientesContabilizados.put(ingrediente, contabilizacao + 1);
		}

	}

	public boolean semIngredientes() {
		return ingredientes.size() == 0;
	}

	public static Map<String, Integer> pegaIngredientesContabilizados() {
		return ingredientesContabilizados;
	}

}

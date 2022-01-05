package product;

import java.util.HashMap;

public class ProductManager {

	HashMap<Integer, Product> map = new HashMap<>();

	private static ProductManager instance;

	private ProductManager() {
	}

	public static ProductManager getInstance() {
		if (instance == null) {
			instance = new ProductManager();
		}
		return instance;
	}

	public Product get(Integer productId) {
		return this.map.get(productId);
	}

	public void add(Integer productId, Product product) {
		this.map.put(productId, product);
	}

	public void remove(Integer productId) {
		this.map.remove(productId);
	}

}
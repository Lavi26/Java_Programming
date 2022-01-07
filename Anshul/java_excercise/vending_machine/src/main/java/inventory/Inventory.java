package inventory;

public class Inventory {

	public Integer productId = 0;
	public Integer quantity = 0;

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventory(Integer productId, Integer quantity) {
		super();
		this.productId = productId;
		this.quantity = quantity;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void add(Integer productId, Integer quantity) {
		this.productId = productId;
		this.quantity += quantity;
	}

	public void update(Integer productId, Integer quantity) {
		this.productId = productId;
		this.quantity = quantity;
	}

	public void remove(Integer productId, Integer quantity) {
		this.productId = productId;
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return "product id [" + productId + "] quantity [" + quantity + "]";
	}

	public static void main(String[] args) {
	}
}
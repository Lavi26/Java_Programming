package product;

public class Price {

	private Double mrp;
	private Double productPrice;

	public Price(Double mrp, Double productPrice) {
		super();
		this.mrp = mrp;
		this.productPrice = productPrice;
	}

	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Price [mrp=" + mrp + ", productPrice=" + productPrice + "]";
	}
}
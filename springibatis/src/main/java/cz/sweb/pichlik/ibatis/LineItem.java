package cz.sweb.pichlik.ibatis;


public class LineItem {
	
	private long id;
	private int quantity;
	private Order order;
	private Product product;

	public LineItem() {}

	/**
	 * @return Returns the order.
	 */
	public Order getOrder() {
		return order;
	}
	/**
	 * @param order The order to set.
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	/**
	 * @return Returns the product.
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product The product to set.
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	/**
	 * @return Returns the quantity.
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity The quantity to set.
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return Returns the id.
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id The id to set.
	 */
	public void setId(long id) {
		this.id = id;
	}
}

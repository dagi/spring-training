package cz.sweb.pichlik.ibatis;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;


public class Order {	

	private long id;
	private Calendar orderDate;
	private Customer customer;
	private Collection<LineItem> lineItems = new ArrayList<LineItem>();
	private BigDecimal total;


	public Order() {}

	/**
	 * @return Returns the customer.
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer The customer to set.
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return Returns the lineItems.
	 */
	public Collection getLineItems() {
		return lineItems;
	}
	/**
	 * @param lineItems The lineItems to set.
	 */
	public void setLineItems(Collection lineItems) {
		this.lineItems = lineItems;
	}
	/**
	 * @return Returns the orderDate.
	 */
	public Calendar getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate The orderDate to set.
	 */
	public void setOrderDate(Calendar orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return Returns the total.
	 */
	public BigDecimal getTotal() {
		return total;
	}
	/**
	 * @param total The total to set.
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
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

package cz.sweb.pichlik.ibatis;

import java.util.ArrayList;
import java.util.List;
import java.util.GregorianCalendar;
import java.math.BigDecimal;


public class Customer {
	private long customerId;
	private String name;
	private String address;
	private List orders = new ArrayList();
	/**
	 * @return Returns the address.
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address The address to set.
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return Returns the customerId.
	 */
	public long getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId The customerId to set.
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return Returns the orders.
	 */
	public List getOrders() {
		return orders;
	}
	/**
	 * @param orders The orders to set.
	 */
	public void setOrders(List orders) {
		this.orders = orders;
	}

}

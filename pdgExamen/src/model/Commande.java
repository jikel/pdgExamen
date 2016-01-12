package model;

public class Commande {

	private int orderId;
	private int tableId;
	private String waiterId;
	private double totalPrice;
	private boolean status;

	public Commande(int idOrder, int tableId, String waiterId) {
		this.orderId = idOrder;
		this.tableId = tableId;
		this.waiterId = waiterId;
		this.totalPrice = 0;
		this.status = false;

	}

	public int getId() {
		return orderId;
	}

	public void setId(int id) {
		this.orderId = id;
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public String getWaiterId() {
		return waiterId;
	}

	public void setWaiterId(String waiterId) {
		this.waiterId = waiterId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Commande [orderId=" + orderId + ", tableId=" + tableId + ", waiterId=" + waiterId + ", totalPrice="
				+ totalPrice + ", status=" + status + "]";
	}

}
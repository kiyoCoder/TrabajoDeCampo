package P1;

public class Producto {
	private int cantidad, stock;
	private String codigo, descripcion;
	private double pUnitario;
	//Constructor
	public Producto(String descripcion, String codigo, int stock) {
		this.descripcion = descripcion;
		this.stock = stock;
		this.codigo = codigo;
	}
	public Producto(int cantidad, double pUnitario) {
		this.cantidad = cantidad;
		this.pUnitario = pUnitario;
	}
	//Getters And Setters
	public String getDescripcion() {
		return descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getpUnitario() {
		return pUnitario;
	}
	public void setpUnitario(double pUnitario) {
		this.pUnitario = pUnitario;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public double Total(int cantidad, double pUnitario) {
		return cantidad*pUnitario;
	}
}

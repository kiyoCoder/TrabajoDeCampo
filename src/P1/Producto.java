package P1;

public class Producto {
	private int codigo;
	private String descripcion;
	private double pUnitario;
	private int stock;
	//Constructor
	public Producto(int codigo, String descripcion, double pUnitario, int stock) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.pUnitario = pUnitario;
		this.stock = stock;
	}
	//Getters And Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
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
}

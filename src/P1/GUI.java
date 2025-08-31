package P1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTable;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	TitledBorder bordeArticulo = new TitledBorder("Articulo");
	private JTextField txtCodigo;
	private JTextField txtStock;
	private JTextField txtPUnitario;
	private JTextField txtCantidad;
	private JTable table;
	private JTextField txtRUC;
	private JTextField txtRazonSocial;
	private JTextField txtDomicilio;
	private JTextField txtSubTotal;
	private JTextField txtIGV;
	private JTextField txtTotal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Facturación");
		lblNewLabel.setFont(new Font("MS PGothic", Font.PLAIN, 24));
		lblNewLabel.setBounds(62, 0, 143, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblnombreDelRestaurante = new JLabel("(Nombre del restaurante)");
		lblnombreDelRestaurante.setFont(new Font("MS PGothic", Font.PLAIN, 24));
		lblnombreDelRestaurante.setBounds(10, 37, 247, 39);
		contentPane.add(lblnombreDelRestaurante);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel1.setBounds(281, 11, 149, 39);
		contentPane.add(panel1);
		
		JLabel lblNro = new JLabel("Nro: 000001");
		lblNro.setFont(new Font("MS PGothic", Font.PLAIN, 24));
		panel1.add(lblNro);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel.setBounds(10, 73, 420, 164);
		contentPane.add(panel);
		panel.setBorder(bordeArticulo);
		panel.setLayout(null);
		
		JLabel lblCdigo = new JLabel("Código:");
		lblCdigo.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCdigo.setBounds(10, 11, 102, 39);
		panel.add(lblCdigo);
		
		JLabel lblDescrp = new JLabel("Descripción:");
		lblDescrp.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblDescrp.setBounds(10, 38, 102, 39);
		panel.add(lblDescrp);
		
		JLabel lblPUnitario = new JLabel("P. Unitario:");
		lblPUnitario.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblPUnitario.setBounds(10, 68, 102, 39);
		panel.add(lblPUnitario);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCantidad.setBounds(10, 99, 102, 39);
		panel.add(lblCantidad);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(140, 22, 147, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JComboBox comboBoxDescripcion = new JComboBox();
		comboBoxDescripcion.setBounds(140, 48, 147, 22);
		panel.add(comboBoxDescripcion);
		
		JLabel lblStock = new JLabel("Stock:");
		lblStock.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblStock.setBounds(308, 11, 102, 39);
		panel.add(lblStock);
		
		txtStock = new JTextField();
		txtStock.setEditable(false);
		txtStock.setColumns(10);
		txtStock.setBounds(306, 49, 92, 20);
		panel.add(txtStock);
		
		txtPUnitario = new JTextField();
		txtPUnitario.setEditable(false);
		txtPUnitario.setColumns(10);
		txtPUnitario.setBounds(140, 79, 147, 20);
		panel.add(txtPUnitario);
		
		txtCantidad = new JTextField();
		txtCantidad.setEditable(false);
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(140, 110, 147, 20);
		panel.add(txtCantidad);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnAgregar.setBackground(SystemColor.activeCaption);
		btnAgregar.setBounds(308, 99, 89, 23);
		panel.add(btnAgregar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.activeCaption));
		panel_1.setBounds(10, 248, 420, 179);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCantidad_1 = new JLabel("Cantidad");
		lblCantidad_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCantidad_1.setBounds(10, 0, 102, 39);
		panel_1.add(lblCantidad_1);
		
		JLabel lblCantidad_1_1 = new JLabel("Descripción");
		lblCantidad_1_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCantidad_1_1.setBounds(102, 0, 102, 39);
		panel_1.add(lblCantidad_1_1);
		
		JLabel lblCantidad_1_1_1 = new JLabel("P. Unitario");
		lblCantidad_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCantidad_1_1_1.setBounds(214, 0, 102, 39);
		panel_1.add(lblCantidad_1_1_1);
		
		JLabel lblCantidad_1_1_1_1 = new JLabel("P. Total");
		lblCantidad_1_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCantidad_1_1_1_1.setBounds(315, 0, 102, 39);
		panel_1.add(lblCantidad_1_1_1_1);
		
		table = new JTable();
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.activeCaption));
		table.setBounds(10, 38, 389, 130);
		panel_1.add(table);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNuevo.setBackground(SystemColor.activeCaption);
		btnNuevo.setBounds(10, 428, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnSalir.setBackground(SystemColor.activeCaption);
		btnSalir.setBounds(109, 428, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblRucDni = new JLabel("R.U.C ");
		lblRucDni.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblRucDni.setBounds(10, 448, 54, 39);
		contentPane.add(lblRucDni);
		
		txtRUC = new JTextField();
		txtRUC.setColumns(10);
		txtRUC.setBounds(10, 477, 147, 20);
		contentPane.add(txtRUC);
		
		JLabel lblRaznSocial = new JLabel("Razón Social");
		lblRaznSocial.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblRaznSocial.setBounds(10, 490, 101, 39);
		contentPane.add(lblRaznSocial);
		
		txtRazonSocial = new JTextField();
		txtRazonSocial.setColumns(10);
		txtRazonSocial.setBounds(10, 518, 147, 20);
		contentPane.add(txtRazonSocial);
		
		JLabel lblRaznSocial_1 = new JLabel("Domicilio");
		lblRaznSocial_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblRaznSocial_1.setBounds(10, 530, 101, 39);
		contentPane.add(lblRaznSocial_1);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setColumns(10);
		txtDomicilio.setBounds(10, 560, 147, 20);
		contentPane.add(txtDomicilio);
		
		JLabel lblCantidad_1_2 = new JLabel("Sub Total.");
		lblCantidad_1_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCantidad_1_2.setBounds(226, 422, 102, 39);
		contentPane.add(lblCantidad_1_2);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setEditable(false);
		txtSubTotal.setColumns(10);
		txtSubTotal.setBounds(317, 431, 113, 20);
		contentPane.add(txtSubTotal);
		
		JLabel lblCantidad_1_2_1 = new JLabel("I.G.V.");
		lblCantidad_1_2_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCantidad_1_2_1.setBounds(226, 448, 102, 39);
		contentPane.add(lblCantidad_1_2_1);
		
		txtIGV = new JTextField();
		txtIGV.setEditable(false);
		txtIGV.setColumns(10);
		txtIGV.setBounds(317, 459, 113, 20);
		contentPane.add(txtIGV);
		
		JLabel lblCantidad_1_2_1_1 = new JLabel("Total.");
		lblCantidad_1_2_1_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCantidad_1_2_1_1.setBounds(226, 480, 102, 39);
		contentPane.add(lblCantidad_1_2_1_1);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setColumns(10);
		txtTotal.setBounds(317, 490, 113, 20);
		contentPane.add(txtTotal);
		
		JButton btnFacturar = new JButton("FACTURAR");
		btnFacturar.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnFacturar.setBackground(SystemColor.activeCaption);
		btnFacturar.setBounds(223, 530, 207, 23);
		contentPane.add(btnFacturar);
	}
}

package desactivarComponenteGrafico;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Principal extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtCiudad;
    private JLabel etiFrase; 
    private JButton btnAceptar;
    private JButton btnActivar;
    private JButton btnDesactivar;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(217, 11, 140, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(217, 60, 140, 20);
		frame.getContentPane().add(txtCiudad);
		
		etiFrase = new JLabel("");
		etiFrase.setHorizontalAlignment(SwingConstants.CENTER);
		etiFrase.setBounds(97, 91, 241, 63);
		frame.getContentPane().add(etiFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(268, 177, 89, 23);
		frame.getContentPane().add(btnAceptar);
		btnAceptar.addActionListener(this);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(73, 213, 89, 23);
		frame.getContentPane().add(btnDesactivar);
		btnDesactivar.addActionListener(this);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBounds(215, 213, 89, 23);
		frame.getContentPane().add(btnActivar);
		btnActivar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnAceptar) {
			String mensaje = "Usted se llama " + txtNombre.getText() + " y vive en " + txtCiudad.getText();
			etiFrase.setText(mensaje);
		} else if (e.getSource() == btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
		} else if (e.getSource() == btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}
	}
}

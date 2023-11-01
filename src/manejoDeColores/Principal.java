package manejoDeColores;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Principal extends JFrame implements ActionListener {

	private JFrame frame;
	private JLabel etiTexto;
	private JButton btnAzul;
	private JButton btnRojo;
	private JButton btnVerde;
	private JButton btnFondoAzul;
	private JButton btnFondoRojo;
	private JButton btnFondoVerde;
	private JButton btnTransparente;
	private JButton btnOpaca;

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
		
		etiTexto = new JLabel("Texto");
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setBounds(125, 11, 206, 31);
		frame.getContentPane().add(etiTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setBounds(10, 76, 89, 23);
		frame.getContentPane().add(btnAzul);
		btnAzul.addActionListener(this);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBounds(10, 110, 89, 23);
		frame.getContentPane().add(btnRojo);
		btnRojo.addActionListener(this);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBounds(10, 144, 89, 23);
		frame.getContentPane().add(btnVerde);
		btnVerde.addActionListener(this);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setBounds(172, 76, 89, 23);
		frame.getContentPane().add(btnFondoAzul);
		btnFondoAzul.addActionListener(this);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setBounds(172, 110, 89, 23);
		frame.getContentPane().add(btnFondoRojo);
		btnFondoRojo.addActionListener(this);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setBounds(172, 144, 89, 23);
		frame.getContentPane().add(btnFondoVerde);
		btnFondoVerde.addActionListener(this);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setBounds(335, 76, 89, 23);
		frame.getContentPane().add(btnTransparente);
		btnTransparente.addActionListener(this);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setBounds(335, 110, 89, 23);
		frame.getContentPane().add(btnOpaca);
		btnOpaca.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnAzul) {
			etiTexto.setForeground(Color.BLUE);
		} else if (e.getSource() == btnRojo) {
			etiTexto.setForeground(Color.RED);
		} else if (e.getSource() == btnVerde) {
			etiTexto.setForeground(Color.GREEN);
		} else if (e.getSource() == btnFondoAzul) {
			etiTexto.setBackground(Color.BLUE);
		} else if (e.getSource() == btnFondoRojo) {
			etiTexto.setBackground(Color.RED);
		} else if (e.getSource() == btnFondoVerde) {
			etiTexto.setBackground(Color.GREEN);
		} else if (e.getSource() == btnTransparente) {
			etiTexto.setOpaque(false);
		} else if (e.getSource() == btnOpaca) {
			etiTexto.setOpaque(true);
		}
	}

}

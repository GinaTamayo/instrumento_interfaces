package informacionComponentesGraficos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener {
	private JTextField txtTexto;
	
	private JLabel etiTexto1;
	private JLabel etiTexto2;
	private JButton btnTraspasa1;
	private JButton btnTraspasa2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 328);
		getContentPane().setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setHorizontalAlignment(SwingConstants.CENTER);
		txtTexto.setBounds(117, 11, 240, 78);
		getContentPane().add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto1.setBounds(63, 117, 89, 66);
		getContentPane().add(etiTexto1);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto2.setBounds(316, 117, 89, 66);
		getContentPane().add(etiTexto2);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setBounds(63, 206, 89, 23);
		getContentPane().add(btnTraspasa1);
		btnTraspasa1.addActionListener(this);
		
		btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setBounds(316, 206, 89, 23);
		getContentPane().add(btnTraspasa2);
		btnTraspasa2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnTraspasa1) {
			etiTexto1.setText(txtTexto.getText());
		} else if (e.getSource() == btnTraspasa2) {
			etiTexto2.setText(txtTexto.getText());
		}
	}
}

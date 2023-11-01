package NotaEstudiantes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField txtTercerTrimestre;
	private JLabel etiNotaFinal;
	private JLabel etiResultado;
	private JButton btnCalcular;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setToolTipText("");
		txtPrimerTrimestre.setBounds(174, 10, 86, 20);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setColumns(10);
		txtSegundoTrimestre.setBounds(174, 41, 86, 20);
		contentPane.add(txtSegundoTrimestre);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setColumns(10);
		txtTercerTrimestre.setBounds(174, 72, 86, 20);
		contentPane.add(txtTercerTrimestre);
		
		etiNotaFinal = new JLabel("");
		etiNotaFinal.setHorizontalAlignment(SwingConstants.CENTER);
		etiNotaFinal.setBounds(27, 115, 376, 43);
		contentPane.add(etiNotaFinal);
		
		etiResultado = new JLabel("");
		etiResultado.setHorizontalAlignment(SwingConstants.CENTER);
		etiResultado.setBounds(109, 157, 218, 43);
		contentPane.add(etiResultado);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(174, 211, 89, 23);
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnCalcular) {
		    double nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
		    double nota2 = Double.parseDouble(txtSegundoTrimestre.getText());
		    double nota3 = Double.parseDouble(txtTercerTrimestre.getText());

			double promedio = (nota1 + nota2 + nota3) / 3; 
			etiNotaFinal.setText("La nota final es:" + promedio );
			if (promedio < 5) {
				etiResultado.setForeground(Color.red);
				etiResultado.setText("SUSPENSO");
			} else if (promedio >= 5) {
				etiResultado.setForeground(Color.black);
				etiResultado.setText("APROBADO");
			}
		}
	}

}

package asignacionValores;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JLabel etiUno;
	private JLabel etiDos;
	private JLabel etiTres;
	private JLabel etiCuatro;
	private JLabel etiCinco;
	private JLabel etiSeis;
	private JLabel etiSiete;
	private JLabel etiOcho;
	private JLabel etiNueve;
	private JLabel etiDiez;
	private JButton btnBorrar;


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
		
		etiUno = new JLabel("0");
		etiUno.setHorizontalAlignment(SwingConstants.CENTER);
		etiUno.setBounds(52, 11, 46, 22);
		contentPane.add(etiUno);
		etiUno.addMouseListener(this);
		
		etiDos = new JLabel("1");
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setBounds(52, 48, 46, 22);
		contentPane.add(etiDos);
		etiDos.addMouseListener(this);
		
		etiTres = new JLabel("2");
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setBounds(52, 87, 46, 22);
		contentPane.add(etiTres);
		etiTres.addMouseListener(this);
		
		JLabel etiCuatro = new JLabel("3");
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setBounds(189, 11, 46, 22);
		contentPane.add(etiCuatro);
		etiCuatro.addMouseListener(this);
		
		etiCinco = new JLabel("4");
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setBounds(189, 48, 46, 22);
		contentPane.add(etiCinco);
		etiCinco.addMouseListener(this);
		
		etiSeis = new JLabel("5");
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setBounds(189, 87, 46, 22);
		contentPane.add(etiSeis);
		etiSeis.addMouseListener(this);
		
		etiSiete = new JLabel("6");
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setBounds(189, 131, 46, 22);
		contentPane.add(etiSiete);
		etiSiete.addMouseListener(this);
		
		etiOcho = new JLabel("7");
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setBounds(329, 11, 46, 22);
		contentPane.add(etiOcho);
		etiOcho.addMouseListener(this);
		
		etiNueve = new JLabel("8");
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setBounds(329, 48, 46, 22);
		contentPane.add(etiNueve);
		etiNueve.addMouseListener(this);

		etiDiez = new JLabel("9");
		etiDiez.setHorizontalAlignment(SwingConstants.CENTER);
		etiDiez.setBounds(329, 87, 46, 22);
		contentPane.add(etiDiez);
		etiDiez.addMouseListener(this);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(134, 177, 161, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(175, 206, 89, 23);
		contentPane.add(btnBorrar);
		btnBorrar.addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnBorrar) {
			txtNumero.setText("");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == etiUno) {
			txtNumero.setText(txtNumero.getText() + etiUno.getText());
		} else if (e.getSource() == etiDos) {
			txtNumero.setText(txtNumero.getText() + etiDos.getText());
		} else if (e.getSource() == etiTres) {
			txtNumero.setText(txtNumero.getText() + etiTres.getText());
		} else if (e.getSource() == etiCuatro) {
			txtNumero.setText(txtNumero.getText() + etiCuatro.getText());
		} else if (e.getSource() == etiCinco) {
			txtNumero.setText(txtNumero.getText() + etiCinco.getText());
		} else if (e.getSource() == etiSeis) {
			txtNumero.setText(txtNumero.getText() + etiSeis.getText());
		} else if (e.getSource() == etiSiete) {
			txtNumero.setText(txtNumero.getText() + etiSiete.getText());
		} else if (e.getSource() == etiOcho) {
			txtNumero.setText(txtNumero.getText() + etiOcho.getText());
		} else if (e.getSource() == etiNueve) {
			txtNumero.setText(txtNumero.getText() + etiNueve.getText());
		} else if (e.getSource() == etiDiez) {
			txtNumero.setText(txtNumero.getText() + etiDiez.getText());
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

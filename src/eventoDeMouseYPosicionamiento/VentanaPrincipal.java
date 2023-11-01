package eventoDeMouseYPosicionamiento;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaPrincipal extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane;
	private JLabel etiNombre;
	private JButton btnEsquina;
	private JButton btnCentro;
	private JButton btnAgrandar;
	private JButton btnAchicar;


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
		
		etiNombre = new JLabel("Nombre");
		etiNombre.setOpaque(true);
		etiNombre.setBackground(new Color(255, 128, 192));
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setBounds(166, 11, 103, 22);
		contentPane.add(etiNombre);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(41, 109, 89, 23);
		contentPane.add(btnEsquina);
		btnEsquina.addActionListener(this);
		
		btnCentro = new JButton("Centro");
		btnCentro.setBounds(41, 155, 89, 23);
		contentPane.add(btnCentro);
		btnCentro.addActionListener(this);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(293, 109, 89, 23);
		contentPane.add(btnAgrandar);
		btnAgrandar.addActionListener(this);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setBounds(293, 155, 89, 23);
		contentPane.add(btnAchicar);
		btnAchicar.addActionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		if (e.getSource()==btnEsquina) {
            btnEsquina.setSize(96, 30);
        }else if (e.getSource()==btnCentro) {
            btnCentro.setSize(96, 30);
        }else if (e.getSource()==btnAchicar) {
            btnAchicar.setSize(96, 30);
        }else if (e.getSource()==btnAgrandar) {
            btnAgrandar.setSize(96, 30);
        }
	 }

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnEsquina) {
	        btnEsquina.setSize(89, 23);
	    }else if (e.getSource()==btnCentro) {
	        btnCentro.setSize(89, 23);
	    }else if (e.getSource()==btnAchicar) {
	        btnAchicar.setSize(89, 23);
	    }else if (e.getSource()==btnAgrandar) {
	        btnAgrandar.setSize(89, 23);
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnEsquina) {
			etiNombre.setLocation(10, 10);
		} else if (e.getSource() == btnCentro) {
			etiNombre.setLocation(110, 166);
		} else if (e.getSource() == btnAgrandar) {
			 etiNombre.setSize(50, 40);
		}else if (e.getSource() == btnAchicar) {
			 etiNombre.setSize(50, 10);
		}
		
	}

	
}

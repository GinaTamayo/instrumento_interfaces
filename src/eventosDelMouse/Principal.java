package eventosDelMouse;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Principal extends JFrame implements MouseListener{

	private JFrame frame;
	private JLabel etiPal1;
	private JLabel etiPal2;
	private JLabel etiPal3;
	private JLabel etiPal4;
	private JLabel etiOcultar;


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
		
		etiPal1 = new JLabel("Pal1");
		etiPal1.setBounds(46, 27, 69, 14);
		frame.getContentPane().add(etiPal1);
		
		etiPal2 = new JLabel("Pal2");
		etiPal2.setBounds(291, 27, 69, 14);
		frame.getContentPane().add(etiPal2);
		
		etiPal3 = new JLabel("Pal3");
		etiPal3.setBounds(46, 75, 69, 14);
		frame.getContentPane().add(etiPal3);
		
		etiPal4 = new JLabel("Pal4");
		etiPal4.setBounds(291, 75, 69, 14);
		frame.getContentPane().add(etiPal4);
		
		etiOcultar = new JLabel("Ocultar");
		etiOcultar.setOpaque(true);
		etiOcultar.setBackground(new Color(0, 255, 255));
		etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcultar.setBounds(89, 125, 213, 93);
		frame.getContentPane().add(etiOcultar);
		
		etiOcultar.addMouseListener(this);
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
		if (e.getSource() == etiOcultar) {
			etiPal1.setVisible(false);
			etiPal2.setVisible(false);
			etiPal3.setVisible(false);
			etiPal4.setVisible(false);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == etiOcultar) {
			etiPal1.setVisible(true);
			etiPal2.setVisible(true);
			etiPal3.setVisible(true);
			etiPal4.setVisible(true);
		}
	}

}




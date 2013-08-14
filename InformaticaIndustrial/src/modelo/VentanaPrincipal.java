package modelo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
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
		setBounds(100, 100, 568, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lb_padre = new JLabel("New label");
		GridBagConstraints gbc_lb_padre = new GridBagConstraints();
		gbc_lb_padre.insets = new Insets(0, 0, 5, 5);
		gbc_lb_padre.gridx = 1;
		gbc_lb_padre.gridy = 1;
		contentPane.add(lb_padre, gbc_lb_padre);
		
		JLabel lb_hijo = new JLabel("New label");
		GridBagConstraints gbc_lb_hijo = new GridBagConstraints();
		gbc_lb_hijo.insets = new Insets(0, 0, 5, 0);
		gbc_lb_hijo.gridx = 2;
		gbc_lb_hijo.gridy = 2;
		contentPane.add(lb_hijo, gbc_lb_hijo);
		
		JLabel lb_hijo2 = new JLabel("New label");
		GridBagConstraints gbc_lb_hijo2 = new GridBagConstraints();
		gbc_lb_hijo2.gridx = 2;
		gbc_lb_hijo2.gridy = 3;
		contentPane.add(lb_hijo2, gbc_lb_hijo2);
		
		
	}
	
	public void ArmaGrilla(Nodo nodo,Integer x, Integer y)
	{
//		//FALTA IR VARIANDO LOS lb_hijo SEGUN VA ITERANDO
//			JLabel lb_hijo2 = new JLabel("Padre" + nodo.GetValor());
//			GridBagConstraints gbc_lb_hijo2 = new GridBagConstraints();
//			gbc_lb_hijo2.gridx = x;
//			gbc_lb_hijo2.gridy = y;
//			contentPane.add(lb_hijo2, gbc_lb_hijo2);
//			while (nodo.GetHijos()!=null)
//			{
//				for (Nodo hijo: nodo.GetHijos())
//				{
//					ArmaGrilla(hijo,x+2,y+1);
//				}
//			}
//		
	}
}

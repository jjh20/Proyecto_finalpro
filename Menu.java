package Venta;

import java.awt.BorderLayout;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class Menu extends JFrame {
// esta es la clase menu.
	
	
	//Aqu� estan todas la variabes utilizada en este programa. 
	//Tambien estan la variables de la extencion JFrame.
		
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	//Este es el Main de esta clases.  

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	//Este es el Constructor 
		//Donde tenemos todos los procesos de jFrame 

	
	public Menu() {
		// Aqu� comienza el interfaz grafico.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 228);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 50, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Usuarios");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setIcon(new ImageIcon(Menu.class.getResource("/Venta/groups_users_people_4517.png")));
	
		btnNewButton.setToolTipText("");
		btnNewButton.addActionListener(new ActionListener() {
			//aqui esta la fucionalidad del boton actualizar.
			public void actionPerformed(ActionEvent e) {
		//Este este bot�n sirve para ir la interfaz de usuario.
			principal Prin = new principal();
			Prin.setVisible(true);
			dispose();
			}
		});
		btnNewButton.setBounds(49, 97, 158, 59);
		
		contentPane.add(btnNewButton);
		
		//bot�n Producto.
		JButton btnNewButton_1 = new JButton("Productos");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Este este bot�n sirve para ir la interfaz de producto.
			Producto produ = new Producto();
			produ.setVisible(true);
			dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Menu.class.getResource("/Venta/fs.png")));
		btnNewButton_1.setBounds(221, 97, 169, 59);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Onyx", Font.BOLD, 26));
		lblNewLabel.setBounds(177, 11, 88, 24);
		contentPane.add(lblNewLabel);
	}
	// aqu� termina el interfaz grafico.		

}

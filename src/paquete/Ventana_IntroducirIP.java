package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class Ventana_IntroducirIP extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_IntroducirIP frame = new Ventana_IntroducirIP();
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
	public Ventana_IntroducirIP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Botones
		//Boton de historial
		JButton btnHistorial = new JButton("Historial");
		btnHistorial.setBounds(331, 189, 89, 23);
		contentPane.add(btnHistorial);
		//Boton mostrar resultado
		JButton btnMostrar = new JButton("Mostrar resultado");
		btnMostrar.setBounds(150, 189, 152, 23);
		contentPane.add(btnMostrar);
		
		//Boton ir hacia atrás
		JButton btn_Atras = new JButton("Atrás");       
		btn_Atras.setBounds(36, 189, 89, 23);
		btn_Atras.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(btn_Atras);
		
		//LABELS
		//Label titulo
		JLabel lblTitulo = new JLabel("GeoIpScan");
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTitulo.setBounds(224, 15, 132, 41);
		contentPane.add(lblTitulo);
		//Label Introduzca la IP
		JLabel lblIntroduzca = new JLabel("Introduzca la IP");
		lblIntroduzca.setFont(new Font("Arial", Font.PLAIN, 16));
		lblIntroduzca.setBounds(68, 96, 111, 14);
		contentPane.add(lblIntroduzca);
		
		//Campo de texto
		//Campo de ingresar IP
		JTextArea txtIngresar = new JTextArea();
		txtIngresar.setBounds(217, 91, 127, 22);
		contentPane.add(txtIngresar);
		
		btn_Atras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ventana_Registrarse Ventana_Registrarse = new Ventana_Registrarse();
                Ventana_Registrarse.setVisible(true);
                dispose();
            }
        });
		
		
	}
}

package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Ventana_IniciarSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_IniciarSesion frame = new Ventana_IniciarSesion();
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
	public Ventana_IniciarSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CAMPOS DE TEXTO
		//Campo de texto usuario
		txtNombre = new JTextField();
		txtNombre.setBounds(216, 70, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		//Campo de texto contraseña
		txtPass = new JPasswordField();
		txtPass.setBounds(216, 116, 86, 20);
		contentPane.add(txtPass);
		
		//LABELS
		//Label del campo de texto usuario
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(133, 61, 54, 35);
		contentPane.add(lblNewLabel);
		//Label del campo de texto Contraseña
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setFont(new Font("Arial", Font.PLAIN, 16));
		lblContrasea.setBounds(106, 107, 81, 35);
		contentPane.add(lblContrasea);
		//Label titulo
		JLabel lblIniciarSesin = new JLabel("Iniciar sesión");
		lblIniciarSesin.setFont(new Font("Arial", Font.PLAIN, 16));
		lblIniciarSesin.setBounds(165, 15, 91, 35);
		contentPane.add(lblIniciarSesin);
		
		//BOTONES
		//Boton continuar
		JButton btn_Continuar = new JButton("Continuar");
		btn_Continuar.setFont(new Font("Arial", Font.PLAIN, 13));
		btn_Continuar.setBounds(239, 173, 89, 23);
		contentPane.add(btn_Continuar);
		//Boton para ir hacia atrás
		JButton btn_Atras = new JButton("Atrás");
		btn_Atras.setFont(new Font("Arial", Font.PLAIN, 13));
		btn_Atras.setBounds(106, 173, 89, 23);
		contentPane.add(btn_Atras);
		
		//METODOS
		//Metodo del boton "Ir hacia atras" FUNCIONA
		 btn_Atras.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                Ventana_Registrarse ventanaInicio = new Ventana_Registrarse();
	                ventanaInicio.setVisible(true);
	                dispose();
	            }
	        });
			
	}
}

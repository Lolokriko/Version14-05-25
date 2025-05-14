package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class VentanaCrearCuenta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCrearCuenta frame = new VentanaCrearCuenta();
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
	public VentanaCrearCuenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Campos de texto
		//Campo de texto Usuario
		JTextArea textArea = new JTextArea();
		textArea.setBounds(212, 76, 105, 22);
		contentPane.add(textArea);
		//Campo de texto Contraseña
		passwordField = new JPasswordField();
		passwordField.setBounds(214, 121, 103, 20);
		contentPane.add(passwordField);
		
		//LABELS
		//Label campo usuario
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(76, 76, 89, 18);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		//Label campo contraseña
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(76, 123, 89, 18);
		lblContrasea.setFont(new Font("Arial", Font.PLAIN, 16));
		contentPane.add(lblContrasea);
		//Label titulo Crear Cuenta
		JLabel lblCrearCuenta = new JLabel("Crear cuenta");
		lblCrearCuenta.setBounds(145, 21, 117, 25);
		lblCrearCuenta.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(lblCrearCuenta);
		
		//BOTONES
		//Boton crear cuenta
		JButton btn_Crear = new JButton("Crear");
		btn_Crear.setBounds(159, 205, 89, 23);
		btn_Crear.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(btn_Crear);
		//Boton ir hacia atrás
		JButton btn_Atras = new JButton("Atrás");       
		btn_Atras.setBounds(159, 171, 89, 23);
		btn_Atras.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(btn_Atras);
		
		
		btn_Atras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ventana_Registrarse ventanaInicio = new Ventana_Registrarse();
                ventanaInicio.setVisible(true);
                dispose();
            }
        });
		
	}
}


package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel JFramePrincipal;

	/**
	 * Launch the application.
	 */
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
	public Menu() {
		setTitle("Menu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 469);
		JFramePrincipal = new JPanel();
		JFramePrincipal.setBackground(new Color(255, 255, 204));

		setContentPane(JFramePrincipal);
		JFramePrincipal.setLayout(null);
		
		JPanel JPanelPrincipal = new JPanel();
		JPanelPrincipal.setBackground(new Color(255, 255, 204));
		JPanelPrincipal.setBounds(0, 0, 580, 430);
		JFramePrincipal.add(JPanelPrincipal);
		JPanelPrincipal.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel JLabelTitulo = new JLabel("Meu primeiro menu");
		JPanelPrincipal.add(JLabelTitulo);
		JLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		JLabelTitulo.setFont(new Font("Times New Roman", Font.BOLD, 32));
		
		JPanel JPanelBotoes = new JPanel();
		JPanelBotoes.setBackground(new Color(255, 255, 204));
		JPanelPrincipal.add(JPanelBotoes);
		JPanelBotoes.setLayout(null);
		
		JButton JButtonCalculadora = new JButton("Calculadora");
		JButtonCalculadora.setFocusPainted(false);
		JButtonCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculadora calc = new Calculadora();
				calc.setVisible(true);
				calc.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		
		JButtonCalculadora.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonCalculadora.setToolTipText("Acessar Calculadora");
		JButtonCalculadora.setBounds(225, 11, 124, 23);
		JPanelBotoes.add(JButtonCalculadora);
		
		JButton JButtonFormulario = new JButton("Formul\u00E1rio");
		JButtonFormulario.setFocusPainted(false);
		JButtonFormulario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonFormulario.setToolTipText("Acessar Formul\u00E1rio");
		JButtonFormulario.setBounds(225, 61, 124, 23);
		JPanelBotoes.add(JButtonFormulario);
		
		JButton JButtonProjeto = new JButton("Projeto");
		JButtonProjeto.setFocusPainted(false);
		JButtonProjeto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonProjeto.setToolTipText("Acessar Projeto");
		JButtonProjeto.setBounds(225, 109, 124, 23);
		JPanelBotoes.add(JButtonProjeto);
		
		JLabel JLabelAutoria = new JLabel("powered by \u00AEEnrico");
		JLabelAutoria.setVerticalAlignment(SwingConstants.BOTTOM);
		JPanelPrincipal.add(JLabelAutoria);
		JLabelAutoria.setHorizontalAlignment(SwingConstants.CENTER);
		JLabelAutoria.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		
		JPanel JPanelPrincipal_1 = new JPanel();
		JPanelPrincipal_1.setBackground(new Color(255, 255, 204));
		JPanelPrincipal_1.setBounds(0, 0, 580, 430);
		JFramePrincipal.add(JPanelPrincipal_1);
		JPanelPrincipal_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel JLabelTitulo_1 = new JLabel("Meu primeiro menu");
		JLabelTitulo_1.setHorizontalAlignment(SwingConstants.CENTER);
		JLabelTitulo_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		JPanelPrincipal_1.add(JLabelTitulo_1);
		
		JPanel JPanelBotoes_1 = new JPanel();
		JPanelBotoes_1.setLayout(null);
		JPanelBotoes_1.setBackground(new Color(255, 255, 204));
		JPanelPrincipal_1.add(JPanelBotoes_1);
		
		JButton JButtonCalculadora_1 = new JButton("Calculadora");
		JButtonCalculadora_1.setToolTipText("Acessar Calculadora");
		JButtonCalculadora_1.setBounds(225, 11, 124, 23);
		JPanelBotoes_1.add(JButtonCalculadora_1);
		
		JButton JButtonFormulario_1 = new JButton("Formul\u00E1rio");
		JButtonFormulario_1.setToolTipText("Acessar Formul\u00E1rio");
		JButtonFormulario_1.setBounds(225, 61, 124, 23);
		JPanelBotoes_1.add(JButtonFormulario_1);
		
		JButton JButtonProjeto_1 = new JButton("Projeto");
		JButtonProjeto_1.setToolTipText("Acessar Projeto");
		JButtonProjeto_1.setBounds(225, 109, 124, 23);
		JPanelBotoes_1.add(JButtonProjeto_1);
		
		JLabel JLabelAutoria_1 = new JLabel("powered by @Enrico");
		JLabelAutoria_1.setVerticalAlignment(SwingConstants.BOTTOM);
		JLabelAutoria_1.setHorizontalAlignment(SwingConstants.CENTER);
		JLabelAutoria_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		JPanelPrincipal_1.add(JLabelAutoria_1);
	}
}

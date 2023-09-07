package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import java.awt.Component;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel JPanelPrincipal;
	private JTextField JTextFieldResultado;
	private JTextField JTextFieldHistorico;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	
	public Calculadora() {
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 545);
		JPanelPrincipal = new JPanel();
		JPanelPrincipal.setBackground(new Color(204, 204, 204));
		JPanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(JPanelPrincipal);
		JPanelPrincipal.setLayout(null);
		
		JPanel JPanelTeclas = new JPanel();
		JPanelTeclas.setBackground(new Color(204, 204, 204));
		JPanelTeclas.setBounds(0, 149, 397, 322);
		JPanelPrincipal.add(JPanelTeclas);
		JPanelTeclas.setLayout(new GridLayout(5, 4, 1, 1));
		
		JButton JButtonLimpa = new JButton("CE");
		JButtonLimpa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonLimpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextFieldResultado.setText("0");
			}
		});
		JButtonLimpa.setFocusPainted(false);
		JPanelTeclas.add(JButtonLimpa);
		
		JButton JButtonLimpaTudo = new JButton("C");
		JButtonLimpaTudo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonLimpaTudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextFieldResultado.setText("0");
				JTextFieldHistorico.setText("");
			}
		});
		JButtonLimpaTudo.setFocusPainted(false);
		JPanelTeclas.add(JButtonLimpaTudo);
		
		JButton JButtonApagar = new JButton("\u21DA");
		JButtonApagar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JTextFieldResultado.getText().length() > 1) {
					StringBuilder visor = new StringBuilder(JTextFieldResultado.getText());
					JTextFieldResultado.setText(visor.deleteCharAt(JTextFieldResultado.getText().length() - 1).toString());
				}
				else {JTextFieldResultado.setText("0");}
			}
		});
		JButtonApagar.setFocusPainted(false);
		JPanelTeclas.add(JButtonApagar);
		
		JButton JButtonDivisao = new JButton("\u00F7");
		JButtonDivisao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operar("÷");
			}
		});
		JButtonDivisao.setFocusPainted(false);
		JPanelTeclas.add(JButtonDivisao);
		
		JButton JButton7 = new JButton("7");
		JButton7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitar("7");
			}
		});
		JButton7.setFocusPainted(false);
		JPanelTeclas.add(JButton7);
		
		JButton JButton8 = new JButton("8");
		JButton8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitar("8");
			}
		});
		JButton8.setFocusPainted(false);
		JPanelTeclas.add(JButton8);
		
		JButton JButton9 = new JButton("9");
		JButton9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitar("9");
			}
		});
		JButton9.setFocusPainted(false);
		JPanelTeclas.add(JButton9);
		
		JButton JButtonMultiplicacao = new JButton("*");
		JButtonMultiplicacao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operar("*");
			}
		});
		JButtonMultiplicacao.setFocusPainted(false);
		JPanelTeclas.add(JButtonMultiplicacao);
		
		JButton JButton4 = new JButton("4");
		JButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitar("4");
			}
		});
		JButton4.setFocusPainted(false);
		JPanelTeclas.add(JButton4);
		
		JButton JButton5 = new JButton("5");
		JButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitar("5");
			}
		});
		JButton5.setFocusPainted(false);
		JPanelTeclas.add(JButton5);
		
		JButton JButton6 = new JButton("6");
		JButton6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitar("6");
			}
		});
		JButton6.setFocusPainted(false);
		JPanelTeclas.add(JButton6);
		
		JButton JButtonSubtracao = new JButton("-");
		JButtonSubtracao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operar("-");
			}
		});
		JButtonSubtracao.setFocusPainted(false);
		JPanelTeclas.add(JButtonSubtracao);
		
		JButton JButton1 = new JButton("1");
		JButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitar("1");
			}
		});
		JButton1.setFocusPainted(false);
		JPanelTeclas.add(JButton1);
		
		JButton JButton2 = new JButton("2");
		JButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitar("2");
			}
		});
		JButton2.setFocusPainted(false);
		JPanelTeclas.add(JButton2);
		
		JButton JButton3 = new JButton("3");
		JButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitar("3");
			}
		});
		JButton3.setFocusPainted(false);
		JPanelTeclas.add(JButton3);
		
		JButton JButtonSoma = new JButton("+");
		JButtonSoma.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operar("+");
			}
		});
		JButtonSoma.setFocusPainted(false);
		JPanelTeclas.add(JButtonSoma);
		
		JButton JButtonMaisMenos = new JButton("+/-");
		JButtonMaisMenos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonMaisMenos.setFocusPainted(false);
		JPanelTeclas.add(JButtonMaisMenos);
		
		JButton JButton0 = new JButton("0");
		JButton0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitar("0");
			}
		});
		JButton0.setFocusPainted(false);
		JPanelTeclas.add(JButton0);
		
		JButton JButtonPonto = new JButton(".");
		JButtonPonto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!JTextFieldResultado.getText().contains(".")) {
					JTextFieldResultado.setText(JTextFieldResultado.getText() + ".");
				}
			}
		});
		JButtonPonto.setFocusPainted(false);
		JPanelTeclas.add(JButtonPonto);
		
		JButton JButtonIgual = new JButton("=");
		JButtonIgual.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButtonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operar("=");
			}
		});
		JButtonIgual.setFocusPainted(false);
		JPanelTeclas.add(JButtonIgual);
		
		JPanel JPanelResultado = new JPanel();
		JPanelResultado.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		JPanelResultado.setBounds(0, 48, 397, 85);
		JPanelPrincipal.add(JPanelResultado);
		JPanelResultado.setLayout(null);
		
		JTextFieldResultado = new JTextField();
		JTextFieldResultado.setBorder(null);
		JTextFieldResultado.setSelectionColor(new Color(255, 255, 255));
		JTextFieldResultado.setDisabledTextColor(new Color(255, 255, 255));
		JTextFieldResultado.setEditable(false);
		JTextFieldResultado.setFont(new Font("Unispace", Font.BOLD, 26));
		JTextFieldResultado.setText("0");
		JTextFieldResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		JTextFieldResultado.setBounds(0, 29, 397, 45);
		JPanelResultado.add(JTextFieldResultado);
		JTextFieldResultado.setColumns(10);
		
		JTextFieldHistorico = new JTextField();
		JTextFieldHistorico.setBorder(null);
		JTextFieldHistorico.setSelectionColor(new Color(255, 255, 255));
		JTextFieldHistorico.setEditable(false);
		JTextFieldHistorico.setFont(new Font("Unispace", Font.BOLD, 14));
		JTextFieldHistorico.setHorizontalAlignment(SwingConstants.RIGHT);
		JTextFieldHistorico.setBounds(0, 11, 397, 20);
		JPanelResultado.add(JTextFieldHistorico);
		JTextFieldHistorico.setColumns(10);
		
	}
	
	private void digitar(String numero) {
		if (JTextFieldResultado.getText().equals("0")) {
			JTextFieldResultado.setText(numero);
		}
		else {
			JTextFieldResultado.setText(JTextFieldResultado.getText() + numero);	
			
		}
	}
	
	private String valor, valorHistorico;
	private double dValor = 0, dValorHistorico = 0;
	private String operacao, resultado;
	boolean ponto = false;
	
	private void operar(String simbolo) {
		
		valor = JTextFieldResultado.getText();
		
		ponto = JTextFieldResultado.getText().contains(".");
		
		if (simbolo.equals("=")) {
			switch (operacao) {
			case "+":
				this.dValor = dValorHistorico + Double.parseDouble(valor);
				resultado = Double.toString(dValor);
				
				if(!ponto) {resultado = Integer.toString((int)dValor);}
				
				JTextFieldResultado.setText(resultado);
				JTextFieldHistorico.setText(resultado);
				break;
			case "-":
				this.dValor = dValorHistorico - Double.parseDouble(valor);
				resultado = Double.toString(dValor);
				
				if(!ponto) {resultado = Integer.toString((int)dValor);}
				
				JTextFieldResultado.setText(resultado);
				JTextFieldHistorico.setText(resultado);
				break;
			case "*":
				this.dValor = dValorHistorico * Double.parseDouble(valor);
				resultado = Double.toString(dValor);
				
				if(!ponto) {resultado = Integer.toString((int)dValor);}
				
				JTextFieldResultado.setText(resultado);
				JTextFieldHistorico.setText(resultado);
				break;
			case "÷":
				this.dValor = dValorHistorico / Double.parseDouble(valor);
				resultado = Double.toString(dValor);
				
				if(!ponto) {resultado = Integer.toString((int)dValor);}
				
				JTextFieldResultado.setText(resultado);
				JTextFieldHistorico.setText(resultado);
				break;
			default:
				break;
			}
			dValorHistorico = Double.parseDouble(JTextFieldHistorico.getText());
			JTextFieldHistorico.setText("");
		}
		else {
			
			dValorHistorico = Double.parseDouble(valor);
			operacao = simbolo;
			exibir(valor + simbolo);
		}
	}
	
	private void exibir(String a) {
		JTextFieldHistorico.setText(a);
		JTextFieldResultado.setText("0");
		
	}
}

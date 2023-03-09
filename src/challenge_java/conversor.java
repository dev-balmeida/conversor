package challenge_java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class conversor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conversor frame = new conversor();
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
	public conversor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Beatriz\\Downloads\\calculadora.png"));
		setTitle("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(520, 230, 495, 374);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		JButton btnNewButton = new JButton("Moedas");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setToolTipText("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Beatriz\\Downloads\\moeda.png"));
		btnNewButton.setFont(new Font("Book Antiqua", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
								
				String[] opcoes = {
						"Selecione", 
						"Real    >   Dólar", 
						"Real    >   Euro",
						"Real    >   Libras Esterlinas",
						"Real    >   Peso Argentino",
						"Real    >   Peso Chinelo",
						"Dólar   >   Real",
						"Euro    >   Real", 
						"Libras Esterlinas  >   Real",
						"Peso Argentino     >   Real",
						"Peso Chileno       >   Real"
						};	
								
		        String pergunta = (String)JOptionPane.showInputDialog(null, "Qual moeda você quer converter?", 
		                "Moeda", JOptionPane.PLAIN_MESSAGE, null, opcoes, "0");
		        
		        double valorInserido = 0;
		        try {
		        	valorInserido = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor:"));
		        }catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inserir somente valores númericos");
				}
		        
		        double calculo = 0;
		        if (pergunta == "Real    >   Dólar") {
					calculo = valorInserido * 0.19;
					JOptionPane.showMessageDialog(null, "O valor convertido fica em $ " + calculo, null, WIDTH);
		
				} else if (pergunta == "Real    >   Euro") {
					calculo = valorInserido * 0.18;
					JOptionPane.showMessageDialog(null, "O valor convertido fica em " +  calculo + " €", null, WIDTH);	
					
				} else if (pergunta == "Real    >   Libras Esterlinas") {
					calculo = valorInserido * 0.16;
					JOptionPane.showMessageDialog(null, "O valor convertido fica em £ " +  calculo, null, WIDTH);
					
				} else if (pergunta == "Real    >   Peso Argentino") {
					calculo = valorInserido * 38.88;
					JOptionPane.showMessageDialog(null, "O valor convertido fica em $ " +  calculo, null, WIDTH);	
					
				} else if (pergunta == "Real    >   Peso Chinelo") {
					calculo = valorInserido * 156.12;
					JOptionPane.showMessageDialog(null, "O valor convertido fica em CLP$ " +  calculo, null, WIDTH);	
					
				} else if (pergunta == "Dólar   >   Real") {
					calculo = valorInserido * 5.14;
					JOptionPane.showMessageDialog(null, "O valor convertido fica em R$ " +  calculo, null, WIDTH);	
					
				} else if (pergunta == "Euro    >   Real") {
					calculo = valorInserido * 5.42;
					JOptionPane.showMessageDialog(null, "O valor convertido fica em R$ " +  calculo, null, WIDTH);	
					
				} else if (pergunta == "Libras Esterlinas  >   Real") {
					calculo = valorInserido * 6.09;
					JOptionPane.showMessageDialog(null, "O valor convertido fica em R$ " +  calculo, null, WIDTH);	
					
				} else if (pergunta == "Peso Argentino     >   Real") {
					calculo = valorInserido * 0.026;
					JOptionPane.showMessageDialog(null, "O valor convertido fica em R$ " +  calculo, null, WIDTH);
					
				} else if (pergunta == "Peso Chileno       >   Real") {
					calculo = valorInserido * 0.0064;
					JOptionPane.showMessageDialog(null, "O valor convertido fica em R$ " +  calculo, null, WIDTH);	
					
				} else if (pergunta == "Selecione") {
					JOptionPane.showMessageDialog(null, "Opção Inválida",null, WIDTH);
				}
				
		        int outroValor = JOptionPane.showConfirmDialog(null, "Você gostaria de converter outro valor?", 
		        		"Escolha uma das opções...", JOptionPane.YES_NO_CANCEL_OPTION);
				// 0=Sim, 1=Não, 2=Cancelar
		        
		        if (outroValor == 0) {
		        	
		        	}else {
		        		if(outroValor == 1) {
		        			JOptionPane.showMessageDialog(null, "Programa Finalizado",null, WIDTH);
				        	dispose();
		        	}else {
		        		JOptionPane.showMessageDialog(null, "Programa Concluído",null, WIDTH);	
		        	} 
		        	}			        
			}
		});
		btnNewButton.setBounds(38, 64, 166, 41);
		contentPane.add(btnNewButton);
						
		JButton btnNewButton_1 = new JButton("Temperatura");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Beatriz\\Downloads\\celsius_2.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String[] opcoes = {"Selecione", "C°   >   F°", "F°   >   C°"};  
		        String pergunta = (String)JOptionPane.showInputDialog(null, "Qual medida você quer converter?", 
		                "Temperatura", JOptionPane.PLAIN_MESSAGE, null, opcoes, "0");
		       
		        int valorInserido = 0;
		        try {
		        	valorInserido = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor:"));
		        }catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Inserir somente valores númericos");
				}
		        				
				if (pergunta == "C°   >   F°") {
					int calculo = (int) (valorInserido * 1.8 + 32);
					JOptionPane.showMessageDialog(null, "A temperatura fica em " + calculo + " F°", null, WIDTH);
					
				} else {
					if (pergunta == "F°   >   C°") {
						int calculo = (int) ((valorInserido - 32) / 1.8);
						JOptionPane.showMessageDialog(null, "A temperatura fica em  " + calculo + " C°", null, WIDTH);
				
					} else {
						JOptionPane.showMessageDialog(null, "Opção Inválida",null, WIDTH);
				}
				}
				 int outroValor = JOptionPane.showConfirmDialog(null, "Você gostaria de converter outro valor?", 
			        		"Escolha uma das opções...", JOptionPane.YES_NO_CANCEL_OPTION);
					// 0=Sim, 1=Não, 2=Cancelar
			        
			        if (outroValor == 0) {
			        	
			        	}else {
			        		if(outroValor == 1) {
			        			JOptionPane.showMessageDialog(null, "Programa Finalizado",null, WIDTH);
					        	dispose();
					        	
			        	}else {
			        		JOptionPane.showMessageDialog(null, "Programa Concluído",null, WIDTH);	
			        	} 
			        	}
			}
		});
		btnNewButton_1.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		btnNewButton_1.setBounds(38, 218, 166, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Binário");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Beatriz\\Downloads\\codigo-binario.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String[] opcoes = {"Selecione", "Decimal > Binário", "Binário   > Decimal"};  
		        String pergunta = (String)JOptionPane.showInputDialog(null, "Qual valor você quer converter?", 
		                "Temperatura", JOptionPane.PLAIN_MESSAGE, null, opcoes, "0");
		                		        
				if (pergunta == "Decimal > Binário") {			        
			        double valorInserido = 0;
			        try {
			        	valorInserido = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor:"));
			        }catch(NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Inserir somente valores númericos");
					}
			        			        
					String decimalParaBinario = Integer.toBinaryString((int) valorInserido);
					JOptionPane.showMessageDialog(null, "O número em Binário fica " + decimalParaBinario, null, WIDTH);
					
				} else if (pergunta == "Binário   > Decimal") {
					
			        String valorInserido = JOptionPane.showInputDialog("Insira o valor:");
					int binarioParaDecimal = Integer.parseInt(valorInserido, 2);
					JOptionPane.showMessageDialog(null, "O número em Decimal fica " +  binarioParaDecimal, null, WIDTH);
						
				} else {
					JOptionPane.showMessageDialog(null, "Opção Inválida",null, WIDTH);
				}
				
				
				int outroValor = JOptionPane.showConfirmDialog(null, "Você gostaria de converter outro valor?", 
		        		"Escolha uma das opções...", JOptionPane.YES_NO_CANCEL_OPTION);
				// 0=Sim, 1=Não, 2=Cancelar
		        
		        if (outroValor == 0) {
		        	
		        	}else {
		        		if(outroValor == 1) {
		        			JOptionPane.showMessageDialog(null, "Programa Finalizado",null, WIDTH);
				        	dispose();
		        	}else {
		        		JOptionPane.showMessageDialog(null, "Programa Concluído",null, WIDTH);	
		        	} 
		        	}
			}
		});
		btnNewButton_2.setFont(new Font("Book Antiqua", Font.BOLD, 17));
		btnNewButton_2.setBounds(38, 141, 166, 41);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Conversor");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Book Antiqua", Font.BOLD, 21));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(233, 144, 222, 33);
		contentPane.add(lblNewLabel_1);	
	}
}

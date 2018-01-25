import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends JFrame {
	private JTextField answerfield;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, add, decimal, negative, sub, multiply, div, equals, reset, delete;
	private String stemp1, stemp2, sanswer;
	private double answer= 0.0;
	private JPanel contentPanel;
	private JLabel la1, la2, la3, la4, la5, la6, la7, la8, la9, la10, la11; 
	private boolean equalsClicked= false, opChosen= false;
	char operation= ' ';
	
	public GUI() {
		super("Calculator");
		
		answerfield = new JTextField(null, 37);
		answerfield.setEditable(false);
		
		zero = new JButton("0");
		nine = new JButton("9");
		eight = new JButton("8");
		seven = new JButton("7");
		six = new JButton("6");
		five = new JButton("5");
		four = new JButton("4");
		three = new JButton("3");
		two = new JButton("2");
		one = new JButton("1");
		decimal = new JButton(".");
		negative = new JButton("+/-");
		add = new JButton("+");
		sub = new JButton("-");
		multiply = new JButton("x");
		div = new JButton("/");
		equals = new JButton("=");
		reset= new JButton("C");
		delete= new JButton("Del");
		la1= new JLabel("");
		la2= new JLabel("");
		la3= new JLabel("");
		la4= new JLabel("");
		la5= new JLabel("");
		la6= new JLabel("");
		la7= new JLabel("");
		la8= new JLabel("");
		la9= new JLabel("");
		la10= new JLabel("");
		
		Dimension dim = new Dimension(70, 35);
		
		zero.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		six.setPreferredSize(dim);
		five.setPreferredSize(dim);
		four.setPreferredSize(dim);
		three.setPreferredSize(dim);
		two.setPreferredSize(dim);
		one.setPreferredSize(dim);
		decimal.setPreferredSize(dim);
		negative.setPreferredSize(dim);
		add.setPreferredSize(dim);
		sub.setPreferredSize(dim);
		multiply.setPreferredSize(dim);
		div.setPreferredSize(dim);
		equals.setPreferredSize(dim);
		reset.setPreferredSize(dim);
		delete.setPreferredSize(dim);
		answerfield.setPreferredSize(new Dimension(5, 37));
		la1.setPreferredSize(new Dimension(335, 30));
		la2.setPreferredSize(new Dimension(140, 30));
		la3.setPreferredSize(new Dimension(420, 25));
		la4.setPreferredSize(new Dimension(420, 15));
		la5.setPreferredSize(new Dimension(420, 15));
		la6.setPreferredSize(new Dimension(420, 15));
		la7.setPreferredSize(new Dimension(35, 35));
		la8.setPreferredSize(new Dimension(35, 35));
		la9.setPreferredSize(new Dimension(35, 35));
		la10.setPreferredSize(new Dimension(35, 35));
		
		Numbers n= new Numbers();
		Calc c= new Calc();
		
		zero.addActionListener(n); nine.addActionListener(n); eight.addActionListener(n);
		seven.addActionListener(n); six.addActionListener(n); five.addActionListener(n);
		four.addActionListener(n); three.addActionListener(n); two.addActionListener(n);
		one.addActionListener(n);  
		  
		decimal.addActionListener(n); negative.addActionListener(n);
		delete.addActionListener(n);
		add.addActionListener(c); sub.addActionListener(c); multiply.addActionListener(c);
		div.addActionListener(c); equals.addActionListener(c); reset.addActionListener(c); 
		
		
		contentPanel= new JPanel();
		contentPanel.setBackground(Color.black);
		contentPanel.setLayout(new FlowLayout());
		
		contentPanel.add(answerfield, BorderLayout.NORTH);
		contentPanel.add(la1); contentPanel.add(reset); contentPanel.add(la3);
		contentPanel.add(seven); contentPanel.add(eight); contentPanel.add(nine);
		contentPanel.add(la7);
		contentPanel.add(add); contentPanel.add(sub); contentPanel.add(la4);
		contentPanel.add(four); contentPanel.add(five); contentPanel.add(six);
		contentPanel.add(la8);
		contentPanel.add(multiply); contentPanel.add(div); contentPanel.add(la5); 
		contentPanel.add(one); contentPanel.add(two); contentPanel.add(three);
		contentPanel.add(la10);
		contentPanel.add(la2); contentPanel.add(la6); contentPanel.add(zero); 
		contentPanel.add(decimal); contentPanel.add(negative); contentPanel.add(la9); 
		contentPanel.add(delete); contentPanel.add(equals); 
		
		
		
		this.setContentPane(contentPanel);
	}
	
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JButton src= (JButton) event.getSource();
			
			if(src.equals(one)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "1";
					}else {
						stemp1= stemp1 + "1";
					}
				}else {
					if(stemp2==null) {
						stemp2= "1";
					}else {
						stemp2= stemp2 + "1";
					}
				}
			}
			
			if(src.equals(two)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "2";
					}else {
						stemp1= stemp1 + "2";
					}
				}else {
					if(stemp2==null) {
						stemp2= "2";
					}else {
						stemp2= stemp2 + "2";
					}
				}
			}
			
			if(src.equals(three)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "3";
					}else {
						stemp1= stemp1 + "3";
					}
				}else {
					if(stemp2==null) {
						stemp2= "3";
					}else {
						stemp2= stemp2 + "3";
					}
				}
			}
			
			if(src.equals(four)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "4";
					}else {
						stemp1= stemp1 + "4";
					}
				}else {
					if(stemp2==null) {
						stemp2= "4";
					}else {
						stemp2= stemp2 + "4";
					}
				}
			}
			
			if(src.equals(five)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "5";
					}else {
						stemp1= stemp1 + "5";
					}
				}else {
					if(stemp2==null) {
						stemp2= "5";
					}else {
						stemp2= stemp2 + "5";
					}
				}
			}
			
			if(src.equals(six)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "6";
					}else {
						stemp1= stemp1 + "6";
					}
				}else {
					if(stemp2==null) {
						stemp2= "6";
					}else {
						stemp2= stemp2 + "6";
					}
				}
			}
			
			if(src.equals(seven)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "7";
					}else {
						stemp1= stemp1 + "7";
					}
				}else {
					if(stemp2==null) {
						stemp2= "7";
					}else {
						stemp2= stemp2 + "7";
					}
				}
			}
			
			if(src.equals(eight)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "8";
					}else {
						stemp1= stemp1 + "8";
					}
				}else {
					if(stemp2==null) {
						stemp2= "8";
					}else {
						stemp2= stemp2 + "8";
					}
				}
			}
			
			if(src.equals(nine)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "9";
					}else {
						stemp1= stemp1 + "9";
					}
				}else {
					if(stemp2==null) {
						stemp2= "9";
					}else {
						stemp2= stemp2 + "9";
					}
				}
			}
			
			if(src.equals(zero)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "0";
					}else {
						stemp1= stemp1 + "0";
					}
				}else {
					if(stemp2==null) {
						stemp2= "0";
					}else {
						stemp2= stemp2 + "0";
					}
				}
			}
			
			if(src.equals(decimal)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "0.";
					}else 
						if(stemp1 != null) {
							if(stemp1.contains(".")) {
								System.out.println("There is already a decimal");
							}else {
								stemp1 += ".";
							}
						
					}
				}else {
					if(stemp2==null) {
						stemp2= "0.";
					}else 
						if(stemp2 != null) {
							if(stemp2.contains(".")) {
								System.out.println("There is already a decimal");
							}else {
								stemp2 += ".";
							}
					}
				}
			}
			
			if(src.equals(negative)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "-";
					}else 
					    if(stemp1 != null && stemp1.startsWith("-")){
					    	stemp1= stemp1.substring(1);
					}else {
						stemp1= "-" + stemp1;
					}		
				}else {
					if(stemp2==null) {
						stemp2= "-";
					}else 
						if(stemp2 != null && stemp2.startsWith("-")){
						stemp2 = stemp2.substring(1);
					}else {
						stemp2= "-" + stemp2;
					}
				}
			}
			
			if(src.equals(delete)) {
				if(opChosen==false) {
					if(stemp1==null) {
						System.out.println("No number");
					}else {
						stemp1= stemp1.substring(0, stemp1.length()-1);
					}
				}else {
					if(stemp2== null) {
						System.out.println("No number");
					}else {
						stemp2= stemp2.substring(0, stemp2.length()-1);
					}
				}
			}
			
			if(equalsClicked==false) {
				if(opChosen==false) {
					answerfield.setText(stemp1);
				}else {
					answerfield.setText(stemp2);
				}
			}
		}
	}
	
	private class Calc implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JButton src= (JButton) event.getSource();
			
			if(src.equals(add)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						opChosen= true;
						operation= '+';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Only two operations can be done at a time");
						}
			}
			
			if(src.equals(sub)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						opChosen= true;
						operation= '-';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Only two operations can be done at a time");
						}
			}
			
			if(src.equals(multiply)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						opChosen= true;
						operation= '*';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Only two operations can be done at a time");
						}
			}
			
			if(src.equals(div)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						opChosen= true;
						operation= '/';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Only two operations can be done at a time");
						}
			}
			
			if(src.equals(equals)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						System.out.println("Input numbers first");
					}
				
				if(stemp1 != null && stemp2 != null) {
					double d1= 0.0, d2= 0.0;
					
					d1= Double.parseDouble(stemp1);
					d2= Double.parseDouble(stemp2);
					
					switch(operation) {
					case '+':
						answer= d1 + d2;
						break;
					case'-':
						answer= d1 - d2;
						break;
					case '*':
						answer= d1 * d2;
						break;
					case '/':
						answer= d1 / d2;
						break;
					}
					
					sanswer= Double.toString(answer);
					answerfield.setText(sanswer);
					if(operation== '/' && d2 == 0.0) {
						answerfield.setText("Cannot divide by zero");
					}
				}
			}
			
			if(src.equals(reset)) {
				stemp1= null; stemp2= null;
				equalsClicked= false;
				opChosen= false;
				operation= ' ';
				answerfield.setText(null);
				sanswer= null;
			}
			
		}
	}
}


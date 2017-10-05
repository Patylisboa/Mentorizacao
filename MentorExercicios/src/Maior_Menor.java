import javax.swing.JOptionPane;

public class Maior_Menor {

	public static void main(String[] args) {
		
		
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero 1"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero 2"));
		int number3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero 3"));
		int aux =0;
		
		if (number1 > number2)
	    	   aux = number1;
	       else
	    	   aux = number2;
	       if(aux > number3)
	    	   System.out.printf("O número maior é: " + aux);
	       else
	           System.out.printf("O número maior é: " +  number3);
	
	}
}

import javax.swing.JOptionPane;

public class MesTemporada {

	public static void main(String[] args) {
		
	int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
	int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes"));
		
//N�o sei o porque n�o imprime no console	
	if((mes >= 7 && mes <= 12) && (dia >= 22 && dia <= 21) ){

		System.out.println("primavera");
		}
	else if(mes >= 12 && dia >= 21){

		System.out.println("verao");
		}
	else if(mes >=3 && dia >= 20){

		System.out.println("outono");
		}
	else if(mes >=6 && dia >= 20){

		System.out.println("inverno");
		}
	
	}

}
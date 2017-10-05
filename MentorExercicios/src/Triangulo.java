import java.util.Scanner;

public class Triangulo{
public static void main(String []args){
	double base;
	double altura;
	double area;
//Porque a variável que declarei do scanner fica com warning?	
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite o valor da Base");
		base = sc.nextDouble();
		System.out.println("Digite o valor da Altura");
		altura = sc.nextDouble();
		area = (base * altura)/2;
//Como definir a quantidade de casas decimais?	
		System.out.println("A Area do triangulo eh " + area);
		
	}
}


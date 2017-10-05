package com.br.classesmetodos;

public class TesteCarro {

	public static void main(String[] args) {
			Carro car1 = new Carro();
			 car1.ano = 2017;
			 car1.cor = "cinza";
			 car1.marca = "hb2";
			 car1.motor = "seila";
			 
			 System.out.println("A marca do carro é : " + car1.marca);
			 car1.acelerar(20);
			 int velocidade = car1.frear();
			 System.out.println(velocidade);
			 
	}

}

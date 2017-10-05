package com.br.classesmetodos;

public class Carro {

	int ano;
	String motor;
	String marca;
	String cor;
	int velocidade;
	
	public void acelerar(int v){
		velocidade = velocidade + v;
	}
	
	public int frear(){
		return velocidade - 10;
	}

}

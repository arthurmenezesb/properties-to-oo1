package loo1.plp.orientadaObjetos1.declaracao.variavel;

import loo1.plp.orientadaObjetos1.comando.ChamadaMetodo;
import loo1.plp.orientadaObjetos1.expressao.Expressao;

public class Propriedade {
	
	private Expressao expressao;
	
	private ChamadaMetodo chamadaMetodo;
	
	public Propriedade(Expressao expressao, ChamadaMetodo chamadaMetodo) {
		this.expressao = expressao;
		this.chamadaMetodo = chamadaMetodo;
	}
	
	public Expressao getExpressao() {
		return this.expressao;
	}
	
	public ChamadaMetodo getChamadaMetodo() {
		return this.chamadaMetodo;
	}

}

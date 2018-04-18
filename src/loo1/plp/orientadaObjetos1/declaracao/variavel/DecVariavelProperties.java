package loo1.plp.orientadaObjetos1.declaracao.variavel;

import loo1.plp.expressions2.memory.VariavelJaDeclaradaException;
import loo1.plp.expressions2.memory.VariavelNaoDeclaradaException;
import loo1.plp.orientadaObjetos1.excecao.declaracao.ClasseJaDeclaradaException;
import loo1.plp.orientadaObjetos1.excecao.declaracao.ClasseNaoDeclaradaException;
import loo1.plp.orientadaObjetos1.excecao.declaracao.ObjetoJaDeclaradoException;
import loo1.plp.orientadaObjetos1.excecao.declaracao.ObjetoNaoDeclaradoException;
import loo1.plp.orientadaObjetos1.expressao.Expressao;
import loo1.plp.orientadaObjetos1.expressao.leftExpression.Id;
import loo1.plp.orientadaObjetos1.memoria.AmbienteCompilacaoOO1;
import loo1.plp.orientadaObjetos1.memoria.AmbienteExecucaoOO1;
import loo1.plp.orientadaObjetos1.util.Tipo;

public class DecVariavelProperties implements DecVariavel {

	private Tipo tipo;
	private Id id;
	private Expressao expressao;
	private Expressao expget;
	private Expressao expset;
	
	public DecVariavelProperties(Tipo tipo, Id id, Expressao expressao, Expressao expget, Expressao expset) {
		this.tipo = tipo;
        this.id = id;
        this.expressao = expressao;
        this.expget = expget;
        this.expset = expset;
	}
	
	@Override
	public Tipo getTipo(Id id) throws VariavelNaoDeclaradaException {
		if(this.id.equals(id)){
            return tipo;
        }
        else {
            throw new VariavelNaoDeclaradaException(id);
        }
	}

	@Override
	public AmbienteExecucaoOO1 elabora(AmbienteExecucaoOO1 ambiente)
			throws VariavelJaDeclaradaException, VariavelNaoDeclaradaException, ClasseJaDeclaradaException,
			ClasseNaoDeclaradaException, ObjetoNaoDeclaradoException, ObjetoJaDeclaradoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checaTipo(AmbienteCompilacaoOO1 ambiente) throws VariavelNaoDeclaradaException,
			VariavelJaDeclaradaException, ClasseJaDeclaradaException, ClasseNaoDeclaradaException {
		// TODO Auto-generated method stub
		return false;
	}

}

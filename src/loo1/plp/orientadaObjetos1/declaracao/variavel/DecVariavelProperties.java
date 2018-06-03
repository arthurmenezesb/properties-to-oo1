package loo1.plp.orientadaObjetos1.declaracao.variavel;

import loo1.plp.expressions2.memory.VariavelJaDeclaradaException;
import loo1.plp.expressions2.memory.VariavelNaoDeclaradaException;
import loo1.plp.orientadaObjetos1.comando.ChamadaMetodo;
import loo1.plp.orientadaObjetos1.excecao.declaracao.ClasseJaDeclaradaException;
import loo1.plp.orientadaObjetos1.excecao.declaracao.ClasseNaoDeclaradaException;
import loo1.plp.orientadaObjetos1.excecao.declaracao.ObjetoJaDeclaradoException;
import loo1.plp.orientadaObjetos1.excecao.declaracao.ObjetoNaoDeclaradoException;
import loo1.plp.orientadaObjetos1.excecao.declaracao.PropriedadeJaDeclaradaException;
import loo1.plp.orientadaObjetos1.expressao.Expressao;
import loo1.plp.orientadaObjetos1.expressao.leftExpression.Id;
import loo1.plp.orientadaObjetos1.memoria.AmbienteCompilacaoOO1;
import loo1.plp.orientadaObjetos1.memoria.AmbienteExecucaoOO1;
import loo1.plp.orientadaObjetos1.util.Tipo;
import loo1.plp.orientadaObjetos1.util.TipoClasse;

public class DecVariavelProperties implements DecVariavel {

	private Tipo tipo;
	private Id id;
	private Expressao expressao;
	private Expressao expget;
	private Expressao expset;
	private ChamadaMetodo metodoGet;
	private ChamadaMetodo metodoSet;
	
	public DecVariavelProperties(Tipo tipo, Id id, Expressao expressao, Expressao expget, Expressao expset, ChamadaMetodo metodoGet, ChamadaMetodo metodoSet) {
		this.tipo = tipo;
        this.id = id;
        this.expressao = expressao;
        this.expget = expget;
        this.expset = expset;
        this.metodoGet = metodoGet;
        this.metodoSet = metodoSet;
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
			ClasseNaoDeclaradaException, ObjetoNaoDeclaradoException, ObjetoJaDeclaradoException, PropriedadeJaDeclaradaException {
		// TODO Auto-generated method stub
		
		ambiente.map(id , expressao.avaliar(ambiente));
		
		return ambiente;
	}

	@Override
	public boolean checaTipo(AmbienteCompilacaoOO1 ambiente) throws VariavelNaoDeclaradaException,
			VariavelJaDeclaradaException, ClasseJaDeclaradaException, ClasseNaoDeclaradaException {
		// TODO Auto-generated method stub
		boolean resposta = false;
        if ( expressao.checaTipo(ambiente) ) {
            if( tipo instanceof TipoClasse) {
                resposta = expressao.getTipo(ambiente).equals(TipoClasse.TIPO_NULL) ||
                           expressao.getTipo(ambiente).equals(tipo);
            }
            else {
                resposta = expressao.getTipo(ambiente).equals(tipo);
            }
        }
        if(resposta) {
            ambiente.map(id, tipo);
        }
        return resposta;
	}
	
	public Object getVariavelById(Id idVariavel) {
		if(this.id.equals(idVariavel)) { 
			return this;
		} else {
			throw new VariavelNaoDeclaradaException(id);
		}
	}
	
	public Expressao getExpressaoGet() {
		return this.expget;
	}
	
	public Expressao getExpressaoSet() {
		return this.expget;
	}
	
	public ChamadaMetodo getMetodoGet() {
		return this.metodoGet;
	}
	
	public ChamadaMetodo getMetodoSet() {
		return this.metodoSet;
	}

}

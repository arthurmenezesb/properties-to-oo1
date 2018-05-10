package loo1.plp.orientadaObjetos1.excecao.declaracao;

import loo1.plp.expressions2.expression.Id;


/**
 * Excecao lancada quando uma propriedade que estah sendo referenciada
 * nao foi declarada anteriormente.
 */
public class PropriedadeNaoDeclaradaException extends Exception {
    /**
     * Construtor
     * @param id Identificador representando a propriedade.
     */
    public PropriedadeNaoDeclaradaException(Id id) {
        super("Propriedade " + id + " nao declarada.");
    }
}
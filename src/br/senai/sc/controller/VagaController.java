/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.controller;

import br.senai.sc.dao.VagaDao;
import br.senai.sc.model.Vaga;
import com.sun.org.apache.xpath.internal.operations.String;
import java.util.ArrayList;

/**
 *
 * @author Caio Pereira
 */
public class VagaController {
    
     private static VagaController instanciaRep;
     private ArrayList<Vaga> listaVagaLivre;
    
    public static VagaController obterInstancia() {
        if ( instanciaRep == null ) {
            instanciaRep = new VagaController();
        }
        return instanciaRep;
    }
    
    public void inserir(Vaga vaga) throws Exception{
        if ( vaga.getNumeroVaga()== 0) {
            throw new Exception("Numero da vaga inválido");
            
        }
        if ( vaga.getTipoVaga().isEmpty() ) {
            throw new Exception("Tipo vaga inválido");
        }
        if ( vaga.getTipoValor().isEmpty()){
            throw new Exception("Tipo valor inválido");
        }
        if (vaga.getValorUnit() == 0){
            throw new Exception("Valor unitário inválido");
        }
        
        VagaDao.obterInstancia().inserir(vaga);
        
    }
    public ArrayList<Vaga> listarTodos(){
        return VagaDao.obterInstancia().listarTodos();
    }
    
    
    
    public void alterar(Vaga vaga)throws Exception{
        if ( vaga == null ){
            throw new Exception("Selecione uma vaga");
        }
        if (vaga.getNumeroVaga() == null){
            throw new Exception("Preencha o número da vaga");
            // itemVenda.setQuantidade(Integer.parseInt(jtfQuantidadeItem.getText()));
        }
        
         if (vaga.getTipoVaga().trim().equals("")){
            throw new Exception("Preencha o número da vaga");
        }
        
        if ( vaga.getValorUnit() == 0){
            throw new Exception("Preencha o CPF do cliente");
        }
        VagaDao.obterInstancia().alterar(vaga);
    }
    
    public void remover(Vaga vaga) throws Exception{
        if ( vaga == null){
            throw new Exception("Selecione um cliente");
        }
        VagaDao.obterInstancia().remover(vaga);
    }

    public String listarVagasLivres(java.lang.String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    


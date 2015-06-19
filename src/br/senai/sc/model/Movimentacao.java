/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model;

import br.senai.sc.dao.MovimentacaoDao;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;



/**
 *
 * @author Caio Pereira
 */
public class Movimentacao {
    
    private String tipocliente;
    private String placa;
    private Date dataentrada;
    private Date datasaida;
    private Double vlrtotal;
    private Cliente cliente;
    private Integer id;
    private Vaga vaga;
  
   
    public Movimentacao(){   
    }

  
    public Movimentacao(Integer pid){
        try {
            Movimentacao movimentacao = MovimentacaoDao.obterInstancia().movimentacaoget(pid);
            if(movimentacao.getId() > 0){
                id=movimentacao.getId();
                tipocliente=movimentacao.getTipocliente();
                placa=movimentacao.getCliente().getPlaca();
                dataentrada=movimentacao.getDataentrada();
                datasaida=movimentacao.getDatasaida();
                vlrtotal=movimentacao.getVlrtotal();
                cliente=movimentacao.getCliente();
                vaga=movimentacao.getVaga();
            }
        } catch (ParseException ex) {
        }
    }
  
    public Movimentacao(String pPlaca){
        try {
            Movimentacao movimentacao = MovimentacaoDao.obterInstancia().movimentacaoSaidaGet(pPlaca);
            if(movimentacao.getId() > 0){
                id=movimentacao.getId();
                tipocliente=movimentacao.getTipocliente();
                placa=movimentacao.getCliente().getPlaca();
                dataentrada=movimentacao.getDataentrada();
                datasaida=movimentacao.getDatasaida();
                vlrtotal=movimentacao.getVlrtotal();
                cliente=movimentacao.getCliente();
                vaga=movimentacao.getVaga();
            }
        } catch (ParseException ex) {
        }
    }    

    public void estacionar(){
        MovimentacaoDao dao = new MovimentacaoDao();
        dao.inserir(this);
    }
    
    public void desestacionar(){
        MovimentacaoDao dao = new MovimentacaoDao();
        dao.inserirSaida(this);        
    }
    
    public double calcularSaida(Date dataSaidaDate){
        double valor = 0.0;
        if(this.getCliente().getTipocliente().equals("A")){

            Calendar dataSaidaCal = Calendar.getInstance();  
            dataSaidaCal.setTime(dataSaidaDate);  
            Calendar dataEntradaCal = Calendar.getInstance();  
            dataEntradaCal.setTime(this.getDataentrada());  

            long diferenca = dataSaidaCal.getTimeInMillis() - dataEntradaCal.getTimeInMillis();  
            int diferencaHoras =  1+(int)(diferenca / (60 * 60 * 1000));

            valor = this.getVaga().getValorUnit() * diferencaHoras;
        }else{
            valor = this.getVaga().getValorUnit();                
        }
        return valor;
    }
    
    
    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }
  
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
  

    public String getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(String tipocliente) {
        this.tipocliente = tipocliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(Date dataentrada) {
        this.dataentrada = dataentrada;
    }

    public Date getDatasaida() {
        return datasaida;
    }

    public void setDatasaida(Date datasaida) {
        this.datasaida = datasaida;
    }

    public Double getVlrtotal() {
        return vlrtotal;
    }

    public void setVlrtotal(Double vlrtotal) {
        this.vlrtotal = vlrtotal;
    }
  
  
    
    
}

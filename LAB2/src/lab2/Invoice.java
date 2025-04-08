/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author unifenascimento
 */
public class Invoice {
    
    public String indentificador;
    public String descricao;
    public int quantidade;
    public double preco;
    
    public void setinvoice( String setInd , String setDesc, 
            int setQtde, double setPreco){
       
        
        if(setPreco >= 0 && setQtde >=0){
    
        this.indentificador = setInd;
        this.descricao = setDesc;
        this.quantidade = setQtde;
        this.preco = setPreco;
        System.out.println("Gravado");
        }else{
        this.indentificador = setInd;
        this.descricao = setDesc;
        this.quantidade = 0;
        this.preco = 0;
       System.out.println("Gravado com Quantidade e preco zerados!!");   
        };
    };
    public String getIndentificador(){
        return this.indentificador ;
        
    };
    public String getDescricao(){
        return this.descricao;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public double getPreco(){
        return this.preco;
    }
    
    public double getInvoceAmount(){
        double quantfatura ;
        return quantfatura = quantidade * preco;
    }
}

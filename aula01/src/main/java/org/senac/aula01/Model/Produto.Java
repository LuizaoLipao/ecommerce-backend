package org.senac.aula01;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
@Entity
public class Produto {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPr    
   
    @Column(nullable = false)
    private String nome;


    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private Double preco;
   
    @Lob
    @Column
    private String imgURL;
 
   
    private String descricao;
    private Double preco;
    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
 
    public int getImgURL() {
        return imgURL;
    }
    public void setImgURL(int imgURL) {
        this.imgURL = imgURL;
   
}
 
tem menu de contexto
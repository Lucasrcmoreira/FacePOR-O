/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faceporao.model;

import java.util.Date;

/**
 *
 * @author Lucas Ramos
 */
public class Postagem {
    
    private int idPostagem;
    private String Postagem;
    //private Date dtPostagem;
    private int idEmissor;

    public int getIdPostagem() {
        return idPostagem;
    }

    public void setIdPostagem(int idPostagem) {
        this.idPostagem = idPostagem;
    }

    public String getPostagem() {
        return Postagem;
    }

    public void setPostagem(String Postagem) {
        this.Postagem = Postagem;
    }

    public int getIdEmissor() {
        return idEmissor;
    }

    public void setIdEmissor(int idEmissor) {
        this.idEmissor = idEmissor;
    }


        
}

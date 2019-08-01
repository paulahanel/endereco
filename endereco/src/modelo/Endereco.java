/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Endereco {

    private String bairro;
    private String logradouro;
    private String complemento;
    private Integer codigo;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + '}';
    }

    public Integer getCodigo() {

        return codigo;
    }

    public void setCodigo(int codigo) {
        System.out.println("yteste:" + codigo);
        this.codigo = codigo;
    }

}

package exercicios.monitoria.model;

import exercicios.monitoria.model.enums.Estado;

public class Endereco {
    private Estado estado;
    private String municipio;
    private String bairro;
    private String complemento;
    private String cep;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = Estado.valueOf(estado);
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}

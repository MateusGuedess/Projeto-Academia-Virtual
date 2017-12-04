package com.u9.fabapp.virtualgym;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaExercicios {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("id_aluno")
    @Expose
    private String idAluno;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("num_serie")
    @Expose
    private String numSerie;
    @SerializedName("num_repeticao")
    @Expose
    private String numRepeticao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getNumRepeticao() {
        return numRepeticao;
    }

    public void setNumRepeticao(String numRepeticao) {
        this.numRepeticao = numRepeticao;
    }

}

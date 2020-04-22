package br.com.ajudeumapesquisa.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name = "pesquisa", sequenceName = "SQ_PESQUISA", allocationSize = 1)
public class Pesquisa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pesquisa")
    private int codigo;

    @NotBlank(message = "Nome obrigatório!")
    @Size(max = 100)
    private String nome;

    @NotBlank(message = "Descrição obrigatório!")
    @Size(max = 300)
    private String descricao;

    @NotBlank(message = "Objetivo da pesquisa obrigatório!")
    @Size(max = 140)
    private String objetivo;

    @NotBlank(message = "Telefone obrigatório!")
    @Size(max = 8)
    private String telefone;

    @NotBlank(message = "Celular obrigatório!")
    @Size(max = 9)
    private String celular;

    @NotBlank(message = "E-mail obrigatório!")
    @Size(max = 50)
    private String email;

    private LocalDate dataInicio;

    private LocalDate dataTermino;

    @NotBlank(message = "Pesquisador responsável obrigatório!")
    @Size(max = 100)
    private String nomePesquisadorResponsavel;

    @NotBlank(message = "Protocolo obrigatório!")
    @Size(max = 100)
    private String protocolo;

    @NotBlank(message = "Critérios obrigatório!")
    @Size(max = 200)
    private String criterios;

    private int idadeMinina;

    private int idadeMaxima;

    private Byte imgCover;

    @Type(type="true_false")
    private Boolean status;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getNomePesquisadorResponsavel() {
        return nomePesquisadorResponsavel;
    }

    public void setNomePesquisadorResponsavel(String nomePesquisadorResponsavel) {
        this.nomePesquisadorResponsavel = nomePesquisadorResponsavel;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getCriterios() {
        return criterios;
    }

    public void setCriterios(String criterios) {
        this.criterios = criterios;
    }

    public int getIdadeMinina() {
        return idadeMinina;
    }

    public void setIdadeMinina(int idadeMinina) {
        this.idadeMinina = idadeMinina;
    }

    public int getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(int idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    public Byte getImgCover() {
        return imgCover;
    }

    public void setImgCover(Byte imgCover) {
        this.imgCover = imgCover;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}

package br.com.ajudeumapesquisa.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name = "pesquisa", sequenceName = "SQ_PESQUISA", allocationSize = 1)
public class Pesquisa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pesquisa")
    private int id;

    // status -> "recrutando" "buscando voluntários"...
    // categorias -> "medicamento", "reabilitação", "questionário"

    @NotBlank(message = "nome obrigatório!")
    @Size(max = 200, message = "máximo 200 caracteres")
    private String nome;

    @NotBlank(message = "descricao obrigatório!")
    @Size(max = 400, message = "máximo 400 caracteres")
    private String descricao;

    private LocalDate dataInicio;
    private LocalDate dataTermino;

    @NotBlank(message = "protocolo obrigatório!")
    @Size(max = 100, message = "máximo 100 caracteres")
    private String protocolo;

    @NotNull(message = "idadeMinina obrigatório!")
    private int idadeMinina;

    @NotNull(message = "idadeMaxima obrigatório!")
    private int idadeMaxima;

    @NotNull(message = "totalAmostra obrigatório!")
    private int totalAmostra;

    @Size(max = 140, message = "máximo 400 caracteres")
    private String linkFormCadastro;

    @NotBlank(message = "criteriosAceite obrigatório!")
    @Size(max = 800, message = "máximo 800 caracteres")
    private String criteriosAceite;

    @NotBlank(message = "criteriosExclusao obrigatório!")
    @Size(max = 800, message = "máximo 800 caracteres")
    private String criteriosExclusao;

    @NotBlank(message = "etapasPesquisa obrigatório!")
    @Size(max = 800, message = "máximo 800 caracteres")
    private String etapasPesquisa;

    @NotBlank(message = "condicoesSaude obrigatório!")
    @Size(max = 400, message = "máximo 400 caracteres")
    private String condicoesSaude;

    @NotBlank(message = "telefone obrigatório!")
    @Size(max = 8, message = "máximo 8 caracteres")
    private String telefone;

    @NotBlank(message = "celular obrigatório!")
    @Size(max = 9, message = "máximo 9 caracteres")
    private String celular;

    @NotBlank(message = "email obrigatório!")
    @Size(max = 50, message = "máximo 50 caracteres")
    private String email;

    private Byte imgCover;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
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

    public int getTotalAmostra() {
        return totalAmostra;
    }

    public void setTotalAmostra(int totalAmostra) {
        this.totalAmostra = totalAmostra;
    }

    public String getLinkFormCadastro() {
        return linkFormCadastro;
    }

    public void setLinkFormCadastro(String linkFormCadastro) {
        this.linkFormCadastro = linkFormCadastro;
    }

    public String getCriteriosAceite() {
        return criteriosAceite;
    }

    public void setCriteriosAceite(String criteriosAceite) {
        this.criteriosAceite = criteriosAceite;
    }

    public String getCriteriosExclusao() {
        return criteriosExclusao;
    }

    public void setCriteriosExclusao(String criteriosExclusao) {
        this.criteriosExclusao = criteriosExclusao;
    }

    public String getEtapasPesquisa() {
        return etapasPesquisa;
    }

    public void setEtapasPesquisa(String etapasPesquisa) {
        this.etapasPesquisa = etapasPesquisa;
    }

    public String getCondicoesSaude() {
        return condicoesSaude;
    }

    public void setCondicoesSaude(String condicoesSaude) {
        this.condicoesSaude = condicoesSaude;
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

    public Byte getImgCover() {
        return imgCover;
    }

    public void setImgCover(Byte imgCover) {
        this.imgCover = imgCover;
    }
}

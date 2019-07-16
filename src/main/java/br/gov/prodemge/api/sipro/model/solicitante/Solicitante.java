package br.gov.prodemge.api.sipro.model.solicitante;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.gov.prodemge.api.sipro.model.auxiliares.Cargo;
import br.gov.prodemge.api.sipro.model.processo.Processo;

@Entity
@Table(name = "TB_SOLICITANTE")
public class Solicitante implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne(targetEntity = Processo.class)
	@JoinColumn(name = "CCNUM_PROCESSO", referencedColumnName = "AANUM_PROCESSO")
	private Processo processo;

	@Column(name = "CCCOD_MUNICIPIO")
	private Integer codMunicipio;

	@ManyToOne(targetEntity = Cargo.class)
	@JoinColumn(name = "CCNUM_CARGO", referencedColumnName = "NOME_ELEMENTO")
	private Cargo cargo;

	@Column(name = "CCNOME", length = 50)
	private String nome;

	@Column(name = "CCTIPO_LOGRADOURO", length = 10)
	private String tipoLogradouro;

	@Column(name = "CCNOME_LOGRADOURO", length = 40)
	private String nomeLogradouro;

	@Column(name = "CCNUMERO", length = 5)
	private String numero;

	@Column(name = "CCCOMPLEMENTO", length = 20)
	private String complemento;

	@Column(name = "CCBAIRRO", length = 20)
	private String bairro;

	@Column(name = "CCCIDADE", length = 30)
	private String cidade;

	@Column(name = "CCESTADO", length = 2)
	private String estado;

	@Column(name = "CCTELEFONE", length = 10)
	private String telefone;

	@Column(name = "CCCEP", length = 8)
	private String cep;

	@Column(name = "CCDATA_NASCIMENTO", length = 8)
	private Date dataNascimento;

	@Column(name = "CCEMPRESA", length = 30)
	private String empresa;

//	@ManyToOne(targetEntity = Identificacao.class)
//	@JoinColumn(name = "CCNUM_IDENTIFICACAO", referencedColumnName = "CCNUM_IDENTIFICACAO")
//	private Identificacao identificacao;
	
	
	
	@Column(name = "CCTIPO_SOLICITANTE", length = 1)
	private String tipoSolicitante;

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}


	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public Integer getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(Integer codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getNomeLogradouro() {
		return nomeLogradouro;
	}

	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTipoSolicitante() {
		return tipoSolicitante;
	}

	public void setTipoSolicitante(String tipoSolicitante) {
		this.tipoSolicitante = tipoSolicitante;
	}

}

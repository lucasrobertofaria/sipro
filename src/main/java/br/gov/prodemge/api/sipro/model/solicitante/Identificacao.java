package br.gov.prodemge.api.sipro.model.solicitante;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.gov.prodemge.api.sipro.model.auxiliares.Assunto;
import br.gov.prodemge.api.sipro.model.auxiliares.TipoIdentificacao;

@Entity
@Table(name = "TB_IDENTIFICACAO")
public class Identificacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne(targetEntity = TipoIdentificacao.class)
	@JoinColumn(name = "CCTIPO_IDENTIFICACAO", referencedColumnName = "COD_ELEMENTO")
	private TipoIdentificacao tipoIdentificacao;

	@Column(name = "CCNUMERO_IDENTIFICACAO", length = 15)
	private String numeroIdentificacao;

	@Column(name = "CCSERIE_IDENTIFICACAO", length = 6)
	private String serieIdentificacao;

	@Column(name = "CCIDENTIFICACAO", length = 17)
	private String identificacao;

	@Id
	@ManyToOne(targetEntity = Solicitante.class)
	@JoinColumn(name = "CCNUM_PROCESSO", referencedColumnName = "CCNUM_PROCESSO")
	private Solicitante solicitante;

	public TipoIdentificacao getTipoIdentificacao() {
		return tipoIdentificacao;
	}

	public void setTipoIdentificacao(TipoIdentificacao tipoIdentificacao) {
		this.tipoIdentificacao = tipoIdentificacao;
	}

	public String getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(String numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public String getSerieIdentificacao() {
		return serieIdentificacao;
	}

	public void setSerieIdentificacao(String serieIdentificacao) {
		this.serieIdentificacao = serieIdentificacao;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

}

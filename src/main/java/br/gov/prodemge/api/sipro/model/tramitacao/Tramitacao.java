package br.gov.prodemge.api.sipro.model.tramitacao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.gov.prodemge.api.sipro.model.auxiliares.Local;
import br.gov.prodemge.api.sipro.model.auxiliares.Motivo;
import br.gov.prodemge.api.sipro.model.auxiliares.Situacao;
import br.gov.prodemge.api.sipro.model.processo.Processo;

@Entity
@Table(name = "TB_TRAMITACAO")
public class Tramitacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "BBNUM_TRAMITACAO")
	private Long numeroTramitacao;

	@ManyToOne(targetEntity = Processo.class)
	@JoinColumn(name = "BBNUM_PROCESSO", referencedColumnName = "AANUM_PROCESSO")
	private Processo processo;

	@Column(name = "BBDATA_RECEBIMENTO")
	private Date dataRecebimento;

	@Column(name = "BBHORA_RECEBIMENTO", length = 8)
	private String horaRecebimento;

	@Column(name = "BBDATA_ENVIO")
	private Date dataEnvio;

	@Column(name = "BBHORA_ENVIO", length = 8)
	private String horaEnvio;

	@ManyToOne(targetEntity = Local.class)
	@JoinColumn(name = "BBLOCAL_DE", referencedColumnName = "COD_ELEMENTO")
	private Local localDe;

	@ManyToOne(targetEntity = Local.class)
	@JoinColumn(name = "BBLOCAL_PARA", referencedColumnName = "COD_ELEMENTO")
	private Local localPara;

	@ManyToOne(targetEntity = Motivo.class)
	@JoinColumn(name = "BBMOTIVO", referencedColumnName = "COD_ELEMENTO")
	private Motivo motivo;

	@ManyToOne(targetEntity = Situacao.class)
	@JoinColumn(name = "BBSITUACAO", referencedColumnName = "COD_ELEMENTO")
	private Situacao situacao;

	@Column(name = "BBOBS_TRAMITACAO", length = 80)
	private String obsTramitacao;

	@Column(name = "BBUSU_RACF_ENVIO", length = 8)
	private String usuRacfEnvio;

	@Column(name = "BBDATA_RACF_ENVIO")
	private Date dataRacfEnvio;

	@Column(name = "BBHORA_RACF_ENVIO", length = 4)
	private String horaRacfEnvio;

	@Column(name = "BBUSU_RACF_RECEBIMENTO", length = 8)
	private String usuRacfRecebimento;

	@Column(name = "BBDATA_RACF_RECEBIMENTO")
	private Date dataRacfRecebimento;

	@Column(name = "BBHORA_RACF_RECEBIMENTO", length = 4)
	private String horaRacfRecebimento;

	@Column(name = "BBUSU_TRAMITACAO", length = 4)
	private Integer usuTramitacao;

	@Column(name = "BBDATA_LIMITE")
	private Date dataLimite;

	@Column(name = "BBRESPOSTA", length = 1)
	private String resposta;

	public Long getNumeroTramitacao() {
		return numeroTramitacao;
	}

	public void setNumeroTramitacao(Long numeroTramitacao) {
		this.numeroTramitacao = numeroTramitacao;
	}

	public Local getLocalDe() {
		return localDe;
	}

	public void setLocalDe(Local localDe) {
		this.localDe = localDe;
	}

	public Local getLocalPara() {
		return localPara;
	}

	public void setLocalPara(Local localPara) {
		this.localPara = localPara;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public Date getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public String getHoraRecebimento() {
		return horaRecebimento;
	}

	public void setHoraRecebimento(String horaRecebimento) {
		this.horaRecebimento = horaRecebimento;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public String getHoraEnvio() {
		return horaEnvio;
	}

	public void setHoraEnvio(String horaEnvio) {
		this.horaEnvio = horaEnvio;
	}

	public Motivo getMotivo() {
		return motivo;
	}

	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}

	public String getObsTramitacao() {
		return obsTramitacao;
	}

	public void setObsTramitacao(String obsTramitacao) {
		this.obsTramitacao = obsTramitacao;
	}

	public String getUsuRacfEnvio() {
		return usuRacfEnvio;
	}

	public void setUsuRacfEnvio(String usuRacfEnvio) {
		this.usuRacfEnvio = usuRacfEnvio;
	}

	public Date getDataRacfEnvio() {
		return dataRacfEnvio;
	}

	public void setDataRacfEnvio(Date dataRacfEnvio) {
		this.dataRacfEnvio = dataRacfEnvio;
	}

	public String getHoraRacfEnvio() {
		return horaRacfEnvio;
	}

	public void setHoraRacfEnvio(String horaRacfEnvio) {
		this.horaRacfEnvio = horaRacfEnvio;
	}

	public String getUsuRacfRecebimento() {
		return usuRacfRecebimento;
	}

	public void setUsuRacfRecebimento(String usuRacfRecebimento) {
		this.usuRacfRecebimento = usuRacfRecebimento;
	}

	public Date getDataRacfRecebimento() {
		return dataRacfRecebimento;
	}

	public void setDataRacfRecebimento(Date dataRacfRecebimento) {
		this.dataRacfRecebimento = dataRacfRecebimento;
	}

	public String getHoraRacfRecebimento() {
		return horaRacfRecebimento;
	}

	public void setHoraRacfRecebimento(String horaRacfRecebimento) {
		this.horaRacfRecebimento = horaRacfRecebimento;
	}

	public Integer getUsuTramitacao() {
		return usuTramitacao;
	}

	public void setUsuTramitacao(Integer usuTramitacao) {
		this.usuTramitacao = usuTramitacao;
	}

	public Date getDataLimite() {
		return dataLimite;
	}

	public void setDataLimite(Date dataLimite) {
		this.dataLimite = dataLimite;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}

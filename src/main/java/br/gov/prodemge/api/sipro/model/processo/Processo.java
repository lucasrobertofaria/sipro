package br.gov.prodemge.api.sipro.model.processo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.gov.prodemge.api.sipro.enums.SimNaoEnum;
import br.gov.prodemge.api.sipro.model.auxiliares.Assunto;
import br.gov.prodemge.api.sipro.model.auxiliares.Local;
import br.gov.prodemge.api.sipro.model.auxiliares.Motivo;
import br.gov.prodemge.api.sipro.model.auxiliares.Origem;
import br.gov.prodemge.api.sipro.model.auxiliares.PalavraChave;
import br.gov.prodemge.api.sipro.model.auxiliares.Situacao;
import br.gov.prodemge.api.sipro.model.auxiliares.TipoDocumento;

@Entity
@Table(name = "TB_PROCESSO")
public class Processo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "AANUM_PROCESSO", length = 15)
	private String numeroProcesso;

	@Column(name = "AADATA_CADASTRO")
	private Date dataCadastro;

	@ManyToOne(targetEntity = Assunto.class)
	@JoinColumn(name = "AAASSUNTO", referencedColumnName = "COD_ELEMENTO")
	private Assunto assunto;

	@ManyToOne(targetEntity = Origem.class)
	@JoinColumn(name = "AAORIGEM", referencedColumnName = "NOME_ELEMENTO")
	private Origem origem;

	@ManyToOne(targetEntity = TipoDocumento.class)
	@JoinColumn(name = "AATIPO_DOCUMENTO", referencedColumnName = "COD_ELEMENTO")
	private TipoDocumento tipoDocumento;

	@Column(name = "AANUM_DOCUMENTO", length = 10)
	private Long numeroDocumento;

	@Column(name = "AAANEXADO", length = 15)
	private String anexado;

	@Column(name = "AANUM_PROCESSO_PRINCIPAL", length = 15)
	private String numeroProcessoPrincipal;

	@Column(name = "AADATA_RECEBIMENTO")
	private Date dataRecebimento;

	@OneToMany
	@JoinColumn(name = "AANUM_PROCESSO")
	private List<PalavraChave> palavraChaves;

	@Column(name = "AADATA_DESARQUIVAMENTO")
	private Date dataDesarquivamento;

	@Column(name = "AAPROCESSO_ANTERIOR", length = 16)
	private String processoAnterior;

	@Column(name = "AAHORA_CADASTRO", length = 4)
	private String horaCadastro;

	@Column(name = "AADATA_DOCUMENTO")
	private Date dataDocumento;

	@Column(name = "AAPRIVADO") // "0 = SIM, 1 = NÃO"
	@Enumerated(EnumType.ORDINAL)
	private SimNaoEnum privado;

	@Column(name = "AANUM_ULT_TRAMITACAO")
	private Integer numeroUltTramitacao;

	@Column(name = "AADATA_ENVIO")
	private Date dataEnvio;

	@Column(name = "AAHORA_ENVIO", length = 4)
	private String horaEnvio;

	@ManyToOne(targetEntity = Local.class)
	@JoinColumn(name = "AALOCAL", referencedColumnName = "COD_ELEMENTO")
	private Local local;

	@ManyToOne(targetEntity = Motivo.class)
	@JoinColumn(name = "AAMOTIVO", referencedColumnName = "COD_ELEMENTO")
	private Motivo motivo;

	@ManyToOne(targetEntity = Situacao.class)
	@JoinColumn(name = "AASITUACAO", referencedColumnName = "COD_ELEMENTO")
	private Situacao situacao;

	@Column(name = "AAOBS_TRAMITACAO", length = 80)
	private String obsTramitacao;

	@Column(name = "AAHORA_RECEBIMENTO", length = 4)
	private String horaRecebimento;

	@Column(name = "AAFLG_ARQUIVO") // "0 = SIM, 1 = NÃO"
	@Enumerated(EnumType.ORDINAL)
	private SimNaoEnum flgArquivo;

	@Column(name = "AAPORTADOR", length = 4)
	private Integer portador;

	@Column(name = "AADONO", length = 4)
	private Integer dono;

	@Column(name = "AAUSU_RACF", length = 8)
	private String usuRACF;

	@Column(name = "AADATA_RACF")
	private Date dataRACF;

	@Column(name = "AAHORA_RACF", length = 4)
	private String horaRACF;

	@Column(name = "AADETALHAMENTO", length = 2000)
	private String detalhamento;

	@Column(name = "AAHORA_DESARQUIVAMENTO", length = 4)
	private String horaDesarquivamento;

	@Column(name = "AAUSU_RACF_DESARQUIVAMENTO", length = 8)
	private String usuRacfDesarquivamento;

	@Column(name = "AAPRAZO_RETENCAO")
	private Integer prazoRetencao;

	@Column(name = "AAFLAG_COMPLETO", length = 1)
	@Enumerated(EnumType.ORDINAL)
	private SimNaoEnum flagCompleto;

	@Column(name = "AAFLAG_ANEXO", length = 1)
	@Enumerated(EnumType.ORDINAL)
	private SimNaoEnum flagAnexo;

	@Column(name = "AAFLAG_DESMEMBRAMENTO", length = 1)
	@Enumerated(EnumType.ORDINAL)
	private SimNaoEnum flagDesmembramento;

	@ManyToOne(targetEntity = Local.class)
	@JoinColumn(name = "AALOCAL_DE", referencedColumnName = "COD_ELEMENTO")
	private Local localDe;

	@Column(name = "AADIGITO", length = 1)
	private String digito;

	@ManyToOne(targetEntity = Local.class)
	@JoinColumn(name = "AALOCAL_DONO", referencedColumnName = "COD_ELEMENTO")
	private Local localDono;

	@Column(name = "AAEMITE_GUIA", length = 1)
	private String emiteGuia;

	@Column(name = "AAFLAG_ARQUIVADO", length = 1)
	@Enumerated(EnumType.ORDINAL)
	private SimNaoEnum flagArquivado;

	@Column(name = "AADATA_COMPROMISSO")
	private Date dataCompromisso;

	@Column(name = "AAFLAG_IMAGEM", length = 1)
	private String flagImagem;

	@ManyToOne(targetEntity = Local.class)
	@JoinColumn(name = "AALOCAL_RACF", referencedColumnName = "COD_ELEMENTO")
	private Local localRACF;

	@ManyToOne(targetEntity = Local.class)
	@JoinColumn(name = "AALOCAL_RACF_TRA", referencedColumnName = "COD_ELEMENTO")
	private Local localRacfTra;

	@ManyToOne(targetEntity = Local.class)
	@JoinColumn(name = "AALOCAL_COMPROMISSO", referencedColumnName = "COD_ELEMENTO")
	private Local localCompromisso;

	@Column(name = "AAPROCESSO_ARQUIVADO", length = 1)
	@Enumerated(EnumType.ORDINAL)
	private SimNaoEnum processoArquivado;

	@Column(name = "AAMUNICIPIO_INTERESSADO", length = 30)
	private String municipioInteressado;

	@Column(name = "AANOMEPAI", length = 50)
	private String nomePai;

	@Column(name = "AANOMEMAE", length = 50)
	private String nomeMae;

	@Column(name = "VINCULADO", length = 15)
	private String vinculado;

	public Assunto getAssunto() {
		return assunto;
	}

	public void setAssunto(Assunto assunto) {
		this.assunto = assunto;
	}

	public Origem getOrigem() {
		return origem;
	}

	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<PalavraChave> getPalavraChaves() {
		return palavraChaves;
	}

	public void setPalavraChaves(List<PalavraChave> palavraChaves) {
		this.palavraChaves = palavraChaves;
	}

	public Long getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(Long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getAnexado() {
		return anexado;
	}

	public void setAnexado(String anexado) {
		this.anexado = anexado;
	}

	public String getDetalhamento() {
		return detalhamento;
	}

	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}

	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroProcessoPrincipal() {
		return numeroProcessoPrincipal;
	}

	public void setNumeroProcessoPrincipal(String numeroProcessoPrincipal) {
		this.numeroProcessoPrincipal = numeroProcessoPrincipal;
	}

	public Date getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public Date getDataDesarquivamento() {
		return dataDesarquivamento;
	}

	public void setDataDesarquivamento(Date dataDesarquivamento) {
		this.dataDesarquivamento = dataDesarquivamento;
	}

	public String getProcessoAnterior() {
		return processoAnterior;
	}

	public void setProcessoAnterior(String processoAnterior) {
		this.processoAnterior = processoAnterior;
	}

	public String getHoraCadastro() {
		return horaCadastro;
	}

	public void setHoraCadastro(String horaCadastro) {
		this.horaCadastro = horaCadastro;
	}

	public Date getDataDocumento() {
		return dataDocumento;
	}

	public void setDataDocumento(Date dataDocumento) {
		this.dataDocumento = dataDocumento;
	}

	public SimNaoEnum getPrivado() {
		return privado;
	}

	public void setPrivado(SimNaoEnum privado) {
		this.privado = privado;
	}

	public Integer getNumeroUltTramitacao() {
		return numeroUltTramitacao;
	}

	public void setNumeroUltTramitacao(Integer numeroUltTramitacao) {
		this.numeroUltTramitacao = numeroUltTramitacao;
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

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Motivo getMotivo() {
		return motivo;
	}

	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public String getObsTramitacao() {
		return obsTramitacao;
	}

	public void setObsTramitacao(String obsTramitacao) {
		this.obsTramitacao = obsTramitacao;
	}

	public String getHoraRecebimento() {
		return horaRecebimento;
	}

	public void setHoraRecebimento(String horaRecebimento) {
		this.horaRecebimento = horaRecebimento;
	}

	public SimNaoEnum getFlgArquivo() {
		return flgArquivo;
	}

	public void setFlgArquivo(SimNaoEnum flgArquivo) {
		this.flgArquivo = flgArquivo;
	}

	public Integer getPortador() {
		return portador;
	}

	public void setPortador(Integer portador) {
		this.portador = portador;
	}

	public Integer getDono() {
		return dono;
	}

	public void setDono(Integer dono) {
		this.dono = dono;
	}

	public String getUsuRACF() {
		return usuRACF;
	}

	public void setUsuRACF(String usuRACF) {
		this.usuRACF = usuRACF;
	}

	public Date getDataRACF() {
		return dataRACF;
	}

	public void setDataRACF(Date dataRACF) {
		this.dataRACF = dataRACF;
	}

	public String getHoraRACF() {
		return horaRACF;
	}

	public void setHoraRACF(String horaRACF) {
		this.horaRACF = horaRACF;
	}

	public String getHoraDesarquivamento() {
		return horaDesarquivamento;
	}

	public void setHoraDesarquivamento(String horaDesarquivamento) {
		this.horaDesarquivamento = horaDesarquivamento;
	}

	public String getUsuRacfDesarquivamento() {
		return usuRacfDesarquivamento;
	}

	public void setUsuRacfDesarquivamento(String usuRacfDesarquivamento) {
		this.usuRacfDesarquivamento = usuRacfDesarquivamento;
	}

	public Integer getPrazoRetencao() {
		return prazoRetencao;
	}

	public void setPrazoRetencao(Integer prazoRetencao) {
		this.prazoRetencao = prazoRetencao;
	}

	public SimNaoEnum getFlagCompleto() {
		return flagCompleto;
	}

	public void setFlagCompleto(SimNaoEnum flagCompleto) {
		this.flagCompleto = flagCompleto;
	}

	public SimNaoEnum getFlagAnexo() {
		return flagAnexo;
	}

	public void setFlagAnexo(SimNaoEnum flagAnexo) {
		this.flagAnexo = flagAnexo;
	}

	public SimNaoEnum getFlagDesmembramento() {
		return flagDesmembramento;
	}

	public void setFlagDesmembramento(SimNaoEnum flagDesmembramento) {
		this.flagDesmembramento = flagDesmembramento;
	}

	public Local getLocalDe() {
		return localDe;
	}

	public void setLocalDe(Local localDe) {
		this.localDe = localDe;
	}

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}

	public Local getLocalDono() {
		return localDono;
	}

	public void setLocalDono(Local localDono) {
		this.localDono = localDono;
	}

	public String getEmiteGuia() {
		return emiteGuia;
	}

	public void setEmiteGuia(String emiteGuia) {
		this.emiteGuia = emiteGuia;
	}

	public SimNaoEnum getFlagArquivado() {
		return flagArquivado;
	}

	public void setFlagArquivado(SimNaoEnum flagArquivado) {
		this.flagArquivado = flagArquivado;
	}

	public Date getDataCompromisso() {
		return dataCompromisso;
	}

	public void setDataCompromisso(Date dataCompromisso) {
		this.dataCompromisso = dataCompromisso;
	}

	public String getFlagImagem() {
		return flagImagem;
	}

	public void setFlagImagem(String flagImagem) {
		this.flagImagem = flagImagem;
	}

	public Local getLocalRACF() {
		return localRACF;
	}

	public void setLocalRACF(Local localRACF) {
		this.localRACF = localRACF;
	}

	public Local getLocalRacfTra() {
		return localRacfTra;
	}

	public void setLocalRacfTra(Local localRacfTra) {
		this.localRacfTra = localRacfTra;
	}

	public Local getLocalCompromisso() {
		return localCompromisso;
	}

	public void setLocalCompromisso(Local localCompromisso) {
		this.localCompromisso = localCompromisso;
	}

	public SimNaoEnum getProcessoArquivado() {
		return processoArquivado;
	}

	public void setProcessoArquivado(SimNaoEnum processoArquivado) {
		this.processoArquivado = processoArquivado;
	}

	public String getMunicipioInteressado() {
		return municipioInteressado;
	}

	public void setMunicipioInteressado(String municipioInteressado) {
		this.municipioInteressado = municipioInteressado;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getVinculado() {
		return vinculado;
	}

	public void setVinculado(String vinculado) {
		this.vinculado = vinculado;
	}

}

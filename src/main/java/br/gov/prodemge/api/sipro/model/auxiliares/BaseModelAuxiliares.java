package br.gov.prodemge.api.sipro.model.auxiliares;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.gov.prodemge.api.sipro.enums.StatusEnum;

public class BaseModelAuxiliares implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codElemento;

	private String descricao;

	private StatusEnum flagAtivo;

	private String superTabela;

	private String superElemento;

	private String senha;

	private String tabOrgao;

	private String tabAssunto;

	private String dataRacfTab;

	private String usuRacfTab;

	private String horaRacfTab;

	private String estrutura;

	private String dependencia;

	private String codHierarquico;

	private String mensagensTab;

	private Long orgao;

	@Column(name = "COD_ELEMENTO", length = 15)
	public String getCodElemento() {
		return codElemento;
	}

	public void setCodElemento(String codElemento) {
		this.codElemento = codElemento;
	}

	@Column(name = "NOME_ELEMENTO", length = 45)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "FLAG_ATIVO")
	@Enumerated(EnumType.ORDINAL)
	public StatusEnum getFlagAtivo() {
		return flagAtivo;
	}

	public void setFlagAtivo(StatusEnum flagAtivo) {
		this.flagAtivo = flagAtivo;
	}

	public String getSuperTabela() {
		return superTabela;
	}

	@Column(name = "SUPER_TABELA", length = 17)
	public void setSuperTabela(String superTabela) {
		this.superTabela = superTabela;
	}

	@Column(name = "SUPER_ELEMENTO", length = 47)
	public String getSuperElemento() {
		return superElemento;
	}

	public void setSuperElemento(String superElemento) {
		this.superElemento = superElemento;
	}

	@Column(name = "SENHA", length = 8)
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Column(name = "TAB_ORGAO", length = 400)
	public String getTabOrgao() {
		return tabOrgao;
	}

	public void setTabOrgao(String tabOrgao) {
		this.tabOrgao = tabOrgao;
	}

	@Column(name = "TAB_ASSUNTO", length = 400)
	public String getTabAssunto() {
		return tabAssunto;
	}

	public void setTabAssunto(String tabAssunto) {
		this.tabAssunto = tabAssunto;
	}

	@Column(name = "DATA_RACF_TAB", length = 8)
	public String getDataRacfTab() {
		return dataRacfTab;
	}

	public void setDataRacfTab(String dataRacfTab) {
		this.dataRacfTab = dataRacfTab;
	}

	@Column(name = "USU_RACF_TAB", length = 8)
	public String getUsuRacfTab() {
		return usuRacfTab;
	}

	public void setUsuRacfTab(String usuRacfTab) {
		this.usuRacfTab = usuRacfTab;
	}

	@Column(name = "HORA_RACF_TAB", length = 4)
	public String getHoraRacfTab() {
		return horaRacfTab;
	}

	public void setHoraRacfTab(String horaRacfTab) {
		this.horaRacfTab = horaRacfTab;
	}

	@Column(name = "ESTRUTURA", length = 15)
	public String getEstrutura() {
		return estrutura;
	}

	public void setEstrutura(String estrutura) {
		this.estrutura = estrutura;
	}

	@Column(name = "DEPENDENCIA", length = 15)
	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	@Column(name = "COD_HIERARQUICO", length = 1)
	public String getCodHierarquico() {
		return codHierarquico;
	}

	public void setCodHierarquico(String codHierarquico) {
		this.codHierarquico = codHierarquico;
	}

	@Column(name = "MENSAGENS_TAB", length = 200)
	public String getMensagensTab() {
		return mensagensTab;
	}

	public void setMensagensTab(String mensagensTab) {
		this.mensagensTab = mensagensTab;
	}

	@Column(name = "ORGAO", length = 4)
	public Long getOrgao() {
		return orgao;
	}

	public void setOrgao(Long orgao) {
		this.orgao = orgao;
	}

}

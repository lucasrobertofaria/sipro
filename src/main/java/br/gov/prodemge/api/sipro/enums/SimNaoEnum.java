package br.gov.prodemge.api.sipro.enums;

public enum SimNaoEnum {
	A("Ativo"), I("Inativo");

	private String descricao;

	SimNaoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return getDescricao();
	}

}

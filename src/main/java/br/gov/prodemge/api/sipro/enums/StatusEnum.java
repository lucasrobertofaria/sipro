package br.gov.prodemge.api.sipro.enums;

public enum StatusEnum {
	S("Sim"), N("Não");

	private String descricao;

	StatusEnum(String descricao) {
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

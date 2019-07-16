package br.gov.prodemge.api.sipro.model.auxiliares;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SINONIMO")
public class Sinonimo extends BaseModelAuxiliares implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	@Id
	@Column(name = "NOME_ELEMENTO", length = 45)
	public String getDescricao() {
		// TODO Auto-generated method stub
		return super.getDescricao();
	}
}

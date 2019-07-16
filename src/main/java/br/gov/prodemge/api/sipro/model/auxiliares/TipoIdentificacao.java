package br.gov.prodemge.api.sipro.model.auxiliares;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_TIPO_IDENTIFICACAO")
public class TipoIdentificacao extends BaseModelAuxiliares implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD_ELEMENTO", length = 15)
	public String getCodElemento() {
		return super.getCodElemento();
	}

}

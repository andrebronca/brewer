package com.algaworks.brewer.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {

	@NotBlank(message = "SKU é obrigatório")
	private String sku;
	@NotNull(message = "Nome é obrigatório")
	@Size(min=3, max=50)
	private String nome;
	@NotNull(message = "A descrição é obrigatória")
	@Size(min=4, max=50, message="Tamanho da descrição deve estar entre: 4 e 50 caracteres")
	private String descricao;
	
	
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
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

	@Override
	public String toString() {
		return "Cerveja [sku=" + sku + ", nome=" + nome + ", descricao=" + descricao + "]";
	}
	
	
	
}

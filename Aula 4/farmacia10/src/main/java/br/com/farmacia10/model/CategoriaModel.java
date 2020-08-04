package br.com.farmacia10.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class CategoriaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Column(name = "descricao_categoria")
	// na tabela vai se chamar descricao_categoria, enquanto aqui posso chamar apenas por descrição
	@Size(min = 5, max = 150)
	private String descricao;
	
	@NotNull
	@Column(name = "ativo_categoria")
	private boolean ativo;
	
	// se usar ALL e apagar uma categoria, todos os produtos com essa categoria vão ser apagados também.
	// o PERSIST só atualiza e deixa os produtos relacionados sem categoria.
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.PERSIST)
	@JsonIgnoreProperties("categoria")
	private List<ProdutoModel> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public List<ProdutoModel> getProduto() {
		return produto;
	}

	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}
}

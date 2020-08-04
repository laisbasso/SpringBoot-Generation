package br.com.minhaescola.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_turma")
public class TurmaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String turma;
	
	@NotNull
	private boolean ativo;
	
	@OneToMany(mappedBy = "turma", cascade = CascadeType.PERSIST)
	@JsonIgnoreProperties("turma")
	private List<AlunoModel> aluno;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public List<AlunoModel> getAluno() {
		return aluno;
	}

	public void setAluno(List<AlunoModel> aluno) {
		this.aluno = aluno;
	}
}

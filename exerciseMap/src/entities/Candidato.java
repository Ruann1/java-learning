package entities;

import java.util.Objects;

public class Candidato {

	private String nome;
	private Integer voto;
	
	public Candidato(String nome, Integer voto) {
		this.nome = nome;
		this.voto = voto;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, voto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		return Objects.equals(nome, other.nome) && voto == other.voto;
	}
	
	
	
}

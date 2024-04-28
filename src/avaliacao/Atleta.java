package avaliacao;

public class Atleta {

	String fone; //chave primária
    String nome;
    String apelido;
    String dataNascimento;
    
    
    public Atleta(String fone, String nome, String apelido, String dataNascimento, int pontuacaoAcumulada) {
        this.fone = fone;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.pontuacaoAcumulada = pontuacaoAcumulada;
    }
    
    
    int pontuacaoAcumulada;	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getPontuacaoAcumulada() {
		return pontuacaoAcumulada;
	}
	public void setPontuacaoAcumulada(int pontuacaoAcumulada) {
		this.pontuacaoAcumulada = pontuacaoAcumulada;
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Atleta atleta = (Atleta) obj;
	    if (fone == null) {
	        return atleta.fone == null;
	    } else {
	        return fone.equals(atleta.fone);
	    }
	}
}


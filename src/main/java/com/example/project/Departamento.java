package com.example.project;

public class Departamento {
    private String nome;
    private String sigla;
    private String localizacao;
    private Coordenador coordenador;

    public Departamento(
        String nome, 
        String sigla, 
        String localizacao, 
        Coordenador coordenador
    ) {
        this.nome = nome;
        this.sigla = sigla;
        this.localizacao = localizacao;
        this.coordenador = coordenador;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Coordenador getCoordenador() {
        return this.coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public static boolean isEmpty(String text) {
		if (text == null){
			return true;
		}
		
		if (text.equals("")){
			return true;
		}

		else{
			return false;
		}
    }

    private String Quebra_Linha = System.lineSeparator();

    public void verificarCampoObrigatorioDepartamento() {
        if (isEmpty(this.getNome())) {
            throw new RuntimeException("O campo nome do departamento é obrigatório");
        }

        if (isEmpty(this.getLocalizacao())) {
            throw new RuntimeException("O campo localização do departamento é obrigatório");
        }
    }

    public String dadosDepartamento() {

        String _sigla = isEmpty(this.sigla) ? "" : this.sigla;
        String _localizacao = "Localização: " + this.localizacao;

        String retornoDepartamento = this.nome + Quebra_Linha;
        retornoDepartamento += _sigla + Quebra_Linha;
        retornoDepartamento += _localizacao + Quebra_Linha;
        retornoDepartamento += this.coordenador.dadosCoordenador() + Quebra_Linha;

        return retornoDepartamento;
    }

}

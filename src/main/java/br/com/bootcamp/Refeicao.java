package br.com.bootcamp;

public class Refeicao {
    private String nome;
    private boolean saudavel;

    public Refeicao(String nome, boolean saudavel) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da refeição não pode ser vazio.");
        }
        this.nome = nome;
        this.saudavel = saudavel;
    }

    public String getNome() { return nome; }
    public boolean isSaudavel() { return saudavel; }
}

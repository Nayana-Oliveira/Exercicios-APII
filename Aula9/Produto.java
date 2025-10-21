package segundo_semestre.java.Aula9.HashMap;

import java.util.Objects;

public class Produto {
    private int id;
    private String nome;
    
    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (objeto == null || this.getClass() != objeto.getClass()) {
            return false;
        }
        Produto produto = (Produto) objeto;
        if (this.id == produto.id) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
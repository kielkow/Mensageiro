package lista;

public class Node {
    String data;
    String descricao;
    String nome;
    int tempo;
    String lugar;
    boolean completado;
    Node proximo;

    public Node(String data, String descricao,  String nome, int tempo, String lugar) {
        this.data = data;
        this.descricao = descricao;
        this.nome = nome;
        this.tempo = tempo;
        this.lugar = lugar;
        this.completado = false;
        proximo = null;
    }
}
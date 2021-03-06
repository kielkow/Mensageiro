package lista;

public interface TADLista {
    public boolean isEmpty();
    //public boolean isFull();
    public int size();
    public void add(String data, String horInicial, String horFinal, String nome, String lugar, int indice) throws IndexOutOfBoundsException;
    public Node remove(int indice) throws IndexOutOfBoundsException;
    public Node set(String data, String horInicial, String horFinal, String nome, String lugar, int indice) throws IndexOutOfBoundsException;
    public Node get(int indice) throws IndexOutOfBoundsException;
}
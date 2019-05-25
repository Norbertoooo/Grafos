public class main {
    public static void main(String[] args) {
        Grafos grafo = new Grafos();

        grafo.criarGrafo();

        grafo.exibirGrafo();

        grafo.listarArestas();

        grafo.listarVertices();

        grafo.addVertice("H");

        grafo.addAresta("I","H");

        grafo.apagarVerticeEAresta("C");

        grafo.exibirGrafo();


    }
}

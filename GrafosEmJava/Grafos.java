import java.util.*;

public class Grafos {


    private Map<String, List<String>> grafo = new HashMap();

    public void criarGrafo(){
        List<String> vertice = new ArrayList<>();

        vertice.add("A");
        vertice.add("B");
        vertice.add("C");
        vertice.add("D");
        vertice.add("E");
        grafo.put("A",vertice);
        vertice = new ArrayList<>();

        vertice.add("B");
        vertice.add("C");
        vertice.add("D");
        vertice.add("E");
        grafo.put("B",vertice);
        vertice = new ArrayList<>();

        vertice.add("C");
        vertice.add("D");
        vertice.add("E");
        grafo.put("C",vertice);
        vertice = new ArrayList<>();

        vertice.add("D");
        vertice.add("E");
        grafo.put("D",vertice);
        vertice = new ArrayList<>();

        vertice.add("E");
        grafo.put("E",vertice);

    }

    public void exibirGrafo(){
        System.out.println(grafo);
        System.out.println(grafo.size());
    }

    public void apagarVerticeEAresta(String vertice){

        System.out.println("Apagando valores: " + vertice);

        for (List<String> i : grafo.values()){
            if (i.contains(vertice)){
                i.remove(vertice);
            }
        }

        System.out.println("Apagando Key: " + vertice );
        grafo.remove(vertice);

    }

    public void listarVertices(){
        System.out.println(grafo.keySet());
    }
    public void listarArestas(){
        System.out.println(grafo.values());
    }

    public void addVertice(String vertice){
        List<String> listaDeAresta = new ArrayList<>();
        grafo.put(vertice, listaDeAresta);
    }

    public void addAresta(String aresta, String vertice){
        List<String> listaDeAresta = new ArrayList<>();
        listaDeAresta.add(aresta);
        grafo.replace(vertice,listaDeAresta);
    }



}

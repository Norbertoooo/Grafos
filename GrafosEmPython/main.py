print("iniciando em python")
print("grafinho feito de forma mais burra possivel")
grafo={"a":["ac","ca"],
        "b":["cb","bc","be","eb"],
        "c":["ce","ec","cd","dc","ca","ac","bc","cb"],
        "d":["cd","dc",],
        "e":["eb","be","ce","ec"],
        "f":[]}
class grafinho:
    def listar(self,grafo):
        for x in grafo:
            print(x, grafo[x])

    def adicionar(self,elemento,destino,grafo):
        grafo[destino] = grafo[destino] + [elemento]
        
    def criar(self,elemento,novo,grafo):
        grafo[novo] = [elemento]

    def deletar(self,elemento,grafo):
        del(grafo[elemento])

grafinho.listar(grafinho,grafo)
print("------------------------")
grafinho.deletar(grafinho,"c",grafo)
print("-----------lista com c deletada-------------")
grafinho.listar(grafinho,grafo)
print("------------------------")
grafinho.adicionar(grafinho,"k","d",grafo)
print("------------------------")
grafinho.listar(grafinho,grafo)
grafinho.adicionar(grafinho,"michel","b",grafo)
grafinho.adicionar(grafinho,"michel","a",grafo)
grafinho.criar(grafinho,"k","michel",grafo)
grafinho.listar(grafinho,grafo)



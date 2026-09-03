from Item import Item
class Personagem:
    def __init__(self, nome: str, vida: int, nivel: int):
        self._nome = nome
        self._vida = vida
        self._nivel = nivel
        self._inventario = []
    def pegar(self, item: Item):
        if item is None or item == "":
            print("item não encontrado.")
        else:
            self._inventario.append(item)
    def ficha(self):
        print(f"Nome: {self._nome}")
        print(f"Vida: {self._vida}")
        print(f"Nível: {self._nivel}")
        if self._inventario:
            print("Inventário:")
            for item in self._inventario:
                print(f"- {item.nome} (Peso: {item.bonus})")
        else:
            print("Inventário: Vazio")

    @property
    def nome(self):
        return self._nome
    @nome.setter
    def nome(self, valor):
        if valor is None or valor == "":
            print("O nome não pode ser vazio.")
        else:
            self._nome = valor
    @property
    def vida(self): 
        return self._vida
    @vida.setter
    def vida(self, valor):
        if valor <= 100 and valor >= 0:
            self._vida = valor
        else:
            print("A vida deve estar entre 0 e 100.")
    @property
    def nivel(self):    
        return self._nivel

    @nivel.setter
    def nivel(self, valor):
        if valor > 0:
            self._nivel = valor  
        else:
            print("O nível não pode ser menor que 1.")
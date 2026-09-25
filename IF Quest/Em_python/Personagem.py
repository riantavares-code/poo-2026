from abc import ABC, abstractmethod
from Item import Item
from SemForca import SemForca
from SemMana import SemMana
class Personagem(ABC):
    def __init__(self, nome: str, vida: int, nivel: int, forca: int):
        self.nome = nome
        self.nivel = nivel
        self.vida = vida
        self.forca = forca
        self._inventario = [None] * 10
        self._quantidade_item = 0
    @abstractmethod
    def habilidade(self) -> str: 
        pass
    @property
    def nome(self):
        return self._nome
    @nome.setter
    def nome(self, nome):
        if nome is None or nome.strip() == "":
            raise ValueError(f"Nome inválido: {nome}")
        self._nome = nome
    @property
    def vida(self): 
        return self._vida
    @vida.setter
    def vida(self, vida):
        if vida > 200:
            raise ValueError(f"Vida nao pode ser maior que 200: {vida}")
        if vida < 0:
            self._vida = 0
        else:
            self._vida = vida
    @property
    def nivel(self):    
        return self._nivel
    @nivel.setter
    def nivel(self, nivel):
        if nivel < 1:
            print("Nivel nao pode ser menor que 1")
        else:
            self._nivel = nivel
    @property
    def forca(self):
        return self._forca
    @forca.setter
    def forca(self, forca):
        if forca < 0:
            raise ValueError(f"Forca nao pode ser negativa: {forca}")
        self._forca = forca
    def pegar(self, item: Item):
        if item is None: 
            print("ERRO, item nulo\n")
            return
        if self._quantidade_item < len(self._inventario):
            self._inventario[self._quantidade_item] = item
            self._quantidade_item += 1
        else: 
            print("Inventario cheio")
    def atacar(self, alvo=None):
        if alvo is not None:
            danoTotal = self.forca
            for i in range(self._quantidade_item):
                danoTotal += self._inventario[i].bonus
            alvo.vida = alvo.vida - danoTotal
            print(f"{self.nome} atacou {alvo.nome} causando {danoTotal} de dano total!")
        else:
            print("ERRO: Nao ha alvo para atacar.\n")
    def GolpeEspecial(self, habilidade: str, custoForca: int):
        if self.forca < custoForca:
            raise SemForca(self.forca)
        self.forca -= custoForca 
        print(f"{self.nome} usou o golpe especial '{habilidade}' gastando {custoForca} de força!")
    def ficha(self):
        print(f"Nome: {self.nome}")
        print(f"Vida: {self.vida}")
        print(f"Nivel: {self.nivel}")
        print(f"Forca: {self.forca}")
        if hasattr(self, '_mana') and self._mana < 10:
            print("Habilidade: Indisponível (Sem Mana)")
        else:
            if self.__class__.__name__ == "Mago":
                print("Habilidade: Magia_de_raio")
            elif self.__class__.__name__ == "Guerreiro":
                print("Habilidade: corte_duplo")
            else:
                print("Habilidade: Nenhuma")   
        print("Inventario: ")
        if self._quantidade_item == 0:
            print("Inventario vazio")
        else:
            for i in range(self._quantidade_item):
                print(self._inventario[i].descricao())

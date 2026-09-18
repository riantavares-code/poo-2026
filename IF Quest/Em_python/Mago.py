from Personagem import Personagem
from SemManaError import SemManaError

class Mago(Personagem):
    def __init__(self, nome: str, vida: int, nivel: int, forca: int):
        super().__init__(nome, vida, nivel, forca)
        self._mana = 50

    def habilidade(self) -> str:
        if self._mana < 10:
            raise SemManaError(self._mana)
        self._mana -= 10
        return "Magia_de_raio"

    def atacar(self, alvo=None):
        super().atacar(alvo)

    @property
    def mana(self):
        return self._mana

    @mana.setter
    def mana(self, valor: int):
        if valor < 0:
            raise ValueError("A mana não pode ser negativa.")
        else:
            self._mana = valor
            
    def ficha(self):
        print("Ficha do Mago:")
        super().ficha()
        print(f"Mana: {self._mana}")

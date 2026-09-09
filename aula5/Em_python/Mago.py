from Personagem import Personagem
class Mago(Personagem):
    def __init__(self, nome: str, vida: int, nivel: int, forca: int):
        super().__init__(nome, vida, nivel, forca)
        self._mana = 50
    def habilidade(self) -> str:
        return "Magia_de_raio"
    @property
    def mana(self):
        return self._mana
    @mana.setter
    def mana(self, valor: int):
        if valor < 0:
            print("A mana não pode ser negativa.")
        else:
            self._mana = valor
            
    def ficha(self):
        print("Ficha do Mago:")
        super().ficha()
        print(f"Mana: {self._mana}")
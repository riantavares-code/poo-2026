from Personagem import Personagem
class Guerreiro(Personagem):
    def __init__(self, nome: str, vida: int, nivel: int, forca: int):
        super().__init__(nome, vida, nivel, forca)
        self._defesa = 5
    def habilidade(self) -> str:
        return "corte_duplo"
    @property
    def defesa(self):
        return self._defesa
    @defesa.setter
    def defesa(self, valor: int):
        if valor < 0:
            print("A defesa não pode ser negativa.")
        else:
            self._defesa = valor
    def ficha(self):
        print("Ficha do Guerreiro:")
        super().ficha()
        print(f"Defesa: {self._defesa}")
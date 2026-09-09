from Personagem import Personagem
class Chefe(Personagem):
    def __init__(self, nome: str):
        super().__init__(nome, 200, 32, 20)
    def habilidade(self) -> str:
        return "golpe_de_furia"
    def ficha(self):
        print("Ficha do Chefe:")
        super().ficha()
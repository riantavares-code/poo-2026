class Personagem:
    def __init__(self, nome: str, vida: int, forca: int):
        self.__nome = nome
        self.__vida = vida
        self.__forca = forca
    def receber_dano(self, dano: int):
        self.__vida -= dano
        if self.__vida < 0:
            self.__vida = 0
    def esta_vivo(self) -> bool:
        return self.__vida > 0
    def ficha(self):
        print(f"Nome: {self.__nome}")
        print(f"Vida: {self.__vida}")
        print(f"Forca: {self.__forca}")
    def atacar(self, alvo: 'Personagem'):
        alvo.receber_dano(self.__forca)
    @property
    def nome(self):
        return self.__nome
    @property
    def vida(self):
        return self.__vida
    @property
    def forca(self):
        return self.__forca
if __name__ == "__main__":
    heroi = Personagem("Heroi", 100, 10)
    chefe = Personagem("Chefe", 150, 15)
    print("\n----Ficha de Personagem----\n")
    heroi.ficha()
    print()
    chefe.ficha()
    while heroi.esta_vivo() and chefe.esta_vivo():
        heroi.atacar(chefe)
        if chefe.esta_vivo():
            chefe.atacar(heroi)
    print("\n----Apos a luta----\n")
    heroi.ficha()
    print()
    chefe.ficha()
    if heroi.esta_vivo():
        print("Vitoria do heroi\n")
    else:
        print("Vitoria do chefe")

class Item:
    def __init__(self, nome: str, bonus: int):
        self._nome = nome
        self._bonus = bonus

    @property
    def nome(self):
        return self._nome

    @nome.setter
    def nome(self, nome: str):
        if not nome:
            print("O nome vazio.")
        else:
            self._nome = nome

    @property
    def bonus(self):
        return self._bonus

    @bonus.setter
    def bonus(self, bonus: int):
        if bonus < 0:
            print("O bônus não pode ser negativo.")
        else:
            self._bonus = bonus

    def descricao(self):
        return self.__str__()

    def __str__(self):
        return f"Item: {self._nome}, Bônus: {self._bonus}"

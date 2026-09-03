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
            raise ValueError("O nome vazio.")
        self._nome = nome
    @property
    def bonus(self):
        return self._bonus
    @bonus.setter
    def bonus(self, bonus: int):
        if bonus < 0:
            raise ValueError("O bônus não pode ser negativo.")
        self._bonus = bonus
    def __str__(self):
        return f"Item: {self.nome}, Bônus: {self.bonus}"
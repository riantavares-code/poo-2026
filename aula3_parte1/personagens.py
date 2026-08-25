class Personagens:
    def __init__(self):
        self._nome = None
        self._vida = None
        self._nivel = None

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


if __name__ == "__main__":
    personagem1 = Personagens()

    personagem1.nome = "Berserker"
    personagem1.vida = 80
    personagem1.nivel = 10
    print(f"Nome: {personagem1.nome}, Vida: {personagem1.vida}, Nível: {personagem1.nivel}")

    personagem1.nome = ""
    personagem1.vida = -10
    personagem1.nivel = -5
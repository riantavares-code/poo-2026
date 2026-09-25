class SemMana(Exception):
    def __init__(self, mana_atual: int):
        self.mana_atual = mana_atual
        super().__init__(f"Mana {mana_atual} de mana, mas precisa de pelo menos 10.")

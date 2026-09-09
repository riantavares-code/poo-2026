from Personagem import Personagem
from Item import Item
from Mago import Mago
from Chefe import Chefe
from Guerreiro import Guerreiro
if __name__ == "__main__":
    p = Mago("Gandalf", 100, 5, 20)
    g = Guerreiro("Anao", 100, 4, 25)
    c = Chefe("Sauron")
    ip = Item("Cajado eletrico", 10)
    ig = Item("Machado duplo", 5)
    g.pegar(ig)
    p.pegar(ip)
    g.ficha()
    p.ficha()
    c.ficha()
    grupo = [p, g]
    print("Batalha")
    for heroi in grupo:
        heroi.ficha()
        print(f"{heroi.nome} usou a habilidade: {heroi.habilidade()}")
        heroi.atacar(c)
    print("status do chefe:")
    c.ficha()
    for heroi in grupo:
        if isinstance(heroi, Mago):
            print(f"{heroi.nome} tem {heroi.mana} de mana.")
    # Comentario de esplicacao:
    # Dentro da batalha não usamos checagem de tipo para respeitar o POLIMORFISMO puro,
    # onde tratamos todos como personagem e a cod descobre o método certo sozingho.
    # Fora do laço o uso do isinstance é aceitável pois serve para ler um atributo específico
    # e exclusivo do Mago, que a classe mãe não conhece.
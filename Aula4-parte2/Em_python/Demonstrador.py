from Personagem import Personagem
from Item import Item
from Mago import Mago
from Guerreiro import Guerreiro
if __name__ == "__main__":
    p = Mago("Gandalf", 100, 5)
    g = Guerreiro("Orque", 120, 4)
    ip = Item("Cajado eletrico", 10)
    ig = Item("Machado duplo", 5)
    g.pegar(ig)
    p.pegar(ip)
    
    g.ficha()
    p.ficha()
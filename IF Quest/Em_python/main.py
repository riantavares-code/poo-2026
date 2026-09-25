import sys
from Mago import Mago
from Guerreiro import Guerreiro
from Chefe import Chefe
from Item import Item
from SemMana import SemMana
from TelaCriacaoHeroi import TelaCriacaoHeroi
from TelaCriacaoHeroiFlow import TelaCriacaoHeroiFlow

def main():
    TelaCriacaoHeroi()
    telaFlow = TelaCriacaoHeroiFlow()
    
    g = None
    mvalido = None
    minvalido = None
    c = None
    ig = None
    im = None

    print("teste de invalido")
    try:
        minvalido = Mago("Hermione", -100, 33, 44)
    except ValueError as e:
        print("Captura de erro com sucesso: " + str(e))

    print("criacao de personagem")
    try:
        ig = Item("Manopla", 3)
        im = Item("Varinha de cedro", 5)
        c = Chefe("Rabo-Corneo Hungaro")
        mvalido = Mago("Dumblodore", 100, 78, 65)
        g = Guerreiro("Hagrid", 100, 66, 50)
    except ValueError as e:
        print("Erro no personagem: " + str(e))

    if g is not None and c is not None and mvalido is not None:
        g.pegar(ig)
        mvalido.pegar(im)
        Grupo = []
        Grupo.append(g)
        Grupo.append(mvalido)
        print("Comeco\n")
        while c.getVida() > 0:
            for heroi in Grupo:
                if c.getVida() <= 0:
                    break
                heroi.ficha()
                print(heroi.getNome() + " usa" + heroi.habilidade())
                try:
                    heroi.atacar(c)
                except SemMana as e:
                    print(heroi.getNome() + " Falha: " + str(e))
                    print(heroi.getNome() + " Turno passado")
                finally:
                    if c.getVida() < 0:
                        c.setVida(0)
                    print("Final do turno")
            print("\nStatus final do ")
            c.ficha()
            print("\nVerificacao de mago", file=sys.stderr)
            for heroi in Grupo:
                if isinstance(heroi, Mago):
                    mago = heroi
                    print("Mago: " + mago.getNome() + "\nMana: " + str(mago.getMana()))

# Dentro da batalha não usamos checagem de tipo para respeitar o POLIMORFISMO,
# onde tratamos todos como personagem e a linguagem descobre o método correto sozinha.
# Fora do laço o uso do instanceof é aceitável pois serve para ler um atributo específico
# e exclusivo de Mago mana, que a classe genérica mãe não conhece.

if __name__ == "__main__":
    main()

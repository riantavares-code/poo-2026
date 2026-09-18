from Personagem import Personagem
from Item import Item
from Mago import Mago
from Chefe import Chefe
from Guerreiro import Guerreiro
from SemManaError import SemManaError

if __name__ == "__main__":
    ginvalido = None
    m = None
    g = None
    c = None
    ip = None
    ig = None
    
    print("teste de criacao")
    try:
        ginvalido = Guerreiro("Legolas", -11, 8, 54) # criacao de invalido
    except ValueError as e:
        print(f"Captura de erro com sucesso")
        
    try: 
        m = Mago("Gandalf", 100, 5, 20)
        g = Guerreiro("Anao", 100, 4, 25)
        c = Chefe("Sauron")
        ip = Item("Cajado eletrico", 10)
        ig = Item("Machado duplo", 5)
    except ValueError as e:
        print(f"Erro no personagem: {e}")
        
    if g is not None and c is not None and m is not None:
        g.pegar(ig)
        m.pegar(ip)
    
        grupo = []
        grupo.append(g)
        grupo.append(m)
        
        print("-----Batalha-----")
        while(c.vida > 0):
            for heroi in grupo:
                if c.vida <= 0:
                    break
                heroi.ficha()
                
                # O bloco try agora engloba a habilidade e o ataque
                try:
                    print(f"{heroi.nome} usa {heroi.habilidade()}")
                    heroi.atacar(c)
                except SemManaError as e:
                    print(f"{heroi.nome} falhou ao atacar")
                    print(f"Motivo: {e}")
                    print(f"{heroi.nome} perdeu o turno")
                finally:
                    if c.vida < 0:
                        c.vida = 0
                    print("Final do turno")   
                                 
        print("---status do chefe---")
        c.ficha()
        
        print("Verificacao de mago")
        for heroi in grupo:
            if isinstance(heroi, Mago):
                print(f"{heroi.nome} tem {heroi.mana} de mana.")
    
    # Comentario de esplicacao:
    # Dentro da batalha não usamos checagem de tipo para respeitar o POLIMORFISMO puro,
    # onde tratamos todos como personagem e a cod descobre o método certo sozingho.
    # Fora do laço o uso do isinstance é aceitável pois serve para ler um atributo específico
    # e exclusivo do Mago, que a classe mãe não conhece.

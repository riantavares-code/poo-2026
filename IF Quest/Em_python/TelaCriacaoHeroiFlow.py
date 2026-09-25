import tkinter as tk
from tkinter import ttk

class TelaCriacaoHeroiFlow(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("IF Quest - Versão FlowLayout")
        self.geometry("400x300")
        self.protocol("WM_DELETE_WINDOW", self.destroy)

        titulo = ttk.Label(self, text="Criação de Herói")
        labelNome = ttk.Label(self, text="Nome:")
        campoNome = ttk.Entry(self, width=15)
        labelVida = ttk.Label(self, text="Vida:")
        campoVida = ttk.Entry(self, width=15)
        labelClasse = ttk.Label(self, text="Classe:")
        campoClasse = ttk.Entry(self, width=15)
        botaoCriar = ttk.Button(self, text="Criar Herói")

        botaoCriar.config(state="disabled")

        titulo.pack(side="top", anchor="center", padx=10, pady=15)
        labelNome.pack(side="top", anchor="center", padx=10, pady=15)
        campoNome.pack(side="top", anchor="center", padx=10, pady=15)
        labelVida.pack(side="top", anchor="center", padx=10, pady=15)
        campoVida.pack(side="top", anchor="center", padx=10, pady=15)
        labelClasse.pack(side="top", anchor="center", padx=10, pady=15)
        campoClasse.pack(side="top", anchor="center", padx=10, pady=15)
        botaoCriar.pack(side="top", anchor="center", padx=10, pady=15)

        self.eval('tk::PlaceWindow . center')
        self.mainloop()

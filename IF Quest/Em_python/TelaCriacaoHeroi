import tkinter as tk
from tkinter import ttk

class TelaCriacaoHeroi(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("IF Quest")
        self.geometry("400x300")
        self.protocol("WM_DELETE_WINDOW", self.destroy)

        titulo = ttk.Label(self, text="Texto Provisório")
        titulo.config(text="Criação de Herói", anchor="center")
        
        painelCentral = ttk.Frame(self)
        painelFormulario = ttk.Frame(painelCentral)
        
        campoNome = ttk.Entry(painelFormulario, width=15)
        campoVida = ttk.Entry(painelFormulario, width=15)
        campoClasse = ttk.Entry(painelFormulario, width=15)
        
        ttk.Label(painelFormulario, text="Nome:").grid(row=0, column=0, sticky="e", padx=5, pady=5)
        campoNome.grid(row=0, column=1, padx=5, pady=5)
        ttk.Label(painelFormulario, text="Vida:").grid(row=1, column=0, sticky="e", padx=5, pady=5)
        campoVida.grid(row=1, column=1, padx=5, pady=5)
        ttk.Label(painelFormulario, text="Classe:").grid(row=2, column=0, sticky="e", padx=5, pady=5)
        campoClasse.grid(row=2, column=1, padx=5, pady=5)
        
        painelFormulario.pack(expand=True, pady=30)

        botaoCriar = ttk.Button(self, text="Criar Herói", command=criarHeroi)

        valorInicialNome = campoNome.get()
        print("Conteúdo consultado do campoNome: " + valorInicialNome)
        print("Texto consultado do titulo: " + titulo.cget("text"))

        titulo.pack(side="top", fill="x", pady=5)
        painelCentral.pack(expand=True, fill="both")
        botaoCriar.pack(side="bottom", fill="x")

        self.eval('tk::PlaceWindow . center')
        self.mainloop()

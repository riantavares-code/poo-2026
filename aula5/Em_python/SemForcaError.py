class SemForcaError(Exception):
    def __init__(self, forca: int):
        super().__init__(f"Forca insuficiente: {forca}")
        self._forcaAtual = forca

    @property
    def forca(self):
        return self._forcaAtual

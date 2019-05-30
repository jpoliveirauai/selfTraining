from Costumer import Costumer
from BD import Base

joao = Costumer("Jp","1234",20)
bd = Base()
if ( bd.show(joao) == "" ):
    bd.insert(joao)
bd.show(joao)
joao = Costumer("Jp","1234",70)
bd.update(joao)
bd.show(joao)
bd.delete(joao)
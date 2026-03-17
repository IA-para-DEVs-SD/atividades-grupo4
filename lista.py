#Manual
def numero_igual(lista):
    for i in lista:
        if lista.count(i) > 1:
            return True
    return False




#IA
#set elimina duplicatas em O(n), então comparar os tamanhos resolve o problema em tempo linear.
def numero_igual_ia(lista):
    return len(lista) != len(set(lista)) 



lista1 = [1,2,3,3,5,5,7]
lista2 = [2,5,1,3,9,312,7,10]

print(f"Manual :{numero_igual(lista1)}")

print(f"Manual :{numero_igual(lista2)}")

print(f"IA :{numero_igual_ia(lista1)}")
print(f"IA :{numero_igual_ia(lista2)}")



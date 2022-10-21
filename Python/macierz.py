import random

def main():
  #przykładowa macierz
  macierz = [
             [1, 2, 3],         
             [4, 5, 6],
             [7, 8, 9] 
            ]
  
  #przykładowa macierz wygenerowana losowo
  macierz2 = [[random.randint(1,9) for i in range(3)] for j in range(3)]
  
  print(macierz2) #wyświetlenie macierzy przed transponowaniem dla sprawdzenia
  print(transp(macierz))
  print(transp(macierz2)) #wyświetlnie macierzy na ekranie

def transp(M): #funkcja transponowania macierzy
  
  T = [] #tworzenie pustej listy 
  for i in range(len(M)): #przejście po listach w długości listy
    P = [] #tworzenie pustej listy
    for j in range(len(M[i])): #przejście po elementach listy w liście
      P.append(M[j][i]) #dodawanie do nowej listy elementów w odwrotnej kolejności
    T.append(P) #dodawanie listy do pustej listy aby powstała macierz

  return T # zwrócenie macierzy

main()

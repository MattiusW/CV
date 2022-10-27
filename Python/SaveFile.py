def main():
  #Poem to save
  poem = '''   
  "To nie ognik. To przewodnik.
  Taki drut, a w drucie PRĄD.
  Robisz pstryk i włączasz PRĄD!"
  ''' 
  dictionary ={} #Create dictionary
  file = open('wiersz.txt', 'w') #Open file to write
  file.write(poem) #Write poem
  file.close() #Close file
  nameFile = input("Enter name of file: ")

  # Try to open file 
  try:
    file = open(nameFile)
  except:
    print("I can't open this file.")
    return
  
  #Read save file
  SaveFile = file.read()
  print(SaveFile)

  for element in SaveFile:
    if element.islower() == False and element.isupper() == False: #Count not letter in poem
      dictionary[element] = dictionary.get(element, 0) + 1 #Save result to dictionary
    else:
      continue
  file.close #close file
  print(dictionary)

  return
    
if __name__ == "__main__":
  main()
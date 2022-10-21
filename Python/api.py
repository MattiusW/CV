import requests
import json
import pprint
import webbrowser
from datetime import datetime, timedelta

timeBefore = timedelta(days=7)    #przedział daty

searchDate = datetime.today() - timeBefore    #dzisiejsza data

print(int(searchDate.timestamp()))

#profesjonalnie używać parametrów w słowniku
params = {
    "site" : "stackoverflow",    #dokładnie jaka strona?
    "sort" : "votes",            #co sortujemy? 
    "order" : "desc",            #sortowanie malejąco
    "fromdate" : int(searchDate.timestamp()),  #generowanie daty w sekundach  
    "tagged" : "python",         #jakiej kategorii?
    "min" : 5                   #ustawiamy minimalną ocene
}

#pobieranie ze strony
r = requests.get("https://api.stackexchange.com/2.2/questions/", params)

try:
    questions = r.json()                #spróbuj otworzyć pytania w json
except json.decoder.JSONDecodeError:
    print("Niepoprawny format")         #obsługa błędu
else:
    for question in questions["items"]:
        webbrowser.open_new_tab(question["link"]) #otwarcie linku za pomocą webrowser 

#timestamp() czas liczony w sekundach od 1 stycznia 1970.


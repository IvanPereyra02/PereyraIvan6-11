
import requests

res = requests.get('https://dog.ceo/api/breeds/image/random')

data = res.text

file = open("destino.txt", "w")
file.write(data)
file.close()
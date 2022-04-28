
import requests

response = request.get('https://dog.ceo/api/breeds/image/random')
body = response.json()
print(body)
print(response.headers)

cuerpo = open("cuerpo.txt","w")
cuerpo.write(str(body))
cuerpo.close()

encabezado = open("encabezado.txt", "w")
encabezado.write(str(response.headers))
encabezado.close()


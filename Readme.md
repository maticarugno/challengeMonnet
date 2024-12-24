# Challenge Monnet

Lo que planteo como solucion es implementar un strategy donde los distintos modos de manejo
tengan su propia clase concreta, con su propia logica (hoy en dia no tienen nada
pero en cada modo se manejaria de forma diferente), y a la vez todas implementen la interfaz
ModoAuto y de esta forma todos entiendan el metodo "manejar()".

De esta manera tambien se podrian agregar nuevos modos de manejo sin modificar el 
codigo existente.

Tambien cree un endpoint para ejecutar la funcionalidad de manejar:

Request: curl --location 'http://localhost:8080/auto/manejarDia/lunes'

Resultado: "Manejando en modo trabajo"

# inditex-challenge

#Ejercicio 10

La estructura de datos que proponemos como una solución válida para este ejercicio es ArrayList por las siguientes razones:
  - Se debe recorrer el array de manera secuencial, desde el inicio hasta el final ya que se debe obtener el primer número mayor que el actual que se encuentre a la derecha del array.
  - No se debe ordenar el array ya que alteraría el resultado esperado.

El coste temporal del algoritmo se ha calculado para el coste peor, que ocurre cuando el array está ordenado a la inveresa, es decir, de mayor a menor. En este caso el algoritmo debe recorrer el resto del array para cada uno de los elementos. 
El primer bucle recorre el array n veces. El segundo lo recorre n-1, por lo tanto el coste temporal del algoritmo sería de 2n-1. Teniendo en cuenta que n contiene los costes de las comparaciones del propio bucle y las dos comparaciones de dentro. El coste estimado es de O(2n).

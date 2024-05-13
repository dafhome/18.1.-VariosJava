# 18.1.3. Barras Resultados

3- BARRAS RESULTADOS ELECTORALES
Son las elecciones! Se van a mostrar gráficamente los resultados de cada partido.
Crea una clase Partido con los datos: nombre y porcentaje. Instancia al menos 5 partidos.
Pedir el porcentaje de votos recibido para cada uno de los partidos. Impide que se escriba un tipo diferente mediante hasNext() (ej: si se pide un entero, usar teclado.hasNextInt() )
Cuando estén introducidos todos los resultados, crear un método que muestre barras de resultado para cada uno de los participantes. Puedes escoger cualquier carácter alfanumérico habitual, como *, o #.
Cuando acabe que pregunte: ¿Actualizar resultados (S/N)? Si dice que sí, limpia el terminal y vuelve a preguntar los resultados. Si dice que no, limpia el terminal y escribe “hasta la próxima!” y se acaba el programa. Debe existir una clase Metodos, que contenga los métodos:
- mostrarResultado()
- limpiarPantalla() borra la consola,
- aprietaEnter(). le dice “para seguir, aprieta enter”.
Son en total tres clases: principal, Partido y Metodos.
+EXTRA se pueden añadir controles del tipo: suma la cantidad más del 100% ?
+EXTRA: como controlarías may/min en S/N con tipo char
NOTA: el extended ASCII list (número ascii más de 127) puede dar error, o mostrar resultados diferentes según el sistema operativo o charset empleado.



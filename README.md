LaLiga de fútbol profesional nos ha pedido digitalizar su sistema para automatizar las tareas que hacen
manualmente. Tras varias reuniones con los directivos de LaLiga, los empleados de administración, etc.
Se ha obtenido la siguiente información:
1. LaLiga guarda información de los Equipos. La información que almacena en la ficha es: 
- Código del equipo
- Nombre del equipo
- Teléfono
- Dirección.
2. Los equipos están formados por un presidente, un entrenador y varios jugadores. Se almacena la
   siguiente información:
- Presidente: nombre, apellidos y profesión.
- Entrenador: nombre, apellidos y año de nacimiento. 
- Jugador: nombre, apellidos y número de camiseta.
3. La competición está formada por partidos de fútbol. Estos partidos se organizan en un calendario. De los partidos se almacena:
- Un código de partido único, 
- Fecha en la que se disputa el partido, 
- Equipo local
- Equipo visitante.

Se pide: 

   Diseña el diagrama de clases para digitalizar LaLiga. 
   - Se deberá identificar las entidades y sus relaciones.
   - El diagrama será correcto sólo si se identifican todas las entidades correctamente (junto con sus tipos) y sus  relaciones son correctas.

   Para la digitalización de LaLiga se pide:
   - Crear un proyecto en GitHub con el nombre: LaLiga2023
   - Crear un proyecto Java con el nombre: LaLiga2023
   - Añadir el proyecto Java al repositorio GitHub.
   - Añadir al usuario: josem.perram al repositorio.
   
   Implementa en Java las siguientes funcionalidades respetando la arquitectura por capas( presentación,
   dominio y datos):
   - Crear una rama en el repositorio llamada develop.
   - Crear un equipo de fútbol que pueda almacenar los datos solicitados en el enunciado.
   - Buscar un equipo de fútbol a través de su código.
   - Imprimir por pantalla los datos del equipo de fútbol creado.
   - Crear una PullRequest con toda la implementación realizada y que contenga las siguientes secciones:
   - Descripción de lo que se pide a hacer.
   - Cómo se ha implementado.
   - Captura de pantalla donde se muestra que el programa realiza lo que se pide (ejecución por consola)
   - Otra información (dificultades, cosas que se han quedado pendiente, problemas, etc.)
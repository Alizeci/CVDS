# LAB03

** Crear un proyecto con Maven **

```
mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=ClasesEquivalencia -DpackageId=edu.eci.cvds.tdd -DarchetypeArtifactId=maven-archetype-quickstart 
```

** Actualizar y crear dependencias en el proyecto **

```
mvn test #Ejecuta todas los test

mvn -Dtest=NombreTest test
```

** ESPECIFICACIÓN **

** Clase de equivalencia no válida **

1. ** Edad inválida **: edad < 0 & edad > 150 & alive:true
2. ** Menor de edad **: edad < 18 & alive:true

3. ** Estado **:La persona este muerta -> alive:false
4. ** Duplicado **: Exista dos veces la misma id (cédula) en el registro & alive:true & 18 >= edad < 150

** Clase de equivalencia válida **

5. 18 >= edad < 150 & alive:true & No exista dos veces la misma id (cédula)
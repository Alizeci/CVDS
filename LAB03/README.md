# LAB03

**Crear un proyecto con Maven**

```
mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=ClasesEquivalencia -DpackageId=edu.eci.cvds.tdd -DarchetypeArtifactId=maven-archetype-quickstart 
```

**Actualizar y crear dependencias en el proyecto**

```
mvn test #Ejecuta todas los test

mvn -Dtest=NombreTest test
```
<br></br>

**ESPECIFICACIÓN**

**Clase de equivalencia no válida**

1. **Edad inválida**: edad < 0 & edad > 150 & alive:true
2. **Menor de edad**: edad < 18 & alive:true

3. **Estado**:La persona este muerta -> alive:false
4. **Duplicado**: Exista dos veces la misma id (cédula) en el registro & alive:true & 18 >= edad < 150

**Clase de equivalencia válida**

5. 18 >= edad < 150 & alive:true & No exista dos veces la misma id (cédula)

## AeroDescuentos

Se está desarrollando para una aerolínea su módulo de liquidación de tiquetes aéreos. Para el mismo, se tiene una función que aplica descuentos a la tarifa base del vuelo dependiendo del tiempo de antelación de la reserva y la edad del pasajero. Los descuentos **SON ACUMULABLES**.

Normativa 005, sobre los descuentos:

- 15% de descuento sacando el billete con antelación superior a 20 días.
- 5% a los pasajeros con edad inferior a 18 años y 8% a los pasajeros con edad superior a 65 años.

La siguiente es la especificación de la función que se usará en el módulo del cálculo de los descuentos:

```
/**
calcular la tarifa de cada billete según el trayecto, la antelación
en la que se obtiene el billete y la edad del pasajero, de acuerdo
con la normativa 005.
@param tarifaBase valor base del vuelo
@param diasAntelacion dias de antelación del vuelo
@param edad - edad del pasajero
@throws ExcepcionParametrosInvalidos [XXXXXXXXXXXXXXXXXXXXXXXXXXX]
**/
public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad)
```
- De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación.
	1. El parámetro tarifaBase sea gativo.
	2. El parámetro diasAntelacion sea negativo.
	3. El parámetro edad sea negativo.

- En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted- creen una buena división del conjunto de datos de entrada de la función anterior:

| Número   | Clase de equivalencia (en lenguaje natural o matemático). 										| Resultado correcto / incorrecto. |
| :------: | :------:																| -----: |
| 1        | tarifaBase menor que 0, diasAntelacion mayor que cero y menor igual que 20, edad mayor igual que 0 y menor que 18.  	| Incorrecto   |
| 2        | tarifaBase mayor o igual que 0, diasAntelacion menor que 0, edad mayor que 18 y menor igual que 65     					| Incorrecto |
| 3        | tarifaBase mayor o igual que 0, diasAntelacion mayor que cero y menor igual que 20, edad mayor que 65   					| Correcto |
| 4        | tarifaBase mayor o igual que 0, diasAntelacion mayor que cero y menor igual que 20, edad menor que 0     					| Incorrecto  |
| 5        | tarifaBase mayor o igual que 0, diasAntelacion mayor que 20, edad mayor que 65    								| Correcto |
| 6        | tarifaBase mayor o igual que 0, diasAntelacion mayor que cero y menor igual que 20, edad mayor igual que 0 y menor que 18     		| Correcto |

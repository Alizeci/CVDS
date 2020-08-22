## Apache Maven

Apache Maven es una herramienta que estandariza la configuración de un proyecto en todo su ciclo de vida, como por ejemplo en todas las fases de compilación y empaquetado y la instalación de mecanismos de distribución de librerías, para que puedan ser utilizadas por otros desarrolladores y equipos de desarrollo.

Ingresar a la página de la herramienta y entender:

**1. Cuál es su mayor utilidad**

- La característica más importante de Maven es su capacidad de trabajar en red.
<br></br>

**2. Fases de maven**

Cada ciclo de vida de compilación se compone de fases
	
Por ejemplo, el ciclo de vida default comprende los siguientes Build Phases:

- **validate** - validate the project is correct and all necessary information is available
- **compile** - compile the source code of the project
- **test** - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
- **package** - take the compiled code and package it in its distributable format, such as a JAR.
- **integration-test** - process and deploy the package if necessary into an environment where integration tests can be run
- **verify** - run any checks to verify the package is valid and meets quality criteria
- **install** - install the package into the local repository, for use as a dependency in other projects locally
- **deploy** - done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.

Para pasar por las fases anteriores, solo tenemos que llamar a un comando:
```sh
$	mvn <phase> { Ex: mvn install }
```

Para el comando anterior, a partir de la primera fase, todas las fases se ejecutan secuencialmente hasta la fase de **instalación**. mvn puede ejecutar un objetivo o una fase (o incluso varios objetivos o varias fases) de la siguiente manera:

```sh
$	mvn clean install plugin:goal  
```

Sin embargo, si desea personalizar el prefijo utilizado para hacer referencia a su complemento, puede especificar el prefijo directamente a través de un parámetro de configuración en el maven-plugin-plugin en el POM de su plugin.
<br></br>

**3. Ciclo de vida de la construcción**

- **compile:** Genera los ficheros .class compilando los fuentes .java
- **test:** Ejecuta los test automáticos de JUnit existentes, abortando el proceso si alguno de ellos falla.
- **install:** Copia el fichero .jar a un directorio de nuestro ordenador donde maven deja todos los .jar. De esta forma esos .jar pueden utilizarse en otros proyectos maven en el mismo ordenador.
- **deploy:** Copia el fichero .jar a un servidor remoto, poniéndolo disponible para cualquier proyecto maven con acceso a ese servidor remoto.

Hay tres principales incorporadas Build Life Cycles:

- **default**
- **limpiar**
- **sitio**

<p align="center">
<br>
<img height="300" src="https://i.stack.imgur.com/Ub3Bd.png" />
<br>
</p>

**4. Para qué sirven los plugins**

Un plugin es aquella aplicación que en un programa añade una funcionalidad adicional o una nueva característica al software.

<br></br>
**5. Qué es y para qué sirve el repositorio central de maven**

 El repositorio Maven es básicamente un lugar donde están los artefactos maven, estructurados en cierta forma estándar para hacer las descargas de las dependencias.

![](http://webipedia.es/wp-content/uploads/2018/08/11_Facilidad-1024x578.jpg)
<br></br>

### Crear un proyecto con Maven

Si deseamos crear un nuevo proyecto desde nuestra consola usando Maven teniendo en cuenta:

- archetype: generate
- Grupo: edu.eci.cvds
- Id del Artefacto: Patterns
- Paquete: edu.eci.cvds.patterns
- archetypeArtifactId: maven-archetype-quickstart

se hace de la siguiente forma:

```
mvn archetype:generate -DgroupId=edu.eci.cvds.patterns -DartifactId=Patterns -DarchetypeArtifactId=maven-archetype-quickstart
```

una vez creado se puede consultar la estructura de archivos y de directorios de nuestro proyecto con:

```
tree o  tree /f
```
para configurar la version del compilador de Java ejemplo a la versión 8 de nuetro maven
solo basta con editar el achivo pom.xml y agregar lo siguiente andes de **dependencias**:
```
 <properties>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
 </properties>
```

### compilar y ejecutar

para compilar usamos el siguiente comando:

```
mvn package o si no usa dependencias mvn -U package
```

el paramatro ***package*** construye el proyecto maven y lo empaqueta en un JAR

existen muchos mas parametros como los siguientes:

- mvn clean =  limpia el proyecto maven eliminando el directorio de destino
- mvn compiler:compile = compila las clases fuente Java del proyecto maven
- mvn compiler:testCompile =  compila las clases de prueba del proyecto maven
- mvn install = Este comando construye el proyecto maven e instala los archivos del proyecto (JAR, WAR, pom.xml, etc.) en el repositorio local
- mvn validate = Este comando valida el proyecto maven de que todo es correcto y toda la información necesaria está disponible
- mvn dependency:tree = Este comando genera el árbol de dependencias del proyecto maven
- mvn dependency:analyze = Este comando analiza el proyecto maven para identificar las dependencias declaradas y no declaradas no utilizadas
- mvn archetype:generate = Podemos usar este comando para generar un proyecto maven esqueleto de diferentes tipos, como JAR, aplicación web, sitio maven, etc
- mvn site:site = Este comando genera un sitio web para el proyecto

para ejecutar una clase en este caso App.java usamos el siguiente comando:

```
mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App" -Dexec.args="mainClass"
```

## REFERENCIAS

- <https://www.it-swarm.dev/es/maven/cuales-son-los-objetivos-y-fases-de-maven-y-cual-es-su-diferencia/1071905498/>
- <http://webipedia.es/tecnologia/cursos/maven-construyendo-proyectos/>
- <https://wiki.uqbar.org/wiki/articles/maven.html>
- <https://www.it-swarm.dev/es/java/por-que-maven-cuales-son-los-beneficios/969289522/>
- <https://www.journaldev.com/33645/maven-commands-options-cheat-sheet#1-mvn-clean>

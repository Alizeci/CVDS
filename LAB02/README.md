## Apache Maven

Apache Maven es una herramienta que estandariza la configuración de un proyecto en todo su ciclo de vida, como por ejemplo en todas las fases de compilación y empaquetado y la instalación de mecanismos de distribución de librerías, para que puedan ser utilizadas por otros desarrolladores y equipos de desarrollo.

Ingresar a la página de la herramienta y entender:

**1. Cuál es su mayor utilidad**

	- La característica más importante de Maven es su capacidad de trabajar en red.

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

**3. Ciclo de vida de la construcción**

	- **compile:** Genera los ficheros .class compilando los fuentes .java
	- **test:** Ejecuta los test automáticos de JUnit existentes, abortando el proceso si alguno de ellos falla.
	- **install:** Copia el fichero .jar a un directorio de nuestro ordenador donde maven deja todos los .jar. De esta forma esos .jar pueden utilizarse en otros proyectos maven en el mismo ordenador.
	- **deploy:** Copia el fichero .jar a un servidor remoto, poniéndolo disponible para cualquier proyecto maven con acceso a ese servidor remoto.

	Hay tres principales incorporadas Build Life Cycles:

	- **default**
	- **limpiar**
	- **sitio**
	
	![](https://i.stack.imgur.com/Ub3Bd.png)
	
**4. Para qué sirven los plugins**

	- Un plugin es aquella aplicación que en un programa añade una funcionalidad adicional o una nueva característica al software.

**5. Qué es y para qué sirve el repositorio central de maven**

	- El repositorio Maven es básicamente un lugar donde están los artefactos maven, estructurados en cierta forma estándar para hacer las descargas de las dependencias.

![](http://webipedia.es/wp-content/uploads/2018/08/11_Facilidad-1024x578.jpg) 

## REFERENCIAS

- https://www.it-swarm.dev/es/maven/cuales-son-los-objetivos-y-fases-de-maven-y-cual-es-su-diferencia/1071905498/
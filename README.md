Automatización de Pruebas con Cucumber y Selenium

Este repositorio contiene el proyecto de automatización de pruebas para el sitio OrangeHRM Live, utilizando Cucumber para escribir escenarios en Gherkin y Selenium WebDriver para la ejecución de las pruebas.
Estructura del Proyecto

src/main/java

    co.com.choucair.certification.proyectobase: Este paquete contiene las clases principales del proyecto. Incluye:
        models: Contiene la clase Datos utilizada en las pruebas con sus respectivos métodos get y set.
        questions: Contiene clases que permiten verificar ciertas condiciones en la aplicación:
            ValidarDatosEnLogin: Valida que el usuario haya iniciado sesión de manera exitosa.
            ValidarContratacion: Valida que se haya realizado correctamente la contratación del empleado.
            ValidarFormulario: Valida que los datos ingresados por el usuario correspondan a los diligenciados en los formularios.
        tasks: Clases como VerificarContratacion, VerificarEmpleado y VerificarLogin que describen tareas y acciones que el usuario realiza en la aplicación.
        userinterfaces: Clases que mapean los elementos de la interfaz de usuario.
        utils: Utilidades y herramientas de apoyo para las pruebas.

src/test/java
Contiene las clases de pruebas y los steps definitions.

src/test/resources
Contiene los archivos de características (feature files) y cualquier recurso necesario para las pruebas.

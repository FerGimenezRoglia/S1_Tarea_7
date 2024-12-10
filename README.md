
# Resumen de Ejercicios sobre Anotaciones

Este repositorio contiene dos ejercicios en Java que exploran conceptos fundamentales como la jerarquía de clases, sobrescritura de métodos (`@Override`), y el uso de anotaciones como `@Deprecated` y `@SuppressWarnings`. A continuación, se presenta un resumen de cada uno:

---

## Ejercicio 1: Jerarquía de Trabajadores y Cálculo de Salario

### Descripción:

- Se creó una jerarquía de trabajadores que incluye las clases:
  - `Worker`: Clase base con atributos comunes como `name`, `surname`, y `hourlyRate`, y un método `calculateSalary()`.
  - `OnlineWorker`: Clase hija que sobrescribe el cálculo del salario, sumando un costo fijo por conexión a internet.
  - `OnsiteWorker`: Clase hija que sobrescribe el cálculo del salario, incluyendo un costo adicional por gasolina.
- El programa incluye un menú interactivo para gestionar trabajadores:
  - Agregar trabajadores.
  - Mostrar la lista de trabajadores.
  - Calcular el salario de un trabajador seleccionado.

### Aprendizajes:

- Implementación de la anotación `@Override` para sobrescribir métodos.
- Uso de herencia para estructurar clases.
- Manejo de listas dinámicas (`ArrayList`) para almacenar objetos.
- Diseño de un menú interactivo con control de errores para capturar entradas del usuario.

---

## Ejercicio 2: Uso de Métodos Obsoletos (Deprecated)

### Descripción:

- Se añadieron métodos obsoletos (usando `@Deprecated`) en las clases `OnlineWorker` y `OnsiteWorker`:
  - `obsoletemethotonline`: Un método de ejemplo en `OnlineWorker` marcado como obsoleto.
  - `obsoletemethotinperson`: Un método de ejemplo en `OnsiteWorker` marcado como obsoleto.
- En la clase `Main`, se invocaron estos métodos utilizando la anotación `@SuppressWarnings("deprecation")` para evitar los avisos del compilador.

### Aprendizajes:

- Uso de la anotación `@Deprecated` para marcar métodos como obsoletos.
- Implementación de la anotación `@SuppressWarnings` para gestionar avisos de deprecación en el compilador.
- Comprensión de cómo manejar métodos que han quedado en desuso en el contexto de una jerarquía de clases.

---

## Conclusiones

Estos ejercicios han ayudado a desarrollar habilidades clave en Java, incluyendo:
- Estructuración y manejo de jerarquías de clases con herencia.
- Uso de anotaciones estándar (`@Override`, `@Deprecated`, `@SuppressWarnings`).
- Diseño de menús interactivos para gestionar datos dinámicos.

---

## Autor
Este proyecto fue desarrollado como parte de un aprendizaje progresivo en Java. Siéntete libre de contribuir, reportar errores, o proponer mejoras.

Fer

---



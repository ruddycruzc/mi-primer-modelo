<h1 align="center">Mi Primer Modelo</h1>

<p align="center">
  Modelado de la entidad <strong>Person</strong> utilizando <strong>Java 21</strong>, aplicando principios de Programación Orientada a Objetos y pruebas unitarias con <strong>JUnit 5</strong>.
</p>

<p align="center">

<a href="https://skillicons.dev">

<img src="https://skillicons.dev/icons?i=java,maven,git,github,vscode&perline=5"/>
</a>
</p>

<p align="center">

![JUnit 5](https://img.shields.io/badge/JUnit%205-25A162?style=for-the-badge&logo=junit5&logoColor=white) ![Hamcrest](https://img.shields.io/badge/Hamcrest-3.0-blue?style=for-the-badge)

</p>

---


# Enunciado de la práctica

## Requisitos

- JDK 21
- Maven
- JUnit
- Hamcrest

---

## Ejercicio

Modelar el concepto de una persona.

Una persona posee los siguientes atributos:

- Nombre
- Apellido
- Documento de identidad
- Año de nacimiento
- Edad (calculada automáticamente a partir del año de nacimiento)

La clase deberá disponer de un constructor que inicialice todos los atributos necesarios. La edad no será un dato recibido por el constructor, sino que deberá calcularse mediante un método específico.

No es necesaria ninguna salida por consola.

---

## Tecnologías utilizadas

| Tecnología | Versión |
|------------|---------|
| Java | 21 |
| Maven | 3.x |
| JUnit | 5.9.2 |
| Hamcrest | 3.0 |
| JaCoCo | 0.8.14 |

---

## Estructura del proyecto

```text
mi-primer-modelo
├── docs
│   ├── diagrams
│   └── images
├── src
│   ├── main
│   └── test
├── .gitignore
├── pom.xml
└── README.md
```

---

# Modelo de la entidad

La clase `Person` representará a una persona mediante los siguientes atributos:

- Nombre
- Apellido
- Documento de identidad
- Año de nacimiento
- Edad (calculada automáticamente)

---

## Estado del proyecto

| Estado | Valor |
|---------|-------|
| Desarrollo | - En progreso |
| Metodología | Test Driven Development (TDD) |
| Java | 21 |
| Cobertura mínima requerida | 70% |

---

## Criterios de evaluación

- [x] Configuración del proyecto
- [x] Implementación de la clase `Person`
- [x] Constructor
- [ ] Cálculo automático de la edad
- [ ] Tests unitarios
- [ ] Cobertura superior al 70%
- [ ] Diagrama UML
- [ ] Capturas de pantalla
- [ ] Documentación completa

---

# Registro de desarrollo

## ⌱Paso 1 · Configuración del proyecto

### Objetivo

Preparar el entorno de desarrollo para comenzar la implementación del modelo.

### Trabajo realizado

- Creación del proyecto Maven.
- Configuración de Java 21.
- Configuración de dependencias.
- Configuración de JaCoCo.
- Configuración de Checkstyle.
- Configuración del `.gitignore`.
- Creación de la estructura de documentación.
- Creación del README inicial.

**Estado**

✔︎ Completado

---

## ⌱Paso 2 · Implementación del modelo Person

### Objetivo

Crear la clase `Person` e implementar el primer comportamiento del modelo siguiendo la metodología TDD.

### Requisito

Una persona debe almacenar correctamente el nombre recibido mediante el constructor y permitir acceder a él mediante un método getter.

### Desarrollo

1. Se escribió el primer test unitario para verificar que el atributo `name` se almacenaba correctamente.
2. Se ejecutó el comando:

```bash
mvn clean test
```

3. La compilación falló porque la clase `Person` todavía no existía.
4. Se implementó la clase `Person` con el constructor y el método `getName()`.
5. Se volvió a ejecutar la batería de pruebas obteniendo un resultado satisfactorio.

**Estado**

✔︎  Completado

### Ampliación

- Se añadió el atributo `surname` al modelo y su correspondiente método `getSurname()`. Se creó un nuevo test unitario para verificar que el apellido se inicializa correctamente mediante el constructor.

**Resultado**

El nuevo comportamiento supera correctamente todas las pruebas.

---
- Se incorporó el atributo `identityDocument` al modelo y se implementó su método `getIdentityDocument()`. Se añadió un nuevo test unitario para comprobar que el documento de identidad se almacena correctamente al crear una instancia de `Person`.

**Resultado**

Todos los tests continúan superándose correctamente.

---
- Se añadió el atributo `birthYear` junto con su método `getBirthYear()`.Se incorporó un nuevo test unitario para verificar que el año de nacimiento se almacena correctamente al crear una instancia de la clase `Person`.

**Resultado**

Todos los tests continúan superándose correctamente.

---

## ⌱Paso 3 · Constructor

> Pendiente.

---

## ⌱Paso 4 · Cálculo automático de la edad

> Pendiente.

---

## ⌱Paso 5 · Testing

> Pendiente.

---

## Tests unitarios

| Caso de prueba | Estado |
|----------------|--------|
| Constructor |✓ |
| Nombre | ✓|
| Apellido | - |
| Documento de identidad | - |
| Año de nacimiento | - |
| Edad calculada | - |

---

## Cobertura de pruebas

> Pendiente.

---

## UML

> Pendiente.

---

## Capturas

### Tests

> Pendiente.

### Cobertura

> Pendiente.

### UML

> Pendiente.

---

## Git Workflow

Durante el desarrollo del proyecto se seguirá una estrategia basada en ramas **feature**, integrando cada funcionalidad en la rama **develop** mediante commits atómicos.

---

## Conclusiones

> Se completará una vez finalizada la práctica.

---

## Developer Notes

> Todo empezó modelando una persona.
>
> Si el README acaba teniendo más líneas que la propia clase `Person`, prometo que ha sido por motivos educativos.

---

## Autor

| Nombre | GitHub |
|---------|--------|
| **Ruddy P. Cruz Campoverde** | https://github.com/ruddycruzc |
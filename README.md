# Red Social Mini 📱




---

##  Funcionalidades Principales

### 1. Gestión de Usuarios e Inicio de Sesión
* **Registro e Inicio de Sesión:** Acceso protegido a un menú principal personalizado.
* **Seguimiento:** Capacidad de seguir a otros usuarios para priorizar su contenido en el feed.

### 2. Tipos de Contenido
El sistema clasifica automáticamente la publicación según los datos introducidos:
* **Texto:** Basado en descripciones (muestra previsualización de 50 caracteres).
* **Archivo:** Gestión de archivos multimedia (imágenes/documentos).
* **Mixto:** Combinación de texto y archivos.


### 3. Algoritmos de Selección (Feed)
Desde el menú de **Configuración**, el usuario puede elegir cómo visualizar las publicaciones:
* **Intereses:** Prioriza etiquetas basadas en el historial de visualización.
* **Contenido Reciente:** Orden cronológico (más nuevos primero).
* **Usuarios Seguidos:** Prioriza publicaciones de la red de contactos del usuario.

---


##  Estructura del Proyecto (Arquitectura)

Basado en un diseño modular y orientado a objetos, el código se organiza en los siguientes paquetes:

* **`PuntoEntrada`**: Contiene la clase `App.java` (Main).
* **`Algoritmos`**: Estrategias de selección (`SelectorPorIntereses`, `SelectorPorRecientes`, `SelectorPorSeguidos`).
* **`InterfazDeConsola`**: Gestión de menús y flujos de usuario (`Menu.java`).
* **`Modelo`**: Clases entidad (`Usuario`, `Contenido`, `ContenidoMixto`, etc.).
* **`Servicios`**: Lógica de negocio (`GestorUsuarios`, `GestorContenido`).

---

##  Gestión de Git y Ramas

El proyecto sigue una estructura de ramificación organizada para el trabajo en equipo:

* **`main`**: Rama principal con código estable y listo para entrega.
* **`develop`**: Rama de integración de características.
* **Ramas de características (Features):**
  * `featured-javier`: Desarrollo de funcionalidades de Javier.
  * `featured_Juan`: Desarrollo de funcionalidades de Juan.
  * `featured_Brayan`: Desarrollo de funcionalidades de Brayan.

---

## Equipo de Desarrollo (@author)

* **Javier** - [@featured-javier]
* **Juan** - [@featured_Juan]
* **Brayan** - [@featured_Brayan]

---
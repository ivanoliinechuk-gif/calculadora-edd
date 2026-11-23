# Actividad Evaluable: Control de Versiones (Calculadora)

## 1. Comandos utilizados en orden cronológico

1. `git clone https://github.com/ivanoliinechuk-gif/calculadora-edd.git` — Clona el repositorio remoto creado previamente en GitHub con un archivo `README.md` inicial.
2. `cd calculadora-edd` — Accede al directorio local del proyecto recién clonado.
3. `git branch backend` — Crea la rama `backend` a partir de la rama principal `main`.
4. `git branch frontend` — Crea la rama `frontend` a partir de la rama principal `main`.
5. `git checkout backend` — Cambia el espacio de trabajo activo a la rama `backend`.
6. `git add Calculadora.java` — Añade exclusivamente el archivo fuente Java al área de preparación (Staging Area).
7. `git commit -m "Add Calculadora.java with suma, resta, multiplicacion and potencia"` — Guarda los cambios de `Calculadora.java` en el historial de la rama `backend`.
8. `git checkout frontend` — Cambia el espacio de trabajo activo a la rama `frontend`.
9. `git add index.html` — Añade exclusivamente el archivo HTML al área de preparación (Staging Area).
10. `git commit -m "Add index.html with calculator form"` — Guarda los cambios de `index.html` en el historial de la rama `frontend`.
11. `git checkout main` — Regresa a la rama principal `main`.
12. `git merge --no-ff backend -m "Merge branch backend into main"` — Fusiona la rama `backend` dentro de `main` generando un commit de fusión explícito.
13. `git merge --no-ff frontend -m "Merge branch frontend into main"` — Fusiona la rama `frontend` dentro de `main` generando un commit de fusión explícito.
14. `git add Calculadora.java` — Prepara los cambios realizados tras añadir comentarios explicativos en el código.
15. `git commit -m "Update comments in Calculadora.java"` — Registra el commit de actualización de comentarios en `main`.
16. `git add README.md` — Prepara el archivo `README.md` con la documentación completa del proceso.
17. `git commit -m "Update README.md with commands and GitHub guide"` — Guarda la documentación en el historial de `main`.
18. `git push -u origin --all` — Publica todas las ramas locales (`main`, `backend` y `frontend`) junto con sus historiales de commits en GitHub.

---

## 2. Explicación detallada de los comandos utilizados

* **`git clone <URL>`**: Descarga una copia completa de un repositorio remoto desde GitHub a nuestro equipo local, configurando automáticamente la conexión remota llamada `origin` y descargando la rama principal.
* **`git branch <nombre_rama>`**: Crea una nueva rama independiente (puntero a un commit) sin cambiar todavía a ella, permitiendo desarrollar partes aisladas del proyecto (`backend` para Java y `frontend` para HTML).
* **`git checkout <nombre_rama>`**: Cambia de una rama a otra, actualizando los archivos del directorio de trabajo para que coincidan con el estado de la rama seleccionada.
* **`git add <archivo>`**: Pasa los archivos nuevos o modificados desde el directorio de trabajo al área de preparación (*Staging Area*), seleccionando con precisión qué ficheros formarán parte del siguiente commit.
* **`git commit -m "<mensaje>"`**: Crea una instantánea permanente en el historial local del repositorio con los archivos preparados en el *Staging Area* y un mensaje descriptivo (`-m`).
* **`git merge --no-ff <rama> -m "<mensaje>"`**: Integra los cambios de otra rama dentro de la rama actual (`main`). El parámetro `--no-ff` (*no fast-forward*) obliga a Git a crear siempre un commit de fusión dedicado para que quede constancia clara de la unión de ramas en el historial.
* **`git push -u origin --all`**: Envía los commits locales al servidor remoto (`origin`). La opción `--all` sube todas las ramas locales a la vez, y `-u` (`--set-upstream`) vincula cada rama local con su equivalente en GitHub para futuros envíos.

---

## 3. Cómo crear y publicar un repositorio en GitHub desde cero

Si en lugar de clonar un repositorio ya creado se parte de una carpeta local en el ordenador, los pasos para publicarlo en GitHub son los siguientes:

1. **Crear el repositorio vacío en GitHub:** Iniciar sesión en GitHub, pulsar en **New repository**, asignar un nombre al proyecto, elegir la visibilidad **Public** y crear el repositorio sin inicializar archivos adicionales.
2. **Inicializar Git en la carpeta local (`git init`):** Abrir la terminal dentro de la carpeta del proyecto y ejecutar `git init` para crear el subdirectorio oculto `.git` que gestionará el control de versiones.
3. **Renombrar la rama principal (`git branch -M main`):** Establecer `main` como nombre de la rama base del repositorio local.
4. **Registrar los archivos (`git add` y `git commit`):** Ejecutar `git add .` (o `git add <archivo>`) para preparar los ficheros y `git commit -m "Initial commit"` para crear el primer punto en el historial.
5. **Vincular el repositorio local con GitHub (`git remote add origin <URL>`):** Conectar el repositorio local con la dirección URL del repositorio creado en el paso 1:
   bash
   git remote add origin [https://github.com/usuario/nombre-repositorio.git](https://github.com/usuario/nombre-repositorio.git)
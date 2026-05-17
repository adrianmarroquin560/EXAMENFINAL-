# EXAMENFINAL-
Se presentará el examen final para su respectiva calificación presentando el código de java como prueba del mismo 

# Examen Final – Árbol Binario de Búsqueda (BST)

## 📌 Información General
- **Universidad:** Universidad Da Vinci de Guatemala  
- **Facultad:** Ingeniería en Sistemas y Ciencias de la Computación  
- **Curso:** Estructuras de Datos  
- **Estudiante:** Adrian Marroquín  
- **Carné: 202506479

Este proyecto implementa desde cero un Árbol Binario de Búsqueda (BST) en Java, cumpliendo con los requisitos de inserción, búsqueda, eliminación y recorridos (InOrder, PreOrder y PostOrder).  


# Descripción del Código
El programa define una clase `BST` que contiene:
- **Clase interna `Node`:** cada nodo guarda un valor entero y referencias a sus hijos izquierdo y derecho.  
- **Método `insert`:** coloca un nuevo valor en la posición correcta según las reglas del BST.  
- **Método `search`:** devuelve `true` si el valor existe en el árbol, `false` si no.  
- **Método `delete`:** elimina un nodo considerando los tres casos:
  1. Nodo hoja (sin hijos).  
  2. Nodo con un solo hijo.  
  3. Nodo con dos hijos (se reemplaza con el sucesor in‑order).  
- **Recorridos:**  
  - `inorder()` → imprime los valores en orden ascendente.  
  - `preorder()` → útil para clonar o representar la estructura.  
  - `postorder()` → útil para liberar memoria o evaluar expresiones.  

---

## 🖥️ Ejemplo de Ejecución
Al ejecutar el `main`, se insertan los valores `{50, 30, 70, 20, 40, 60, 80}` y se muestran los recorridos:

link del video: 

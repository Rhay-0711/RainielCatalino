# Registro Académico

Programa en Java Swing que calcula la nota final de un estudiante y dice si aprobó o reprobó.

## Qué hace?

Llenas tus datos y tus notas, le das a **Calcular Resultado** y te muestra la nota final con su estado. El botón **Limpiar** borra todo.

**Nota final = Prácticas + Parciales + Asignaciones + Examen final** (máximo 100)

- 60 o más → `APROBADO`
- Menos de 60 → `REPROBADO`

## Cómo usarlo

1. Ejecuta `RegistroAcademicoGUI.java`.
2. Llena tus datos:
   - **Nombre completo** y **Carrera**
   - **Matrícula**
3. Escribe tus notas:
   - **Prácticas**: de 0 a 40
   - **Parciales**: de 0 a 20
   - **Asignaciones**: de 0 a 20
   - **Examen final**: de 0 a 20
4. Dale a **Calcular Resultado**. En el cuadro de la derecha te sale tu nota final y si quedaste `APROBADO` (60 o más) o `REPROBADO` (menos de 60).
5. Si quieres hacer otro cálculo, dale a **Limpiar** y empiezas de nuevo.

Si dejas un campo vacío o escribes algo que no se permite, te sale un aviso indicando qué corregir.

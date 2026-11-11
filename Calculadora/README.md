# Calculadora

Programa en Java Swing con dos ventanas: una calculadora con operaciones básicas y un conversor de temperatura entre Celsius y Fahrenheit.

## Qué hace?

Escribes uno o dos valores, le das al botón de la operación que quieras y el resultado te sale en el cuadro de abajo. También puedes pasar al conversor de temperatura con un botón y volver cuando quieras.

## Operaciones

| Botón | Qué hace |
|---|---|
| Sumar | Primer valor + Segundo valor |
| Restar | Primer valor − Segundo valor |
| Multiplicar | Primer valor × Segundo valor |
| Dividir | Primer valor ÷ Segundo valor |
| Exponencial | Eleva el primer valor (base) al segundo valor (exponente) |
| Raíz cuadrada | Saca la raíz cuadrada del primer valor (el segundo no se usa) |

## Cómo usarlo

### Calculadora
1. Escribe el **Primer valor** y el **Segundo valor**.
2. Dale al botón de la operación que quieras.
3. El resultado aparece en el cuadro de **Resultado**.
4. Si quieres hacer otro cálculo, dale a **Reset** y se limpian los dos valores y el resultado.

Para la **raíz cuadrada** solo necesitas llenar el primer valor.

### Conversor de temperatura

1. En la calculadora, dale a **Conversor de temperatura** (se abre la otra ventana).
2. Escribe la temperatura en el campo.
3. Elige la conversión:
   * **Fahrenheit → Celsius**: te sale el resultado en °C.
   * **Celsius → Fahrenheit**: te sale el resultado en °F.
4. Dale a **Calculadora** para volver a la primera ventana.
5. Si quieres hacer otro cálculo, dale a **Reset** y se limpia el campo con valores y el resultado.

## Nota:

* Solo se pueden escribir números (también `-` y `.`). Si escribes otra cosa, sale el aviso "Ingresar solo numeros".
* Para decimales usa el punto (`3.5`), no la coma.
* Si dejas un campo vacío, sale un aviso diciendo que necesitas ingresar un valor.
* Si intentas dividir entre 0, sale el aviso "No es posible dividir entre 0".

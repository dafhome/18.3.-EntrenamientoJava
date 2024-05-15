# 18.3.-EntrenamientoJava
 
1- Métodos: Cálculo IVA:
Diferentes tipos de IVA:
- General = 21% (ej. Ropa);
- Reducido = 10% (bono-metro);
- Super-reducido = 4% (huevos);
- Exento = 0% (dentista)
- Para el cálculo, hacer cuatro CONSTANTES para cada tipo de IVA.
- Pides el precio de producto, el tipo de IVA, y pasas estos dos parámetros a la función
calcularPrecioFinal(), y ésta te DEVUELVE el precio final (int o float), y se imprime en el main().

- Ejemplo: para el 21%, el precio final sería precioProducto + (precioProducto*0.21);
Ejemplo de constante para IVA21 = 0.21;



2- Ejercicio validación setter, y ArrayLists:
Tienes el objeto ClienteDiscoteca.
Tienes un arraylist de clientes discoteca ya creados.
Antes de añadir un cliente más en el arraylist, debes verificar si el cliente tiene 18 años o más. Si es
mayor de edad, se añade el cliente, si no, se le da un mensaje de que no puede entrar.
Si es mayor de edad, imprimir nombre, edad y bienvenid@ a nuestra discoteca.

+EXTRA: hacer esto en un bucle while (para salir escribe 'salir'), y guardar dos arraylist, uno con los clientes aceptados y otro con los rechazados. Mostrar ambos al final.



3- Trabajo con cadenas de caracteres:
Dada una frase entrada por usuario, poner en mayúscula sólo la primera letra de cada palabra

## Ejercicio: Servicio de Cálculo de Envío

Caso de uso: una tienda en línea necesita calcular el costo de envío según el peso del paquete y si el contenido es frágil.

- Paquetes hasta 1 kg: tarifa base $5

- Paquetes mayores de 1 kg y hasta 5 kg: tarifa base $10

- Paquetes mayores de 5 kg: tarifa base $20

Si el paquete es frágil, se añade un recargo de $5 extra.

1- Peso <= 1k, no frágil
2- Peso <= 1k, frágil
3- 1 kg < peso <= 5 k, no frágil
4- 1 kg < peso <= 5 k, frágil
5- Peso > 5 k, frágil
6- Peso > 5 k, no frágil


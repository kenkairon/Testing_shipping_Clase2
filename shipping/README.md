## Ejercicio: Servicio de Cálculo de Envío

Caso de uso: una tienda en línea necesita calcular el costo de envío según el peso del paquete y si el contenido es frágil.

- Paquetes hasta 1 kg: tarifa base $5

- Paquetes mayores de 1 kg y hasta 5 kg: tarifa base $10

- Paquetes mayores de 5 kg: tarifa base $20

Si el paquete es frágil, se añade un recargo de $5 extra.

Peso del paquete	¿Frágil?	Tarifa esperada
≤ 1 kg	❌ No	    $5
≤ 1 kg	✅ Sí	    $10
> 1 kg y ≤ 5 kg	     ❌ No	    $10
> 1 kg y ≤ 5 kg	     ✅ Sí	    $15
> 5 kg	❌ No	    $20
> 5 kg	✅ Sí	    $25


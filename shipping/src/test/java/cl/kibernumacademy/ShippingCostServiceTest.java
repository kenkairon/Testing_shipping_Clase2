package cl.kibernumacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests para ShippingCostService")
public class ShippingCostServiceTest {

    private ShippingCostService shippingCostService;

    @BeforeEach
    void setUp() {
        shippingCostService = new ShippingCostService();
    }

    @Test
    @DisplayName("Arr <= 1 kg, no frágil -> Act, calcular -> Assert: $5")
    void paqueteLigeroNoFragil() {
        // Arrange : Preparando los datos de entrada
        double peso = 0.5;
        boolean fragil = false;
        double esperado = 5.0;

        // Act : Ejecutar la acción a probar
        double resultado = shippingCostService.calcularCosto(peso, fragil);

        // Assert : Verificar el resultado
        assertEquals(esperado, resultado, "Hasta 1 kg sin fragilidad debería ser $5");
    }
}

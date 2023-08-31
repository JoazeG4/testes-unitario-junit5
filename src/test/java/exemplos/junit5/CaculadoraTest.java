package exemplos.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaculadoraTest {

    @Test
    public void somaDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(10,20);
        Assertions.assertEquals(30, soma);  // EXPECTED: Esperado a resposta X. SOMA: Resultado do função.
    }

    @Test
    public void verificaSeEPar(){
        Calculadora calculadora = new Calculadora();
        boolean verifica = calculadora.verificaPar(2);
        Assertions.assertTrue(verifica);
    }
}

package exemplos.junit5;

import org.junit.jupiter.api.*;

public class UserTest {

    private final User user = new User();

    @BeforeEach // Antes de cada teste executar createUser()
    public void createrUser(){
        user.setNome("Lucas");
        user.setSalario(1000d);
    }

    @AfterEach // Depois de cada teste executar imprimirSalario()
    public void imprimirSalario(){
        System.out.println(user.getSalario());
    }

    @BeforeAll // Antes de executar todos os testes iniciarTestes()
    public static void iniciarTestes(){
        System.out.println("Iniciando testes");
    }

    @AfterAll // Depois de executar todos testes testesFinalizado()
    public static void testesFinalizado(){
        System.out.println("Testes finalizado");
    }

    @Test
    public void testResjusteComNotaMaisAlta(){
        user.reajustar(9);
        double salario = user.getSalario();
        Assertions.assertEquals(1500, salario);
    }

    @Test
    public void testResjusteComNotaMaisBaixa(){
        user.reajustar(7);
        double salario = user.getSalario();
        Assertions.assertEquals(1100, salario);
    }
}

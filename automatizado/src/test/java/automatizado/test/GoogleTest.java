package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleTest extends BaseTest {

    @Test // Obsevação de teste do JUNIT5 // Credenciais utilizadas para acesso

    public void loginSermilmobUsuarioMobilizacao() {

        WebElement inputUsuario = driver.findElement(By.id("cpf"));
        inputUsuario.sendKeys("48563065025"); // Função sendKeys para simular o teclado

        WebElement inputSenha = driver.findElement(By.id("password")); // Localizando o campo senha
        inputSenha.sendKeys("Teste123@" + Keys.ENTER); // Função sendKeys para simular o teclado + Enter

        String resultado = driver.findElement(By.id("msg593")).getText(); // Função getText para obter o texto do

        assertTrue(resultado, resultado.contains("AMBIENTE DE TESTE / TREINAMENTO")); // Validação do teste

        WebElement inputPesquisaUsario = driver.findElement(By.id("criterio"));
        inputPesquisaUsario.sendKeys("06871867147" + Keys.ENTER);

        WebElement inputMenuInformacoes = driver.findElement(By.id("menu1"));
        inputMenuInformacoes.sendKeys(Keys.ENTER);

    }
}

package automatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected static WebDriver driver;
    private static final String URL = "https://teste-sermilweb.eb.mil.br/login";
    private static final String CHROME_DRIVER = "C://Users//Bruno.Marques//Documents//automatizado//automatizado//src//test//java//automatizado//resource//chromedriver.exe";

    @BeforeClass // Anotação para executar antes de qualquer teste
    public static void iniciar() { // Método estático para iniciar o WebDriver (O método sempre deve ser estático quando usado com @BeforeClass)
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @AfterClass // Anotação para executar após todos os testes
    public static void finalizar() {
            driver.quit(); // Finaliza o navegador
    }   
}

package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private ChromeDriver driver;

    @Given("^El usuario se encuentra en la pagina Home de mi tienda$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_mi_tienda() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","./src/test/Resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @When("^Hace clic sobre la pensataña de contactenos$")
    public void hace_clic_sobre_la_pensataña_de_contactenos() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement titleContactLocator = driver.findElement(By.id("contact-link"));
        titleContactLocator.click();
    }

    @Then("^Se debe redirigir a la pantalla Contactenos$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement pageContactLocator = driver.findElement(By.className("page-heading bottom-indent"));
        Assert.assertTrue( message: "No se redirecciono correctamente a la pagina de Contactenos", pageContactLocator.isDisplayed());
        Assert.assertEquals( expected: "Atención al cliente - Contáctenos",pageContactLocator.getText());
    }

}

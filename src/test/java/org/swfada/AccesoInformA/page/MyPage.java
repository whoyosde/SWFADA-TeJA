package org.swfada.AccesoInformA.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("/veauni_teja-webpru/inicio/indicarInstalacion.action")

public class MyPage extends PageObject {

    @FindBy(id = "instalacionEscogida")
    private WebElementFacade listaInstalacion;

    @FindBy(id = "submitInstalacion")
    private WebElementFacade btnNextInstalacion;

    @FindBy(id = "submitSistema")
    private WebElementFacade btnNextSistema;

    @FindBy(id = "sistema")
    private WebElementFacade listaSistema;

    @FindBy(id = "dni")
    private WebElementFacade campoDNI;

    @FindBy(id = "pw")
    private WebElementFacade campoContraseña;

    @FindBy(xpath = "//input[@value=\"Entrar\"]")
    private WebElementFacade btnEntrar;

    @FindBy(xpath = "//button/b[contains(text(),'Aceptar')]")
    private WebElementFacade btnAceptarObligaciones;

    @FindBy(id = "usuarioSeleccionado")
    private WebElementFacade listaPuestos;

    @FindBy(xpath = "//input[@value=\"Acceder\"]")
    private WebElementFacade btnAcceder;

    @FindBy(id = "cabecera-titulo")
    private WebElementFacade validarAcceso;

    public void SeleccionarInstalación(String instalacion) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formInstalacion")));
        listaInstalacion.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + instalacion + "')]"));
        clickOn(selectOptions);
        btnNextInstalacion.waitUntilClickable();
        btnNextInstalacion.click();

    }

    public void SeleccionarSistema(String sistema) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formSistema")));
        listaSistema.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + sistema + "')]"));
        clickOn(selectOptions);
        btnNextSistema.waitUntilClickable();
        btnNextSistema.click();
    }

    public void IngresarCredenciales(String usuario) {
        campoDNI.sendKeys(usuario);
    }

    public void IngresarContraseña(String contraseña) {
        campoContraseña.sendKeys(contraseña);
        btnEntrar.click();
    }


    public void PulsarAceptarObligaciones() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contenido-nuevo-inicio-ultimoacceso")));
        btnAceptarObligaciones.click();
    }

    public void SeleccionarPuesto(String puesto) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formulario")));
        listaPuestos.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + puesto + "')]"));
        clickOn(selectOptions);
    }

    public void PulsarAcceder() {
        btnAcceder.click();
    }

    public void ValidarQueEncuentoEnBandejaDeExpedientes() {
        WebElement iframe = getDriver().findElement(By.xpath( "//div[@id=\"frameModuloHome\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id=\"filtroForm\"]")));
        getDriver().switchTo().defaultContent();
    }
}

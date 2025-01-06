package org.swfada.AltaExpediente.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyPage extends PageObject {

    @FindBy(xpath = "//button[@id=\"btnAltaExpediente\"]")
    private WebElementFacade btnAltaExpediente;

    @FindBy(xpath = "(//select[@id=\"selTipoExpediente\"])[1]")
    private WebElementFacade selectTipo;

    @FindBy(xpath = "(//select[@id=\"selProcVersion\"])[1]")
    private WebElementFacade selectProcedimiento;

    @FindBy(xpath = "(//select[@id=\"tranInicio\"])[1]")
    private WebElementFacade selectFase;

    @FindBy(xpath = "(//input[@id=\"titulo\"])[1]")
    private WebElementFacade campoTitulo;

    @FindBy(xpath = "(//select[@id=\"unidOrganica\"])[1]")
    private WebElementFacade selectUnidad;

    @FindBy(xpath = "(//select[@id=\"unidadOrganicaEnvia\"])[1]")
    private WebElementFacade selectUnidadCreadora;

    @FindBy(xpath = "(//button[@id=\"submitAltaGenerica\"])[1]")
    private WebElementFacade btnContinuar;

    @FindBy(id = "editar")
    private WebElementFacade iconoEditar;

    @FindBy(xpath = "//input[@id=\"formDesigner:_id23:1:_id27:2:_id30:0:_id34:0:_id79\"]")
    private WebElementFacade campoNombre;

    @FindBy(xpath = "//input[@id=\"formDesigner:_id23:1:_id27:2:_id30:1:_id34:0:_id79\"]")
    private WebElementFacade campoApellido;

    @FindBy(xpath = "//input[@id=\"formDesigner:_id23:1:_id27:2:_id30:2:_id34:0:_id79\"]")
    private WebElementFacade campoApellido2;

    @FindBy(xpath = "//select[@name=\"formDesigner:_id23:1:_id27:2:_id30:3:_id34:0:_id527\"]")
    private WebElementFacade selectSexo;

    @FindBy(xpath = "//input[@name=\"formDesigner:_id23:1:_id27:2:_id30:4:_id34:0:_id79\"]")
    private WebElementFacade campoNif;

    @FindBy(xpath = "//select[@name=\"formDesigner:_id23:1:_id27:3:_id30:0:_id34:0:_id527\"]")
    private WebElementFacade selectTipovia;

    @FindBy(xpath = "//input[@name=\"formDesigner:_id23:1:_id27:3:_id30:1:_id34:0:_id79\"]")
    private WebElementFacade campoVia;

    @FindBy(xpath = "//input[@name=\"formDesigner:_id23:1:_id27:3:_id30:2:_id34:0:_id79\"]")
    private WebElementFacade campoNumeroVia;

    @FindBy(xpath = "//select[@name=\"formDesigner:_id23:1:_id27:4:_id30:0:_id34:0:_id527\"]")
    private WebElementFacade selectProvincia;

    @FindBy(xpath = "//select[@name=\"formDesigner:_id23:1:_id27:4:_id30:1:_id34:0:_id527\"]")
    private WebElementFacade selectMunicipio;

    @FindBy(xpath = "//input[@name=\"formDesigner:_id23:1:_id27:4:_id30:2:_id34:0:_id79\"]")
    private WebElementFacade campoCodPostal;

    @FindBy(xpath = "//input[@name=\"formDesigner:_id23:1:_id27:5:_id30:0:_id34:0:_id79\"]")
    private WebElementFacade campoTelefono;

    @FindBy(xpath = "//input[@name=\"formDesigner:_id23:1:_id27:5:_id30:2:_id34:0:_id79\"]")
    private WebElementFacade campoEmail;

    @FindBy(xpath = "(//input[@value=\"Página Siguiente\"])[1]")
    private WebElementFacade btnPagSiguiente;

    @FindBy(xpath = "(//input[@value=\"Guardar y Terminar\"])[1]")
    private WebElementFacade btnGuardarTerminar;

    @FindBy(xpath = "//input[@name=\"formDesigner:_id23:1:_id27:0:_id30:0:_id34:1:_id571\"]")
    private WebElementFacade checkConsentimiento;

    @FindBy(xpath = "//input[@name=\"formDesigner:_id23:2:_id27:3:_id30:1:_id34:0:_id79\"]")
    private WebElementFacade campoLugar;

    @FindBy(xpath = "//input[@name=\"formDesigner:_id23:2:_id27:6:_id30:1:_id34:0:_id79\"]")
    private WebElementFacade campoFdo;

    @FindBy(xpath = "(//input[@id=\"cerrarFormulario\"])[1]")
    private WebElementFacade btnCerrar;

    @FindBy(xpath = "(//button[@id=\"submitAltaEspedifica\"])[1]")
    private WebElementFacade btnContinuarEspe;

    @FindBy(xpath = "//select[@id=\"selTipoDocumento\"]")
    private WebElementFacade selectTipoDoc;

    @FindBy(id = "file")
    private WebElementFacade btnadjuntar;

    @FindBy(xpath = "//button[@id=\"btn-Subir\"]")
    private WebElementFacade btnsubir;

    @FindBy(xpath = "(//button[@id=\"submitAltaEspedifica\"])[2]")
    private WebElementFacade btnContinuarDoc;


    public void PulsarAltaExpediente() {
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"frameModuloHome\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        btnAltaExpediente.waitUntilClickable();
        Actions action = new Actions(getDriver());
        action.moveToElement(btnAltaExpediente)
                .click()
                .perform();
        getDriver().switchTo().defaultContent();
    }

    public void SeleccionarTipoDeExpediente(String tipoExpediente) {
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"frameModuloHome\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@id=\"submitAltaGenerica\"])[1]")));
        btnContinuar.waitUntilClickable();
        selectTipo.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + tipoExpediente + "')]"));
        clickOn(selectOptions);

    }

    public void seleccionoElProcedimiento(String procedimiento) {
        selectProcedimiento.waitUntilClickable();
        selectProcedimiento.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + procedimiento + "')]"));
        clickOn(selectOptions);
    }

    public void ingresarElTítuloDelExpediente(String título) {
        campoTitulo.sendKeys(título);
    }

    public void seleccionoLaFaseDeInicio(String fase) {
        selectFase.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + fase + "')]"));
        clickOn(selectOptions);
    }

    public void seleccionoLaUnidadOrgánica(String unidad) {
        selectUnidad.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + unidad + "')]"));
        clickOn(selectOptions);
    }

    public void seleccionoLaUnidadOrgánicaCreadora(String unidadcreadora) {
        selectUnidadCreadora.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("(//option[contains(text(),'" + unidadcreadora + "')])[2]"));
        clickOn(selectOptions);
    }

    public void pulsaElBotónContinuar() {

        btnContinuar.click();
        getDriver().switchTo().defaultContent();
    }

    public void rellenarDatosDelFormulario() {
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"frameModuloHome\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("editar")));
        iconoEditar.waitUntilClickable();
        iconoEditar.click();
        getDriver().switchTo().defaultContent();
        waitFor(3).second();
        WebElement iframe2 = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadXXL\"]/iframe"));
        getDriver().switchTo().frame(iframe2);
        campoNombre.sendKeys("Juan");
        campoApellido.sendKeys("Español");
        campoApellido2.sendKeys("Español");
        selectSexo.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'Hombre')]"));
        clickOn(selectOptions);
        campoNif.sendKeys("49343284G");

        selectTipovia.click();
        WebElement selectOptions2 = getDriver().findElement(By.xpath("//option[contains(text(),'Acceso')]"));
        clickOn(selectOptions2);
        campoVia.sendKeys("Acceso prueba");
        campoNumeroVia.sendKeys("125");
        selectProvincia.click();
        WebElement selectOptions3 = getDriver().findElement(By.xpath("//option[contains(text(),'HUELVA')]"));
        clickOn(selectOptions3);
        selectMunicipio.waitUntilClickable();
        selectMunicipio.click();
        WebElement selectOptions4 = getDriver().findElement(By.xpath("//option[contains(text(),'ISLA CRISTINA')]"));
        clickOn(selectOptions4);
        campoCodPostal.sendKeys("21040");
        campoTelefono.sendKeys("123695847");
        campoEmail.sendKeys("test@test.com");
        btnPagSiguiente.click();
        getDriver().switchTo().defaultContent();

        WebElement iframe3 = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadXXL\"]/iframe"));
        getDriver().switchTo().frame(iframe3);
        checkConsentimiento.waitUntilClickable();
        checkConsentimiento.click();
        campoLugar.sendKeys("Huelva");
        campoFdo.sendKeys("Walter");
    }


    public void pulsaElBotónGuardarYTerminar() {
        btnGuardarTerminar.waitUntilClickable();
        getDriver().switchTo().defaultContent();
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadXXL\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        btnCerrar.waitUntilClickable();
        btnCerrar.click();
        getDriver().switchTo().defaultContent();
    }

    public void pulsaElBotónContinuarDeDatosEspecíficos() {
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"frameModuloHome\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("editar")));
        btnContinuarEspe.waitUntilClickable();
        btnContinuarEspe.click();
        getDriver().switchTo().defaultContent();
    }

    public void seleccionoTipoDeDocumento(String tipodoc) {
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"frameModuloHome\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id=\"selTipoDocumento\"]")));
        selectTipoDoc.waitUntilClickable();
        selectTipoDoc.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + tipodoc + "')]"));
        clickOn(selectOptions);
    }

    public void adjuntoDocumento() {

        String relativePath = "src/test/resources/DOC01.pdf";
        String absolutePath = Paths.get(relativePath).toAbsolutePath().toString();

        // Localizar el elemento de entrada de archivo
        WebElement fileInput = getDriver().findElement(By.id("file"));

        // Adjuntar el archivo
        fileInput.sendKeys(absolutePath);

        System.out.println("Archivo adjuntado correctamente.");

        btnsubir.waitUntilClickable();
        btnsubir.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"item-formulario\"])[2]")));
    }

    public void pulsaElBotónContinuarDeDocumentación() {
        btnContinuarDoc.waitUntilClickable();
        btnContinuarDoc.click();
        getDriver().switchTo().defaultContent();
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"frameModuloHome\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id=\"filtroForm\"]")));
        getDriver().switchTo().defaultContent();
    }
}

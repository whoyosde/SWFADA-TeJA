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

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyPage extends PageObject {
    @FindBy(id = "cabecera-titulo")
    private WebElementFacade validarAcceso;

    @FindBy(xpath = "//a[@title=\"Creación de expediente electrónico que contiene el conjunto de procesos operativos y documentación electrónica correspondiente a un procedimiento administrativo\"]")
    private WebElementFacade pestañaAltaExpediente;

    @FindBy(id = "moduloAltaExp_selTipoExpediente")
    private WebElementFacade selectTipo;

    @FindBy(id = "selProcVersion2")
    private WebElementFacade selectProcedimiento;

    @FindBy(id = "titulo")
    private WebElementFacade campoTítuloExpe;

    @FindBy(id = "moduloAltaExp_guardaExpediente")
    private WebElementFacade btnCrearExpediente;

    @FindBy(xpath = "//input[@id=\"numIdentificacion\"]")
    private WebElementFacade campoIdentificación;

    @FindBy(id = "formBusqueda_0")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//input[@value=\"Añadir\"]")
    private WebElementFacade btnAñadir;

    @FindBy(xpath = "//select[@id=\"selectRazonInteresSel\"]")
    private WebElementFacade selectRazón;

    @FindBy(xpath = "//select[@id=\"notificacionTelematicaSel\"]")
    private WebElementFacade selectNotificación;

    @FindBy(xpath = "//select[@id=\"infoEspecifica\"]")
    private WebElementFacade selectRespuesta;

    @FindBy(id = "mostrarDatosEspecificos_insertarInteresado")
    private WebElementFacade btnContinuarInsertar;

    @FindBy(xpath = "//input[@id=\"noAsociar_0\"]")
    private WebElementFacade btnContinuar;

    @FindBy(xpath = "//p[@class=\"info\"]")
    private WebElementFacade mensajeConfirmación;

    private String interesado;

    public void ValidarQueEncuentoEnBandejaDeExpedientes() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bloqueResultadosBusqueda")));
        assertEquals("Plataforma de Tramitación INFORM@", validarAcceso.getText());
    }

    public void PulsarAltaExpediente() {
        Actions action = new Actions(getDriver());
        action.moveToElement(pestañaAltaExpediente)
                .click()
                .perform();
    }

    public void SeleccionarTipoDeExpediente(String tipoExpediente) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id=\"formulario\"])[1]")));
        selectTipo.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + tipoExpediente + "')]"));
        clickOn(selectOptions);
    }

    public void SeleccionarProcedimiento(String procedimiento) {
        selectProcedimiento.waitUntilClickable();
        selectProcedimiento.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + procedimiento + "')]"));
        clickOn(selectOptions);
    }

    public void IngresarTítuloDeExpediente(String títuloExpe) {
        campoTítuloExpe.sendKeys(títuloExpe);
    }

    public void PulsarCrearExpediente() {
        btnCrearExpediente.waitUntilClickable();
        btnCrearExpediente.click();
    }

    public void BuscarInteresado(String interesado) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("busquedaInteresados")));
        campoIdentificación.sendKeys(interesado);
        this.interesado = interesado;
    }

    public void PulsarBuscar() {
        btnBuscar.waitUntilClickable();
        btnBuscar.click();
    }

    public void AñadirInteresado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=\"parent\"]")));
        btnAñadir.click();
    }

    public void ValidarPantallaDeInformaciónEspecifica() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id=\"mostrarDatosEspecificos\"]")));
    }

    public void SeleccionarRazónDeInteres(String razón) {
        selectRazón.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + razón + "')]"));
        clickOn(selectOptions);
    }

    public void SeleccionarMedioDeNotificación(String medioNoti) {
        selectNotificación.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + medioNoti + "')]"));
        clickOn(selectOptions);
    }

    public void ResponderSiUtilizaDomicilioDistinto(String respuesta) {
        selectRespuesta.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + respuesta + "')]"));
        clickOn(selectOptions);
    }

    public void PulsarContinuar() {
        btnContinuarInsertar.click();
    }

    public void ValidarInteresadoAñadido() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formularioInteresado")));
        List<WebElement> filas = getDriver().findElements(By.xpath("//table[@id=\"tabla-tareas\"]/tbody/tr"));
        // Bandera para indicar si se encontró el elemento
        boolean encontrado = false;

        for (int i = 0; i < filas.size(); i++) {
            WebElement fila = filas.get(i);
            if (fila.getText().contains(interesado)) {
                Assert.assertTrue(true);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el elemento buscado.");
        }

    }

    public void PulsarContinuarInteresado() {
        btnContinuar.waitUntilClickable();
        btnContinuar.click();
    }

    public void ValidarExpedienteCreado() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class=\"info\"]")));
        List<WebElement> mensajeConfirmación = getDriver().findElements(By.xpath("//p[contains(text(),'El expediente se ha creado correctamente con el número')]"));
        if (mensajeConfirmación.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se ha creado el expediente");
        }

    }
}

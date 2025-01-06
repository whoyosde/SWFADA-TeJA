package org.swfada.Notificacion.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyPage extends PageObject {

    @FindBy(xpath = "//div[@id=\"pendienteTramitar\"]")
    private WebElementFacade btnExpPendiente;

    @FindBy(xpath = "//input[@id=\"buscar\"]")
    private WebElementFacade campoBuscar;

    @FindBy(xpath = "//button[contains(normalize-space(),'Buscar')]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//a[contains(text(),'Notificaciones')]")
    private WebElementFacade pestañaNotificaciones;

    @FindBy(xpath = "//table[@id=\"tablaResultado1\"]//td[1]/input")
    private WebElementFacade checkDocumento;

    @FindBy(xpath = "(//button[@id=\"btn-guardar\"])[1]")
    private WebElementFacade btnSiguienteDoc;

    @FindBy(xpath = "//input[@title=\"EIDAS CERTIFICADO, PRUEBAS\"]")
    private WebElementFacade checkInteresado;

    @FindBy(xpath = "(//button[@id=\"btn-guardar\"])[2]")
    private WebElementFacade btnSiguienteInte;

    @FindBy(xpath = "//input[@id=\"asuntoTele\"]")
    private WebElementFacade campoAsunto;

    @FindBy(xpath = "//input[@value=\"Enviar notificación\"]")
    private WebElementFacade btnEnviar;

    @FindBy(xpath = "//div[@class=\"alert alert-success\"]//li")
    private WebElementFacade mensaje;

    @FindBy(xpath = "//input[@value=\"Cerrar\"]")
    private WebElementFacade btnCerrar;

    @FindBy(xpath = "//input[@id=\"sp-searchtext\"]")
    private WebElementFacade campoBuscar2;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String currentDate = sdf.format(new Date());

    public void BuscarExpediente(String expediente) {

        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"frameModuloHome\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        btnExpPendiente.click();

        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id=\"filtroForm\"]")));
        btnExpPendiente.waitUntilClickable();
        campoBuscar.sendKeys(expediente);
        btnBuscar.waitUntilClickable();
        btnBuscar.click();
        waitFor(1).second();
    }

    public void TramitarExpediente() {

        String estado = "Registro de Licitadores de Andalucía PRU";
        // Encontrar todas las filas de la tabla
        List<WebElement> filas = getDriver().findElements(By.tagName("tr"));
        // Bandera para indicar si se encontró el elemento
        boolean encontrado = false;

        for (int i = 0; i < filas.size(); i++) {
            WebElement fila = filas.get(i);
            // Buscar el elemento en la fila por su texto
            if (fila.getText().contains(estado)) {

                Actions actions = new Actions(getDriver());
                actions.moveToElement(fila)
                        .perform();
                WebElement tramitar = getDriver().findElement(By.xpath("//div[@style=\"display: flex; align-items: center; justify-content: center; min-width: 105px; min-height: 80px;\"]/button"));
                actions.moveToElement(tramitar)
                        .perform();
                tramitar.click();

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el elemento buscado.");
        }
        getDriver().switchTo().defaultContent();
    }

    public void PulsaLaPestañaNotificaciones() {
        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Documentos')]")));
        pestañaNotificaciones.waitUntilClickable();
        pestañaNotificaciones.click();
        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value=\"Nueva Remesa\"]")));
    }

    public void PulsaElBotónNuevaRemesa() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        WebElement btnNuevaRemesa = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value=\"Nueva Remesa\"]")));
        btnNuevaRemesa.click();
        getDriver().switchTo().defaultContent();
        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));

        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadXL\"]/iframe"));
        getDriver().switchTo().frame(iframe);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id=\"formRemesa\"]")));
    }

    public void SeleccionaElDocumentoFirmado() {
        checkDocumento.waitUntilClickable();
        checkDocumento.click();
    }

    public void PulsaElBotónSiguiente() {
        btnSiguienteDoc.waitUntilClickable();
        btnSiguienteDoc.click();
    }

    public void SeleccionaElInteresado() {
        checkInteresado.waitUntilClickable();
        checkInteresado.click();
    }

    public void PulsaElBotónSiguienteInteresados() {
        btnSiguienteInte.waitUntilClickable();
        btnSiguienteInte.click();
    }

    public void IngresaElAsuntoDeNotificación(String asunto) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"documentosNotificados\"]")));
        campoAsunto.sendKeys(asunto);
    }

    public void PulsaElBotónEnviarNotificación() {
        btnEnviar.waitUntilClickable();
        btnEnviar.click();
        getDriver().switchTo().defaultContent();

        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));
    }

    public void MostrarResumenDeNotificación() {
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadXL\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        assertEquals("Se ha notificado correctamente.", mensaje.getText());
    }

    public void PulsaElBotónCerrar() {
        btnCerrar.waitUntilClickable();
        btnCerrar.click();
        getDriver().switchTo().defaultContent();
        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.visibilityOf(espera));
        getDriver().navigate().refresh();
    }

    public void ValidarNotificación() {
        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Documentos')]")));
        pestañaNotificaciones.waitUntilClickable();
        pestañaNotificaciones.click();
        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@id='tablaResultado']//td[2][contains(text(),'" + currentDate + "')]//..//a[contains(text(),'Acuerdo')])[1]")));
    }
}

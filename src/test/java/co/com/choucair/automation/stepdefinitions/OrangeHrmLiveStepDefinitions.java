package co.com.choucair.automation.stepdefinitions;

import co.com.choucair.automation.models.Datos;
import co.com.choucair.automation.questions.ValidarContratacion;
import co.com.choucair.automation.questions.ValidarDatosEnLogin;
import co.com.choucair.automation.questions.ValidarFormulario;
import co.com.choucair.automation.tasks.VerificarContratacion;
import co.com.choucair.automation.tasks.VerificarEmpleado;
import co.com.choucair.automation.tasks.VerificarLogin;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static co.com.choucair.automation.util.Constants.BASE_URL;

public class OrangeHrmLiveStepDefinitions {
    @Managed
    WebDriver driver;

    @DataTableType
    public Datos defineDatos(Map<String, String> entry) {
        return new Datos(entry.get("userName"), entry.get("password"),entry.get("firtsName"), entry.get("lastName"), entry.get("email"), entry.get("palabra"));

    }



    @Before
    public void configurar() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Automatizador");

    }

    @Dado("el usuario ingresa a la pagina")
    public void elUsuarioIngresaALaPagina() {

            OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(BASE_URL));

    }



    @Cuando("el usuario ingrese las credenciales correctas")
    public void elUsuarioIngreseLasCredencialesCorrectas(List<Datos> datos) {
        Datos credenciales = datos.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(
                VerificarLogin.conCredenciales(credenciales.getUserName(), credenciales.getPassword())
        );

    }

    @Entonces("el usuario ingresa a la página principal {string}")
    public void elUsuarioIngresaALaPáginaPrincipal(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarDatosEnLogin.message(), Matchers.is(true)));
    }

    @Cuando("el usuario ingrese los datos correctas")
    public void elUsuarioIngreseLosDatosCorrectas(List<Datos> datos) {
        Datos credenciales = datos.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(
                VerificarContratacion.conDatos(credenciales.getFirtsName(),credenciales.getLastName(),credenciales.getEmail(), credenciales.getPalabra())
        );
    }

    @Entonces("el usuario culmina el proceso de contratacion {string}")
    public void elUsuarioCulminaElProcesoDeContratacion(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarContratacion.message(), Matchers.is(true)));
    }

    @And("el usuario verifique la información")
    public void elUsuarioVerifiqueLaInformación(List<Datos> datos) {
        Datos credenciales = datos.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(
                VerificarEmpleado.conDatos(credenciales.getPalabra())
        );



    }

    @Then("los datos de la persona deben corresponder a los diligenciados en los formularios")
    public void losDatosDeLaPersonaDebenCorresponderALosDiligenciadosEnLosFormularios(List<Datos> datos) {
        Datos credenciales = datos.get(0);

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                "Los datos del formulario son correctos",
                ValidarFormulario.es(
                        credenciales.getFirtsName(),
                        credenciales.getLastName(),
                        credenciales.getEmail()
                )
        ));
    }

    @And("el estado debe ser contratado {string}")
    public void elEstadoDebeSerContratado(String status) {

    }


}

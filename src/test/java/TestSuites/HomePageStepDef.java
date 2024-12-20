package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import helper.Config;
import helper.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class HomePageStepDef {

	
	@Given("utilsateur est sur la page dacceuil")
	public void utilsateur_est_sur_la_page_dacceuil() throws Exception {
		Config.driver=new ChromeDriver();
		Config.maximizewindow();
		Config.driver.get(Utils.getproprety("Web_Home_Link"));
		
		
	    
	}

	@When("utlisateur survole la souris sur le menu {string} et clique sur le submenu {string}")
	public void utlisateur_survole_la_souris_sur_le_menu_et_clique_sur_le_submenu(String menuTitle, String submenuTitle) {
	    HomePage page = new HomePage ();
	    page.mousehoveronmenu(submenuTitle);
	    page.clickonproduct(submenuTitle);
	    
	}

	@Then("utilisateur est derige vers la page {string}")
	public void utilisateur_est_derige_vers_la_page(String name) {
		HomePage page =new HomePage ();
		page.verif(name);
		
	    
	}



}

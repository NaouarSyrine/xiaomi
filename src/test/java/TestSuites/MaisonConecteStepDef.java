package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Pages.MaisonConnecte;
import helper.Config;
import helper.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConecteStepDef {
	
	
	
	@Given("utilisateur est sur la page maison connecte")
	public void utilisateur_est_sur_la_page_maison_connecte() throws Exception {
	    
		Config.driver=new ChromeDriver();
		Config.maximizewindow();
		Config.driver.get(Utils.getproprety("Web_MaisonConecte_Link"));
	}

	@When("utilisateur effectue le tri {string} et clique sur le produit {string}")
	public void utilisateur_effectue_le_tri_et_clique_sur_le_produit(String sortTri, String nameproduct) {
		MaisonConnecte maison= new MaisonConnecte();
		maison.SortTriAndClickProduct(sortTri, nameproduct);
	   
	}

	@Then("utilisateur est derige vers la page du produit {string}")
	public void utilisateur_est_derige_vers_la_page_du_produit(String titreproduit) {
		
		MaisonConnecte maison= new MaisonConnecte();
		maison.verifproduct(titreproduit);
		
		
		
	}
	




}

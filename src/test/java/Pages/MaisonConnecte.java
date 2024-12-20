package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import helper.Config;

public class MaisonConnecte {
	
	@FindBy(name="orderby")
	WebElement tri;
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement> menus;
	@FindBy(xpath="//*[@id=\"product-16704\"]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement verifproduct;
	
	public  MaisonConnecte () {
		PageFactory.initElements(Config.driver, this);
		
	}
	
	
	public void SortTriAndClickProduct (String sortTri, String productname) {
		
		Select select = new Select(tri);
		select.selectByVisibleText(sortTri);
		try {
		
		for(WebElement menu:menus) {
			if(menu.getText().contains(productname)) {
				menu.click();
			}
			
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
			
		}
			
		public void verifproduct (String titreproduit) {
			Assert.assertEquals(titreproduit, verifproduct.getText());
			
	}

}

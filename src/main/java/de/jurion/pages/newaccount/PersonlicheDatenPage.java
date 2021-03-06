package de.jurion.pages.newaccount;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import de.jurion.tools.AbstractPage;

public class PersonlicheDatenPage extends AbstractPage {

    public PersonlicheDatenPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input#institution")
    private WebElement institutionInput;
    
    @FindBy(css = "div#gender-elem")
    private WebElement genderCheckboxContainer;

    @FindBy(id = "gender-1")
    private WebElement anrredeHerrCheckbox;
  
    @FindBy(css = "input#gender-2")
    private WebElement anrredeFrauCheckbox;

    @FindBy(id = "title")
    private WebElement akademischerTitelDropdown;

    @FindBy(css = "input#firstname")
    private WebElement vornameInput;

    @FindBy(css = "input#lastname")
    private WebElement nachnameInput;

    @FindBy(css = "input#street")
    private WebElement addressInput;

    @FindBy(css = "input#zipcode")
    private WebElement plzInput;

    @FindBy(css = "input#city")
    private WebElement cityInput;

    @FindBy(id = "country")
    private WebElement landDropdown;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "profession")
    private WebElement berufDropdown;

    @FindBy(css = "input#phone")
    private WebElement phoneInput;

    @FindBy(css = "fieldset#fieldset-form1 dd#buttonnavigation-element")
    private WebElement weiterButtonContainer;
    
    @FindBy(css = "input#email")
    private WebElement nutznameInput;
    
    @FindBy(css = "input#password")
    private WebElement passwortInput;
    
    @FindBy(css = "#confirm_terms-elem span.checkbox")
    private WebElement firstCheckbox;
    
    @FindBy(css = "#accept_newsletter-elem span.checkbox")
    private WebElement secondCheckbox;
    
    @FindBy(css = "#accept_marketing-elem span.checkbox")
    private WebElement thirdCheckbox;
    
    @FindBy(css = "input#submit")
    private WebElement registerButton; 

    public void fillInstitutionName(String institution) {
        element(institutionInput).waitUntilVisible();
        institutionInput.sendKeys(institution);
    }

     // needs refactoringgg
    public void selectFromAnredeCheckbox(String gender) {
        element(genderCheckboxContainer).waitUntilVisible();
//        if(gender==CustomerLabels.GENDER_MALE)
        System.out.println("XXX : "+genderCheckboxContainer.getText());
        elementFocus("div#gender-elem input#gender-1");
        System.out.println("Is focused indeeed !!!");
        elementjQueryClick("div#gender-elem input#gender-1");
//        	List<WebElement> elems = genderCheckboxContainer.findElements(By.cssSelector("span.radio"));
//        	for(WebElement elem:elems){
//        	if(elem.getText().contains(gender)){
//        		elem.click();
//        	}	
//        	}
//        else if(gender==CustomerLabels.GENDER_MALE)
//        	genderCheckboxContainer.findElement(By.cssSelector("input#gender-2")).click();
    }

    public void selectAcademicTitleDropdown(String academicTitle) {
        element(akademischerTitelDropdown).waitUntilVisible();
        element(akademischerTitelDropdown).selectByVisibleText(academicTitle);
    }

    public void fillVorname(String firstname) {
        element(vornameInput).waitUntilVisible();
        vornameInput.sendKeys(firstname);
    }

    public void fillNachName(String lastname) {
        element(nachnameInput).waitUntilVisible();
        nachnameInput.sendKeys(lastname);
    }

    public void fillAddress(String address) {
        element(addressInput).waitUntilVisible();
        addressInput.sendKeys(address);
    }

    public void fillPlz(String plz) {
        element(plzInput).waitUntilVisible();
        plzInput.sendKeys(plz);
    }

    public void fillOrt(String city) {
        element(cityInput).waitUntilVisible();
        cityInput.sendKeys(city);
    }

    public void selectLandDropdown(String country) {
        element(landDropdown).waitUntilVisible();
        element(landDropdown).selectByVisibleText(country);
    }

    public void fillEmailAdresse(String email) {
        element(emailInput).waitUntilVisible();
        emailInput.sendKeys(email);
    }

    public void fillTelefon(String phone) {
        element(phoneInput).waitUntilVisible();
        phoneInput.sendKeys(phone);
    }

    public void selectBerufDropdown(String profession) {
        element(berufDropdown).waitUntilVisible();
        element(berufDropdown).selectByVisibleText(profession);
    }

    public void clickOnWeiterButton() {
        element(weiterButtonContainer).waitUntilVisible();
        WebElement button = weiterButtonContainer.findElement(By.id("next"));
        button.click();
    }

	public void fillUsernameInput(String email) {
		element(nutznameInput).waitUntilVisible();
		nutznameInput.sendKeys(email);
	}

	public void fillPasswordInput(String password) {
		element(passwortInput).waitUntilVisible();
		passwortInput.sendKeys(password);
	}

	public void tickAcceptTermsCheckbox() {
		element(firstCheckbox).waitUntilVisible();
		firstCheckbox.click();
	}

	public void tickAcceptNewsletterCheckbox() {
		element(secondCheckbox).waitUntilVisible();
		secondCheckbox.click();
	}

	public void tickDataProtectionCheckbox() {
		element(thirdCheckbox).waitUntilVisible();
		thirdCheckbox.click();
	}

	public void clickOnRegisterButton() {
		element(registerButton).waitUntilVisible();
		registerButton.click();
	}

}

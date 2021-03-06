package de.jurion.steps.newaccount;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import de.jurion.tools.AbstractSteps;

public class RegisterSteps extends AbstractSteps{

	public RegisterSteps(Pages pages) {
		super(pages);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6505619819300294355L;
   
	 @StepGroup
	    public void fillRegisterDataForm(String gender,
	            String academicTitle, String firstname, String lastname,
	            String email, String password) {
//	        fillInstitutionName(institution);
	        selectFromAnredeCheckbox(gender);
	        selectAcademicTitleDropdown(academicTitle);
	        fillVorname(firstname);
	        fillNachName(lastname);
	        fillUsernameInput(email);
	        fillPasswordInput(password);
	        tickAcceptTermsCheckbox();
	        tickAcceptNewsletterCheckbox();
	        tickDataProtectionCheckbox();
	        clickOnRegisterButton();

	    }
	 
	 @StepGroup
	    public void fillRegisterDataFormWithoutAcceptingTerms(String gender,
	            String academicTitle, String firstname, String lastname,
	            String email, String password) {
	        selectFromAnredeCheckbox(gender);
	        selectAcademicTitleDropdown(academicTitle);
	        fillVorname(firstname);
	        fillNachName(lastname);
	        fillUsernameInput(email);
	        fillPasswordInput(password);
	        untickAcceptTermsCheckbox();
	        tickAcceptNewsletterCheckbox();
	        tickDataProtectionCheckbox();
	        clickOnRegisterButton();

	    }
	 
	@Step
	public void selectFromAnredeCheckbox(String gender) {
		registerPage().selectFromAnredeCheckbox(gender);
	}

	@Step
	public void selectAcademicTitleDropdown(String academicTitle) {
		registerPage().selectAcademicTitleDropdown(academicTitle);
	}

	@Step
	public void fillVorname(String firstname) {
		registerPage().fillVorname(firstname);
	}

	@Step
	public void fillNachName(String lastname) {
		registerPage().fillNachName(lastname);
	}

	@Step
	public void fillUsernameInput(String email) {
		registerPage().fillUsernameInput(email);
	}

	@Step
	public void fillPasswordInput(String password) {
		registerPage().fillPasswordInput(password);
	}

	@Step
	public void tickAcceptTermsCheckbox() {
		registerPage().tickAcceptTermsCheckbox();
	}
	
	@Step
	public void untickAcceptTermsCheckbox() {
		registerPage().untickAcceptTermsCheckbox();
	}

	@Step
	public void tickAcceptNewsletterCheckbox() {
		registerPage().tickAcceptNewsletterCheckbox();
	}

	@Step
	public void tickDataProtectionCheckbox() {
		registerPage().tickDataProtectionCheckbox();
	}

	@Step
	public void clickOnRegisterButton() {
		registerPage().clickOnRegisterButton();
	}
    
	@Step
	public void verifyFirstNameErrorMessage(String firstnameErrorMessage) {
		registerPage().verifyFirstNameErrorMessage(firstnameErrorMessage);
	}
    
	@Step
	public void verifyLastNameErrorMessage(String lastnameErrorMessage) {
		registerPage().verifyLastNameErrorMessage(lastnameErrorMessage);
	}
    
	@Step
	public void verifyEmailErrorMessage(String emailErrorMessage) {
		registerPage().verifyEmailErrorMessage(emailErrorMessage);
	}
	@Step
	public String getComputedStyle(String passwordErrorId){
		return registerPage().getComputedStyle(passwordErrorId);
		
	}
	
	@Step
	public void verifyElementPosition(String elemID, String position){
		registerPage().verifyElementPosition(elemID, position);
	}
    
	@Step
	public void verifyPasswordErrorMessage(String passwordErrorMessage) {
		registerPage().verifyPasswordErrorMessage(passwordErrorMessage);
	}
    
	@Step
	public void verifyAcceptTermsErrorMessage(String termsErrorMessage) {
		registerPage().verifyAcceptTermsErrorMessage(termsErrorMessage);
	}

}

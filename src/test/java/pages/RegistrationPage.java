package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultsModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;



public class RegistrationPage {
    private CalendarComponent calendarComponent = new CalendarComponent();
    private RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();
    private final String TITLE_TEXT = "Student Registration Form";
    private SelenideElement
            lastNameInput = $("#lastName"),
            firstNameInput = $("#firstName"),
            emailInput = $("#userEmail"),
            addressInput = $("#currentAddress"),
            numberInput = $("#userNumber"),
            dobSelector = $("#dateOfBirthInput"),
            genderSelector = $("#genterWrapper"),
            subjectsInput = $("#subjectsInput"),
            hobbiesSelector = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            stateSelector = $("#state"),
            stateCityWrapper = $("#stateCity-wrapper"),
            city = $("#city"),
            submitButton = $("#submit");



    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public RegistrationPage setAddress(String value) {
        addressInput.setValue(value);

        return this;
    }

    public RegistrationPage setNumber(String value) {
        numberInput.setValue(value);

        return this;
    }

    public RegistrationPage setGender (String value) {
        genderSelector.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobbie(String value) {
        hobbiesSelector.$(byText(value)).click();

        return this;
    }
    public RegistrationPage setPicture(String value) {
        uploadPicture.uploadFromClasspath(value);

        return this;
    }

    public RegistrationPage setStateAndCity(String stateValue, String cityValue) {
        stateSelector.click();
        stateCityWrapper.$(byText(stateValue)).click();
        city.click();
        stateCityWrapper.$(byText(cityValue)).click();
        return this;
    }

    public RegistrationPage submitForm() {
        submitButton.click();

        return this;
    }


    public RegistrationPage verifyResultsModalAppears() {
        registrationResultsModal.verifyModalAppears();

        return this;
    }

    public RegistrationPage verifyResult(String key, String value) {
        registrationResultsModal.verifyModalResult(key, value);

        return this;
    }


}

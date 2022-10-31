package tests.demoqa.tests;

import org.junit.jupiter.api.Test;
import tests.demoqa.pages.RegistrationFormPage;

import static io.qameta.allure.Allure.step;
import static tests.demoqa.utils.TestData.*;


public class RegistrationFormWithPageObjectsTests extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    void fillFormTest() {
        step("Open registration form", () -> {
            registrationFormPage.openPage();
        });

        step("Fill form", () -> {
            registrationFormPage.setFirstName(firstName)
                    .setLastName(lastName)
                    .setEmail(email)
                    .setGender(gender)
                    .setNumber(mobile)
                    .setBirthDate(day, month, year)
                    .setSubjects(subjects)
                    .setHobbies(hobbies)
                    .uploadPicture("img/" + picture)
                    .setAddress(currentAddress)
                    .setStateAndCity(state, city)
                    .clickSubmit();
        });

        step("Check form results", () -> {
            registrationFormPage.checkResultsTableVisible()
                    .checkResult("Student Name", firstName + " " + lastName)
                    .checkResult("Student Email", email)
                    .checkResult("Gender", gender)
                    .checkResult("Mobile", mobile)
                    .checkResult("Date of Birth", day + " " + month + "," + year)
                    .checkResult("Subjects", subjects)
                    .checkResult("Hobbies", hobbies)
                    .checkResult("Picture", picture)
                    .checkResult("Address", currentAddress)
                    .checkResult("State and City", state + " " + city);
        });
    }
}

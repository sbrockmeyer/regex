package regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    // name
    @Test
    void validName() {
        String name1 = "Janet";
        assertEquals(true, App.isValidHumanName(name1));

        String name2 = "Jemma";
        assertEquals(true, App.isValidHumanName(name2));

        String name3 = "Kana";
        assertEquals(true, App.isValidHumanName(name3));
    }

    @Test
    void invalidName() {
        String name1 = "32448";
        assertEquals(false, App.isValidHumanName(name1));

        String name2 = "2523=+-";
        assertEquals(false, App.isValidHumanName(name2));

        String name3 = "=_=-=-/'.;";
        assertEquals(false, App.isValidHumanName(name3));
    }

    // email
    @Test
    void validEmail() {
        String email1 = "Sakurabrockmeyer@yahoo.com";
        assertEquals(true, App.isValidEmailAdress(email1));

        String email2 = "dinekei@auekjd.edu";
        assertEquals(true, App.isValidEmailAdress(email2));

        String email3 = "sadi.@feij.eis";
        assertEquals(true, App.isValidEmailAdress(email3));
    }

    @Test
    void invalidEmail() {
        String email1 = "5s3e838";
        assertEquals(false, App.isValidEmailAdress(email1));

        String email2 = "";
        assertEquals(false, App.isValidEmailAdress(email2));

        String email3 = null;
        assertEquals(false, App.isValidEmailAdress(email3));
    }

    // phone
    @Test
    void validPhone() {
        String phone1 = "580-682-6845";
        assertEquals(true, App.isValidPhoneNumber(phone1));

        String phone2 = "1-800-588-2305";
        assertEquals(true, App.isValidPhoneNumber(phone2));

        String phone3 = "85-851-824-3872";
        assertEquals(true, App.isValidPhoneNumber(phone3));
    }

    @Test
    void invalidPhone() {
        String phone1 = "795748+838";
        assertEquals(false, App.isValidPhoneNumber(phone1));

        String phone2 = "";
        assertEquals(false, App.isValidPhoneNumber(phone2));

        String phone3 = null;
        assertEquals(false, App.isValidPhoneNumber(phone3));
    }

    // ssn
    @Test
    void validSSN() {
        String ssn1 = "852-89-6987";
        assertEquals(true, App.isValidSSN(ssn1));

        String ssn2 = "159-15-6945";
        assertEquals(true, App.isValidSSN(ssn2));

        String ssn3 = "761-84-3848";
        assertEquals(true, App.isValidSSN(ssn3));
    }

    @Test
    void invalidSSN() {
        String ssn1 = "784953984";
        assertEquals(false, App.isValidSSN(ssn1));

        String ssn2 = "8753215698425";
        assertEquals(false, App.isValidSSN(ssn2));

        String ssn3 = "99-865-5487";
        assertEquals(false, App.isValidSSN(ssn3));
    }
}

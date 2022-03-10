package org.springframework.samples.petclinic.model;

/**
 * @author Cavid Aslanov
 * @time 10/03/2022 - 4:55 PM
 **/
// this enum is for constant user roles
// instead of creating @Component annotated class

public enum ERoles {

    OWNER_ADMIN ( "ROLE_OWNER_ADMIN"),
    VET_ADMIN ( "ROLE_VET_ADMIN"),
    ADMIN ( "ROLE_ADMIN");

    private final String value;

    ERoles(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

package mankind;

class Human {
    String firstName;
    String lastName;

    Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    private void setFirstName(String firstName) {
        String namePattern = "^([A-Z])(\\w+)$";
        if (firstName.matches(namePattern)) {
            if (firstName.length() >= 4) {
                this.firstName = firstName;
            } else {
                throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
            }
        } else {
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }
    }

    void setLastName(String lastName) {
        String namePattern = "^([A-Z])(\\w+)$";
        if (lastName.matches(namePattern)) {
            if (lastName.length() >= 3) {
                this.lastName = lastName;
            } else {
                throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
            }
        } else {
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }
    }
}

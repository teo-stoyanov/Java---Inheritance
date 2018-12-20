package mankind;

class Worker extends Human {
    private double weekSalary;
    private double hoursPerDay;

    Worker(String firstName, String lastName, double weekSalary, double hoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setHoursPerDay(hoursPerDay);
    }

    @Override
    void setLastName(String lastName) {
        if (lastName.length() < 4) {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.lastName = lastName;
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    private void setHoursPerDay(double hoursPerDay) {
        if (hoursPerDay < 1 || hoursPerDay > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hoursPerDay = hoursPerDay;
    }

    private double calculateSalaryPerHour(Double weekSalary, double hoursPerDay) {
        return (weekSalary / 7) / hoursPerDay;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s\n" +
                "Last Name: %s\n" +
                "Week Salary: %.2f\n" +
                "Hours per day: %.2f\n" +
                "Salary per hour: %.2f\n", super.firstName, this.lastName, this.weekSalary, this.hoursPerDay, calculateSalaryPerHour(this.weekSalary, this.hoursPerDay));
    }
}

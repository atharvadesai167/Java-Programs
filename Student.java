enum Year {
    FY, SY, TY, BTECH
}

class Student {

    String prn;
    String name;
    Year year;
    String department;
    String division;
    String mobile;
    double percentage;


    // Default Constructor
    Student() {
        this.prn = "";
        this.name = "";
        this.year = Year.FY;
        this.department = "";
        this.division = "";
        this.mobile = "";
        this.percentage = 0.0;
    }


    // Constructor with PRN and Name
    Student(String prn, String name) {
        this.prn = prn;
        this.name = name;
    }


    // Constructor with all parameters
    Student(String prn, String name, Year year,
            String department, String division,
            String mobile, double percentage) {

        this.prn = prn;
        this.name = name;
        this.year = year;
        this.department = department;
        this.division = division;
        this.mobile = mobile;
        this.percentage = percentage;
    }


    public String toString() {
        return prn + " " + name + " " +
                year + " " +
                department + " " +
                division + " " +
                mobile + " " +
                percentage;
    }
}
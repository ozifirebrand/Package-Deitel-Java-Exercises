package ClassWork;

    public class Customer {

        /** This is a Customer table for airline reservation system
         * This Customer system is built mainly to help customers who wants to book
         * a flight...
         Here are th little things our Customer system should be able to do>>>>
         * -> Our Customer will have some attributes for booking a flight
         * >>>>> for instance a Customer might have ::: A register attribute: like--> "
         *
         * "firstName",
         * "email"
         * "lastName"
         * "phoneNumber"
         * "Age"
         * "Date of birth"
         * boolean (isActive)
         * boolean (modifiedForm)
         *
         * Then we should generate a test that create a Customer
         * The first test should be able to assertThat we can create a Customer
         *
         * After a user have been created we can assert that no two user can have
         * the same email and phone number:: Which means a user can not re-register
         * with one email and mobile number
         *
         * Then we can assert that if our Customer  is registering for the first time
         * The system should pop a message that say "Welcome dear user, we are happy to
         * have you here!!"
         *
         *
         * More features will be added as soon as this implementation is met...
         * Enjoy in your career....///
         **/

        private String firstName;
        private String lastName;
        private String mobile;
        private boolean isActive;
        private boolean modifiedForm;
        private int age;
        private String email;
        private String dob;


        public Customer(String firstName, String lastName, String mobile,
                        boolean isActive, boolean modifiedForm, int age,
                        String email, String dob) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.mobile = mobile;
            this.isActive = isActive;
            this.modifiedForm = modifiedForm;
            this.age = age;
            this.email = email;
            this.dob = dob;
            System.out.println("User has been created successfully " +
                    "in the database.");
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {

            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public boolean isActive() {
            return isActive;
        }

        public void setActive(boolean active) {
            isActive = active;
        }

        public boolean isModifiedForm() {
            return modifiedForm;
        }

        public void setModifiedForm(boolean modifiedForm) {
            this.modifiedForm = modifiedForm;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            if (email.isEmpty()){
                System.out.println("Email field can't be empty.");
            }

            else {
                if (email.contains("@gmail.com")) {
                    System.out.println(email);
                }

                else {

                    System.out.println("Email successfully updated");
                    System.out.println("email is " + email + "@gmail.com");
                }
            }
            this.email = email;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public Customer(){

        }


    }
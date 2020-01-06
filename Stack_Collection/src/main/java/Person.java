public class Person {

   private String lastName;
   private String firstName;
   private int age;
   private boolean sex;

   public Person() {
   }

   public Person(String lastName, String firstName, int age, boolean sex) {
      this.lastName = lastName;
      this.firstName = firstName;
      this.age = age;
      this.sex = sex;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public boolean isSex() {
      return sex;
   }

   public void setSex(boolean sex) {
      this.sex = sex;
   }

   @Override
   public String toString() {
      return "Person{" +
              "lastName='" + lastName + '\'' +
              ", firstName='" + firstName + '\'' +
              ", age=" + age +
              ", sex=" + sex +
              '}';
   }
}

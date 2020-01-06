public class Main {

    public static void main(String[] args) {

        BlackList blackList = new BlackList();
        blackList.add(BankDetails.class);
        blackList.add(BankDetails.class);
        blackList.add(IdDetails.class);
        System.out.println("---------------- Check BlackList --------");
        blackList.viewBlackList();
        Stack stack = new Stack(blackList);
        /* --------------- check 1 --------------------------------- */
        System.out.println("---------------- Check 1 ----------------");
        Car car1 = new Car("Toyota", "Corolla", 2015, "black");
        Person person1 = new Person("LastName1", "FirstName1", 30, false);
        IdDetails idDetails1 = new IdDetails("Kyiv, Str. Heroiv Dnipra, 1 / 0", 1234567897,
                "Passport ...");
        Student student1 = new Student("LastName2", "FirstName2", 25, true,
                225, 25, "FIOT-25", 1524);
        Person person2 = new Person("LastName3", "FirstName3", 26, true);
        stack.pushStack(car1);
        stack.pushStack(person1);
        stack.pushStack(idDetails1);
        stack.pushStack(student1);
        stack.pushStack(person2);
        stack.viewStack();
        System.out.println("---------- RESULT after Pull: -----------");
        stack.pullStack();
        stack.viewStack();
        /* ------------------ check 2 ------------------------------ */
        System.out.println("---------------- Check 2 ----------------");
        BankDetails bankDetails1 = new BankDetails("Ukraine", 123456789, "LastName",
                "FirstName", 2025, 1456);
        Person person3 = new Person("LastName4", "FirstName4", 19, false);
        Person person4 = new Person("LastName5", "FirstName5", 89, true);
        stack.pushStack(bankDetails1);
        stack.pushStack(person3);
        stack.pushStack(person4);
        stack.viewStack();
        System.out.println("---------- RESULT after 2 Pull: ----------");
        stack.pullStack();
        stack.pullStack();
        stack.viewStack();
    }

}

public class Condition {
  public static void main(String[] args) {
    int salary = 25400;
    if (salary > 10000) {
      salary = salary + 2000;
    } else {
      salary = salary + 1000;
    }
   System.out.println("Fina salray is: " + salary);



   /*
    * multiple if else statement
    * we can use when we have more than two condition
    */

    int seniorSalary = 40000;
    int bonus = 0;
    if (seniorSalary > 20000) {
         bonus += 2000;
    } else if (seniorSalary > 30000) {
         bonus += 4000;
    } else {
      bonus += 0;
    }

    System.out.println("Salary with 40000 bonus is - " + bonus);
  }
}
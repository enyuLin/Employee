/**
 * Classe per descriure les propietats i els comportaments d'un empleat.
 * @author Enyu Lin
 * @version 2014
 */
public class Employee {

   private String myName;
   private double mySalary;
   
   /**
    * Constructor que serveix per crear un nou objecte de tipus Employee.
    * @param name �s el nom que li passem per par�metre del constructor per instanciar un nou objcte que tingui aquest atribut.
    * @param salary �s el salari que li passem per par�metre del constructor per instanciar un nou objcte que tingui aquest atribut.
    */
   public Employee(String name, double salary) {
      myName = name;
      mySalary = salary;
   }
   
   /**
    * M�tode o getter per obtenir el atribut "myName", o sigui, el nom.
    * @return myName es retorna el nom d'aquest objecte de tipus Employee
    */
   public String getName() {
      return myName;
   }
   
   /**
    * M�tode o getter per obtenir la propietat "mySalari" , �s a dir, el salari.
    * @return mySalary es retorna el salari d'aquest objecte de tipus Employee
    */
   public double getSalary() {
      return mySalary;
   }
   
   /**
    * M�tode per augmentar el salari.
    * @param percent �s el tant per cent que li volem pujar el sou.
    */
   public void raiseSalary(int percent) {
      mySalary = mySalary +
         percent * 0.01 * mySalary;
   }
   
   /**
    * M�tode o setter per introduir el salari del treballador
    * @param salary �s el salari que li volem modificar del seu sou anterior.
    */
   public void setSalary(double salary) {
      mySalary = salary;
      // +++++
   }
   
   /**
    * Classe per retornar el nom i el salari d'un treballador en concret.
    */
   public String toString() {
      return "Name: " + getName() +
             ", Salary: " + getSalary();
   }
}
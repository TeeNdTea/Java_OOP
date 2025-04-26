// Task-1
public class UniversityTester{
  public static void main(String[]args){
    University u1 = new University();
    University u2 = new University();
    System.out.println(u1);
    System.out.println(u2);
    
    u1.name = "Imperial College London";
    u1.country = "England";
      
    u2.name = "XY University";
    u2.country = "Bangladesh";
    
    System.out.println(u1.name);
    System.out.println(u1.country);
    System.out.println(u2.name);
    System.out.println(u2.country);
  }
}

// Task-2
public class Student {
  public String name = "Bob";
  public int id = 1;
}

// Task-3
public class Test3 {
  public static void main(String[] args) {
      Circle circle = new Circle();
      double radius = circle.radius;
      System.out.println("Radius of the circle is " + radius);
      
      double pi = 3.1415;
      double area = pi * radius * radius;
      System.out.println("The area of the circle is " + area);
      
      double circumference = 2 * pi * radius;
      System.out.println("The circumference of the circle is " + circumference);
  }
}

//Task-4
public class Vehicle {
  public String type = "Car";
  public int wheels = 4;
  public String color = "White";
}


//Task-5
public class Tournament {
  public String name = null;
  public String sportsType = null;
  public int numberOfTeams = 0;
  public String[] teams = null;
}

//Task-6
public class ImaginaryNumber {
  public int realPart = 0;
  public int imaginaryPart = 0;
  public void printNumber() {
      System.out.println(realPart + " + " + imaginaryPart + "i");
  }
}


//Task-7
public class Cat {
  public String color="White";
  public String action="sitting";

  public void printCat() {
      System.out.println(color + " cat is " + action);
  }
}


//Task-8
public class Bird {
  public String name;
  public int altitude=0;

  public void makeNoise() {
      if (name == "Parrot") {
          System.out.println("Squawk");
      } else if (name == "Eagle") {
          System.out.println("Squee");
      }
  }

  // Method to fly up
  public void flyUp(int feet) {
      altitude += feet;
      System.out.println(name + " has flown up " + feet + " feet.");
  }

  public void flyDown(int feet) {
      if (altitude - feet < 0) {
          System.out.println(name + " cannot fly down " + feet + " feet.");
      } 
      else {
          altitude -= feet;
          if (altitude == 0) {
              System.out.println(name + " has flown down " + feet + " feet and landed.");
          } else {
              System.out.println(name + " has flown down " + feet + " feet.");
          }
      }
  }
}


//Task-9
public class CellPhone {
    
  public String model =  "unknown";
  public String[] contacts= new String[3];
  public int contactCount = 0;

  public void storeContact(String contact) {
      if (contactCount < 3) {
          contacts[contactCount] = contact;
          contactCount++;
          System.out.println("Contact Stored");
      } else {
          System.out.println("Memory full. New contact can't be stored.");
      }
  }
  public void printDetails() {
      System.out.println("Phone Model " + model);
      System.out.println("Contacts Stored " + contactCount);
      if (contactCount > 0) {
          System.out.println("Stored Contacts:");
          for (int i = 0; i < contactCount; i++) {
              System.out.println(contacts[i]);
          }
      }
  }
}

//task-10,11 are tracing of code. u can use java visualizer or python tutor to visualize the code
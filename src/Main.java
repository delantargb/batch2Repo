

import classes.Customer;

import classes.Employee;
import classes.MyMethods;
import classes.Person;

import javax.lang.model.element.Name;
import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {


/*
//ternary operator (?)
        Boolean bol = false;
        String bol1 = bol ? "bol this is true":"bol this is false";
        System.out.println(bol1);

//variables
     byte byteVar = 127;
     short MediumRangeDecimalVariable = 32767;
     int decimalVariableUpto = 2147483647;
     long longMin = -9223372036854775808L;
     long longMax = 9223372036854775807L;
     float withDec = 8.2f;
     double maxWithDec = 12312312.1232;
     boolean TorF = true;
     char singleChar = '\u2941';
     String name = "my name";
            System.out.println("      Varaibles ");
            System.out.println("Byte: " + byteVar);
            System.out.println("Short: " + MediumRangeDecimalVariable);
            System.out.println("Integer: " + decimalVariableUpto);
            System.out.println("Long Min: " + longMin);
            System.out.println("Long Max: " + longMax);
            System.out.println("Float: " + withDec);
            System.out.println("Double: " + maxWithDec);
            System.out.println("Boolean: " + TorF);
            System.out.println("Character: " + singleChar);
            System.out.println("String: " + name);
            System.out.println("");

//arrays
   int grades[] = new int[5];
     grades[0] = 75;
     grades[1] = 80;
     grades[2] = 90;
     grades[3] = 75;
     grades[4] = 80;
             System.out.println("     Arrays");
             System.out.println("Filipino: " + grades[0]);
             System.out.println("Math: "+ grades[1]);
             System.out.println("Science: " + grades[2]);
             System.out.println("English: " + grades[3]);
             System.out.println("PE: " + grades[4]);

   String errorMsgs[] = new String[3] ;
     errorMsgs[0] = "Error page not found";
     errorMsgs[1] = "Error invalid address";
     errorMsgs[2] = "Error invalid address";
             System.out.println(errorMsgs[0]);
             System.out.println(errorMsgs[1]);
             System.out.println(errorMsgs[2]);

//Using getters and setters
      Person personObj = new Person();
         personObj.setName("Gabriel");
         personObj.setGender(true);
         personObj.setAge(25);
         personObj.setWeight(116.50f);
         personObj.setHeight(176.784f);
         personObj.setEmail("delantargb@gmail.com");
      String name2 = personObj.getName();
      boolean gender2 = personObj.isGender();
      int age2 = personObj.getAge();
      float weight2 = personObj.getWeight();
      float height2 = personObj.getHeight();
      String email2 = personObj.getEmail();
                 System.out.println("Name: " + name2);
                 System.out.println("Age: " + age2);
                 System.out.println("Gender: " + gender2);
                 System.out.println("weight: " + weight2 + "kg");
                 System.out.println("Height: " + height2 + "cm");
                 System.out.println("email: " + email2);

//initiate Employee class values
      Employee employee1 = new Employee();
         employee1.setName("Oliver");
         employee1.setGender(true);
         employee1.setAge(25);
         employee1.setWeight(116.50f);
         employee1.setHeight(176.784f);
         employee1.setEmail("o_chavez@gmail.com");
         employee1.setEmployee_Id_no(881374);
         employee1.setDepartment("Technical");
         employee1.setSss_Id_no(8723);


//initiate Customer Class values
      Customer customer = new Customer();
         customer.setName("Karl");
         customer.setGender(true);
         customer.setAge(25);
         customer.setWeight(116.50f);
         customer.setHeight(176.784f);
         customer.setEmail("k_ambray@gmail.com");
         customer.setCustomer_Id(73873);
         customer.setMebership_Lvl(true);
         customer.setCretid_Card_No(398763627);

//Print Employee class
             System.out.println("        Employee");
             System.out.println("ID No: "+employee1.getEmployee_Id_no());
             System.out.println("Department: "+employee1.getDepartment());
             System.out.println("SSS ID No: "+employee1.getSss_Id_no());

//Print Customer class
             System.out.println("");
             System.out.println("");
             System.out.println("        Customer");
             System.out.println("Name: "+customer.getName());
             System.out.println("ID No: "+customer.getCustomer_Id());
             System.out.println("Premium user: "+customer.isMebership_Lvl());
             System.out.println("Credit card No: "+customer.getCretid_Card_No());
             System.out.println("");


//Polymorphism * Overwriting
             System.out.println("Hi I am an Employee " +"("+ employee1.intoduceYourself()+")");
             System.out.println("Hi I am a Customer " +"("+ customer.intoduceYourself()+")");
             System.out.println("");
             System.out.println("");


//Polymorphism * Overloading
             System.out.println("Hi I am an Employee " + employee1.intoduceYourself2(employee1.getName(), " from " + employee1.getDepartment()) + " Department");
             System.out.println("");
             System.out.println("Hi I am a Customer " + employee1.intoduceYourself2(customer.getName(), " I am a " + customer.isMebership_Lvl()) + " Premium user");
             System.out.println("");

//if conditioning
             int number = 1 ;
             int i ;
             i = number*3;

                if (i >= 3){
                             System.out.println( "Number " + i + " is GREATER than or EQUAL to 3");
                }
                else {
                             System.out.println( "Number " + i + " is LESS than 3");
                }


//test conditions
          String teacher[] = new String[5];
          teacher[0] = "Teacher1";
          teacher[1] = "teacher2";
          teacher[2] = "Teacher3";
          teacher[3] = "Teacher4";
          teacher[4] = "Teacher5";

         String subject[] = new String[5];
          subject[0] = "Math";
          subject[1] = "English";
          subject[2] = "Science";
          subject[3] = "Object Oriented Programing";
          subject[4] = "Server Maintenance";

//Input
              String day="Monday";


             if (day == "Monday"){
             System.out.println(day);
             System.out.println("Current Subject is MATH and " + teacher[0] + " has less than or equal to 15 students") ;
             System.out.println("");
            }
              else if (day=="Tuesday") {
               System.out.println("Day entered is " + day);
               System.out.println("Current Subject is Science and " + teacher[1] + " Has the same total students for all teachers") ;
               System.out.println("");
              }
              else {

               System.out.println("Entered day which is " + day + " has no teacher available");

              }


 //Vacation
            boolean wd; //weekend or weekday
            boolean ho;

            wd = false;
            ho = false;

              if(!wd || ho){
               System.out.println("Vacation");
                  }
              else{
               System.out.println("Not Vacation");
              }


                                       */
        /**students**/

/*
          boolean regularStudent;
          boolean workingStudent;

          regularStudent = true; //true for Regular
          workingStudent = true; //true for working


              if (workingStudent){
                     System.out.println("Working Students, Regular or Irregular");
                     System.out.println("6 Subjects");
              }
              else if (regularStudent) {
                     System.out.println("Regular Student Non-working");
                     System.out.println("7 Subjects");
              }
              else {
                     System.out.println("Irregular Students Non-working");
                     System.out.println("5 Subjects");
              }
        */
        /*        boolean regularStudent = true;
                boolean working = true;

                         System.out.println("Subjects: " + MyMethods.getMymethods(regularStudent, working));*/

        /*
                boolean isParTime = true;
                int isPar = 6;
                boolean isRegular = false;
                int getNum = getNum(isPar, isRegular, maxSub, minSub);

                String message;
                switch (isPar) {
                    case 1:
                        message = "regular/Irregular Student but working Part-time in school = " + getNum;
                        break;
                    default:
                        message = isRegular ? "Regular Student = " + getNum + "Subjects" : "Irregular Student";
                        break;

                }

//*/
//        System.out.println("");
//        MyMethods.getWhileMethod();



/*

        int in = 6;
        System.out.print(MyMethods.getPositive(in));
        */

/*
//DoWhile sample
                int doWhileIn = 9;
                int loopStarter = 1;
                MyMethods.getDoWhilesample(loopStarter, doWhileIn);*/
//do while returning a string
        /*        int in = 9;
                int start = 1;
                System.out.print(MyMethods.getAnotherDoWhile(start,in));*/


/*


//Forloop
        MyMethods.getForLoopsample(9);


/*
//for loop
        String myFriends[]={"Karl","Oliver","Joesil"};

        int numFriends = myFriends.length;
        int con        = myFriends.length - 1;

        System.out.print("My friends are ");
        for(int i=0 ; i < myFriends.length ; i++)
        {
            System.out.print(myFriends[i]);
            if( i < con ){
                System.out.print(",");
            }
            else {
                System.out.print(".");
            }

        }
*/

/**Random data from List**/

        List<String> boyFriends     = MyMethods.getMyFriends();
        List<String> relation       = MyMethods.getRelation();
        List<String> girlfriends    = MyMethods.getGirlfriends();
        List<String> allFriends     =  new ArrayList<String>();

        String randomBoyFriends     = boyFriends.get(new Random().nextInt(boyFriends.size()));
        String randomRelations      = relation.get(new Random().nextInt(relation.size()));
        String randomGirlFriends    = girlfriends.get(new Random().nextInt(girlfriends.size()));

        allFriends.add(randomBoyFriends);
        allFriends.add(randomGirlFriends);

        String randomAllFriends1    = allFriends.get(new Random().nextInt(allFriends.size()));
        String randomAllFriends2    = allFriends.get(new Random().nextInt(allFriends.size()));

            while (randomAllFriends1==randomAllFriends2){
                randomAllFriends1    = allFriends.get(new Random().nextInt(allFriends.size()));
                randomAllFriends2    = allFriends.get(new Random().nextInt(allFriends.size()));
            }
                System.out.println("=== randomFriend relation randomFriend ===");
                System.out.print(randomAllFriends1 + " " + randomRelations + " " + randomAllFriends2);







    }
}











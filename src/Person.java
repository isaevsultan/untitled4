public class Person {
    String name;
   byte age;
   long workSalary;
   long phonePrice;




  public Person(String name,byte age, long  workSalary,long phonePrice){
       this.name = name;
       this.age = age;
       this.workSalary= workSalary;
       this.phonePrice= phonePrice;

   }
   public void getInfo(){
       System.out.printf("""
               name %S
               age %d
               workSalary %d
               phonePrice %d
               """,name,age,workSalary,phonePrice);

   }
 public static void  MaxSalary(Person[] maxPrice){
      long max = maxPrice[0];
     for (int i = 0; i <maxPrice.length ; i++) {
         if(max<maxPrice[i]){
             max = maxPrice[i];
         }

     }
     System.out.println(" самая высокая зарпалта "+max);

 }
 public  static String  methodPhone(Person[] people){
      long minPhone = Integer.MIN_VALUE;
    for(Person person: people){
        if(person.phonePrice>minPhone)
        minPhone = person.phonePrice;


     }
    return "эн арзан phone "+minPhone;
 }


}

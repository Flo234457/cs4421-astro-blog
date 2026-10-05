public class studentFactory{
    public static void main(String[] args) {
        Student s2 = new Student(); 

        Student s1 = new Student("Emily",19,3.21);
         System.out.println("Name: " + s1.getName()+ " Age: "+ s1.getAge()+ "Gpa"+ s1.getGpa()); 

        class Student {
            private String name;
            private int age;
            private double gpa;
            public Student(String inName,int inAge,double inGpa ) {
        name = inName;
        age = inAge;
        gpa = inGpa;
          }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGpa() {
        return gpa;
    }
        
  

    
     }
    }
}
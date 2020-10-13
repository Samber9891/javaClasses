public class Pet {


//  begin empty constructure
// private String name = "Marty"; 
// private int age = 2; 
// private String loaction = "Kitchen"; 
// private String type = "goldendoodle"; 

// public Pet(){
// }

// end empty constructor

    private String name; 
    private int age; 
    private String location; 
    private String type; 

    public Pet(String name, int age, String location, String type){
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }



    public String getName() {
        return this.name;
     }
     public int getAge() {
         return this.age;
     }
       public String getLocation() {
         return this.location;  
     }

     public String getType() {
         return this.type;
     }
}


   

 
            
        

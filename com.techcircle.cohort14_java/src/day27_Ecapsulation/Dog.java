package day27_Ecapsulation;

public class Dog {
	
//	    Update Dog class by creating couple of constructors 
//	    and create 4 dog object
	//    
	    // instance Variables
	    private String breed;
	    private String name;
	    private int age;
	    private String size;
	    private String color;
		
	    
	    public String getBreed() {
			return breed;
		}
		public void setBreed(String breed) {
			this.breed = breed;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		@Override
		
		public String toString() {
			return "Dog [breed=" + breed + ", name=" + name + ", age=" + age + ", size=" + size + ", color=" + color
					+ "]";
		}
	
	    

	    
	    
	    //----
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    public Dog() {} // no args constructor
	    
	    
	    
	    public Dog(String breed, String name, int age , String size, String color) {
	        this.breed = breed;
	        this.name = name;
	        this.age = age;
	        this.size = size;
	        this.color = color;
	    }
	    
	    public void eat() {
	        System.out.println(name + " is eating ");
	    }
	    
	    
	    public void sit() {
	        System.out.println(name + " is sitting ");
	    }
	    
	    public void bark() {
	        System.out.println(name + " is barking ");
	    }
	    
	    public void play() {
	        System.out.println(name + " is playing ");
	    }
	    
	    public void wagTail() {
	        System.out.println(name + " is wagging its tails");
	    }
	    
	    public void introduce() {
	        System.out.println("Hi  wooff wwoof");
	        System.out.println("My name is "+ name+".");
	        System.out.println("I'm am a "+ breed+" I'm "+age +" years old");
	    }
	     
	    
	    
	
}

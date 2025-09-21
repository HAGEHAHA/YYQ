public class Student{
	private String Id;
	private String Name;
    private int Age;

    public Student(String Id,String Name,int Age){
    	this.Id=Id;
    	this.Name=Name;
    	this.Age=Age;
    };
    public void setId(String id){
        this.Id=Id;
    }
    public String getId(){
    	return Id;
    }
     public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
    	return Name;
    }
     public void setAge(int Age){
        this.Age=Age;
    }
    public int getAge(){
    	return Age;
    }
    

}
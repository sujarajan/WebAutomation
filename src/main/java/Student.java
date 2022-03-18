
public class Student  {
	
	String name;
	int age;
	
	public Student(String name,Integer age) {
		this.name=name;
		this.age=age;
	}
	
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	
	@Override
	public String toString() {
		
		return this.name+" "+this.age;
	}

	public int compareTo(Object s) {
		
		if(this.getage()>=((Student) s).getage())
		return 1;
		else 
		return -1;

	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
		return true;
		if(obj==null||this.getClass()!=obj.getClass())
		return false;
		
		Student s=(Student) obj;
		
		return this.name.equals(s.name) && this.age==s.age;
		
	}

	@Override
	public int hashCode() {
		
		return this.name.length()%10;
	}

  

}

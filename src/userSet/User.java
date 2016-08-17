package userSet;

public class User implements Comparable<User> {
private String name;
private String lastName;
private String fatherName;
private Integer age;
public  User(String name,String lastName,String fatherName, int age){
	this.name=name;
	this.lastName=lastName;
	this.fatherName=fatherName;
	this.age=age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
public Integer getAge() {
	return age;
}
public int compareTo(User o)
{
    if ( this.age > o.age) {
    	return 1;
    }
    else return 0;

}
public String toString() {
	return "User [name=" + name + ", lastName=" + lastName + ", fatherName=" + fatherName + ", age=" + age + "]";
}


}

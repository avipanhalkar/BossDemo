package constructor;

public class StudentClass {
	String snm;
	StudentClass(){
		snm="Unkown";
		System.out.println("If name not passed->"+snm);
		}
	StudentClass(String snm){
		this.snm=snm;
		System.out.println("If name is passed->"+snm);
	}
public static void main(String[] args) {
	StudentClass s=new StudentClass();
	StudentClass ss=new StudentClass("avi");
}
}

class Student{
	int index;
	String ime;
	static String fakultet = "Воена Академија";// staticna promenliva
	
	Student(int r,String n){
		index =r;
		ime =n;
	}
	void display() {
		System.out.println(index+ "" + ime + "" + fakultet);
	}
	public static void main(String[]args) {
		Student s1 = new Student(1400," Незири ");
		Student s2 = new Student(1488," Ибиши ");
		
		s1.display();
		s2.display();
	}
}
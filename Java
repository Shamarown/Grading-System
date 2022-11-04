import java.util.Scanner;

class Student {
    private String name, subject, course;
    public double prelim, midterm, finalGrade, average;
    public int id, age;
    
    // setter
    public void setStudentDetails(int Id, String Name, double Prelim, double Midterm, double FinalGrade, int Age, String Subject, String Course) {
        this.id = Id;
        this.name = Name;
        this.prelim = Prelim;
        this.midterm = Midterm;
        this.finalGrade = FinalGrade;
        this.average = Math.round(((Prelim + Midterm + FinalGrade) / 3) * 100.0) / 100.0;
        this.age = Age;
        this.subject = Subject;
        this.course = Course;
    }
    
    // getters  
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getPrelim() {
        return this.prelim;
    }
    
    public double getMidterm() {
        return this.midterm;
    }
    
    public double getFinal() {
        return this.finalGrade;
    }
    
    public double getAverage() {
        return this.average;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getSubject() {
        return this.subject;
    }
    
    public String getCourse() {
        return this.course;
    }
    
    public void display(int index) {
        System.out.println("\nRECORD #" + (index+1));
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Course : " + course);
        System.out.println("Prelim : " + prelim);
        System.out.println("Midterm: " + midterm);
        System.out.println("Final  : " + finalGrade);
        System.out.println("Average: " + average);
    }
    
}

class GradingSystem {
    
    public static void main(String[] args) {
        
        String name, subject, course;
        double prelim, midterm, finalGrade;
        boolean flag = true;
        int choice, i=5, id, age;
        
        Student[] students = new Student[20];
        
        students[0] = new Student();
        students[0].setStudentDetails(1, "Manny Pacquiao", 94, 95, 96, 42, "Programming 101", "BSIT");
        students[1] = new Student();
        students[1].setStudentDetails(2, "Ferdinand Marcos", 93, 98, 96, 52, "Programming 102", "BSCS");
        students[2] = new Student();
        students[2].setStudentDetails(3, "Leni Robredo", 89, 90, 99, 50, "Programming 103", "BSIT");
        students[3] = new Student();
        students[3].setStudentDetails(4, "Ping Lacson", 91, 95, 97, 60, "Programming 101", "BSCS");
        students[4] = new Student();
        students[4].setStudentDetails(5, "Isko Moreno", 94, 92, 93, 42, "Programming 102", "BSIT");
        
        
        Scanner sc = new Scanner(System.in);
        
        while(flag) {
            System.out.println("\n== STUDENT GRADING SYSTEM ==");
            System.out.println("[1] Add Data");
            System.out.println("[2] Edit/Update Data");
            System.out.println("[3] Delete Data");
            System.out.println("[4] Display All Data");
            System.out.println("[5] Exit");
            System.out.print("Select: ");
           
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("\nADD NEW INFO:\n");
                   
                    System.out.print("Enter Student ID   : ");
                    id = sc.nextInt();
                    
                    sc.nextLine();
                    System.out.print("Enter Student Name : ");
                    name = sc.nextLine();
                    
                    System.out.print("Enter Student Age  : ");
                    age = sc.nextInt();
                    
                    sc.nextLine();
                    System.out.print("Enter Subject      : ");
                    subject = sc.nextLine();
                   
                    System.out.print("Enter Course       : ");
                    course = sc.nextLine();
                    
                    System.out.print("Enter Prelim Grade : ");
                    prelim = sc.nextDouble();
                    
                    System.out.print("Enter Midterm Grade: ");
                    midterm = sc.nextDouble();
                    
                    System.out.print("Enter Final Grade  : ");
                    finalGrade = sc.nextDouble();
                    
                    students[i] = new Student();
                    students[i].setStudentDetails(id, name, prelim, midterm, finalGrade, age, subject, course);
                   
                    System.out.println("\nNew Student Record Added Successfully!\n");
                    i++;
                    break;
                
                case 2:
                    // check if students array is empty
                    if(i == 0) {
                        System.out.println("\nNo Available Data Yet!\n");
                    } else {
                    				boolean found = false;
                    				int idx = 0;
                    				System.out.print("\nEnter Student Id to Edit: ");
                    				id = sc.nextInt();
                    
                    				for(int x=0; x<i; x++) {
                        					if(students[x].id == id) {
                            						Student s = students[x];
                            						System.out.println("\nID     : " + s.getId() + "\nName   : " + s.getName() + "\nAge    : " + s.getAge() + "\nSubject: " + s.getSubject() + "\nCourse : " + s.getCourse() + "\nPrelim : " + s.getPrelim() + "\nMidterm: " + s.getMidterm() + "\nFinal  : " + s.getFinal() + "\nAverage: " + s.getAverage() + "\n");
                            						found = true;
                            						idx = x;
                            						break;
                        					}
                    				}
                    
                    				if(found) {
                        				 System.out.println("\nUPDATE:");
                        					System.out.print("Enter Student Id   : ");
                        					int newId = sc.nextInt();
                        		   
                        					sc.nextLine();
                        				 System.out.print("Enter Student Name : ");
                        					name = sc.nextLine();
                        					
                        					System.out.print("Enter Student Age  : ");
                        					age = sc.nextInt();
                        
                        					sc.nextLine();
                        					System.out.print("Enter Subject      : ");
                        					subject = sc.nextLine();
                        
                        					System.out.print("Enter Course       : ");
                        					course = sc.nextLine();
                        
                        					System.out.print("Enter Prelim Grade : ");
                        					prelim = sc.nextDouble();
                        					
                        					System.out.print("Enter Midterm Grade: ");
                        					midterm = sc.nextDouble();
                        					
                        					System.out.print("Enter Final Grade  : ");
                        					finalGrade = sc.nextDouble();
                        
                        					students[idx].setStudentDetails(newId, name, prelim, midterm, finalGrade, age, subject, course);
                        					System.out.println("\nStudent Record Updated Successfully!\n");
                    					} else {
                        					System.out.println("\nStudent Record with id " + id + " not found!\n");
                    					} 
                				}
                    
                    break;
                
                case 3:
                    // check if students array is empty
                    if(i == 0) {
                        System.out.println("\nNo Available Data Yet!\n");
                    } else {
                    		boolean found = false;
                    		int idx = 0, j = 0;
                    
                    		// ask user to enter student id they want to delete
                    		System.out.print("\nEnter Student Id to Delete: ");
                    		id = sc.nextInt();
                    
                    		// loop thru array of students to find the id
                    		for(int x=0; x<i; x++) {
                        		if(students[x].id == id) {
                            		Student s = students[x];
                            		System.out.println("\nID     : " + s.getId() + "\nName   : " + s.getName() + "\nAge    : " + s.getAge() + "\nSubject: " + s.getSubject() + "\nCourse : " + s.getCourse() + "\nPrelim : " + s.getPrelim() + "\nMidterm: " + s.getMidterm() + "\nFinal  : " + s.getFinal() + "\nAverage: " + s.getAverage() + "\n");
                            		found = true;
                            		idx = x;
                            		break;
                        		}
      	              		}
                    
                    		if(found) {
                       		System.out.print("\nDelete this record? y/n  ");
                        	char confirm = sc.next().charAt(0);
                        	
                        	// check if user entered y or Y
                        	if(confirm == 'y' || confirm == 'Y') {
                          		for(int x=0; x<i; x++) {
                                if(students[x].id != id) {
                                    students[j] = students[x];
                                    j++;
                                }
                            } 
                            System.out.println("\nStudent Record Deleted Successfully!\n");
                            i = j;
                        	}
                    		} else {
                       		System.out.println("\nStudent Record with id " + id + " not found!\n"); 
                    		}
                				}
                    
                    break;
                
                case 4:
                    // check if student array is empty
                    if(i == 0) {
                        System.out.println("\nNo Available Data Yet!\n");
                    } else {
                    			 for(int x=0; x<i; x++) {
                        				Student s = students[x];
                        				s.display(x);
                    				}
                				}
                    
                    break;
                
                case 5:
                    System.out.println("\nProgram Terminating...\n");
                    flag = false;
                    break;            
                default:
                    System.out.println("\nSelect only from 1-4.\n");
                    break;
            }
        }
    }
    
}

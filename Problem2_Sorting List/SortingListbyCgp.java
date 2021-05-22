Import java.Util.*;

Class pupil
   non-public int identification;
   personal String fname;
   non-public double cgpa;
   public student(int identity, String fname, double cgpa) 
      fantastic();
      this.Id = identification;
      this.Fname = fname;
      this.Cgpa = cgpa;
   
   public int getId() 
      go back id;
   
   public String getFname() 
      return fname;
   
   public double getCgpa() 
      return cgpa;
   


Public class JavaSort

   public static void essential(String[] args)
      Scanner in = new Scanner(device.In);
      int testCases = Integer.ParseInt(in.NextLine());
      
      listing<Student> studentList = new ArrayList<Student>();
      even as(testCases>zero)
         int identity = in.NextInt();
         String fname = in.Subsequent();
         double cgpa = in.NextDouble();
         
         scholar st = new pupil(identity, fname, cgpa);
         studentList.Add(st);
         
         testCases--;
      
       Collections.Sort(studentList, new Comparator<Student>() 
              @Override
               public int evaluate(student s1, pupil s2) 
                    if(s2.GetCgpa()>s1.GetCgpa())
                        go back 1;
                    else if(s2.GetCgpa()<s1.GetCgpa())
                        go back -1;
                    
                    return s1.GetFname().CompareTo(s2.GetFname());
                
        );
      
         for(student st: studentList)
         gadget.Out.Println(st.GetFname());
      
   

 class Employee {
    int empid;
    String empname;
    int empSalary;
 
    void setempid(int id){
        empid=id;
    }
    void setempName(String name){
        empname= name;
    }
     void setempSalary(int sal){
        empSalary= sal;
    }
    int getempid(){
        return empid;
    }
    String getempname(){
        return empname;
    }
    int getempSalary(){
        return empSalary;
    }
    static Employee getEmployeeDetails(int empid,String empname,int empSalary){
        Employee e1= new Employee();
         e1.setempid(empid);
        e1.setempName(empname);
        e1.setempSalary(empSalary);
        return e1;
    }



    }


 
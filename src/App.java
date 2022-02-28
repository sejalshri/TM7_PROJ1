public class App {
    public static void main(String[] args) throws Exception {
        int[] id={1001,1002,1003,1004,1005,1006,1007};
        String[] name={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
        String[] JoiningDate={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
        char[] code={'e','c','k','r','m','e','c'};
        String[] dept={"R&D","PM","Acct","FrontDesk","Engg","Manufacturing","PM"};
        int[] basic={20000,30000,10000,12000,50000,23000,29000};
        int[] HRA={8000,12000,8000,6000,20000,9000,12000};
        int[] IT={3000,9000,1000,2000,20000,4400,10000};
        int index=Integer.parseInt(args[0])-1001;
        if(Integer.parseInt(args[0])<1001 || Integer.parseInt(args[0])>1007){
            System.out.println("There is no employee with emplyee id : "+Integer.parseInt(args[0]));
        }
        else{
            int emp_id=id[index];
            String emp_name=name[index];
            String department=dept[index];
            char c=code[index];
            String designation="";
            int DA=0;
            switch(c){
                case 'e':
                designation="Engineer";
                DA=20000;
                break;
                case 'c':
                designation="Consultant";
                DA=32000;
                break;
                case 'k':
                designation="Clerk";
                DA=12000;
                break;
                case 'r':
                designation="Receptionist";
                DA=15000;
                break;
                case 'm':
                designation="Manager";
                DA=40000;
                break;
            }
            int salary=basic[index]+HRA[index]+DA-IT[index];
            String[][] answer=new String[5][2];
            answer[0][0]="Emp No. = ";
            answer[1][0]="Emp Name = ";
            answer[2][0]="Department = ";
            answer[3][0]="Designation = ";
            answer[4][0]="Salary = ";
            answer[0][1]=Integer.toString(emp_id);
            answer[1][1]=emp_name;
            answer[2][1]=department;
            answer[3][1]=designation;
            answer[4][1]=Integer.toString(salary);
            for(int i=0;i<5;i++){
                for(int j=0;j<2;j++){
                    System.out.print(answer[i][j]+"\t");
                }
                System.out.println("\n");
            }
        }
    }
}

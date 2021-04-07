public class Date {
    int year;
    int day;
    int month;



    public void setDate(int ye,int mo,int da){
        year=ye;
        month=mo;
        day=da;
              

    }
    public void setMonth(int m){
       month=m;

    }

    public void setYear(int y){
      year=y;

    }
    public void setDay(int d){
    day=d;

    }
    
    public void printDate(){
      

        System.out.println(year+"-"+month+"-"+day);

    }
}

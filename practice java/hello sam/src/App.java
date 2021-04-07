class Tox{
    int length;
    int width;
    int height;    
      
    public void setLength(int l){
        length=l;
    }
    public void setWidth(int w){
        width=w;
    }
    public void setHeight(int h){

        height=h;
    }


    public void setSize(int l, int w, int h){
        length=l;
        width=w;
        height=h;
    }
    
    public void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume of the box : "+volume);
    }
    
    public void printArea(){
        int area;
        area=2*length*width+2*length*height+2*width*height;         
        System.out.println("Area of the box : "+area);
    }
    public int getVolume(){
        int v;
        v=length*width*height;
          return v;
    }
    public int getArea(){
        int a;
        a=2*length*width+2*length*height+2*width*height;  
        return a;
    }
}
class App{
    public static void main(String args[]){
        Tox b1=new Tox();
        b1.setSize(12,5,3);
        b1.printVolume();
        b1.printArea();
        
        b1.setLength(120);
        b1.setWidth(50);
        b1.setHeight(30);
        
        int vol;
        vol=b1.getVolume();
        System.out.println("New volume of the box : "+vol);
        
        int area;
        area=b1.getArea();
        System.out.println("New area of the box : "+area);
    }
}

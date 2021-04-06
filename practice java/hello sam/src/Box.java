public class Box {
    
    double radius;
    double length;
public void setSize(double r,double l){
    radius=r;
    length=l;
    
    
}
public void printVolume(){
    
      double volume;
    volume=Math.PI *radius*radius*length;
    System.out.println("Volume of the Cylinder : "+volume);
}

public void printArea(){
     double area;
    area=2*Math.PI*radius*radius+2*Math.PI*radius*length;
    System.out.println("Area of the Cylinder : "+area); 
    
}

}

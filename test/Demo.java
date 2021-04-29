class Box{
    int length;
    int width;
    int height;
    
    Box(){
        length=0;
        width=0;
        height=0;
    }
   
}
class Demo{
    public static void main(String args[]){
        Box b1=new Box();
       
        
        System.out.println("Length of b1 object : "+b1.length); //0
        System.out.println("Width  of b1 object : "+b1.width);    //0
        System.out.println("Height of b1 object : "+b1.height);    //0
      
    }
}



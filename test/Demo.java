class Box{
    int length;
    int width;
    int height;
    
    public void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume of the box is : "+volume);
    }
    public void setSize(int length, int width, int height){
         this.length=length;
         this.width=width;
         this.height=height;
    }
}
class Demo{
    public static void main(String args[]){
        Box b1=new Box();
        b1.setSize(12,5,3);
        
        System.out.println("Length of b1 object : "+b1.length); //0
        System.out.println("Width  of b1 object : "+b1.width);    //0
        System.out.println("Height of b1 object : "+b1.height);    //0
        b1.printVolume();    //0
    }
}



class Box{
    int length;
    int width;
    int height;
    
    public Box(int length, int width, int height){ //Parameterized constructor
        this.length=length;
        this.width=width;
        this.height=height;
    }    
    public Box(int length){ //Parameterized constructor
        this.length=length;
        this.width=length;
        this.height=length;
    }    
    public Box(){
        length=1;
        width=1;
        height=1;
    }
    public void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume of the box is : "+volume);
    }

}

class Demo{
    public static void main(String args[]){
        Box b1=new Box(12,5,3);
        Box b2=new Box(10);
        Box b3=new Box();

        b1.printVolume();
        b2.printVolume();
        b3.printVolume();
        
    }
}

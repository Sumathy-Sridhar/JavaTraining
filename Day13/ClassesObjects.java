public class ClassesObjects {
    int BookId;
    String Bookname;

    ClassesObjects(int BookId,String Bookname){
        this.BookId=BookId;
        this.Bookname=Bookname;
    }
    void display(){
        System.out.println("Book Id: "+BookId);
        System.out.println("Book Name: "+Bookname);
        System.out.println("");
    }
    public static void main(String[] args){
        ClassesObjects cob1=new ClassesObjects(12354588,"Can Love happen twice?");
        ClassesObjects cob2=new ClassesObjects(254074,"One Indian girl");
        ClassesObjects cob3=new ClassesObjects(8693464,"Everyone has a story");
        cob1.display();
        cob2.display();
        cob3.display();        
    }
    
}

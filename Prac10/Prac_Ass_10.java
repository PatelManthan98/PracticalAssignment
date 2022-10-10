package Prac10;

public class Prac_Ass_10
{
    public static void main(String[] args) {
        ComparableSquare s1 = new ComparableSquare(200);
        ComparableSquare s2 = new ComparableSquare(150);
        if(s1.compareTo(s2)>0){
            System.out.println("s1 is larger than s2");
        }
        else if(s1.compareTo(s2)<0){
            System.out.println("s2 is larger than s1");
        }
        else{
            System.out.println("s1 is equal to s2");
        }
    }
}

package Prac11;
public class Triplet<s1,s2,s3>
{
    private s1 first;
    private s2 second;
    private s3 third;

    Triplet(s1 first,s2 second,s3 third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
    public String toString()
    {
        return "["+first+","+second+","+third+"]";
    }
}

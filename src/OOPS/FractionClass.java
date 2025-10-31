package OOPS;
class Fraction{
    int num;
    int den;
    Fraction(int num,int den){
        this.num=num;
        this.den=den;
        simplify();
    }
    void print(){
        System.out.println(num+"/"+den);
    }
    void add(Fraction f){
        num=num *f.den + den*f.num ;
        den=den *f.den;
        simplify();
    }
    void multiply(Fraction f){
        this.num=num *f.num;
        this.den=den *f.den;
        simplify();
    }
    void divide(Fraction f){
        this.num=num *f.den;
        this.den=den *f.num;
        simplify();
    }
    void simplify(){
        int gcd=hcf(num,den);
        num=num/gcd;
        den=den/gcd;
    }
    int hcf(int a,int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1=new Fraction(4,8);
        f1.print();
        Fraction f2=new Fraction(2,16);
       f1.add(f2);
        f1.print();
        f1.multiply(f2);
        f1.print();
        f1.divide(f2);
        f1.print();
        Fraction f3=new Fraction(50,100);
        f3.print();
    }
}

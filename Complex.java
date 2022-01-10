class Complex
{  

 int real;
 int imeg;
 
 public Complex()
 {
 	real=imeg=0;
 }
 public Complex(int r,int i)
 {
 	real=r;
	imeg=i;
 }
 public void setReal(int r)
 {
    real = r;
 }
 public void setImeg(int i)
 {
 	imeg =i;
 }
 public int getReal()
 {
 	return real;
 }
 public int getImeg()
 {
 	return imeg;
 }
 public Complex addComplex(Complex c1,Complex c2)
 {
    Complex sum = new Complex();
	sum.real=c1.real+c2.real;
	sum.imeg=c1.imeg+c2.imeg;
	return sum;
	
 }
 public Complex minusComplex(Complex c1,Complex c2)
 {
    Complex minus = new Complex();
	minus.real=c1.real-c2.real;
	minus.imeg=c1.imeg-c2.imeg;
	return minus;
}
public void printComplex()
{
    if (this.imeg<0)
	   System.out.println(this.real + ""+ this.imeg+"i");
	else
	   System.out.println(this.real +"+" + this.imeg+"i");
}
 
public static void main (String[] args)
{
   Complex c1=new Complex(3,4);
   Complex c2=new Complex(2,9);
   
   Complex sum=new Complex();
   Complex minus=new Complex();
   
   sum=sum.addComplex(c1,c2);
   minus=minus.minusComplex(c1,c2);

   System.out.println("Sum: ");
   sum.printComplex();
   
   System.out.println("\nminus: ");
   minus.printComplex();

}

}
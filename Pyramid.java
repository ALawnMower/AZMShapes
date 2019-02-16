import java.lang.Math.*;

class Pyramid {
  double l;
  double w;
  double h;

  public Pyramid(int l, int w, int h) {
    this.l = l;
    this.w = w;
    this.h = h;
  }

  public double getVolume(){
    double volVal;
    return volVal = (l*w*h)/3;
  }

  public double getSurfArea(){
    double SurfVal;
	//return SurfVal = 2;
     double p1 = ((l*w));
     //double p2a = (w/2);
	 //double p2b = (Math.pow(h,2));
	 //double p2c = Math.sqrt((p2a+p2b));
	 double p2 = l * ( Math.sqrt( Math.pow( (w/2),2) + Math.pow(h,2) ) );
	 //double p3 = w;
     double p3 = w * ( Math.sqrt( Math.pow( (l/2),2) + Math.pow(h,2) ) );
	 //System.out.println("p1 =" + p1);
     //System.out.println("p2a =" + p2a);
	 //System.out.println("p2b =" + p2b);
	 //System.out.println("p2c =" + p2c);
	 //System.out.println("p2 =" + p2);
     //System.out.println("p3 =" + p3);
	 //System.out.println("p4 =" + p4);
     //double f1 = (p1 + p2);
     //double f2 = (p3 * p4);
     //System.out.println("f1 =" + f1);
     //System.out.println("f2 =" + f2);

    //return SurfVal = (l*w)+l)*Math.sqrt((Math.pow((w/2),2)+Math.pow((h),2)+w)*sqrt(Math.pow((l/2),2)+Math.pow((h),2));
    //return SurfVal = (l*w)+l)*Math.sqrt((Math.pow((w/2),2)+Math.pow((h),2)+w)*sqrt(Math.pow((l/2),2)+Math.pow((h),2));
    //return SurfVal = (l*w)+l)*Math.sqrt((Math.pow((w/2),2)+Math.pow((h),2)+w)*sqrt(Math.pow((l/2),2)+Math.pow((h),2));
    //return SurfVal = (l*w)+l)*Math.sqrt((Math.pow((w/2),2)+Math.pow((h),2)+w)*sqrt(Math.pow((l/2),2)+Math.pow((h),2));
    //return SurfVal = (l*w)+l)*Math.sqrt((Math.pow((w/2),2)+Math.pow((h),2)+w)*sqrt(Math.pow((l/2),2)+Math.pow((h),2));
    
	//return (p1*p2);
	//return(p3*p4);
	return(p1 + p2 + p3);
	//return (f1+f2);
	
  }
}
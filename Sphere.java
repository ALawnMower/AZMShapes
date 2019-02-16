import java.lang.Math.*;


class Sphere {

  double r;

  public Sphere(double r) {

    this.r = r;

  }

  public double getVolume(){
    double volVal;
    return volVal = 4*(Math.PI)*Math.pow(r,3)/3;
	
  }

  public double getSurfArea(){
    double SurfVal;
    return SurfVal = (4)*(Math.PI)*Math.pow(r,2);

  }
}
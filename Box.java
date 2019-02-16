import java.lang.Math.*;


class Box {

  int l;

  int w;

  int h;
  //constructor
  public Box(int l, int w, int h) {

    this.l = l;

    this.w = w;

    this.h = h;


  }

  

public double getVolume(){

    double volVal;

    return volVal = (l*w*h);
  } 
  public double getSurfArea(){

    double SurfVal;

    return SurfVal = (2*h*w) + (2*h*l) + (2*w*l);


  }
}
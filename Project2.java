class Main {
  public static void main(String[] args) {
    double M1= createRand(0,10);
      System.out.println("M1 is : "+M1);
   double M2= createRand(0,10);
      System.out.println("M2 is : "+M2);
   double M3= createRand(0,10);
      System.out.println("M3 is : "+M3);
   double myu1= createRand(0,0.5);
      System.out.println("Myu1 is : "+myu1);
   double myu2= createRand(0,0.5);
      System.out.println("Myu2 is : "+myu2);
   double myu3= createRand(0,0.5);
      System.out.println("Myu3 is : "+myu3);
   double F= createRand(-300,300);
      System.out.println("F is : "+F);

    for (int t = 1;t<=25;t+=5)
            {
                System.out.println("TIME= "+ t);
                results(M1,M2,M3,myu1,myu2,myu3,F,t);

            }

  }



  public static double createRand(double min, double max){ // just in case we want to try random values
        if(min >= max){
            System.out.println("Wrong arguments");
        }
        double random = min + Math.random() * (max - min);
        return random;
    }
    public static void results(double M1, double M2, double M3, double myu1, double myu2, double myu3, double F, double t)
        {
            double x1, x2, x3, y3;
            int g=10;

            double T = M2*g+myu2*M2*g;

           double a1 = (F-myu1*(M1*g+M2*g+T)-T)/(M1-M3);
           double a2 = T/M2+myu2*g;
           double a3 = T/M3-g-myu3*a1;

            x1 = a1*t*t/2;
            x2 = a2*t*t/2;
            x3 = x1;

            y3 =  a3*t*t/2;

            System.out.println("x of M1 :"+x1);
            System.out.println("x of M2 :"+x2);
            System.out.println("x of M3 :"+x3);
            System.out.println("y of M3 :"+y3);
            System.out.println("y of M1 and M2 stay the same");
        }
}


  

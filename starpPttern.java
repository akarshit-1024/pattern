class Main {
  //Inverted Rotated half peramind
  public staic void invertedRotatedHalfPeramind(int n){
    for(int i=0;i<n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
  };
  //hollow rectange
  public static void hollowRectangel(int n){
    for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
               if(i==1||i==n||j==1||j==n){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();  
       }
  };
  //Inverted half peramind with number
  public static void invertedHalfPeramind(int n){
     for(int i=0;i<n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(j+" ");
           }
           System.out.println();
       }
  };
  //floyd's tringle pattern
  public static void floydTringel(int n){
    int counter=1;
    for(int i=0;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(counter+" ");
               counter++;
           }
           System.out.println();
       }
  };
  // 0-1 tringle pattern
  public static void zeroOnePattern(int n){
    for(int i=0;i<n;i++){
           for(int j=0;j<=i;j++){
               if((i+j)%2==0){
                   System.out.print("1 ");
               }
               else{
                   System.out.print("0 ");
               }
           }
           System.out.println();
       }
  };
  //butter fly pattern
  public static void butterFly(int n){
    for(int i=0;i<n;i++){
           for(int j=0;j<=i;j++){
               System.out.print("*");
           }
           for(int j=0;j<=2*(n-i-1);j++){
               System.out.print(" ");
           }
           for(int j=0;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       for(int i=n;i>=1;i--){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           for(int j=0;j<=2*(n-i);j++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
  };
  //solid rhombus pattern
  public static void solidRhombus(int n){
    for(int i=1;i<=n;i++){
           for(int j=n-i;j>=1;j--){
               System.out.print(" ");
           }
           for(int j=1;j<=n;j++){
               System.out.print("*");
           }
           System.out.println();
       }
  };
  //hollow rhombus pattern
  public static void hollowRhombus(int n){
    for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j=1;j<=n;j++){
               if(i==1||i==n||j==1||j==n){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
           
       }
  };
  public static void main(String args[]) {
       hollowRhombus(5);
    }
}














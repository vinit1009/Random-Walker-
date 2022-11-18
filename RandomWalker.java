public class RandomWalker{
    public static void main(String[] args){

    int N = Integer.parseInt(args[0]);

    double nextStep = 0;
    double distance = 0;
    int x = 0;
    int y = 0;
    System.out.println("(0,0)");

    for (int j = 0; j < N; j++){
        
        
        nextStep = Math.random();
        if (nextStep < 1.0/4.0){
            x = x+1;
        }
        else if (nextStep < 2.0/4.0){
            x = x-1;
        }
        else if (nextStep < 3.0/4.0)
        {
            y = y+1;
        }        
        else if (nextStep < 4.0/4.0)
        {
            y = y-1; 
        }       
        

        System.out.println("("+x+","+y+")");
        


        
         

        
        //System.out.println("Sqrt of N is " + Math.sqrt(N));

    }
    distance = (x * x) + (y * y);
    System.out.println("Squared distance = " + distance);
    
    }
}
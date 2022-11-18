public class FindDuplicate {
    public static void main(String[] args){
        int a[] = new int[args.length];
        boolean a1 = false;

        for (int i = 0; i < args.length; i++){
            a[i] = Integer.parseInt(args[i]);
        }

        for ( int i = 0; i < a.length; i++){
            for( int j = i; j < a.length; j++){
                if ((a[i] == a[j])&&(i != j)){
                    a1 = true;
                }
                
                 
            }
        }
        System.out.print(a1);
    }
}
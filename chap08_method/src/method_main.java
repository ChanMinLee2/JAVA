public class method_main {
    public static void main(String[] args) {
        for(String s : args)
        {
            System.out.println(s);
        }

        // main argument switch 
        if (args.length == 1) {
            switch (args[0]) {
                case 1:
                    System.out.println("menu 1");
                    break;
            
                case 2:
                    System.out.println("menu 2");
                    break;

                case 3:
                    System.out.println("menu 3");
                    break;
                default:
                    break;
            }
            
        }
    }
    
}
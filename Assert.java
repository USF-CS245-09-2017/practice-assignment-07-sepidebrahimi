//Sepid Ebrahimi, CS245


public class Assert {

    //checks if the condition is out of bound
    public static boolean not_false (boolean cond){
        if (!cond) {
            return true;
        }
        throw new ArrayIndexOutOfBoundsException("Error");
    }
}

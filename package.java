/*
 Chinmayi V S
 CSE A , Roll No : 63
 */

class Age extends Exception
{
    Age()
    {
        super();
    }
}
class User 
{
    public static void main(String[] args)
    {
        Age a1=new Age();
        int a=Integer.parseInt(args[0]);
        if(a<18)
        {
            try
            {
                throw a1;
            }
            catch(Age A)
            {
                System.out.println("invalid...");
            }
        }    
    }
}
/*
 javac User.java
 java User 17
invalid...
 */

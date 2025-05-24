package week1.day1;

public class LearnJavaOperators {

	public static void main(String[] args) {
		//Assignment operator
		//Arithmetic Operator
		//Logical operator
		//Increment/Decrement Operator
		
		//Assignment - Assigning a value to variable (=)
        int number=7;
        String name="MayBatch";
        
        //Arithmetic Operators //add, sub, mul, div
        //add (+)
        int a=10;
        int b=3;
        System.out.println(a+b);
        
        //sub (-)
        System.out.println(a-b);
        
        //mul (*)
        System.out.println(a*b);
        
        //Division
        //To get the Quotient  (/)
        System.out.println("The quotiet is "+a/b);
        
        //To get the remainder (%)
        System.out.println(a%b);
        
        System.out.println("-----------------");
        
        //Comparison operator - Comparing the 2 different value
        //Comparison is correct->true
        //Comparison is wrong ->false
        
        int c=4;
        int d=5;
        
        
        //equalTo   (==)
        System.out.println(c==d);
        
        //lessThan (<)
        System.out.println(c<d);
       
        //greaterThan (>)
        System.out.println(c>d);                  
        //lessThanOrEqualTo - check 2 conditions -  c<d       c==d
        System.out.println(c<=d);
                                                       
        //greaterThanOrEqualTo -  check 2 conditions - c>d  and  c==d
        System.out.println(c>=d);
       
        //notEqualTo
        System.out.println(c!=d);
        
        System.out.println("-------------");
        
        int s=7;
        int t=8;
        
        //Logical Operators
        //And (&&) -2 Conditions  - Both 2 Conditions should be satistied ->True  
        //OR (||)  -2 Conditions  -Either of the Conditions Satisfied -> True 
         
        //And                 
        System.out.println(s<t&&s==t);   //s<t    s==t
        //Or                               
        System.out.println(s<t||s==t);   //s<t   s==t
        
        System.out.println("----------------");
        
        //Increment and Decrement Operator
        //Increment - preIncrement and postIncrement
        //decrement - preDecrement and postDecrement
        
        //Increment - postIncrement - Increase the value by 1   (m++)
        
        int m=7;
        System.out.println(m++);  //7
        System.out.println(m);    //8
        
        //Increment - preIncrement - Increase the value by 1   (++m)
        System.out.println(++m);     //9
        
        //decrement - postDecrement  -  Decrease the value by 1   (m--)
        System.out.println(m--);  //  9
        System.out.println(m);    //8
        
        //decrement - preDecrement  -  Decrease the value by 1   (--m)
        System.out.println(--m);     //7
        
     }

}

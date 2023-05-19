//Alex Frascone AP Computer Science Project
// 11/29/2022

import java.util.Scanner;//Scanner program for input values
public class Cookies3 //Class name
{
  public static void main(String[] args) //main method
  {
   Scanner sc = new Scanner(System.in);
   boolean haveCookies = true; //For the future compound boolean expression
  System.out.println("Please answer all questions either with \"Y\" or \"N\" (Capital) or with a number");
  System.out.println("Are you ready to play?"); //Conditional Statement
  String answer = sc.nextLine(); //New Set of Choices
  
if(answer.equals("Y"))//Start of Nested if
   {
   System.out.println("You are in the forest camping,\nand you decide to take a walk");
   System.out.println("do you take cookies with you on your walk?"); //Conditinal Statement
   String i1 = sc.nextLine(); //New Set of Choices
 
      if(i1.equals("N"))
      {
      System.out.print("You get lost on your walk and starve to death without the cookies--THE END");
      }
      else if(i1.equals("Y")) //Else if that checks for the int to further you down the storyline
         {
         int num = 0;
         System.out.print("There are 3 cookies how many do you take? (putting anything other than an int will crash code)\n"); //Conditional Statement
         String i2 = sc.nextLine(); //New set of Choices
         num = num + Integer.parseInt(i2);// "Integer.parseInt();" is to turn the value of a string variable to an int variable.
            if(num==3)
            {
            System.out.println("You begin your walk, and an hour into it\nout of nowhere a bear charges at you!");
            System.out.println("Do you drop the cookies and run?"); // Conditinoal Statement
            String i3 = sc.nextLine(); //New set of Choices

               if(i3.equals("Y"))
               {
               System.out.println("The bear stops and eats the cookies giving you time to get away--THE END");
               }
               else if(i3.equals("N")) //Else if that gives an alternate ending
               {
               System.out.println("The bear catches up to you and eats you for lunch--THE END");
   }


else //Else Statement for putting in the wrong input
   {
   System.out.print("Wrong input please restart the code to play once again.");
   }
}
else if(num==2) //Else if that checks for number of cookies and gives new prompts
{
System.out.println("You get tired after a while and decide to have a snack.");
System.out.println("Do you eat the cookies?"); //Conditional Statements
String i5 = sc.nextLine(); //New set of choices
if(i5.equals("Y"))
{
System.out.println("They tasted really good.");
haveCookies=false;
}
else if(i5.equals("N")) //Else if that gives an alternate ending
{
System.out.print("You keep going without eating the cookies--THE END");
}
else //Else Statement for putting in the wrong input
{
System.out.print("Wrong input restart code to play again--THE END");
}
}
else if(num==1) //Else if this checks for the number of cookies taken and gives more prompts
{
System.out.println("You see a racoon on your walk");
System.out.println("Do you give it half of your cookie?"); //Conditional Statement
String i4 = sc.nextLine(); //New Set of choices
if(i4.equals("Y"))
{
System.out.print("You now have a pet racoon--THE END");
}
else if(i4.equals("N")) //Else if that gives an alternative ending
{
System.out.println("The racoon gets upset and bites you!");
System.out.print("You die from rabies--THE END");
}
else// Else statement from user putting in the wrong input
{
System.out.print("You typed in the wrong input and the racoon just walked away");
}
}
else// Else Statement from user putting in the wrong input
{
System.out.print("That is not an option and you now get no cookies --THE END");
}
}
else // Else Statement from putting in the wrong input
{
System.out.print("The answer is either Y or N restart the code to try again--THE END");
}
}

else if (answer.equals("N"))
   {
   System.out.print("Please restart the code when ready to play.");
   }

else// Else Statement for putting in the wrong input
{
System.out.print("You put the wrong input and the code is over.\nRestart the code to try again--THE END");
}

if(haveCookies==false)//Compound boolean expression AND also beginning of another nested if
{
System.out.println("You now finished your walk and made it back to camp safely");
System.out.println("There is one cookie left at camp. Do you eat it?"); //Conditional Statement
String i6 = sc.nextLine(); //New Set of Choices
if(i6.equals("Y"))
{
System.out.print("Yum--THE END");
}
else if(i6.equals("N"))//Else if that leads to an alternative ending
{
System.out.print("You dont eat the last cookie and out of nowhere the campsite\n gets attacked by bears!--THE END");
}
else// Else statement that ends code if putting wrong input
{
System.out.print("Wrong input please restart the code to play again");
}
}

}}

/* Overview of the Program:
The Program created is a game. The game is answered with Y, N, or numerical inputs.
Each Yes or No input from the player gives a different prompt and ending of the game.
Since each input is either Y, N, or a numerical value, EVERY else statement is caused
by inputs other that what's asked in prompt.
This means that every else statement results in the ending of the code.
-------------------------------------------------------------------------------------
The game itself gives a prompt and requires an answer leading to different endings of 
the story. 
*/

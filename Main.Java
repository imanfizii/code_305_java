/*
  BOWLING SCORING SYSTEM
  LANGUAGE : JAVA
  
  MEMBERS : 1) MUHAMMAD AMIRUL SYAFIQ BIN MOHD NOR (2020620108)
            2) IMAN HAFIZI BIN MD ZIN (2020494344)
            3) VINIT ROY A/L LETCHUMANAN (2020812022)
 */
import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner inputText = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);
        
        player ply = new player();
        
        String name;
        int point;
        int frames= 10;
        int first=0, second=0, third=0;
        
        ArrayList<String[]> list = new ArrayList<String[]>();
        
        System.out.println(" Please Enter The Number Of Contestant");
        int contestant = inputNum.nextInt();
        String pName[]= new String[contestant];
        String firstThrow[] = new String[contestant];
        String secondThrow[] = new String[contestant];
        String thirdThrow[] = new String[contestant];
        
        for(int i=0; i<frames ; i++ )
        {
            System.out.println(" Enter Contestant's Name :");
            name = inputText.nextLine();
            pName[i] = name;
            
            if( i<frames-1)
            {
                System.out.println(" Please Enter First Throw : ");
                first = inputNum.nextInt();
                
                if(first <=10)
                {
                    firstThrow[i] = String.valueOf(first);
                    
                    if(first!=10)
                    {
                        System.out.println(" Please Enter Second Throw : ");
                        second = inputNum.nextInt();
                        
                        if(first + second <=10)
                        {
                            secondThrow[i] = String.valueOf(second);
                        }
                    }
                }
            }
            else
            {
                System.out.println(" Please Enter First Throw : ");
                first = inputNum.nextInt();
                if(first <=10)
                {
                    firstThrow[i] = String.valueOf(first);
                    
                    if(first <10)
                    {
                        System.out.println(" Please Enter Second Throw : ");
                        
                        if(first + second <=10)
                        {
                            secondThrow[i] = String.valueOf(second);
                        }
                    }
                    else if(first ==10 )
                    {
                        System.out.println(" Please Enter Second Throw : ");
                        second = inputNum.nextInt();
                        
                        if( second <=10)
                        {
                            secondThrow[i] = String.valueOf(second);
                        }
                    }
                    
                    if(first ==10 || first +second ==10)
                    {
                        System.out.println(" PLease Enter Third Throw : ");
                        third = inputNum.nextInt();
                            
                        if(third <=10)
                        {
                            thirdThrow[i] = String.valueOf(third);    
                        }
                    }
                }
            }
        }
        
        list.add(pName);
        list.add(firstThrow);
        list.add(secondThrow);
        list.add(thirdThrow);
        
        for(String i[] :list)
        {
            System.out.println(Arrays.toString(i));
        }
    }
}

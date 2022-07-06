/*
  BOWLING SCORING SYSTEM
  LANGUAGE : JAVA
  
  MEMBERS : 1) MUHAMMAD AMIRUL SYAFIQ BIN MOHD NOR (2020620108)
            2) IMAN HAFIZI BIN MD ZIN (2020494344)
            3) VINIT ROY A/L LETCHUMANAN (2020812022)
 */
public class player
{
    private String name;
    private int point, first, second, third;
    
    public player()
    {
        name = null;
        point = 0 ;
        first = 0;
        second = 0;
        third = 0;
    }

    public player(String name, int point, int first, int second, int third) 
    {
        this.name= name;
        this.point=point;
        this.first= first;
        this.second= second;
        this.third= third;
    }

    public String getName()
    {
        return name;
    }
    
    public int getPoint()
    {
        return point;
    }
    
    public int getFirst()
    {
        return first;
    }

    public int getSecond()
    {
        return second;
    }

    public int getThird()
    {
        return third;
    }

    }

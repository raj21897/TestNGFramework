package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilityClasses.baseClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TC01 extends baseClass {

    @Parameters("tcname")
    @Test
    public void tc01(String tcname){
        System.out.println(" This is tc01");
        System.out.println("paramter tc vlaue = "+tcname);
    } @Test
    public void tc02(){
        System.out.println(" This is tc02");
    }

    @Test (dataProvider = "dp1")
    public void tc03(String s){
        System.out.println(" This is tc03");
        System.out.println("dp1 values are >>"+s);
    }
    @DataProvider
    public Iterator<String> dp1(){
        List<String> l1 = new ArrayList<>();
        l1.add("rajesh");
        l1.add("choudhari");
        return l1.iterator();
    }
}

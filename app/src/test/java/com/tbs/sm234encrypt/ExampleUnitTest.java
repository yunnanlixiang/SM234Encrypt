package com.tbs.sm234encrypt;

import org.junit.Test;

import com.tbs.sm234encrypt.test.BillBean;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testtt() {
        double total = 0;
        List<BillBean> list = new ArrayList<>();
        list.add(new BillBean(1,15,100.0,"_100","100",0.0));
        list.add(new BillBean(4,0,50.0,"_50","50",0.0));
        list.add(new BillBean(0,0,20.0,"_20","20",23.0));
        list.add(new BillBean(1,0,10.0,"_10","10",28.0));
        list.add(new BillBean(1,0,5.0,"_5","5",17.0));
        list.add(new BillBean(0,0,1.0,"_1","1(券)",10.0));
        list.add(new BillBean(0,0,0.5,"_05","0.5(券)",4.0));
        list.add(new BillBean(0,0,0.1,"_01","0.1(券)",2.0));
        for (BillBean bill : list) {
            System.out.println(MessageFormat.format(
                    "票面:    {0}    {1}捆    {2}把    {3}张",
                    bill.getBILL_NAME(),
                    bill.getBILL_KUN(),
                    bill.getBILL_BA(),
                    bill.getBILL_ZHANG()
            ));
            System.out.println("\n");
            total += bill.getBILL_VALUE() * (bill.getBILL_KUN() * 10 * 100 + bill.getBILL_BA() * 100 + bill.getBILL_ZHANG());
        }
        System.out.println("\n total："+total+"");
        System.out.println("\n"+MessageFormat.format("金额:    {0}", formatTosepara(total)));
        System.out.println("\n total："+total+"");
    }

    /**
     * 金额加逗号分隔符显示
     * 保留小数"#，###.00"
     */
    public static String formatTosepara(double data) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(data);
    }

    @Test
    public void bigTest(){
        BigDecimal bg=new BigDecimal("1.0858021E7");
        System.out.println(bg.toPlainString());
    }
}
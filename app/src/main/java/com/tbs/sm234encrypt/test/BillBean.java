package com.tbs.sm234encrypt.test;

import java.io.Serializable;

/**
 * Created
 * by @author wzt
 * on @date 2018/11/27
 * contact @qq 3622667006
 */
public class BillBean implements Serializable {
    /**
     * BILL_BA : 1
     * BILL_KUN : 1
     * BILL_VALUE : 100
     * BILL_ZHANG : 10
     */

    private int BILL_BA;
    private int BILL_KUN;
    private double BILL_VALUE;
    private String BILL_CODE;
    private String BILL_NAME;
    private double BILL_ZHANG;

    public BillBean(int BILL_BA, int BILL_KUN, double BILL_VALUE, String BILL_CODE, String BILL_NAME, double BILL_ZHANG) {
        this.BILL_BA = BILL_BA;
        this.BILL_KUN = BILL_KUN;
        this.BILL_VALUE = BILL_VALUE;
        this.BILL_CODE = BILL_CODE;
        this.BILL_NAME = BILL_NAME;
        this.BILL_ZHANG = BILL_ZHANG;
    }

    public double getBILL_VALUE() {
        return BILL_VALUE;
    }

    public void setBILL_VALUE(double BILL_VALUE) {
        this.BILL_VALUE = BILL_VALUE;
    }

    public String getBILL_CODE() {
        return BILL_CODE;
    }

    public void setBILL_CODE(String BILL_CODE) {
        this.BILL_CODE = BILL_CODE;
    }

    public String getBILL_NAME() {
        return BILL_NAME;
    }

    public void setBILL_NAME(String BILL_NAME) {
        this.BILL_NAME = BILL_NAME;
    }

    public int getBILL_BA() {
        return BILL_BA;
    }

    public void setBILL_BA(int BILL_BA) {
        this.BILL_BA = BILL_BA;
    }

    public int getBILL_KUN() {
        return BILL_KUN;
    }

    public void setBILL_KUN(int BILL_KUN) {
        this.BILL_KUN = BILL_KUN;
    }

    public double getBILL_ZHANG() {
        return BILL_ZHANG;
    }

    public void setBILL_ZHANG(double BILL_ZHANG) {
        this.BILL_ZHANG = BILL_ZHANG;
    }
}

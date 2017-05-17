package org.yh.designmode.VisitorMode;

public class VisitorMode
{

    public void ride(Horse h)
    {
        System.out.println("骑马");
    }

    public void ride(WhiteHorse wh)
    {
        System.out.println("骑白马");
    }

    public void ride(BlackHorse bh)
    {
        System.out.println("骑黑马");
    }

    public static void test()
    {
        Horse wh = new WhiteHorse();
        Horse bh = new BlackHorse();
        VisitorMode mozi = new VisitorMode();
        mozi.ride(wh);
        mozi.ride(bh);
    }
}
package org.yh.designmode.ProxyMode;

public class TalkProxy implements Italk
{
    Italk talker;

    public TalkProxy(Italk talker)
    {
        // super();
        this.talker = talker;
    }

    public void talk(String msg)
    {
        talker.talk(msg);
    }

    public void talk(String msg, String singname)
    {
        talker.talk(msg);
        sing(singname);
    }

    private void sing(String singname)
    {
        System.out.println("唱歌：" + singname);
    }
}

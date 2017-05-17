package org.yh.designmode.TemplateMethodModel;

public class TemplateMethodModel
{
    public static void test()
    { // 多态
        BaseTest sina = new SinaTest();
        BaseTest tencent = new TencentTest();
        sina.ask();
        tencent.ask();
    }
}

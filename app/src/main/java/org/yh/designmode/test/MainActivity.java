package org.yh.designmode.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.yh.designmode.AbstractFactoryModel.AbstractFactoryModel;
import org.yh.designmode.BridgeMode.BridgeMode;
import org.yh.designmode.BuilderMode.BuilderMode;
import org.yh.designmode.ChainOfResponsibilityModel.ChainOfResponsibilityModel;
import org.yh.designmode.CloneMode.CloneMode;
import org.yh.designmode.CombinationMode.CombinationMode;
import org.yh.designmode.CommandMode.CommandMode;
import org.yh.designmode.DecorativeMode.DecorativeMode;
import org.yh.designmode.FactoryMethodModel.FactoryMethodModel;
import org.yh.designmode.FactoryMethodModel.IProduct;
import org.yh.designmode.FactoryMethodModel.Tree;
import org.yh.designmode.FlyweightMode.FlyweightMode;
import org.yh.designmode.IntermediaryModel.IntermediaryModel;
import org.yh.designmode.IteratorModel.IteratorModel;
import org.yh.designmode.MemoMode.MemoMode;
import org.yh.designmode.ObserverMode.ObserverMode;
import org.yh.designmode.ParserMode.ParserMode;
import org.yh.designmode.ProxyMode.ProxyMode;
import org.yh.designmode.R;
import org.yh.designmode.SingleMode.SingleMode;
import org.yh.designmode.StateModel.StateModel;
import org.yh.designmode.StrategyMode.StrategyMode;
import org.yh.designmode.TemplateMethodModel.TemplateMethodModel;
import org.yh.designmode.VisitorMode.VisitorMode;
import org.yh.designmode.WindowMode.WindowMode;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSingleMode(View view)
    { // 单例
        SingleMode.getInstance();
    }

    public void onClickFactoryMethodModel(View view)
    {// 工厂方法
        IProduct iProduct = new FactoryMethodModel();
        iProduct.productMethod();
        iProduct = new Tree();
        iProduct.productMethod();
    }

    public void onClickAbstractFactoryModel(View view)
    {// 抽象工厂
        AbstractFactoryModel.test();
    }

    public void onClickTemplateMethodModel(View view)
    {// 模版方法模式
        TemplateMethodModel.test();
    }

    public void onClickBuilderMode(View view)
    {// 建造者模式
        BuilderMode.test();
    }

    public void onClickProxyMode(View view)
    {// 代理模式
        ProxyMode.test();
    }

    public void onClickCloneMode(View view)
    {// 原型模式
        CloneMode.test();
    }

    public void onClickIntermediaryModel(View view)
    {// 中介者模式
        IntermediaryModel.test1();
        IntermediaryModel.test2();
    }

    public void onClickCommandMode(View view)
    {// 命令模式
        CommandMode.test();
    }

    public void onChainOfResponsibilityModel(View view)
    {// 责任链模式
        ChainOfResponsibilityModel.test();
    }

    public void onClickDecorativeMode(View view)
    {// 装饰模式
        DecorativeMode.test();
    }

    public void onClickStrategyMode(View view)
    {// 策略模式
        StrategyMode.test();
    }

    public void onClickIteratorModel(View view)
    {// 模式
        IteratorModel.test();
    }

    public void onClickCombinationMode(View view)
    {// 组合模式
        CombinationMode.test();
    }

    public void onClickObserverMode(View view)
    {// 观察者模式
        ObserverMode.test();
    }

    public void onClickWindowMode(View view)
    {// 门面模式
        WindowMode.test();
    }

    public void onClickMemoMode(View view)
    {// 备忘录模式
        MemoMode.test();
    }

    public void onClickVisitorMode(View view)
    {// 访问者模式
        VisitorMode.test();
    }

    public void onClickStateModel(View view)
    {// 状态模式
        StateModel.test();
    }

    public void onClickParserMode(View view)
    {// 解释器模式
        ParserMode.test();
    }

    public void onClickFlyweightMode(View view)
    {// 享元模式
        FlyweightMode.test();
    }

    public void onClickBridgeMode(View view)
    {// 桥梁模式
        BridgeMode.test();
    }
}

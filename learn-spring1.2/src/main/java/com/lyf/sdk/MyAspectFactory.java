package com.lyf.sdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyAspectFactory {


    public static CustomDao getBean(){
        final CustomDao customDao = new CustomDaoImpl();

        final MyAspect myAspect  = new MyAspect();

        return (CustomDao) Proxy.newProxyInstance(MyAspectFactory.class.getClassLoader(),
                new Class[]{CustomDao.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       myAspect.myBefore();
                       Object obj = method.invoke(customDao,args
                               );
                       myAspect.myAfter();
                        return obj;
                    }
                }
        );

    }
}

package com.demo.work;

import com.demo.pojo.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @ClassName Test1
 * 使用反射机制访问任意类的任意方法
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月06日  19:48:30
 * @Version 1.0.0
 */

public class ReflectionMethod {

    /**
     * 执行方法
     *
     * @param className  类名
     * @param methodName 方法名
     * @param args       参数列表
     * @return
     * @throws Exception
     */

    public static Object execute(String className, String methodName, Object[] args) throws Exception {

        //获得类的Class对象
        //Class  classzz = Class.forName(className);
        Class classz = ClassLoader.getSystemClassLoader().loadClass(className);

        //参数类型数组
        Class[] argsTypes = new Class[args.length];

        for (int i = 0; i < args.length; i++) {
            argsTypes[i] = args[i].getClass();
        }
        /* //获得方法
        Method method = classz.getDeclaredMethod(methodName,argsClasses);*/

        //获得所有方法
        Method[] methods = classz.getMethods();
        //定义方法的变量
        Method method = null;
        //遍历方法数组
        for (Method temp : methods) {
            //判断方法名是否相同
            if (temp.getName().equals(methodName)) { //方法名相同比较参数
                //暂时同名的方法对象赋值给循环外的方法变量
                method = temp;
                //获得方法的参数类型数组
                Class[] paramTypes = temp.getParameterTypes();
                //遍历参数类型数组
                for (int i = 0; i < paramTypes.length; i++) {
                    //通过参数类型匹配方法
                    if (paramTypes[i] != argsTypes[i]) {
                        boolean isSuch = false;
                        if (argsTypes[i] == Integer.class && paramTypes[i] == int.class) {
                            isSuch = true;
                        } else if (argsTypes[i] == Long.class && paramTypes[i] == long.class) {
                            isSuch = true;
                        } else if (argsTypes[i] == Float.class && paramTypes[i] == float.class) {
                            isSuch = true;
                        } else if (argsTypes[i] == Double.class && paramTypes[i] == double.class) {
                            isSuch = true;
                        } else if (argsTypes[i] == Short.class && paramTypes[i] == short.class) {
                            isSuch = true;
                        } else if (argsTypes[i] == Byte.class && paramTypes[i] == byte.class) {
                            isSuch = true;
                        } else if (argsTypes[i] == Boolean.class && paramTypes[i] == boolean.class) {
                            isSuch = true;
                        } else if (argsTypes[i] == Character.class && paramTypes[i] == char.class) {
                            isSuch = true;
                        }
                        if (!isSuch) {
                            method = null;
                            break;
                        }
                    }
                }
                //判断是否为空
                if (method != null) {
                    break;
                }

            }
        }
        //判断是否未匹配到方法
        if (method == null) {
            throw new NoSuchMethodException("未找到");
        }
        //执行方法
        return method.invoke(classz.newInstance(), args);

    }

    public static void main(String[] args) {


        try {
            System.out.println(execute("com.demo.work.Calculator",
                    "subtract", new Object[]{8, 5}));
            System.out.println(execute("com.demo.work.Calculator",
                    "sum", new Object[]{3, 5}));
            System.out.println(execute("com.demo.work.Calculator",
                    "printMsg", new Object[]{}));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

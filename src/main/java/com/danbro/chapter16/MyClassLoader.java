package com.danbro.chapter16;

import java.io.*;

/**
 * @author Danrbo
 * @Classname MyClassLoader
 * @Description TODO 自定义类加载器
 * @Date 2021/3/30 13:28
 */
public class MyClassLoader extends ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClassLoader myClassLoader = new MyClassLoader("C:\\Users\\liweimo\\Desktop\\");
        Class<?> demo = myClassLoader.loadClass("Demo");
        System.out.println(demo.getClassLoader());
    }

    private String byteCodePath;

    public MyClassLoader(String byteCodePath) {
        this.byteCodePath = byteCodePath;
    }

    public MyClassLoader(String byteCodePath, ClassLoader parent) {
        super(parent);
        this.byteCodePath = byteCodePath;
    }

    @Override
    protected Class<?> findClass(String className) {
        String filePath = byteCodePath + className + ".class";
        BufferedInputStream bis = null;
        ByteArrayOutputStream baos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        baos = new ByteArrayOutputStream();
        byte[] data = new byte[1024];
        int len;
        try {
            while ((len = bis.read(data)) != -1) {
                baos.write(data, 0, len);
            }
            return defineClass(null, baos.toByteArray(), 0, baos.toByteArray().length);
        } catch (IOException e) {
            return null;
        } finally {
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

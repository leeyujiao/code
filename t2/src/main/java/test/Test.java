package test;

import biz.ProvincesBiz;
import biz.Impl.ProvincesBizImpl;

public class Test {
    public static void main(String[] args)
    {
        ProvincesBiz pb=new ProvincesBizImpl();
        System.out.println(pb.findAllProvinces());
    }
}

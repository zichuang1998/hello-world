package com.zufe;

import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:&(NAME)
 * Package:&(PACKAGE_NAME)
 * Description；
 *
 * @Date:$(DATE) $(TIME)
 */
public class fang {


    public static void main(String[] args) {
        fang f = new fang();
        System.out.println(f.ProductList(4,1,3,3));
    }


    public List<Integer> ProductList(int offset, int n, int len1, int len2) {
        // write your code here
        List<Integer> list = new ArrayList<>();
        if (offset < len1) {
            list.add(offset);
            if (len1 >= offset + n) {
                list.add(offset + n);
                list.add(0);
                list.add(0);
            } else {
                list.add(len1);
                list.add(0);
                list.add(Math.min(offset + n - len1,len2));
            }
        } else if (offset == len1) {
            list.add(len1);
            list.add(len1);
            list.add(0);
            list.add(Math.min(n, len2));

        } else {
            list.add(len1);
            list.add(len1);
            list.add(offset-len1);
            int temp = (len1+len2-offset>n)? offset-len1+n : len2;
            list.add(temp);
        }
        return list;
    }
}

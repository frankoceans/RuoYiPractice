package HuaWeiExcise;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        t1();
        t2();
        t3();
    }

    /**
     * 1.
     * 汽水瓶
     * 某商店规定：三个空汽水瓶可以换一瓶汽水，允许向老板借空汽水瓶（但是必须要归还）。
     * 小张手上有n个空汽水瓶，她想知道自己最多可以喝到多少瓶汽水。
     * 数据范围：输入的正整数满足
     * 1
     * ≤
     * �
     * ≤
     * 100
     * <p>
     * 1≤n≤100
     * <p>
     * 注意：本题存在多组输入。输入的 0 表示输入结束，并不用输出结果。
     */
    public static void t1() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            System.out.println(t1Solution(n));
        }
        sc.close();
    }

    public static int t1Solution(int n) {
        // 瓶数
        int a = n / 3;
        // 余数
        int b = n % 3;
        // 喝到总瓶数
        int res = 0;
        while (a > 0) {
            res += a;
            a += b;
            b = a % 3;
            a /= 3;
        }
        if (b == 2)
            res++;
        return res;
    }

    /**
     * 2.
     * 明明的随机数
     * 明明生成了
     * �
     * N个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
     * <p>
     * 数据范围：
     * 1
     * ≤
     * �
     * ≤
     * 1000
     * <p>
     * 1≤n≤1000  ，输入的数字大小满足
     * 1
     * ≤
     * �
     * �
     * �
     * ≤
     * 500
     * <p>
     * 1≤val≤500
     */
    public static void t2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        TreeSet<Integer> set = new TreeSet<>(list);
        list.clear();
        list.addAll(set);
        list.sort(Integer::compare);
        for (Integer i : list) {
            System.out.println(i);
        }
        sc.close();

        //        List<Integer> newList = list.stream().distinct().sorted().collect(Collectors.toList());
//        System.out.println(newList);
    }


    /**
     * 3.
     * 进制转换
     * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
     * <p>
     * 数据范围：保证结果在
     * 1
     * ≤
     * �
     * ≤
     * 2
     * 31
     * −
     * 1
     * <p>
     * 1≤n≤2
     * 31
     * −1
     */
    public static void t3() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
//        System.out.println(text);
        try {
            System.out.println(Integer.decode(text));
        } catch (Exception e) {
            System.out.println("it isn't a HexNum");
        }
        sc.close();
    }
}

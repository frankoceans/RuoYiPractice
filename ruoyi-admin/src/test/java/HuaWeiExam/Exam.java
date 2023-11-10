package HuaWeiExam;


import org.junit.Test;
import org.springframework.boot.test.autoconfigure.data.redis.DataRedisTest;

import java.util.Scanner;

@DataRedisTest
public class Exam {
    /**
     * 宜居星球改造计划
     * 2XXX年，人类通过对火星的大气进行宜居改造分析，使得火星已在理论上具备人类宜居的条件，由于技术原因，无法一次性将火星大气全部改造，只能通过局部处理形式，假设将火星待改造的区域为row * column的网格每个网格有3个值，
     * 宜居区、可改造区、死亡区，使用YES、NO、NA代替，YES表示该网格已经完成大气改造，NO表示该网格未进行改造，后期可进行改造，NA表示死亡区，不作为判断是否改造完成的宜居，无
     */
    @Test
    public void t1() {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }

    //完全二叉树非叶子部分后序遍历
    @Test
    public void tttt(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int index = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != -1){
                res[index++] = arr[i];
            }
        }
        for(int i = 0; i < index; i++){
            System.out.print(res[i] + " ");
        }
    }
}

package test算法;

import org.junit.Test;
import test算法.model.Point;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a point.
 * class Point {
 * int x;
 * int y;
 * Point() { x = 0; y = 0; }
 * Point(int a, int b) { x = a; y = b; }
 * }
 */
public class b_maxPoints {
    /**
     * 输入: [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
     * 输出: 4
     * 解释:
     * ^
     * |
     * |  o
     * |     o        o
     * |        o
     * |  o        o
     * +------------------->
     * 0  1  2  3  4  5  6
     *
     * @param points
     * @return
     */
    public int maxPoints(Point[] points) {
        int num = 0;
        //key 斜率，value：个数
        Map<String, Integer> map = new HashMap<String, Integer>();
        String key = "";
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                if (points[i].y - points[j].y == 0) {
                    key = "Y_Zero";
                    continue;
                } else {
                    int gcd = gcd(points[i].x - points[j].x, points[i].y - points[j].y);
                    //事实证明斜率一样，不一定在一条直线上
                    // b = y-kx
                    //求出b 拼到key里面，真蛋疼！
                    // key = (points[i].x-points[j].x)/gcd + "/" + (points[i].y-points[j].y)/gcd+"_"+b;
                    key = (points[i].x - points[j].x) / gcd + "/" + (points[i].y - points[j].y) / gcd;
                }
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 2);
                }
            }
        }
        int aaa = 1;

        return num;
    }

    @Test
    public void test() {
        Point[] points = new Point[]{
                new Point(1, 1),
                new Point(3, 2),
                new Point(5, 3),
                new Point(4, 1),
                new Point(2, 3),
                new Point(1, 4)};
        int a = maxPoints(points);

    }

    public int gcd(int x, int y) { // 这个是运用辗转相除法求 两个数的 最大公约数 看不懂可以百度 // 下
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
}

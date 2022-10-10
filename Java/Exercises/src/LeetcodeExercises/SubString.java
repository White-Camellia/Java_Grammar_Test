package LeetcodeExercises;
//KMP算法的Java实现
public class SubString {
    public static void main(String[] args) {
        String s1 = "asdfasdk", s2 = "asdk";
        System.out.println(new SubString().getIndexOfSubstring(s1, s2));
    }
    //getIndex函数利用KMP算法快速获取字串的开始索引位置，
    public int getIndexOfSubstring(String str, String subStr){
        int[] next = toNext(subStr);
        int j = 0, i = 0;
        //最大索引对应.length()-1,任何一个指针超过了最大索引就视作遍历完成
        while (i < str.length() && j < subStr.length()){
            if (j == -1 || str.charAt(i) == subStr.charAt(j)){
                j++; i++;
            }else j = next[j];
        }
        //如果处理之后模式串恰好遍历完成，那么返回其起始索引，反之不存在则返回-1
        return j == subStr.length() ? i - j : -1;
    }
    //next函数用于标记下一次开始判断的模式串的游标位置
    public int[] toNext(String tmpStr){
        int[] tmpArr = new int[tmpStr.length()+1];
        int j = -1, i = 0;
        tmpArr[0] = -1;
        while (i < tmpStr.length()){
            if(j == -1 || tmpStr.charAt(i) == tmpStr.charAt(j)){
                tmpArr[++i] = ++j;
            }
            else j = tmpArr[j];
        }
        //数组任意i号元素的含义是，记录了第i号元素前的最长的相同前缀后缀串的长度
        return tmpArr;
    }

}

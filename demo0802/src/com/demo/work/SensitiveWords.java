package com.demo.work;

/**
 * 敏感词处理
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月02日 09:25:11
 */
public class SensitiveWords {

    private String[] words;

    public SensitiveWords() {
        init();
    }

    public void init() {
        words = new String[]{"TMD","贱","裸体"};
    }

    /**
     * 屏蔽敏感词
     * @param text
     * @return
     */
    public String shielding(String text) {
        //创建正则表达字符串
        String regex = "";
        //遍历数组
        for(int i=0; i<words.length; i++) {
            if(i!=0) {
                regex += "|";
            }
            regex += words[i];
        }
        System.out.println(regex);
        //将敏感词替换成"***"
        return text.replaceAll(regex, "***");
    }

    public static void main(String[] args) {
        SensitiveWords sw = new SensitiveWords();
        String rs = sw.shielding("在多层介质中，如果贱客其上部覆盖层内有TMD一层的层速度特别大（大于其下任何层）时，" +
                "则其下面即使存TMD在着速度界裸体面，一般也不能形成折射波，因为波穿过裸体高速层后不能以临界角入射到下面界面上。");
        System.out.println(rs);
    }

}


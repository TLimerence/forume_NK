package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: Ran
 * @create: 2023-04-08 21:41
 * @Descripton:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class sensitiveTest {

    @Autowired
    private SensitiveFilter sensitiveFilter;
    @Test
    public void testSensitiveFilter(){
//        String text = "这里可以赌博，可以嫖娼，可以吸毒，可以开票，哈哈哈哈哈!";
        String text = "赌@#$博，~!@吸#$#毒%^%^，啧啧啧";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }
}

package com.lango.langoapiinterface;

import com.lango.langoclientsdk.client.LangoApiClient;
import com.lango.langoclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class LangoapiInterfaceApplicationTests {

    @Resource
    private LangoApiClient langoApiClient;

    @Test
    void contextLoads() {
        String result = langoApiClient.getNameByGet("lango");
        User user = new User();
        user.setUsername("langogg");
        String userNameByPost = langoApiClient.getUserNameByPost(user);
        System.out.println(result);
        System.out.println(userNameByPost);

    }

}

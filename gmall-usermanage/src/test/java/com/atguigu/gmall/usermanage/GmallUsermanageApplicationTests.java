package com.atguigu.gmall.usermanage;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserManageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallUsermanageApplicationTests {
    @Autowired
    UserManageService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void showAddressList() {
        List<UserAddress> userAddressList = userService.getUserAddressList("1000");
        for (UserAddress userAddress : userAddressList) {
            System.err.println("userAddress = " + userAddress.getUserAddress());
        }
    }
}
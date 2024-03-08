package com.delivery.delivery.join;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@Slf4j
@SpringBootTest
class JoinServiceTest {

    @Autowired
    JoinService joinService;

    @Test
    void serviceTransactionTest() {
       log.info("JoinService class = {}", joinService.getClass());
    }


}
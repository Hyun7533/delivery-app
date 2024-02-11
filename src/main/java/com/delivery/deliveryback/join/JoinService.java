package com.delivery.deliveryback.join;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final JoinMapper joinMapper;

    public void join(JoinEntity joinEntity) {
        joinMapper.addCustomer(joinEntity);
    }

}

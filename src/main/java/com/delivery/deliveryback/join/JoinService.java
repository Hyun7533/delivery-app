package com.delivery.deliveryback.join;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    private final JoinMapper joinMapper;
    
    @Autowired
    public JoinService(JoinMapper joinMapper) {
		this.joinMapper = joinMapper;
	}

    public void join(JoinEntity joinEntity) {
        joinMapper.addCustomer(joinEntity);
    }

}

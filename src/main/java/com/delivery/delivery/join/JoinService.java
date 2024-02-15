package com.delivery.delivery.join;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class JoinService {

    private final JoinMapper joinMapper;
    
    @Autowired
    public JoinService(JoinMapper joinMapper) {
		this.joinMapper = joinMapper;
	}

    public JoinEntity saveMember(JoinEntity joinEntity) {
        joinMapper.saveMember(joinEntity);
        return joinEntity;
    }

}

package com.delivery.delivery.join;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JoinMapperImpl implements JoinMapper {

    private final JoinMapper joinMapper;

    @Override
    public void saveMember(JoinEntity joinEntity) {
        joinMapper.saveMember(joinEntity);
    }


}

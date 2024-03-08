package com.delivery.delivery.join;


import com.delivery.delivery.product.ProductEntity;
import com.delivery.delivery.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class JoinService {

    private final ProductService productService;
    private final JoinRepository joinRepository;

    public JoinDTO saveMember(JoinEntity joinEntity, ProductEntity productEntity) {
        joinRepository.save(joinEntity);
//        productService.save(productEntity);
        return null;
    }

    public void saveMemberV2(JoinEntity joinEntity) {
        joinRepository.save(joinEntity);
    }
}

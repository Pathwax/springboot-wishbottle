package com.hust25.wishbottle.service.serviceImpl;

import com.hust25.wishbottle.repository.WishBottleRepository;
import com.hust25.wishbottle.entity.WishBottle;
import com.hust25.wishbottle.service.WishBottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class WishBottleServiceImpl implements WishBottleService {

    @Autowired
    WishBottleRepository wishBottleRepository;

    @Override
    public List<WishBottle> findAllByReceiverid(String receiverid){
        return wishBottleRepository.findAllByReceiverid(receiverid);
    }

    @Override
    public List<WishBottle> findAllByWriterid(String writerid) {
        return wishBottleRepository.findAllByWriterid(writerid);
    }

    @Override
    public WishBottle addWishBottle(WishBottle wishBottle) {
        return wishBottleRepository.saveAndFlush(wishBottle);
    }


    @Override
    public WishBottle getWishBottle(String writerid) {
        return wishBottleRepository.getRandWish(writerid).get(0);
    }
}

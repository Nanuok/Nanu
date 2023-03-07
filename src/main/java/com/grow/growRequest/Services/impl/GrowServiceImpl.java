package com.grow.growRequest.Services.impl;

import com.grow.growRequest.Entity.Grow;
import com.grow.growRequest.Entity.Repository.GrowRepository;
import com.grow.growRequest.Services.GrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrowServiceImpl implements GrowService {
    @Autowired
    private GrowRepository growRepository;
    @Override
    public void saveOneGrow(Grow grow) {
        growRepository.save(grow);
    }
}

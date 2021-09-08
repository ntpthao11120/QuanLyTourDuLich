/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntpt.service.implementation;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.ntpt.pojos.Tour;
import com.ntpt.repository.TourRepository;
import com.ntpt.service.TourService;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ntpth
 */
@Service
public class TourServiceImplementation implements TourService {
    @Autowired
    private Cloudinary cloudinary;
    @Autowired
    private TourRepository tourRepository;

    @Override
    public List<Tour> getTours(String kw, int page) {
        return this.tourRepository.getTours(kw, page);
    }

    @Override
    public boolean addOrUpdate(Tour tour) {
        try {
            Map r = this.cloudinary.uploader().upload(tour.getFile().getBytes(),
                    ObjectUtils.asMap("resource_type", "auto"));
            tour.setImage((String) r.get("secure_url"));
            
            return this.tourRepository.addOrUpdate(tour);
        } catch (IOException ex) {
            System.err.println("==ADD TOUR==" + ex.getMessage());
        }
        
        return false;
    }

    @Override
    public long countTour() {
        return this.tourRepository.countTour();
    }

}

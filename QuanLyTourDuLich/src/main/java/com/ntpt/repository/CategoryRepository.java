/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntpt.repository;

import com.ntpt.pojos.Category;
import java.util.List;

/**
 *
 * @author ntpth
 */
public interface CategoryRepository {
    List<Category> getCategories();
    
}

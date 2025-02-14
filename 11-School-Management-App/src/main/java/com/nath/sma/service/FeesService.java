package com.nath.sma.service;

import com.nath.sma.entity.Fees;
import com.nath.sma.entity.Student;

public interface FeesService {

    Iterable<Fees> getAllFees();

    void save(Fees fees);

    Fees findById(long id);
    
    void delete(Fees fees);

    Student findBySui(String string);

    long count();
    
}

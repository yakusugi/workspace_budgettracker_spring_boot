package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BudgetTrackerInsertRequest;
import com.example.demo.dto.BudgetTrackerSearchRequest;
import com.example.demo.entity.BudgetTracker;
import com.example.demo.repository.BudgetTrackerMapper;
/**
 * ユーザー情報 Service
 */
@Service
public class BudgetTrackerService {
    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private BudgetTrackerMapper budgetTrackerMapper;
    /**
     * ユーザー情報検索
　　　* @param budgetTrackerSearchRequest リクエストデータ
     * @return 検索結果
     */
    public BudgetTracker search(BudgetTrackerSearchRequest budgetTrackerSearchRequest) {
        return budgetTrackerMapper.search(budgetTrackerSearchRequest);
    }
    
    public BudgetTracker insert(BudgetTrackerInsertRequest budgetTrackerInsertRequest) {
        return budgetTrackerMapper.insert(budgetTrackerInsertRequest);
    }
}
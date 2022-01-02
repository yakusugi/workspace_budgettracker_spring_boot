package com.example.demo.repository;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.BudgetTrackerInsertRequest;
import com.example.demo.dto.BudgetTrackerSearchRequest;
import com.example.demo.entity.BudgetTracker;
/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface BudgetTrackerMapper {
    /**
     * ユーザー情報検索
     * @param budgettracker 検索用リクエストデータ
     * @return ユーザー情報
     */
	BudgetTracker search(BudgetTrackerSearchRequest budgetTracker);
	
	BudgetTracker insert(BudgetTrackerInsertRequest budgetTracker);
}
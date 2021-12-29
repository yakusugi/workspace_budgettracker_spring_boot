package com.example.demo.entity;

import java.util.Date;
import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Data
public class BudgetTracker {
	/**
	 * ID
	 */
	private Long id;
	/**
	 * 日時
	 */
	private Date date;
	/**
	 * 店名
	 */
	private String storeName;
	/**
	 * 商品名
	 */
	private String productName;
	/**
	 * 商品種類
	 */
	private String productType;
	/**
	 * 値段
	 */
	private Long price;

}
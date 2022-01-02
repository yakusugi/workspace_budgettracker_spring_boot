package com.example.demo.dto;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
/**
 * ユーザー情報 検索用リクエストデータ
 */
@Data
public class BudgetTrackerInsertRequest implements Serializable {
  /**
   * id
   */
  private Long id;
  
  /**
   * date
   */
  private Date date;
  
  /**
   * store name
   */
  private String storeName;
  
  /**
   * product name
   */
  private String productName;
  
  /**
   * product type
   */
  private String productType;
  
  /**
   * product price
   */
  private int price;
  
  
}
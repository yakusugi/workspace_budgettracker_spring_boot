package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.dto.BudgetTrackerSearchRequest;
import com.example.demo.entity.BudgetTracker;
import com.example.demo.service.BudgetTrackerService;
/**
 * ユーザー情報 Controller
 */
@Controller
public class BudgetTrackerController {
  /**
   * ユーザー情報 Service
   */
  @Autowired
  BudgetTrackerService budgetTrackerService;
  /**
   * ユーザー情報検索画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @GetMapping(value = "/budgettracker/search")
  public String displaySearch(Model model) {
    return "budgettracker/search";
  }
  /**
   * ユーザー情報検索
   * @param userSearchRequest リクエストデータ
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @RequestMapping(value = "/budgettracker/id_search", method = RequestMethod.POST)
  public String search(@ModelAttribute BudgetTrackerSearchRequest budgetTrackerSearchRequest, Model model) {
	  BudgetTracker budgetTracker = budgetTrackerService.search(budgetTrackerSearchRequest);
    model.addAttribute("budgetrackerinfo", budgetTracker);
    return "budgettracker/search";
  }
}
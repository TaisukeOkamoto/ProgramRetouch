package ec;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BuyDataBeans;
import beans.BuyDetailDataBeans;
import dao.BuyDAO;

/**
 * 購入履歴画面
 * @author d-yamaguchi
 *
 */
@WebServlet("/UserBuyHistoryDetail")
public class UserBuyHistoryDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String buyId = (String)request.getParameter("buy_id");
		int buyIdInt = Integer.parseInt(buyId);
		try {
			BuyDataBeans BuyData = BuyDAO.getBuyDataBeansByBuyId(buyIdInt);
			ArrayList<BuyDetailDataBeans> BuyDetailDataList = BuyDAO.getItemNamePrice(buyIdInt);
			request.setAttribute("BuyData", BuyData);
			request.setAttribute("BuyDetailDataList", BuyDetailDataList);
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		request.getRequestDispatcher(EcHelper.USER_BUY_HISTORY_DETAIL_PAGE).forward(request, response);

	}
}

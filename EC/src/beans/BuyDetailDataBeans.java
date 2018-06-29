package beans;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * 購入詳細
 * @author d-yamaguchi
 *
 */
public class BuyDetailDataBeans  implements Serializable {
	private int id;
	private int buyId;
	private int itemId;
	private String itemName;
	private int itemPrice;
	private ArrayList<BuyDetailDataBeans> BuyDetailDataList;

	public BuyDetailDataBeans() {

	}

	public BuyDetailDataBeans(String itemName,int itemPrice,int buyId){
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.buyId = buyId;
	}

	public int getId() {
		return id;
	}
	public void setId(int buyDetailId) {
		this.id = buyDetailId;
	}
	public int getBuyId() {
		return buyId;
	}
	public void setBuyId(int buyId) {
		this.buyId = buyId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public ArrayList<BuyDetailDataBeans> getBuyDetailDataList() {
		return BuyDetailDataList;
	}

	public void setBuyDetailDataList(ArrayList<BuyDetailDataBeans> buyDetailDataList) {
		BuyDetailDataList = buyDetailDataList;
	}
}

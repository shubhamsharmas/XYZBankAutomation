package Helpers;

public class PageObjectForXYZBank {
	//CustomerLogin Page
	public String LoginButton="div.center>button[class='btn btn-primary btn-lg'][ng-click='customer()']";
	
	public String SelectValuefromDropDown= "Select#userSelect";
	public String  LoginButtonUserSelected= "button[class='btn btn-default']";
	public String HeaderTextOfLoginPage ="span[class='fontBig ng-binding']";
	public String DepositScreenPage="button[ng-class='btnClass2'][class='btn btn-lg tab']";
	public String AmounttoBeDeposited="input[class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']";
	public String DepositSubmitButton= "button[class='btn btn-default']";
	
	public String loginButton()
	{
		return LoginButton;
	}
	
	public String selectValuefromDropDown()
	{
		return SelectValuefromDropDown;
	}
	
	public String loginButtonUserSelected()
	{
		return LoginButtonUserSelected;
	}
	
	public String headerTextOfLoginPage()
	{
		return HeaderTextOfLoginPage;
	}
	
	public String depositScreenPage()
	{
		return DepositScreenPage;
	}
	
	public String amounttoBeDeposited()
	{
		return AmounttoBeDeposited;
	}
	
	public String depositSubmitButton()
	{
		return DepositSubmitButton;
	}
	
	

}

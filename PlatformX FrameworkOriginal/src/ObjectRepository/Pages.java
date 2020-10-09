package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pages extends AbstractPage {

	public Pages(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="login")
	public  WebElement loginBtn;

	@FindBy(id="email")
	public WebElement Username;
	
	@FindBy(id="passwd")
	public WebElement Password;
	
	@FindBy(id="SubmitLogin")
	public WebElement submitBtn;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[2]/a")
	public WebElement dressSection;
	
	@FindBy(xpath="//div[@id='categories_block_left']/div/ul/li[1]/a")
	public WebElement casualDress;
	

	@FindBy(xpath=".//*[@id='center_column']/ul/li/div/div[2]/h5/a")
	public WebElement PrintedDrss;
	
	@FindBy(id="quantity_wanted")
	public WebElement quantity;
	
	@FindBy(xpath=".//*[@id='group_1']")
	public WebElement Size;
	
	@FindBy(xpath=".//*[@id='add_to_cart']/button")
	public WebElement addtoCartBtn;
	
	@FindBy(xpath=".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    public WebElement Checkout;
	
	@FindBy(xpath=".//*[@id='center_column']/p[2]/a[1]/span")
	public WebElement ProcessToCheckBtn;
	
	
	@FindBy(xpath=".//*[@id='center_column']/p[2]/a[1]/span")
	public WebElement ProcessToChkBtn;
	
	@FindBy(xpath=".//*[@id='center_column']/form/p/button")
    public WebElement ClickOnAddressProcessToCheckoutbtn;
	
	@FindBy(xpath=".//*[@id='cgv']")
	public WebElement TearmOfServicecheckBox;
	
	@FindBy(xpath=".//*[@id='form']/p/button")
	public WebElement checkoutBtn;
	
	@FindBy(xpath=".//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
	public WebElement paymentFunctionality;
	
	
	@FindBy(className="logout")
	public WebElement LogoutBtn;
	
	public boolean  ClickOnLogin()
	{
		try{
			
			 loginBtn.click();
		 
		    }catch(Exception e){
			  	return false;
		  }
	return true;
}

	public  boolean LoginToSite(String username,String password)
	{
		try{
	  
			    Username.sendKeys(username);
			    Password.sendKeys(password);
			    submitBtn.click();
				
			  }catch(Exception e){
				  	return false;
			  }
		return true;
	}

	public boolean DressSect()
	{
		try{
			
		dressSection.click();
		
		}catch(Exception e){
			
		return false;
		
		}
		return true;
		
	}

	public boolean CasualDressSect()
	{
		try{
			
		 casualDress.click();
		
	     }catch(Exception e){
		
		    return false;
		
		 }
		 return true;
		
	}


	public boolean PrintdressSection()
	{
		try{
			
		 PrintedDrss.click();
		
	    }catch(Exception e){
		
		return false;
		
		}
		return true;
		
	}

	public boolean Quantity()
	{
	   try{
			
		 quantity.clear();
		 quantity.sendKeys("2");
	    }catch(Exception e){
		
		return false;
		
		}
		return true;
		
	}
	public boolean Size()
	{
		try{
		
	     Select sel=new Select(Size);
	     sel.selectByVisibleText("M");
		}catch(Exception e){
			
			return false;
			
			}
			return true;
			
	}

	public boolean clickOnAddToCartBtn()
	{
	    try{
			
	    	addtoCartBtn.click();
		
		   }catch(Exception e){
			
			return false;
			
			}
			return true;
			
	}

	public boolean clickOnProcessToCheckOut()
	{
		try{
			
		   Checkout.click();
	
		    }catch(Exception e){
			
			return false;
			
			}
			return true;
			
		}

	public boolean AddToCheckProcess()
	{
		try{
			
		    ProcessToChkBtn.click();
		    
		    }catch(Exception e){
			
			return false;
			
			}
			return true;
			
	}

	public boolean AddressProcessToCheckout()
	{
		try{
			
		    ClickOnAddressProcessToCheckoutbtn.click();
	     	}catch(Exception e){
			
			return false;
			
			}
			return true;
			
	}
	public boolean ShippingProcessToCheckOutBtn()
	{
		try{
			
		    TearmOfServicecheckBox.click();
		    checkoutBtn.click();	
	
		    }catch(Exception e){
			
			return false;
			
			}
			return true;
			
	}

	public boolean PaymentMode()
	{
		try{
			
		    paymentFunctionality.click();
	
		    }catch(Exception e){
			
			return false;
			
			}
			return true;
			
	}

	public boolean clickOnLogout()
	{
		try {
			
		     LogoutBtn.click();
		    }catch(Exception e){
			
			return false;
			
			}
			return true;
			
	}

}

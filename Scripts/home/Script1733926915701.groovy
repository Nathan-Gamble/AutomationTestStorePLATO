import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sewriveting.ca/store/')

WebUI.click(findTestObject('Object Repository/Page_SewRiveting - Custom Apparel/a_Write Review_productcart'))

WebUI.click(findTestObject('Object Repository/Page_SewRiveting - Custom Apparel/a_1Items-24.43'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Shopping Cart/th_Estimate Shipping  Taxes'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Shopping Cart/select_Canada            United States            Zambia            Zimbabwe'), 
    '38', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Shopping Cart/select_Canada            United States            Zambia            Zimbabwe'), 
    '223', false)

WebUI.closeBrowser()


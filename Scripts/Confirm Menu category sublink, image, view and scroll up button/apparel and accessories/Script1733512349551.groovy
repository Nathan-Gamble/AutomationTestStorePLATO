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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Menu_Category-apparel/Page_Apparel  accessories/a_Apparel  accessories'))

WebUI.click(findTestObject('breadcrumb category apparel/Page_Apparel  accessories/button_Sort By_list'))

WebUI.click(findTestObject('Object Repository/Menu_Category-Apparel/Page_Apparel  accessories/button_Sort By_grid'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-Apparel/Page_Apparel  accessories/a_View_productcart'))

WebUI.click(findTestObject('Object Repository/Menu_Category-Apparel/Page_Apparel  accessories/button_Sort By_list'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-Apparel/Page_Apparel  accessories/img'))

WebUI.scrollToElement(findTestObject('Object Repository/Menu_Category-Apparel/Page_Apparel  accessories/div_Per Page10203040501 - 8 of 8             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_Category-Apparel/Page_Apparel  accessories/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Menu_Category-Apparel/Page_Apparel  accessories/img_1'))

WebUI.click(findTestObject('Object Repository/Menu_Category-Apparel/Page_T-shirts/a_Apparel  accessories'))

WebUI.click(findTestObject('Object Repository/Menu_Category-Apparel/Page_Apparel  accessories/a_T-shirts'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_Category-Apparel/Page_T-shirts/a_Apparel  accessories'))

WebUI.click(findTestObject('Object Repository/Menu_Category-Apparel/Page_T-shirts/a_T-shirts'))

WebUI.click(findTestObject('Object Repository/Menu_Category-Apparel/Page_T-shirts/button_Sort By_grid'))

WebUI.click(findTestObject('Object Repository/Menu_Category-Apparel/Page_T-shirts/button_Sort By_list'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-Apparel/Page_T-shirts/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_Category-Apparel/Page_T-shirts/a_View_productcart'))

WebUI.scrollToElement(findTestObject('Object Repository/Menu_Category-Apparel/Page_T-shirts/div_Per Page10203040501 - 5 of 5             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_Category-Apparel/Page_T-shirts/a_Back to top'))

WebUI.closeBrowser()

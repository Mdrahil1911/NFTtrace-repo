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

WebUI.click(findTestObject('Page_NFTtrace - Projects/a_Form Builder'))

WebUI.click(findTestObject('Page_NFTtrace - Form Builder/button_Create new form'))

WebUI.click(findTestObject('Page_NFTtrace - Create Form/li_Text Input'))

WebUI.click(findTestObject('Page_NFTtrace - Create Form/li_Number Input'))

WebUI.click(findTestObject('Page_NFTtrace - Create Form/li_Paragraph Text'))

WebUI.click(findTestObject('Page_NFTtrace - Create Form/label_Save'))

WebUI.click(findTestObject('Page_NFTtrace - Create Form/input_Form Name_name'))

WebUI.selectOptionByIndex(findTestObject('Page_NFTtrace - Create Form/select_Select form typeTransaction formAsset form'), 
    '1')

WebUI.click(findTestObject('Page_NFTtrace - Create Form/button_SUBMIT'))


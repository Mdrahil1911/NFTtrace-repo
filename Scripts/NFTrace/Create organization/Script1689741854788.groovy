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

WebUI.navigateToUrl('https://app.nfttrace.com/login')

WebUI.setText(findTestObject('Object Repository/Page_NFTtrace - Login to Manage and Track Y_f5a9ba/input_Email_email'), 
    'superadmin@chaincodeconsulting.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NFTtrace - Login to Manage and Track Y_f5a9ba/input_Password_password'), 
    'lt7kXPiIKwaT+RdC1Uoh9g==')

WebUI.sendKeys(findTestObject('Object Repository/Page_NFTtrace - Login to Manage and Track Y_f5a9ba/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_NFTtrace - Projects/a_Organizations'))

WebUI.click(findTestObject('Object Repository/Page_NFTtrace - Organizations/button_Create Organization'))

WebUI.setText(findTestObject('Object Repository/Page_NFTtrace - Organizations/input__organizationName'), 'Central Org')

WebUI.selectOptionByIndex(findTestObject('Page_NFTtrace - Organizations/select_Select Organization typeEducationSup_d2b9eb'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_NFTtrace - Organizations/input__AddressLine'), '4th cross, Jali Nagar')

WebUI.selectOptionByIndex(findTestObject('Page_NFTtrace - Organizations/select_Select stateAndaman and Nicobar Isla_ee6d5b'), 
    '3', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Page_NFTtrace - Organizations/select_Select CityBagraBarka KanaBarki Sari_840c27'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_NFTtrace - Organizations/input__zipcode'), '589655')

WebUI.setText(findTestObject('Object Repository/Page_NFTtrace - Organizations/input__GSTIN'), '22AAAAA0000A1Z9')

WebUI.uploadFile(findTestObject('Page_NFTtrace - Organizations/input__file'), 'C:\\Users\\MD Rahil\\Desktop\\photo-1557426272-fc759fdf7a8d.jpg')

WebUI.click(findTestObject('Object Repository/Page_NFTtrace - Organizations/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_NFTtrace - Organizations/input__firstName'), 'Drake')

WebUI.setText(findTestObject('Object Repository/Page_NFTtrace - Organizations/input__lastName'), 'settle')

WebUI.setText(findTestObject('Object Repository/Page_NFTtrace - Organizations/input__email'), 'md.rahil+drake@chaincodeconsulting.com')

WebUI.setText(findTestObject('Object Repository/Page_NFTtrace - Organizations/input_Phone_mobile'), '+91 54874-51841')

WebUI.click(findTestObject('Object Repository/Page_NFTtrace - Organizations/input__form-check-input'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NFTtrace - Organizations/input__password'), 'lt7kXPiIKwaT+RdC1Uoh9g==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NFTtrace - Organizations/input__confirmPassword'), 'lt7kXPiIKwaT+RdC1Uoh9g==')

WebUI.click(findTestObject('Object Repository/Page_NFTtrace - Organizations/button_Submit'))


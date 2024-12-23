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

WebUI.navigateToUrl('https://app.emea1b.fenergox.com/')

WebUI.setText(findTestObject('Object Repository/OR - Fenergo with TS/Page_Fenergo/input_Tenant Name_TenantName'), 'vistra-sdlc-uat')

WebUI.setText(findTestObject('Object Repository/OR - Fenergo with TS/Page_Fenergo/input_Email_Username'), 'rajesh.chitpol@vistra.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OR - Fenergo with TS/Page_Fenergo/input_Password_Password'), '6P7zrOJyxbp20Fkrhh8rHw==')

WebUI.click(findTestObject('Object Repository/OR - Fenergo with TS/Page_Fenergo/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/OR - Fenergo with TS/Page_vistra-sdlc-uat - Fenergo/path'))

WebUI.setText(findTestObject('Object Repository/OR - Fenergo with TS/Page_vistra-sdlc-uat - Fenergo/input_Legal Entity Name_properties.legalEntityName'), 
    'RR Enterprise')

WebUI.click(findTestObject('Object Repository/OR - Fenergo with TS/Page_vistra-sdlc-uat - Fenergo/div_'))

WebUI.click(findTestObject('Object Repository/OR - Fenergo with TS/Page_vistra-sdlc-uat - Fenergo/li_Client'))

WebUI.click(findTestObject('Object Repository/OR - Fenergo with TS/Page_vistra-sdlc-uat - Fenergo/div_'))

WebUI.click(findTestObject('Object Repository/OR - Fenergo with TS/Page_vistra-sdlc-uat - Fenergo/li_End User Client'))

WebUI.click(findTestObject('Object Repository/OR - Fenergo with TS/Page_vistra-sdlc-uat - Fenergo/div_'))

WebUI.click(findTestObject('Object Repository/OR - Fenergo with TS/Page_vistra-sdlc-uat - Fenergo/li_Private Company'))

WebUI.click(findTestObject('Object Repository/OR - Fenergo with TS/Page_vistra-sdlc-uat - Fenergo/span_Search'))


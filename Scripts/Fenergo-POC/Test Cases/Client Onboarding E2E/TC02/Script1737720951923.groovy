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

not_run: WebUI.click(findTestObject('Object Repository/OR_Billing Address/Page_vistra-sdlc-uat - Fenergo/Add_Contact'))

WebUI.click(findTestObject('OR_Billing Address/Page_vistra-sdlc-uat - Fenergo/Billing_Add'))

WebUI.setText(findTestObject('Object Repository/OR_Billing Address/Page_vistra-sdlc-uat - Fenergo/input_Address Line 1_properties.address_line1'), 
    'Delaware')

WebUI.click(findTestObject('Object Repository/OR_Billing Address/Page_vistra-sdlc-uat - Fenergo/div_Address TypeBillingAddress Line 1Addres_a90c13'))

WebUI.setText(findTestObject('Object Repository/OR_Billing Address/Page_vistra-sdlc-uat - Fenergo/input_City_properties.address_city'), 
    'Delaware')

WebUI.click(findTestObject('Object Repository/OR_Billing Address/Page_vistra-sdlc-uat - Fenergo/path'))

WebUI.click(findTestObject('Object Repository/OR_Billing Address/Page_vistra-sdlc-uat - Fenergo/li_Algeria'))

WebUI.setText(findTestObject('Object Repository/OR_Billing Address/Page_vistra-sdlc-uat - Fenergo/input_ZipCodePostCode_properties.address_zi_d029dd'), 
    '45987')

WebUI.enableSmartWait()

not_run: WebUI.click(findTestObject('Object Repository/OR_Billing Address/Page_vistra-sdlc-uat - Fenergo/BillingAdd_Save'))

WebUI.click(findTestObject('OR_Billing Address/Page_vistra-sdlc-uat - Fenergo/button_Save'))


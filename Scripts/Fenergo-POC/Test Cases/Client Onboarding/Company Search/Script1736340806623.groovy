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

WebUI.navigateToUrl('https://app.emea1b.fenergox.com/journey/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Search Company/Page_Fenergo/input_Tenant Name_TenantName'), 'vistra-sdlc-uat')

WebUI.setText(findTestObject('Object Repository/Search Company/Page_Fenergo/input_Email_Username'), 'rajesh.chitpol@vistra.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Search Company/Page_Fenergo/input_Password_Password'), '6P7zrOJyxbp20Fkrhh8rHw==')

WebUI.click(findTestObject('Object Repository/Search Company/Page_Fenergo/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/span_Company'))

WebUI.enableSmartWait()

WebUI.click(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/input_Legal Entity Name_properties.legalEntityName'))

WebUI.setText(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/input_Legal Entity Name_properties.legalEntityName'), 
    'POC CA-MR2 Enterprise')

WebUI.click(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/input_Role Type_properties.roleType'))

WebUI.click(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/li_Client'))

WebUI.click(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/input_Client Type_properties.clientType'))

WebUI.click(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/li_End User Client'))

WebUI.click(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/input_Company type_properties.companyType'))

WebUI.click(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/li_Private Company'))

WebUI.click(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/span_Search'))

WebUI.click(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/a_POC CA-MR2 Enterprise'))

WebUI.click(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/span_Journeys'))

WebUI.click(findTestObject('Object Repository/Search Company/Page_vistra-sdlc-uat - Fenergo/a_Client Acceptance'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/h6_Relationship Manager'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/svg'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Title_properties.individualTitle_1'))

WebUI.enableSmartWait()

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_Miss_1'))

WebUI.setText(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Surname_properties.lastName_1'), 'gajjar')

WebUI.setText(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_First Name_properties.firstName_1'), 
    'chaitrali')

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/span_Link'))


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

WebUI.click(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/Add_Contact_1'))

WebUI.click(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/path_1'))

WebUI.click(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/li_Mr'))

WebUI.setText(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/input_Surname(English Name)_properties.cont_c09b61'), 
    'Chitpol')

WebUI.setText(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/input_First name (English Name)_properties._6eb452'), 
    'Rajesh')

WebUI.setText(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/input_Email_properties.contact_email'), 
    'rc@gmail.com')

WebUI.setText(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/input_Contact Number_properties.contact_number'), 
    '987654')

WebUI.click(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/button_Save_Contact'))

WebUI.click(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/input_Will the entity (or its subsidiaries)_1a98ab'))

WebUI.click(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/li_Industry involving child labourforced la_25a888'))

WebUI.click(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/input_Do we have a face-to-face relationshi_c60a20'))

WebUI.click(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/li_No - With specific and adequate measures'))

WebUI.click(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/input_Is there a DELEGATION OF AUTHORITY in_56ac51'))

WebUI.click(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/li_No'))

WebUI.click(findTestObject('Object Repository/OR_Add Contact/Page_vistra-sdlc-uat - Fenergo/button_Complete'))


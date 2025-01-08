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

WebUI.setText(findTestObject('Page_vistra-sdlc-uat - Fenergo/Legal Entity Name'), 'RR Enterprise')

not_run: WebUI.click(findTestObject('Page_vistra-sdlc-uat - Fenergo/RoleType_DropdownArrow'))

WebUI.selectOptionByValue(findTestObject('Page_vistra-sdlc-uat - Fenergo/Role Type', [('variable') : 'Client', ('variable_0') : 'Client Entity']), 
    'Client', false)

WebUI.enableSmartWait()

WebUI.selectOptionByLabel(findTestObject('Page_vistra-sdlc-uat - Fenergo/Client Type'), 'End User Client', false)

WebUI.enableSmartWait()

WebUI.selectOptionByIndex(findTestObject('Page_vistra-sdlc-uat - Fenergo/Company Type'), 0)

WebUI.enableSmartWait()

WebUI.click(findTestObject('Page_vistra-sdlc-uat - Fenergo/Search'))

WebUI.enableSmartWait()

WebUI.click(findTestObject('Page_vistra-sdlc-uat - Fenergo/NR_Create'))


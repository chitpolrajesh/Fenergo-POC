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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://app.emea1b.fenergox.com/journey/')

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/svg'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Title_properties.individualTitle'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_Ms'))

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Surname_properties.lastName'), 
    'Smith')

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_First Name_properties.firstName'), 
    'Maggie')

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/span_Search'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/span_Create New'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/span_Confirm'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Type_fenx-59465'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_Authorised Signatory'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/span_Indicate Requirements Needed to Complete IDV'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Primary Nationality_properties.nationality'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_Algerian'))

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Date of Birth_properties.dateOfBirth'), 
    '01/01/2000')

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Telephone_properties.telephone'), 
    '1234567890')

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Occupation_properties.occupation'), 
    'Test POC')

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Title_properties.currentEmploymentTitle'), 
    'Test POC')

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_National ID provided_properties.nationalId'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_Yes'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_National ID Place of Issue_properties_22eac3'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_Algeria'))

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_National ID Number_properties.nationa_6f63fe'), 
    'NID1234')

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_National ID Issue Date_properties.nat_244226'), 
    '01/05/2018')

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Address Validation_properties.address_4e0f64'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_Electoral Registry'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Address Validation Place of Issue_pro_4ac601'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_Algeria_1'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Validation Certification_properties.a_53bc77'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_Certified'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Are there PEP hits_properties.pep'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_No'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Is this a previous PEP_properties.dePEP'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_No_1'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Are there Sanction hits_properties.sanctions'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_No_1_2'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Are there Financial Crime hits_proper_1895fa'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_No_1_2_3'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Are there Law Enforcement hits_proper_2056bc'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_No_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Are there Regulatory hits_properties._db4af0'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_No_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Are there Adverse Media hits_properti_1f10f0'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_No_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Are there Other hits_properties.other_bb14e1'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_No_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/span_Add Address'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Address Type_properties.address_type'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_Registered'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_Billing'))

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Address Line 1_properties.address_line1'), 
    'Test Address 1')

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_City_properties.address_city'), 
    'Delaware')

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Country_properties.address_country'), 
    '')

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Country_properties.address_country'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/li_Algeria_1_2'))

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_ZipCodePostCode_properties.address_zi_d029dd'), 
    '34567')

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/span_Save'))

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/svg_1'))

WebUI.setText(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/input_Email_properties.email'), 
    'maggie.smith@testmail.com')

WebUI.click(findTestObject('Object Repository/Add Authorised Signatory/Page_vistra-sdlc-uat - Fenergo/span_Save'))


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

WebUI.navigateToUrl('https://app.emea1b.fenergox.com/callback?code=BFC133D566333BAE36565589A143F9EECF9B7FE4264A260309DA92894DE83EA3&scope=openid%20profile%20tenant%20fenx.all%20roles&state=932c1a04e23e447aa0c10f309b4dc435&session_state=pVul7u2qZWLEgOiupSC01NCx06Zzu27NaSZ31UlO6zA.EBC4E87F3034E6F5EA3DD3D644D687F2')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/OR - Feb with TS 2/Page_Fenergo/input_Tenant Name_TenantName'), 'vistra-sdlc-uat')

WebUI.setText(findTestObject('Object Repository/OR - Feb with TS 2/Page_Fenergo/input_Email_Username'), 'rajesh.chitpol@vistra.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OR - Feb with TS 2/Page_Fenergo/input_Password_Password'), '6P7zrOJyxbp20Fkrhh8rHw==')

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_Fenergo/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/svg'))

WebUI.setText(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/input_Legal Entity Name_properties.legalEntityName'), 
    'POC CA-MR2 Enterprise')

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/input_Role Type_properties.roleType'))

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/li_Client'))

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/input_Client Type_properties.clientType'))

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/li_End User Client'))

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/input_Company type_properties.companyType'))

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/li_Private Company'))

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://app.emea1b.fenergox.com/callback?code=BFC133D566333BAE36565589A143F9EECF9B7FE4264A260309DA92894DE83EA3&scope=openid%20profile%20tenant%20fenx.all%20roles&state=932c1a04e23e447aa0c10f309b4dc435&session_state=pVul7u2qZWLEgOiupSC01NCx06Zzu27NaSZ31UlO6zA.EBC4E87F3034E6F5EA3DD3D644D687F2')

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('Object Repository/Page_Fenergo/TenantName'), 'vistra-sdlc-uat')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Fenergo/Email'), 'rajesh.chitpol@vistra.com')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fenergo/Password'), '6P7zrOJyxbp20Fkrhh8rHw==')

not_run: WebUI.click(findTestObject('Object Repository/Page_Fenergo/LOGIN'))

not_run: WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/Date of Incorporation'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Legal Entity Name_properties.legalEntityName'), 
    'RR Test Ltd')

not_run: WebUI.setText(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Role Type_properties.roleType'), 
    '')

not_run: WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Role Type_properties.roleType'))

not_run: WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_Client'))

not_run: WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Client Type_properties.clientType'))

not_run: WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_End User Client'))

not_run: WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Company type_properties.companyType'))

not_run: WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_Private Company'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/Search'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/NR_Create'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/BI_RM'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Jurisdiction for Client Acceptance'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_British Virgin Islands'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/Primary Business Unit'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_BVI Entity (CF)'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Sector of the Client Group - Sales'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_CF-BVI Selling Office'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_File Handler'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_Aaron Joseph'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Relationship Manager_properties.relat_915df7'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_Aashiq Santokhi'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Senior Relationship Manager_propertie_288551'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_Abby Liang'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Service Level Status_properties.servi_2f2f89'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_Classic'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Is this a VIP Client_properties.vipClient'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_No'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Client Classification_properties.clie_0fb7fc'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_CF - END USER - CF03'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Standard Payment Term_properties.stan_e6fd96'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_within 7 days Due net'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Rate List_properties.rateList'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_CF - Anguilla End User Rate List'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Country of incorporation  establishme_0babb9'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_Algeria'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Nature of Business_properties.natureO_1fa77d'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/li_Accountant'))

WebUI.setText(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/input_Company number_properties.companyNumber'), 
    '7894105')

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/Date of Incorporation'))

WebUI.click(findTestObject('Object Repository/Page_vistra-sdlc-uat - Fenergo/Date selection'))


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
    'RR Test Ltd')

not_run: WebUI.setText(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/input_Role Type_properties.roleType'), 
    '')

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/input_Role Type_properties.roleType'))

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/li_Client'))

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/input_Client Type_properties.clientType'))

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/li_End User Client'))

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/input_Company type_properties.companyType'))

WebUI.click(findTestObject('Object Repository/OR - Feb with TS 2/Page_vistra-sdlc-uat - Fenergo/li_Private Company'))


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.setText(findTestObject('Login_Page/input_WELCOME BACK_username'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Login_Page/input_WELCOME BACK_password'), 'cR27OcQPE+8L/TgTNGhVYg==')

WebUI.click(findTestObject('Login_Page/button_Login'))

WebUI.click(findTestObject('SSO_Page/li_inaki'))

WebUI.click(findTestObject('SSO_Page/span_inaki_ant-avatar ant-avatar-circle ant-avatar-icon ant-dropdown-trigger'))

WebUI.click(findTestObject('SSO_Page/li_Logout'))

WebUI.click(findTestObject('Login_Page/h1_WELCOME BACK'))

WebUI.closeBrowser()


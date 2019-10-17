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

int num = GlobalVariable.num

Random rnd = new Random()

randomNum = rnd.nextInt(10 ** num)

int a = 2

int b = 5

WebUI.callTestCase(findTestCase('commons/_loginTemplate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SSO_Page/a_Users'), GlobalVariable.medWait)

WebUI.click(findTestObject('SSO_Page/user_Link'))

WebUI.click(findTestObject('user_page/Page_icon-app/button_Add User'))

WebUI.setText(findTestObject('user_page/xpaths/employeeID'), 'LBT' + String.valueOf(randomNum))

WebUI.setText(findTestObject('user_page/xpaths/email_field'), CustomKeywords.'randomData.TestDataGenerator.getRandomEmail'())

WebUI.setText(findTestObject('user_page/xpaths/phone'), CustomKeywords.'randomData.TestDataGenerator.set_RandomNumber'(11))

WebUI.setText(findTestObject('user_page/xpaths/firstName'), CustomKeywords.'randomData.TestDataGenerator.getRandomFirstName'())

WebUI.setText(findTestObject('user_page/xpaths/mname'), CustomKeywords.'randomData.TestDataGenerator.getRandomName'(a, b))

WebUI.setText(findTestObject('user_page/xpaths/lname'), CustomKeywords.'randomData.TestDataGenerator.getRandomLastName'())

WebUI.setText(findTestObject('user_page/xpaths/usname'), 'USR' + String.valueOf(randomNum))

WebUI.click(findTestObject('user_page/Page_icon-app/div_'))

WebUI.waitForElementVisible(findTestObject('user_page/Page_icon-app/li_USER'), 3)

WebUI.verifyOptionPresentByLabel(findTestObject('user_page/Page_icon-app/li_USER'), 'USER', false, 5)

WebUI.waitForElementClickable(findTestObject('user_page/Page_icon-app/li_USER'), 5)

not_run: WebUI.selectOptionByIndex(findTestObject('user_page/Page_icon-app/li_USER'), 1)

WebUI.click(findTestObject('user_page/Page_icon-app/li_USER'))

WebUI.click(findTestObject('Object Repository/SSO_Page/Page_icon-app/div_USER'))

WebUI.click(findTestObject('user_page/xpaths/userType_Admin'))

WebUI.click(findTestObject('Object Repository/SSO_Page/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/SSO_Page/Page_icon-app/li_CORE'))

WebUI.click(findTestObject('Object Repository/SSO_Page/Page_icon-app/li_TRADE'))

WebUI.click(findTestObject('Object Repository/SSO_Page/Page_icon-app/li_TREASURY'))

WebUI.click(findTestObject('Object Repository/SSO_Page/Page_icon-app/button_Submit'))

WebUI.click(findTestObject('Object Repository/SSO_Page/Page_icon-app/div_User successfully created'))

WebUI.click(findTestObject('Object Repository/SSO_Page/Page_icon-app/div_Success'))

WebUI.click(findTestObject('Object Repository/SSO_Page/Page_icon-app/div_SuccessUser successfully created'))

WebUI.closeBrowser()


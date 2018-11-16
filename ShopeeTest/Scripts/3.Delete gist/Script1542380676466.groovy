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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.navigateToUrl('https://github.com/')

WebUI.click(findTestObject('Object Repository/Page_The worlds leading software de/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email addres'), 'frogin21')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 
    'P7VBu69HyMH7Odkf+euWtw==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Object Repository/Page_GitHub/span_New organization_dropdown'))

WebUI.click(findTestObject('Object Repository/Page_GitHub/a_Your gists'))

WebUI.click(findTestObject('Page_GitHub/click hello'))

WebUI.click(findTestObject('Page_GitHub/button_delete'))

Robot rb = new Robot()

rb.keyPress(KeyEvent.VK_ENTER)

WebUI.delay(1)

rb.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)


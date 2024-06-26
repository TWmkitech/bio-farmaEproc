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

CustomKeywords.'login.admin.login'(GlobalVariable.Admin, GlobalVariable.Pass)

WebUI.maximizeWindow()

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_UserManagement'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_AgenPengadaan'), 5)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_AgenPengadaan'), 5)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_AgenPengadaan'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/MengaktifkanKembaliDataAgenPengadaan/Menu_Non-Aktif'))

WebUI.delay(5)

/*WebUI.scrollToElement(findTestObject('User-Management/AgenPengadaan/MengaktifkanKembaliDataAgenPengadaan/button_AktifkanData'), 
    0)
WebUI.scrollToPosition(200, 200)

WebUI.scrollToElement(findTestObject('User-Management/AgenPengadaan/MengaktifkanKembaliDataAgenPengadaan/Text_Aksi'), 5)

TestObject targetElement = findTestObject('User-Management/AgenPengadaan/MengaktifkanKembaliDataAgenPengadaan/button_AktifkanData')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('User-Management/AgenPengadaan/MengaktifkanKembaliDataAgenPengadaan/Scroll right'), 
    0)

Object Repository/User-Management/AgenPengadaan/MengaktifkanKembaliDataAgenPengadaan/Scroll right */
/*myItem = WebUI.findWebElement(findTestObject('User-Management/AgenPengadaan/MengaktifkanKembaliDataAgenPengadaan/Scroll right')) 

WebUI.scrollToPosition(1000, myItem.getLocation().getY()) 

WebUI.delay(1)*/
TestObject targetElement = findTestObject('Object Repository/User-Management/AgenPengadaan/MengaktifkanKembaliDataAgenPengadaan/button_AktifkanData')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('User-Management/AgenPengadaan/MengaktifkanKembaliDataAgenPengadaan/button_AktifkanData'), 
    0)

WebUI.click(findTestObject('User-Management/AgenPengadaan/MengaktifkanKembaliDataAgenPengadaan/button_AktifkanData'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/MengaktifkanKembaliDataAgenPengadaan/Button_OK'))

WebUI.closeBrowser()


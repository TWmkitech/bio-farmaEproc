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
import com.kms.katalon.core.configuration.RunConfiguration as Config

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://eproc-dev.digital-healthcare.id/')

WebUI.setText(findTestObject('null'), 'bima.g')

WebUI.setText(findTestObject('null'), 'password.1')

WebUI.click(findTestObject('null'))

WebUI.delay(8)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(5)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

not_run: WebUI.setText(findTestObject('null'), 'Topik yang dibahas terkait KAK dan CV')

not_run: def projectDir = Config.getProjectDir()

// Ambil elemen field "Choose File"
not_run: TestObject uploadField = findTestObject('null')

// Membentuk path lengkap file yang ingin diunggah
not_run: def filePath = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadField, filePath)

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

WebUI.scrollToElement(findTestObject('null'), 
    2)

WebUI.click(findTestObject('null'))

WebUI.scrollToPosition(0, 4)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.clearText(findTestObject('null'))

WebUI.sendKeys(findTestObject('null'), '3')

WebUI.clearText(findTestObject('null'))

WebUI.sendKeys(findTestObject('null'), '50')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('null'), 'Jakarta')

WebUI.setText(findTestObject('null'), 'Anwijzing dilakukan hybrid, peserta bisa online ataupun offline')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(5)


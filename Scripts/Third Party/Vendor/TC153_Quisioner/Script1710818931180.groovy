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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.builtin.ConvertWebElementToTestObjectKeyword as ConvertWebElementToTestObjectKeyword

WebUI.callTestCase(findTestCase('Third Party/Vendor/TC120_Login Pra-Registrasi Calon Vendor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/0_Anchor_ThirdParty'))

WebUI.click(findTestObject('Third Party/Vendor/Quisionare/Anchor_Quisionare'))

WebUI.click(findTestObject('Third Party/Vendor/Quisionare/Anchor_JawabKuesioner'))

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> Tables = driver.findElements(By.xpath('//table/tbody'))

int tbl_count = Tables.size()

Loop: for (int tbl = 1; tbl < tbl_count; tbl++) {
    WebElement table = driver.findElement(By.xpath(('//div[' + (tbl + 1)) + ']/div/div/div/table/tbody'))

    TestObject tableObject = WebUI.convertWebElementToTestObject(table)

    WebUI.scrollToElement(tableObject, 0)

    List<WebElement> rows_table = table.findElements(By.tagName('tr'))

    'To calculate no of rows In table'
    int rows_count = rows_table.size()

    'Loop will execute for all the rows of the table'
    Loop: for (int row = 0; row < rows_count; row++) {
        if (WebUI.verifyElementPresent(findTestObject('Third Party/Vendor/Quisionare/CustomRadio_JawabanEkspektasi', [('indexdiv') : tbl + 
                    1, ('indexpos') : row + 1]), 5, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('Third Party/Vendor/Quisionare/CustomRadio_JawabanEkspektasi', [('indexdiv') : tbl + 
                        1, ('indexpos') : row + 1]))
        }
        
        if (WebUI.verifyElementPresent(findTestObject('Third Party/Vendor/Quisionare/CustomRadio_JawabanRealisasi', [('indexdiv') : tbl + 
                    1, ('indexpos') : row + 1]), 5, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('Third Party/Vendor/Quisionare/CustomRadio_JawabanRealisasi', [('indexdiv') : tbl + 
                        1, ('indexpos') : row + 1]))
        }
    }
    
    if (WebUI.verifyElementPresent(findTestObject('Third Party/Vendor/Quisionare/Custom_Field_KritikSaran', [('indexdiv') : tbl + 
                1, ('indexpos') : rows_count]), 5, FailureHandling.OPTIONAL)) {
        WebUI.setText(findTestObject('Third Party/Vendor/Quisionare/Custom_Field_KritikSaran', [('indexdiv') : tbl + 1, ('indexpos') : rows_count]), 
            'Kritik Saran Automation #' + tbl)
    }
}

WebUI.click(findTestObject('Third Party/Vendor/Quisionare/Button_SimpanData'))

WebUI.click(findTestObject('Third Party/Vendor/Quisionare/Button_KonfirmasiOK'))


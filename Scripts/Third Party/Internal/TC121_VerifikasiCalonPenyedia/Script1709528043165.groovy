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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGHolding_BioFarma_BOD-4'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Anchor_ThirdPartyManagement'))

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Anchor_CalonPenyedia'))

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Filter_PilihPencarian'))

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Filter_PilihPencarian_Data'))

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Field_CariData'))

WebUI.setText(findTestObject('Third Party/Internal/Verifikasi/Field_CariData'), 'Automated Test X')

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Anchor_PengajuanVerifikasi'))

not_run: WebUI.scrollToElement(findTestObject('Third Party/Internal/Verifikasi/Button_Setuju_ProfilPerusahaan'), 0)

not_run: WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Button_Setuju_ProfilPerusahaan'))

not_run: WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Button_KonfirmasiOK_ProfilPerusahaan'))

not_run: WebUI.delay(3)

not_run: WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Tab_StrukturPerusahaan'))

not_run: WebUI.click(findTestObject('Third Party/Internal/Verifikasi/StrukturPerusahaan/Filter_PilihPencarian_PemegangSaham'))

not_run: WebUI.click(findTestObject('Third Party/Internal/Verifikasi/StrukturPerusahaan/Filter_PilihPencarian_PemegangSaham_Data'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

'Loop will execute for all the rows of the table'
Loop: for (int row = 0; row < rows_count; row++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    'To calculate no of columns(cells) In that specific row'
    int columns_count = Columns_row.size()

    println((('Number of cells In Row ' + row) + ' are ') + columns_count)

    // apabila kolom (nomor 2) Status != Disetujui, maka klik Button verifikasi
    String celltext = Columns_row.get(2).getText()

    if (celltext != 'Disetujui') {
        'After getting the Expected value from Table we will klik Button Verifikasi'
        if (celltext == 'Belum Diverifikasi') {
            WebUI.click(findTestObject('Third Party/Internal/Verifikasi/StrukturPerusahaan/Custom_Button_Verifikasi_PemegangSaham', 
                    [('indexpos') : row + 1]))
        } else {
            WebUI.click(findTestObject('Third Party/Internal/Verifikasi/StrukturPerusahaan/Custom_Button_Verifikasi_PemegangSaham_TidakDisetujui'))
        }
        
        WebUI.click(findTestObject('Third Party/Internal/Verifikasi/StrukturPerusahaan/Button_Submit_PemegangSaham'))

        WebUI.click(findTestObject('Third Party/Internal/Verifikasi/StrukturPerusahaan/Button_KonfirmasiOK_PemegangSaham'))
    }
}


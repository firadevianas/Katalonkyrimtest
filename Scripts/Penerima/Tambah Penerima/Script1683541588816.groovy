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

WebUI.callTestCase(findTestCase('Onboarding - Login/Login as Maker'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Penerima/Menu - Penerima'))

WebUI.click(findTestObject('Object Repository/Penerima/Menu - Tambah Penerima'))

WebUI.click(findTestObject('Object Repository/Penerima/Dropdown_bank'))

WebUI.click(findTestObject('Object Repository/Penerima/Select_bank'))

WebUI.setText(findTestObject('Object Repository/Penerima/input_norek'), '1234980987')

WebUI.setText(findTestObject('Object Repository/Penerima/input_email'), 'firadevianas@gmail.com')

WebUI.click(findTestObject('Object Repository/Penerima/dropdown_category'))

WebUI.click(findTestObject('Object Repository/Penerima/Select_category'))

WebUI.click(findTestObject('Object Repository/Penerima/btn_checkrekening'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Penerima/verify_rekening_OK'), 2)

WebUI.click(findTestObject('Object Repository/Penerima/btn_tambahpenerima'))

WebUI.setText(findTestObject('Object Repository/Pin/input_pindigit1'), '1')

WebUI.setText(findTestObject('Object Repository/Pin/input_pindigit2'), '2')

WebUI.setText(findTestObject('Object Repository/Pin/input_pindigit3'), '3')

WebUI.setText(findTestObject('Object Repository/Pin/input_pindigit4'), '3')

WebUI.setText(findTestObject('Object Repository/Pin/input_pindigit5'), '2')

WebUI.setText(findTestObject('Object Repository/Pin/input_pindigit6'), '1')
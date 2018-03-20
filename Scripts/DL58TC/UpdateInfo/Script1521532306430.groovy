import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

for(def rowIdx = 0; rowIdx < 50; rowIdx++) {
	WebUI.navigateToUrl('http://dl.58.com/shangbiaozhli/30729845309119x.shtml?psid=142589358199250552531158959&entinfo=30729845309119_j&slot=-1&iuType=j_2&PGTID=0d302162-0009-3400-6882-1633f5e69e36&ClickID=1')
	//WebUI.navigateToUrl('http://dl.58.com/shangbiaozhli/33298956032065x.shtml?psid=122356584199257696400020744&entinfo=33298956032065_p&slot=-1&iuType=p_2&PGTID=0d302162-0009-3708-2d98-edff282325ab&ClickID=1')
	//WebUI.navigateToUrl('http://dl.58.com/shangbiaozhli/33297528580417x.shtml?psid=122356584199257696400020744&entinfo=33297528580417_p&slot=-1&iuType=p_2&PGTID=0d302162-0009-3708-2d98-edff282325ab&ClickID=3')
	//WebUI.navigateToUrl('http://dl.58.com/shangbiaozhli/33296699772204x.shtml?psid=122356584199257696400020744&entinfo=33296699772204_p&slot=-1&iuType=p_2&PGTID=0d302162-0009-3708-2d98-edff282325ab&ClickID=5')
	//WebUI.navigateToUrl('http://dl.58.com/shangbiaozhli/33288332591279x.shtml?psid=122356584199257696400020744&entinfo=33288332591279_p&slot=-1&iuType=p_2&PGTID=0d302162-0009-3708-2d98-edff282325ab&ClickID=7')
}

WebUI.closeBrowser()


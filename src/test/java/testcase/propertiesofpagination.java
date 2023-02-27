package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.initial;
import pages.loginpage;

public class propertiesofpagination extends initial {

	public void method1() throws InterruptedException {}
		@Test(priority = 0)
		public static void UnitPagination() throws InterruptedException {

			loginpage loginpages = new loginpage();
			PageFactory.initElements(driver, loginpages);
			Thread.sleep(1000);
			loginpage.username.sendKeys("admin");
			loginpage.password.sendKeys("tokyo@admin");
			loginpage.loginbutton.click();
			Thread.sleep(4000);

			loginpage.master.click();
			loginpage.equipment.click();
			Thread.sleep(2000);
			// STEP-01-CLICKING MATERIALSUBCATERGORY BUTTON
			loginpage.materialsubcatergory.click();
		}
	
		@Test(priority = 1)
		public static void DefaultIndexPage() throws InterruptedException {
			try {
			//	loginpage UnitPage = new loginpage();
				// Default Index Page
				testCase = extent.createTest("UNIT-PAGINATION-FUNCTIONALITY");
				Thread.sleep(2000);
			    WebElement	DefaultPaginationPage =driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/ul/li[3]"));
				boolean ActualDefaultPageIndex = DefaultPaginationPage.isDisplayed();
				boolean ExpectedDefaultPageIndex = true;
				testCase = extent.createTest("STEP-01 Checking Default Index Page");
				try {
					Assert.assertEquals(ActualDefaultPageIndex, ExpectedDefaultPageIndex);
					testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex);
					testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedDefaultPageIndex);
					testCase.log(Status.PASS, "Correct Default Index Page");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex);
					testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedDefaultPageIndex);
					testCase.log(Status.FAIL, "Wrong Default Index Page");

				}
			} catch (Exception e) {
				testCase.log(Status.FAIL, "No Element");
				testCase = extent.createTest("STEP-01 Checking Default Index Page Failed because of no Element");
			}
		}

		@Test(priority = 2)
		public static void RefreshDefaultPage() throws InterruptedException {
			try {
				//loginpage UnitPage = new loginpage();

				loginpage.nxtpage.click();
				// Thread.sleep(20000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			    WebElement	DefaultPaginationPage =driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/ul/li[3]"));

				boolean ActualDefaultPageIndex1 =DefaultPaginationPage.isDisplayed();
				boolean ExpectedDefaultPageIndex1 = true;
				testCase = extent.createTest("STEP-02 Checking Default Index Page after Refresh");
				try {
					Assert.assertEquals(ActualDefaultPageIndex1, ExpectedDefaultPageIndex1);
					testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex1);
					testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedDefaultPageIndex1);
					testCase.log(Status.PASS, "Correct Default Index Page");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex1);
					testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedDefaultPageIndex1);
					testCase.log(Status.FAIL, "Wrong Default Index Page");
				}
			} catch (Exception e) {
				testCase.log(Status.FAIL, "No Element");
				testCase = extent
						.createTest("STEP-02 Checking Default Index Page after Refresh is Failed because of no element");
			}
		}
	
//			Page Redirect to the next page 

		@Test(priority = 3)
		public static void PageRedrict() throws InterruptedException {
			try {
				loginpage UnitPage = new loginpage();
				loginpage.nxtpage.click();
				Thread.sleep(2000);
				WebElement PaginationSecoundPage =driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/ul/li[4]"));
				boolean ActualSecoundPageIndex = PaginationSecoundPage.isDisplayed();
				boolean ExpectedSecoundPageIndex = true;
				testCase = extent.createTest(" STEP-03 Checking Page Redriect to the next page");
				try {
					Assert.assertEquals(ActualSecoundPageIndex, ExpectedSecoundPageIndex);
					testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualSecoundPageIndex);
					testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedSecoundPageIndex);
					testCase.log(Status.PASS, "Correct Default Index Page");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualSecoundPageIndex);
					testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedSecoundPageIndex);
					testCase.log(Status.FAIL, "Wrong Default Index Page");
				}
			} catch (Exception e) {
				testCase.log(Status.FAIL, "No Element");
				testCase = extent
						.createTest(" STEP-03 Checking Page Redriect to the next page is Failed because of no element");
			}
		}

		//	Previous Button Displayed
		@Test(priority = 4)
		public static void PreButtonDispaly() throws InterruptedException {
			try {
			//	loginpage UnitPage = new loginpage();
				WebElement PreviousPageBtn =driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/ul/li[2]/button"));
				boolean ActualVisiblePreviousButton = PreviousPageBtn.isDisplayed();
				boolean ExpectedVisiblePreviousButton = true;
				testCase = extent.createTest("STEP-04 Checking Previous Button Dispaly");
				try {
					Assert.assertEquals(ActualVisiblePreviousButton, ExpectedVisiblePreviousButton);
					testCase.log(Status.INFO, "ActualElement :- " + ActualVisiblePreviousButton);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisiblePreviousButton);
					testCase.log(Status.INFO, "Element Available");
					testCase.log(Status.PASS, "Correct element");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualElement :- " + ActualVisiblePreviousButton);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisiblePreviousButton);
					testCase.log(Status.INFO, "Element not available");
					testCase.log(Status.FAIL, "Not Visible Element");
				}
			} catch (Exception e) {
				testCase.log(Status.FAIL, "No Element");
				testCase = extent.createTest("STEP-04 Checking Previous Button Dispaly is failed because of no element");
			}
		}

//			Next Button Displayed
		@Test(priority = 5)
		public static void NextButtonDispaly() throws InterruptedException {
			try {
				//loginpage UnitPage = new loginpage();
				boolean ActualVisibleNextButton = loginpage.nxtpage.isDisplayed();
				boolean ExpectedVisibleNextButton = true;
				testCase = extent.createTest("STEP-05 Checking Next Button Dispaly");
				try {
					Assert.assertEquals(ActualVisibleNextButton, ExpectedVisibleNextButton);
					testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleNextButton);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleNextButton);
					testCase.log(Status.INFO, "Element Available");
					testCase.log(Status.PASS, "Correct element");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleNextButton);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleNextButton);
					testCase.log(Status.INFO, "Element not available");
					testCase.log(Status.FAIL, "Not Visible Element");
				}
			} catch (Exception e) {
				testCase.log(Status.FAIL, "No Element");
				testCase = extent.createTest("STEP-05 CHecking Next Button Dispaly is failed because of no element");
			}
		}
//
////		Next Button Enable
		@Test(priority = 6)
		public static void NextButtonEanble() throws InterruptedException {
			try {
				boolean ActualNextBtnEnable = loginpage.nxtpage.isEnabled();
				boolean ExpectedNextBtnEnable = true;
				testCase = extent.createTest("STEP-06 Checking Next Button Enable");
				try {
					Assert.assertEquals(ActualNextBtnEnable, ExpectedNextBtnEnable);
					testCase.log(Status.INFO, "ActualElement :- " + ActualNextBtnEnable);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedNextBtnEnable);
					testCase.log(Status.PASS, "Enable element");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualElement :- " + ActualNextBtnEnable);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedNextBtnEnable);
					testCase.log(Status.FAIL, "Not Enable Element");
				}
			} catch (Exception e) {
				testCase.log(Status.FAIL, "No Element");
				testCase = extent.createTest("STEP-06 Checking Next Button Enable is failed because of no element");
			}
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);

		}
//
////		Before move to 2nd page, previous button disable
		@Test(priority = 7)
		public static void SecPagepreButDisable() throws InterruptedException {
			try {
				Thread.sleep(2000);
				WebElement PreviousPageBtn =driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/ul/li[2]/button"));

				boolean ActualPreviousBtnDisable = PreviousPageBtn.isEnabled();
				boolean ExpectedPreviousBtnDisable = false;
				testCase = extent.createTest("STEP-07 Checking Before navigate to 2 Page Previous Button is Disabled");
				try {
					Assert.assertEquals(ActualPreviousBtnDisable, ExpectedPreviousBtnDisable);
					testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
					testCase.log(Status.PASS, "Enable element");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
					testCase.log(Status.FAIL, "Not Enable Element");
				}
			} catch (Exception e) {
				testCase.log(Status.FAIL, "No Element");
				testCase = extent.createTest(
						"STEP-07 Checking Before navigate to 2 Page Previous Button is Disabledc is failed because of no element");
			}

		}
//
////			After move to 2nd page, previous button Enable
		@Test(priority = 8)
		public static void AfterMovetoSecPagepreButEnable() throws InterruptedException {
			try {
				WebElement PreviousPageBtn =driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/ul/li[2]/button"));

				loginpage.nxtpage.click();
				Thread.sleep(2000);
				boolean ActualPreviousBtnEnable = PreviousPageBtn.isEnabled();
				boolean ExpectedPreviousBtnEnable = true;
				testCase = extent.createTest("STEP-08 Checking After Navigate to the Seconfd Page Previous button Enabled");
				try {
					Assert.assertEquals(ActualPreviousBtnEnable, ExpectedPreviousBtnEnable);
					testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnEnable);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnEnable);
					testCase.log(Status.PASS, "Enable element");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnEnable);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnEnable);
					testCase.log(Status.FAIL, "Not Enable Element");
				}
			} catch (Exception e) {
				testCase.log(Status.FAIL, "No Element");
				testCase = extent.createTest(
						"STEP-08 Checking After Navigate to the Seconfd Page Previous button Enabled is failed because of no element");
			}

			driver.navigate().refresh();
			Thread.sleep(2000);
		}
//
//		@Test(priority = 10)
//		public static void TotalPages() throws InterruptedException {
//
//			String DataCountText = loginpage.paginationCount.getText();
//			System.out.println(DataCountText);
//			Pattern pattern = Pattern.compile("\\d+ of (\\d+)");
//			Matcher matcher = pattern.matcher(DataCountText);
//			if (matcher.find()) {
//				String pageCount = matcher.group(1);
//				System.out.println("Total pages: " + pageCount);
//
//				int Expected = 3;
//				testCase = extent.createTest("STEP-9 Checking Total Page for 10 Data per page");
//				try {
//					Assert.assertEquals(pageCount, Expected);
//					testCase.log(Status.INFO, "ActualElement :- " + pageCount);
//					testCase.log(Status.INFO, "ExpectedElement :- " + Expected);
//					testCase.log(Status.PASS, "Enable element");
//				} catch (AssertionError e) {
//					testCase.log(Status.INFO, "ActualElement :- " + pageCount);
//					testCase.log(Status.INFO, "ExpectedElement :- " + Expected);
//					testCase.log(Status.FAIL, "Not Enable Element");
//				}
//			}
////		//testCase = extent.createTest("STEP-09 -PAGINATION-TOTAL-COUNT:" + ActualTotalPage );
//		}
//	//	
//
//		public static void Pages() throws InterruptedException {
//
//			// Thread.sleep(2000);
//			int ActualTotalPage = 1;
//			boolean Enablity = loginpage.NextPageBtn.isEnabled();
//			while (Enablity) {
//				Thread.sleep(1000);
//				loginpage.NextPageBtn.click();
//				ActualTotalPage = ActualTotalPage + 1;
//				Enablity = loginpage.NextPageBtn.isEnabled();
//			}
//			System.out.println(ActualTotalPage);
//			Thread.sleep(2000);
//
//			if (loginpage.CurrentPaginationOpction.getText().contentEquals("10 / page")) {
//				int ExpectedTotalPage = 3;
//				testCase = extent.createTest("STEP-09 Checking Total Page for 10 Data per page");
//				try {
//					Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
//					testCase.log(Status.INFO,
//							"Current Pagination Opction :- " + loginpage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.PASS, "Correct Page Count");
//				} catch (AssertionError e) {
//					testCase.log(Status.INFO,
//							"Current Pagination Opction :- " + loginpage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.FAIL, "Wrong Page Count");
//				}
//			} else if (loginpage.CurrentPaginationOpction.getText().contentEquals("20 / page")) {
//				int ExpectedTotalPage = 2;
//				testCase = extent.createTest("STEP-10 Checking Total Page for 20 Data per page");
//				try {
//					Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
//					testCase.log(Status.INFO,
//							"Current Pagination Opction :- " + loginpage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.PASS, "Correct Page Count");
//				} catch (AssertionError e) {
//					testCase.log(Status.INFO,
//							"Current Pagination Opction :- " + loginpage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.FAIL, "Wrong Page Count");
//				}
//			} else if (loginpage.CurrentPaginationOpction.getText().contentEquals("30 / page")) {
//				int ExpectedTotalPage = 1;
//				testCase = extent.createTest("STEP-11 Checking Total Page for 30 Data per page");
//				try {
//					Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
//					testCase.log(Status.INFO,
//							"Current Pagination Opction :- " + loginpage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.PASS, "Correct Page Count");
//				} catch (AssertionError e) {
//					testCase.log(Status.INFO,
//							"Current Pagination Opction :- " + loginpage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.FAIL, "Wrong Page Count");
//				}
//			} else if (loginpage.CurrentPaginationOpction.getText().contentEquals("100 / page")) {
//				int ExpectedTotalPage = 1;
//				testCase = extent.createTest("STEP-12 Checking Total Page for 100 Data per page");
//				try {
//					Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
//					testCase.log(Status.INFO,
//							"Current Pagination Opction :- " + loginpage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.PASS, "Correct Page Count");
//				} catch (AssertionError e) {
//					testCase.log(Status.INFO,
//							"Current Pagination Opction :- " + loginpage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.FAIL, "Wrong Page Count");
//				}
//
//			}
//
//			driver.navigate().refresh();
//			Thread.sleep(2000);
//
//		}
//
//
//			}
//
//		}

	}
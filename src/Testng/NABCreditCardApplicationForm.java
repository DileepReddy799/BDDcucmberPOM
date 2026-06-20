package Testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class NABCreditCardApplicationForm {

    private WebDriver driver;
    private WebDriverWait wait;

    // ─── URL ───────────────────────────────────────────────────────────────────
    private static final String URL =
        "https://www.nab.com.au/common/forms/creditcards-form" +
        "?products=nab-low-rate-card&campaignCode=OMP";

    // ─── Locators ──────────────────────────────────────────────────────────────

    // Credit-limit radio buttons
    private final By maximumApprovedLimitRadio =
        By.xpath("//label[contains(text(),'Maximum approved limit')]/..//input[@type='radio']");

    private final By chooseAnotherAmountRadio =
        By.xpath("//label[contains(text(),'Choose another amount')]/..//input[@type='radio']");

    // Balance-transfer Yes / No buttons
    private final By balanceTransferYesBtn =
        By.xpath("//button[normalize-space()='Yes']");

    private final By balanceTransferNoBtn =
        By.xpath("//button[normalize-space()='No']");

    // Navigation
    private final By nextBtn =
        By.xpath("//button[normalize-space()='Next']");

    // Notification banner close (optional)
    private final By closeBannerBtn =
        By.xpath("//button[@aria-label='Close' or @class='close-button']");

    // ─── Setup ─────────────────────────────────────────────────────────────────

    public void setUp() {
        // Set path if not using WebDriverManager
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // ─── Page Actions ──────────────────────────────────────────────────────────

    /** Open the credit-card application URL */
    public void openPage() {
        driver.get(URL);
        System.out.println("Opened NAB Credit Card Application Form.");
    }

    /**
     * Select credit-limit option.
     * @param useMaximum  true → Maximum approved limit; false → Choose another amount
     */
    public void selectCreditLimitOption(boolean useMaximum) {
        By locator = useMaximum ? maximumApprovedLimitRadio : chooseAnotherAmountRadio;
        WebElement radio = wait.until(ExpectedConditions.elementToBeClickable(locator));
        radio.click();
        System.out.println("Selected credit limit: " +
            (useMaximum ? "Maximum approved limit (Up to $30,000)" : "Choose another amount"));
    }

    /**
     * Answer the balance-transfer question.
     * @param wantTransfer  true → Yes; false → No
     */
    public void selectBalanceTransfer(boolean wantTransfer) {
        By locator = wantTransfer ? balanceTransferYesBtn : balanceTransferNoBtn;
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(locator));
        btn.click();
        System.out.println("Balance transfer selected: " + (wantTransfer ? "Yes" : "No"));
    }

    /** Click the Next button to proceed to the next section */
    public void clickNext() {
        WebElement next = wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
        next.click();
        System.out.println("Clicked Next button.");
    }

    /** Dismiss the cookie / privacy notification banner if present */
    public void closeBannerIfPresent() {
        try {
            WebElement banner = driver.findElement(closeBannerBtn);
            if (banner.isDisplayed()) {
                banner.click();
                System.out.println("Dismissed notification banner.");
            }
        } catch (Exception e) {
            System.out.println("No dismissible banner found — continuing.");
        }
    }

    // ─── Teardown ──────────────────────────────────────────────────────────────

    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }

    // ─── Full Test Flow ────────────────────────────────────────────────────────

    public static void main(String[] args) {
        NABCreditCardApplicationForm form = new NABCreditCardApplicationForm();
        try {
            form.setUp();
            form.openPage();
            form.closeBannerIfPresent();

            // ── "Your card" section ──
            form.selectCreditLimitOption(true);   // Maximum approved limit
            form.selectBalanceTransfer(false);     // No balance transfer
            form.clickNext();                      // Proceed to "About you"

        } catch (Exception e) {
            System.err.println("Test failed: " + e.getMessage());
            e.printStackTrace();
        } finally {
            form.tearDown();
        }
    }
}
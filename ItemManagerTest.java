import org.junit.*;
import java.util.List;
import static org.junit.Assert.*;

public class ItemManagerTest {

    private ItemManager itemManager;

    @BeforeClass // This method runs once before any of the tests in this class
    public static void beforeAllTests() {
        System.out.println("==> @BeforeClass: Runs once before all tests.");
    }

    @AfterClass    // This method runs once after all the tests in this class have run
    public static void afterAllTests() {
        System.out.println("==> @AfterClass: Runs once after all tests.");
    }

    @Before // This method runs before each test method in this class
    public void setUp() {
        System.out.println("--> @Before: Runs before each test.");
        itemManager = new ItemManager();
        itemManager.initialize();
    }

    @After // This method runs after each test method in this class
    public void tearDown() {
        System.out.println("<-- @After: Runs after each test.");
        itemManager.clearItems(); // Clear items after each test to ensure a clean state
    }

    @Test // This annotation marks this method as a test method
    public void testAddItem() {
        System.out.println(">> @Test: testAddItem");
        itemManager.addItem("Book");
        List<String> items = itemManager.getItems();
        assertEquals(1, items.size());
        assertTrue(items.contains("Book"));
    }

    @Test // This annotation marks this method as a test method
    public void testEmptyListAfterInit() {
        System.out.println(">> @Test: testEmptyListAfterInit");
        List<String> items = itemManager.getItems();
        assertTrue(items.isEmpty()); // Check if the list is empty after initialization
    }
}

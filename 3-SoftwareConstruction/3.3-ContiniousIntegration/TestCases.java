import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;

public class SettingsTest {

    @Test
    public void testChangeStatus_WhenUserIDIsNull_ReturnsMinusOne() {
        Settings settings = new Settings();
        int result = settings.changeStatus(null, "online");
        assertEquals(-1, result);
    }

    @Test
    public void testChangeStatus_WhenUserIDIsEmpty_ReturnsMinusOne() {
        Settings settings = new Settings();
        int result = settings.changeStatus("", "offline");
        assertEquals(-1, result);
    }

    @Test
    public void testChangeStatus_WhenNewStatusIsInvalid_ReturnsMinusTwo() {
        Settings settings = new Settings();
        int result = settings.changeStatus("user123", "invalid_status");
        assertEquals(-2, result);
    }

    @Test
    public void testChangeStatus_WhenNewStatusIsOnline_UpdatesStatusAndReturnsOne() {
        Settings settings = new Settings();
        int result = settings.changeStatus("user123", "online");
        assertEquals(1, result);
        assertEquals("online", settings.getStatus());
    }

    @Test
    public void testChangeStatus_WhenNewStatusIsOffline_UpdatesStatusAndReturnsOne() {
        Settings settings = new Settings();
        int result = settings.changeStatus("user123", "offline");
        assertEquals(1, result);
        assertEquals("offline", settings.getStatus());
    }
} 

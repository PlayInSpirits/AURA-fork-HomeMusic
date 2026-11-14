package aura.smoke;

import android.app.Activity;
import android.app.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.annotation.ConscryptMode;
import org.robolectric.shadows.ShadowLog;
import org.robolectric.shadows.ShadowLooper;

/** Starts the Application and the launcher activity exactly like a cold app start. */
@RunWith(RobolectricTestRunner.class)
@Config(sdk = 34)
// Robolectric's bundled Conscrypt clashes with the app's own org.conscrypt stubs (affects the original HomeMusic too).
@ConscryptMode(ConscryptMode.Mode.OFF)
public class BootTest {
    private static final String MAIN = "com.eddyizm.tempus.ui.activity.MainActivity";

    @Before
    public void logs() {
        ShadowLog.stream = System.out;
    }

    @Test
    public void application() {
        Application app = RuntimeEnvironment.getApplication();
        ShadowLooper.idleMainLooper();
        System.out.println("[" + System.getProperty("aura.variant") + "] APPLICATION OK " + app.getClass().getName());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void mainActivity() throws Exception {
        Class<? extends Activity> c = (Class<? extends Activity>) Class.forName(MAIN);
        Activity a = Robolectric.buildActivity(c).setup().get();
        ShadowLooper.idleMainLooper();
        System.out.println("[" + System.getProperty("aura.variant") + "] MAIN ACTIVITY OK " + a + " finishing=" + a.isFinishing());
    }
}

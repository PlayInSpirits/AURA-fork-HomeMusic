package defpackage;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.eddyizm.tempus.ui.activity.MainActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kz0 {
    public static /* synthetic */ ShortcutInfo.Builder d(MainActivity mainActivity) {
        return new ShortcutInfo.Builder(mainActivity, "login_activity_shortcut");
    }

    public static /* bridge */ /* synthetic */ ShortcutManager f(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return ShortcutManager.class;
    }
}

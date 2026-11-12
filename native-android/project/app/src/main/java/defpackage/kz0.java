package defpackage;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.view.inputmethod.EditorInfo;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kz0 {
    public static /* bridge */ /* synthetic */ ShortcutInfo.Builder a(ShortcutInfo.Builder r0, Icon r1) {
        return r0.setIcon(r1);
    }

    public static /* bridge */ /* synthetic */ ShortcutInfo.Builder b(ShortcutInfo.Builder r0, String r1) {
        return r0.setShortLabel(r1);
    }

    public static /* bridge */ /* synthetic */ ShortcutInfo.Builder c(ShortcutInfo.Builder r0, Intent[] r1) {
        return r0.setIntents(r1);
    }

    public static /* synthetic */ ShortcutInfo.Builder d(MainActivity r2) {
        return new ShortcutInfo.Builder(r2, "login_activity_shortcut");
    }

    public static /* bridge */ /* synthetic */ ShortcutInfo e(ShortcutInfo.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ ShortcutManager f(Object r0) {
        return (ShortcutManager) r0;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return ShortcutManager.class;
    }

    public static /* bridge */ /* synthetic */ void h(ShortcutManager r0, List r1) {
        r0.setDynamicShortcuts(r1);
    }

    public static /* bridge */ /* synthetic */ void i(EditorInfo r0, String[] r1) {
        r0.contentMimeTypes = r1;
    }

    public static /* bridge */ /* synthetic */ String[] j(EditorInfo r0) {
        return r0.contentMimeTypes;
    }

    public static /* bridge */ /* synthetic */ ShortcutInfo.Builder k(ShortcutInfo.Builder r0, String r1) {
        return r0.setLongLabel(r1);
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.view.inputmethod.EditorInfo;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.List;

public abstract class kz0 {
    public static ShortcutInfo.Builder a(ShortcutInfo.Builder builder, Icon icon) {
        return builder.setIcon(icon);
    }

    public static ShortcutInfo.Builder b(ShortcutInfo.Builder builder, String string) {
        return builder.setShortLabel(string);
    }

    public static ShortcutInfo.Builder c(ShortcutInfo.Builder builder, Intent[] intentArray) {
        return builder.setIntents(intentArray);
    }

    public static ShortcutInfo.Builder d(MainActivity mainActivity) {
        return new ShortcutInfo.Builder(mainActivity, "login_activity_shortcut");
    }

    public static ShortcutInfo e(ShortcutInfo.Builder builder) {
        return builder.build();
    }

    public static ShortcutManager f(Object object) {
        return (ShortcutManager)object;
    }

    public static Class g() {
        return ShortcutManager.class;
    }

    public static void h(ShortcutManager shortcutManager, List list) {
        shortcutManager.setDynamicShortcuts(list);
    }

    public static void i(EditorInfo editorInfo, String[] stringArray) {
        editorInfo.contentMimeTypes = stringArray;
    }

    public static String[] j(EditorInfo editorInfo) {
        return editorInfo.contentMimeTypes;
    }

    public static ShortcutInfo.Builder k(ShortcutInfo.Builder builder, String string) {
        return builder.setLongLabel(string);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.kn0;
import defpackage.ym;

public abstract class m3 {
    public static int a(AudioAttributes audioAttributes) {
        return audioAttributes.getSpatializationBehavior();
    }

    public static int b(Spatializer spatializer) {
        return spatializer.getImmersiveAudioLevel();
    }

    public static Spatializer c(AudioManager audioManager) {
        return audioManager.getSpatializer();
    }

    public static Spatializer d(Object object) {
        return (Spatializer)object;
    }

    public static AccessibilityNodeInfo.AccessibilityAction e() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
    }

    public static void f(AudioAttributes.Builder builder, int n16) {
        builder.setSpatializationBehavior(n16);
    }

    public static void g(AudioAttributes.Builder builder, boolean bl5) {
        builder.setIsContentSpatialized(bl5);
    }

    public static void h(Spatializer spatializer, ym ym5, kn0 kn02) {
        spatializer.addOnSpatializerStateChangedListener(ym5, kn02);
    }

    public static void i(Spatializer spatializer, kn0 kn02) {
        spatializer.removeOnSpatializerStateChangedListener(kn02);
    }

    public static boolean j(AudioAttributes audioAttributes) {
        return audioAttributes.isContentSpatialized();
    }

    public static boolean k(Spatializer spatializer) {
        return spatializer.isAvailable();
    }

    public static boolean l(Spatializer spatializer, AudioAttributes audioAttributes, AudioFormat audioFormat) {
        return spatializer.canBeSpatialized(audioAttributes, audioFormat);
    }

    public static AccessibilityNodeInfo.AccessibilityAction m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
    }

    public static boolean n(Spatializer spatializer) {
        return spatializer.isEnabled();
    }

    public static AccessibilityNodeInfo.AccessibilityAction o() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
    }
}


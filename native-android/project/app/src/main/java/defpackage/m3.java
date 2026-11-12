package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m3 {
    public static /* bridge */ /* synthetic */ int a(AudioAttributes r0) {
        return r0.getSpatializationBehavior();
    }

    public static /* bridge */ /* synthetic */ int b(Spatializer r0) {
        return r0.getImmersiveAudioLevel();
    }

    public static /* bridge */ /* synthetic */ Spatializer c(AudioManager r0) {
        return r0.getSpatializer();
    }

    public static /* bridge */ /* synthetic */ Spatializer d(Object r0) {
        return (Spatializer) r0;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction e() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
    }

    public static /* bridge */ /* synthetic */ void f(AudioAttributes.Builder r0, int r1) {
        r0.setSpatializationBehavior(r1);
    }

    public static /* bridge */ /* synthetic */ void g(AudioAttributes.Builder r0, boolean r1) {
        r0.setIsContentSpatialized(r1);
    }

    public static /* bridge */ /* synthetic */ void h(Spatializer r0, ym r1, kn0 r2) {
        r0.addOnSpatializerStateChangedListener(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void i(Spatializer r0, kn0 r1) {
        r0.removeOnSpatializerStateChangedListener(r1);
    }

    public static /* bridge */ /* synthetic */ boolean j(AudioAttributes r0) {
        return r0.isContentSpatialized();
    }

    public static /* bridge */ /* synthetic */ boolean k(Spatializer r0) {
        return r0.isAvailable();
    }

    public static /* bridge */ /* synthetic */ boolean l(Spatializer r0, AudioAttributes r1, AudioFormat r2) {
        return r0.canBeSpatialized(r1, r2);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
    }

    public static /* bridge */ /* synthetic */ boolean n(Spatializer r0) {
        return r0.isEnabled();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction o() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
    }
}

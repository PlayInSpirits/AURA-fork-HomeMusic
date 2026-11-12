package defpackage;

import android.graphics.BlendMode;
import android.net.ssl.SSLSockets;
import android.view.accessibility.AccessibilityNodeInfo;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k3 {
    public static /* bridge */ /* synthetic */ BlendMode A() {
        return BlendMode.EXCLUSION;
    }

    public static /* bridge */ /* synthetic */ BlendMode B() {
        return BlendMode.MULTIPLY;
    }

    public static /* bridge */ /* synthetic */ BlendMode C() {
        return BlendMode.HUE;
    }

    public static /* bridge */ /* synthetic */ BlendMode D() {
        return BlendMode.SATURATION;
    }

    public static /* bridge */ /* synthetic */ BlendMode a() {
        return BlendMode.CLEAR;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
    }

    public static /* bridge */ /* synthetic */ void c(AccessibilityNodeInfo r1) {
        r1.setTextEntryKey(true);
    }

    public static /* bridge */ /* synthetic */ void d(SSLSocket r1) {
        SSLSockets.setUseSessionTickets(r1, true);
    }

    public static /* bridge */ /* synthetic */ boolean e(SSLSocket r0) {
        return SSLSockets.isSupportedSocket(r0);
    }

    public static /* bridge */ /* synthetic */ BlendMode f() {
        return BlendMode.COLOR_BURN;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction g() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
    }

    public static /* bridge */ /* synthetic */ BlendMode h() {
        return BlendMode.COLOR;
    }

    public static /* bridge */ /* synthetic */ BlendMode i() {
        return BlendMode.DST_ATOP;
    }

    public static /* bridge */ /* synthetic */ BlendMode j() {
        return BlendMode.LUMINOSITY;
    }

    public static /* bridge */ /* synthetic */ BlendMode k() {
        return BlendMode.SRC_OVER;
    }

    public static /* bridge */ /* synthetic */ BlendMode l() {
        return BlendMode.DST;
    }

    public static /* bridge */ /* synthetic */ BlendMode m() {
        return BlendMode.DST_OVER;
    }

    public static /* bridge */ /* synthetic */ BlendMode n() {
        return BlendMode.SRC_IN;
    }

    public static /* bridge */ /* synthetic */ BlendMode o() {
        return BlendMode.DST_IN;
    }

    public static /* bridge */ /* synthetic */ BlendMode p() {
        return BlendMode.SRC_OUT;
    }

    public static /* bridge */ /* synthetic */ BlendMode q() {
        return BlendMode.DST_OUT;
    }

    public static /* bridge */ /* synthetic */ BlendMode r() {
        return BlendMode.SRC;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction s() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
    }

    public static /* bridge */ /* synthetic */ BlendMode t() {
        return BlendMode.SRC_ATOP;
    }

    public static /* bridge */ /* synthetic */ BlendMode u() {
        return BlendMode.XOR;
    }

    public static /* bridge */ /* synthetic */ BlendMode v() {
        return BlendMode.PLUS;
    }

    public static /* bridge */ /* synthetic */ BlendMode w() {
        return BlendMode.HARD_LIGHT;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction x() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
    }

    public static /* bridge */ /* synthetic */ BlendMode y() {
        return BlendMode.SOFT_LIGHT;
    }

    public static /* bridge */ /* synthetic */ BlendMode z() {
        return BlendMode.DIFFERENCE;
    }
}

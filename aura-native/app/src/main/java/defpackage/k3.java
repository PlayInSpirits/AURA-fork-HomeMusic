/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.BlendMode;
import android.net.ssl.SSLSockets;
import android.view.accessibility.AccessibilityNodeInfo;
import javax.net.ssl.SSLSocket;

public abstract class k3 {
    public static BlendMode A() {
        return BlendMode.EXCLUSION;
    }

    public static BlendMode B() {
        return BlendMode.MULTIPLY;
    }

    public static BlendMode C() {
        return BlendMode.HUE;
    }

    public static BlendMode D() {
        return BlendMode.SATURATION;
    }

    public static BlendMode a() {
        return BlendMode.CLEAR;
    }

    public static AccessibilityNodeInfo.AccessibilityAction b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setTextEntryKey(true);
    }

    public static void d(SSLSocket sSLSocket) {
        SSLSockets.setUseSessionTickets(sSLSocket, true);
    }

    public static boolean e(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    public static BlendMode f() {
        return BlendMode.COLOR_BURN;
    }

    public static AccessibilityNodeInfo.AccessibilityAction g() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
    }

    public static BlendMode h() {
        return BlendMode.COLOR;
    }

    public static BlendMode i() {
        return BlendMode.DST_ATOP;
    }

    public static BlendMode j() {
        return BlendMode.LUMINOSITY;
    }

    public static BlendMode k() {
        return BlendMode.SRC_OVER;
    }

    public static BlendMode l() {
        return BlendMode.DST;
    }

    public static BlendMode m() {
        return BlendMode.DST_OVER;
    }

    public static BlendMode n() {
        return BlendMode.SRC_IN;
    }

    public static BlendMode o() {
        return BlendMode.DST_IN;
    }

    public static BlendMode p() {
        return BlendMode.SRC_OUT;
    }

    public static BlendMode q() {
        return BlendMode.DST_OUT;
    }

    public static BlendMode r() {
        return BlendMode.SRC;
    }

    public static AccessibilityNodeInfo.AccessibilityAction s() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
    }

    public static BlendMode t() {
        return BlendMode.SRC_ATOP;
    }

    public static BlendMode u() {
        return BlendMode.XOR;
    }

    public static BlendMode v() {
        return BlendMode.PLUS;
    }

    public static BlendMode w() {
        return BlendMode.HARD_LIGHT;
    }

    public static AccessibilityNodeInfo.AccessibilityAction x() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
    }

    public static BlendMode y() {
        return BlendMode.SOFT_LIGHT;
    }

    public static BlendMode z() {
        return BlendMode.DIFFERENCE;
    }
}


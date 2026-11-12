package defpackage;

import android.content.Intent;
import android.credentials.Credential;
import android.credentials.GetCredentialResponse;
import android.graphics.Rect;
import android.media.MediaRoute2Info;
import android.os.Bundle;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.credentials.exceptions.GetCredentialException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a3 {
    public static GetCredentialException a(Intent r2) {
        android.credentials.GetCredentialException r3 = (android.credentials.GetCredentialException) r2.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", android.credentials.GetCredentialException.class);
        if (r3 != null) goto L6;
        return null;
    L6:
        String r0 = r3.getType();
        r0.getClass();
        return rr2.T(r3.getMessage(), r0);
    }

    public static mh1 b(Intent r2) {
        GetCredentialResponse r3 = (GetCredentialResponse) r2.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (r3 != null) goto L6;
        return null;
    L6:
        Credential r4 = r3.getCredential();
        r4.getClass();
        String r1 = r4.getType();
        r1.getClass();
        Bundle r5 = r4.getData();
        r5.getClass();
        return new mh1(gb.p(r1, r5));
    }

    public static AccessibilityNodeInfo.AccessibilityAction c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float d(VelocityTracker r0, int r1) {
        return r0.getAxisVelocity(r1);
    }

    public static void e(AccessibilityNodeInfo r0, Rect r1) {
        r0.getBoundsInWindow(r1);
    }

    public static CharSequence f(AccessibilityNodeInfo r0) {
        return r0.getContainerTitle();
    }

    public static Set g(MediaRoute2Info r0) {
        return r0.getDeduplicationIds();
    }

    public static int h(ViewConfiguration r0, int r1, int r2, int r3) {
        return r0.getScaledMaximumFlingVelocity(r1, r2, r3);
    }

    public static int i(ViewConfiguration r0, int r1, int r2, int r3) {
        return r0.getScaledMinimumFlingVelocity(r1, r2, r3);
    }

    public static int j(MediaRoute2Info r0) {
        return r0.getType();
    }

    public static boolean k(AccessibilityNodeInfo r0) {
        return r0.isAccessibilityDataSensitive();
    }

    public static boolean l(AccessibilityManager r0) {
        return r0.isRequestFromAccessibilityTool();
    }

    public static void m(AccessibilityEvent r0, boolean r1) {
        r0.setAccessibilityDataSensitive(r1);
    }

    public static void n(AccessibilityNodeInfo r0, boolean r1) {
        r0.setAccessibilityDataSensitive(r1);
    }

    public static void o(TextView r0, int r1, float r2) {
        r0.setLineHeight(r1, r2);
    }
}

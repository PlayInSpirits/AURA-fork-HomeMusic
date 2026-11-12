package defpackage;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yh {
    public static ContentCaptureSession a(View r0) {
        return r0.getContentCaptureSession();
    }

    public static String b(Context r0) {
        return r0.getOpPackageName();
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static AutofillId d(ContentCaptureSession r0, AutofillId r1, long r2) {
        return r0.newAutofillId(r1, r2);
    }

    public static ViewStructure e(ContentCaptureSession r0, AutofillId r1, long r2) {
        return r0.newVirtualViewStructure(r1, r2);
    }

    public static void f(ContentCaptureSession r0, ViewStructure r1) {
        r0.notifyViewAppeared(r1);
    }

    public static void g(ContentCaptureSession r0, AutofillId r1) {
        r0.notifyViewDisappeared(r1);
    }

    public static void h(ContentCaptureSession r0, AutofillId r1, String r2) {
        r0.notifyViewTextChanged(r1, r2);
    }

    public static void i(ContentCaptureSession r0, AutofillId r1, long[] r2) {
        r0.notifyViewsDisappeared(r1, r2);
    }

    public static Insets j(int r0, int r1, int r2, int r3) {
        return Insets.of(r0, r1, r2, r3);
    }

    public static void k(Resources.Theme r0) {
        r0.rebase();
    }

    public static final void l(Activity r0, kq3.a r1) {
        r0.registerActivityLifecycleCallbacks(r1);
    }

    public static void m(Notification.Builder r0, boolean r1) {
        r0.setAllowSystemGeneratedContextualActions(r1);
    }

    public static void n(Notification.Builder r1) {
        r1.setBubbleMetadata(null);
    }

    public static void o(Notification.Action.Builder r1) {
        r1.setContextual(false);
    }

    public static void p(SystemForegroundService r0, int r1, Notification r2, int r3) {
        r0.startForeground(r1, r2, r3);
    }

    public static void q(SystemForegroundService r2, int r3, Notification r4, int r5) {
        r2.startForeground(r3, r4, r5);     // Catch: SecurityException -> L5 ForegroundServiceStartNotAllowedException -> L9
        return;
    L9:
        e = move-exception;
        cx r6 = cx.f();
        String r7 = SystemForegroundService.r;
        if (r6.a > 5) goto L18;
        Log.w(r7, "Unable to start foreground service", e);
        return;
    L18:
        return;
    L5:
        e = move-exception;
        cx r8 = cx.f();
        String r9 = SystemForegroundService.r;
        if (r8.a > 5) goto L16;
        Log.w(r9, "Unable to start foreground service", e);
        return;
    }
}

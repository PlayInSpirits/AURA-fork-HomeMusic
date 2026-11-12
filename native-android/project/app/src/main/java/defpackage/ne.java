package defpackage;

import android.app.Application;
import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ne {
    public static Handler a(Looper r0) {
        return Handler.createAsync(r0);
    }

    public static Handler b(Looper r0) {
        return Handler.createAsync(r0);
    }

    public static List c(DisplayCutout r0) {
        return r0.getBoundingRects();
    }

    public static String[] d(DecimalFormatSymbols r0) {
        return r0.getDigitStrings();
    }

    public static Executor e(Context r0) {
        return r0.getMainExecutor();
    }

    public static void f(JobParameters r0) {
        r0.getNetwork();
    }

    public static String g() {
        String r0 = Application.getProcessName();
        r0.getClass();
        return r0;
    }

    public static int h(Object r0) {
        return ((Icon) r0).getResId();
    }

    public static String i(Object r0) {
        return ((Icon) r0).getResPackage();
    }

    public static int j(DisplayCutout r0) {
        return r0.getSafeInsetBottom();
    }

    public static int k(DisplayCutout r0) {
        return r0.getSafeInsetLeft();
    }

    public static int l(DisplayCutout r0) {
        return r0.getSafeInsetRight();
    }

    public static int m(DisplayCutout r0) {
        return r0.getSafeInsetTop();
    }

    public static int n(ViewConfiguration r0) {
        return r0.getScaledHoverSlop();
    }

    public static PrecomputedText.Params o(mh r0) {
        return r0.getTextMetricsParams();
    }

    public static int p(Object r0) {
        return ((Icon) r0).getType();
    }

    public static Uri q(Object r0) {
        return ((Icon) r0).getUri();
    }

    public static void r(TextView r0, int r1) {
        r0.setFirstBaselineToTopHeight(r1);
    }

    public static void s(Notification.Action.Builder r1) {
        r1.setSemanticAction(0);
    }

    public static boolean t(ViewConfiguration r0) {
        return r0.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}

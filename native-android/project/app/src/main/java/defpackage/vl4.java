package defpackage;

import android.app.job.JobInfo;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.net.NetworkRequest;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vl4 {
    public static /* bridge */ /* synthetic */ int a(Typeface r0) {
        return r0.getWeight();
    }

    public static /* bridge */ /* synthetic */ Bitmap b(Picture r0) {
        return Bitmap.createBitmap(r0);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout c(WindowInsets r0) {
        return r0.getDisplayCutout();
    }

    public static /* bridge */ /* synthetic */ WindowInsets d(WindowInsets r0) {
        return r0.consumeDisplayCutout();
    }

    public static /* bridge */ /* synthetic */ void e(JobInfo.Builder r1) {
        r1.setImportantWhileForeground(true);
    }

    public static /* bridge */ /* synthetic */ void f(JobInfo.Builder r0, NetworkRequest r1) {
        r0.setRequiredNetwork(r1);
    }

    public static /* bridge */ /* synthetic */ void g(StaticLayout.Builder r1) {
        r1.setUseLineSpacingFromFallbacks(true);
    }

    public static /* bridge */ /* synthetic */ void h(View r0, int r1) {
        r0.setOutlineSpotShadowColor(r1);
    }

    public static /* bridge */ /* synthetic */ boolean i(CharSequence r0) {
        return r0 instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ void j(JobInfo.Builder r0, NetworkRequest r1) {
        r0.setRequiredNetwork(r1);
    }

    public static /* bridge */ /* synthetic */ void k(View r0, int r1) {
        r0.setOutlineAmbientShadowColor(r1);
    }
}

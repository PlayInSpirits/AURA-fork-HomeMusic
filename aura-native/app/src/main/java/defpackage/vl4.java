/*
 * Decompiled with CFR 0.152.
 */
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

public abstract class vl4 {
    public static int a(Typeface typeface) {
        return typeface.getWeight();
    }

    public static Bitmap b(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    public static DisplayCutout c(WindowInsets windowInsets) {
        return windowInsets.getDisplayCutout();
    }

    public static WindowInsets d(WindowInsets windowInsets) {
        return windowInsets.consumeDisplayCutout();
    }

    public static void e(JobInfo.Builder builder) {
        builder.setImportantWhileForeground(true);
    }

    public static void f(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.setRequiredNetwork(networkRequest);
    }

    public static void g(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static void h(View view, int n16) {
        view.setOutlineSpotShadowColor(n16);
    }

    public static boolean i(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static void j(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.setRequiredNetwork(networkRequest);
    }

    public static void k(View view, int n16) {
        view.setOutlineAmbientShadowColor(n16);
    }
}


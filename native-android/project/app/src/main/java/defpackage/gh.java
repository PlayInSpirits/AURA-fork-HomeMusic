package defpackage;

import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gh {
    public static int a(TextView r0) {
        return r0.getAutoSizeStepGranularity();
    }

    public static void b(TextView r0, int r1, int r2, int r3, int r4) {
        r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4);
    }

    public static void c(TextView r0, int[] r1, int r2) {
        r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2);
    }

    public static boolean d(TextView r0, String r1) {
        return r0.setFontVariationSettings(r1);
    }
}

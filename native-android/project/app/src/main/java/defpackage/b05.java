package defpackage;

import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.os.StrictMode;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b05 {
    public static /* bridge */ /* synthetic */ int a(PositionedGlyphs r0) {
        return r0.glyphCount();
    }

    public static /* bridge */ /* synthetic */ int b(SparseArray r0) {
        return r0.contentHashCode();
    }

    public static /* synthetic */ Font.Builder c(Font r1) {
        return new Font.Builder(r1);
    }

    public static /* bridge */ /* synthetic */ Font d(PositionedGlyphs r1) {
        return r1.getFont(0);
    }

    public static /* bridge */ /* synthetic */ StrictMode.VmPolicy.Builder e(StrictMode.VmPolicy.Builder r0) {
        return r0.permitUnsafeIntentLaunch();
    }

    public static /* bridge */ /* synthetic */ boolean f(SparseArray r0, SparseArray r1) {
        return r0.contentEquals(r1);
    }
}

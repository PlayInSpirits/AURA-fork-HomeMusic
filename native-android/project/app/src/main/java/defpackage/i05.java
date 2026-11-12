package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class i05 extends vr1 {
    public static Font L(FontFamily r5, int r6) {
        if ((r6 & 1) == 0) goto L5;
        int r1 = 700;
    L6:
        int r3 = 1;
        if ((r6 & 2) == 0) goto L9;
        int r7 = 1;
    L10:
        FontStyle r0 = new FontStyle(r1, r7);
        Font r8 = r5.getFont(0);
        int r2 = O(r0, r8.getStyle());
    L12:
        if (r3 >= r5.getSize()) goto L17;
        Font r4 = r5.getFont(r3);
        int r9 = O(r0, r4.getStyle());
        if (r9 >= r2) goto L16;
        r8 = r4;
        r2 = r9;
    L16:
        r3 = r3 + 1;
        goto L12
    L17:
        return r8;
    L9:
        r7 = 0;
        goto L10
    L5:
        r1 = 400;
        goto L6
    }

    public static int O(FontStyle r2, FontStyle r3) {
        int r0 = Math.abs(r2.getWeight() - r3.getWeight()) / 100;
        if (r2.getSlant() != r3.getSlant()) goto L5;
        int r4 = 0;
    L7:
        return r0 + r4;
    L5:
        r4 = 2;
        goto L7
    }

    public final FontFamily M(ib1[] r10, ContentResolver r11) {
        int r0 = r10.length;
        int r2 = 0;
        FontFamily.Builder r3 = null;
    L3:
        if (r2 >= r0) goto L34;
        ib1 r4 = r10[r2];
        if (Objects.equals(r4.a.getScheme(), "systemfont") == false) goto L40;
        Font r5 = N(r4);
    L28:
        if (r5 == null) goto L33;
        if (r3 != null) goto L32;
        r3 = new FontFamily.Builder(r5);
        goto L33
    L32:
        r3.addFont(r5);
    L33:
        r2 = r2 + 1;
        goto L3
    L40:
        Uri r6 = r4.a;     // Catch: IOException -> L12
        String r7 = r4.e;     // Catch: IOException -> L12
        ParcelFileDescriptor r8 = r11.openFileDescriptor(r6, "r", null);     // Catch: IOException -> L12
        if (r8 != null) goto L38;
        if (r8 == null) goto L11;
        r8.close();     // Catch: IOException -> L12
    L11:
        r5 = null;
        goto L28
    L38:
        Font.Builder r9 = new Font.Builder(r8).setWeight(r4.c).setSlant(r4.d ? 1 : 0).setTtcIndex(r4.b);     // Catch: Throwable -> L17
        if (TextUtils.isEmpty(r7) == true) goto L19;
        r9.setFontVariationSettings(r7);     // Catch: Throwable -> L17
    L19:
        r5 = r9.build();     // Catch: Throwable -> L17
        r8.close();     // Catch: IOException -> L12
        goto L28
    L17:
        th = move-exception;
        r8.close();     // Catch: Throwable -> L24
    L26:
        throw th;     // Catch: IOException -> L12
    L24:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L12
    L12:
        e = move-exception;
        Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
        goto L11
    L34:
        if (r3 != null) goto L37;
        return null;
    L37:
        return r3.build();
    }

    public Font N(ib1 r1) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.vr1
    public final Typeface e(Context r6, ya1 r7, Resources r8, int r9) {
        za1[] r10 = r7.a;     // Catch: Exception -> L9
        int r11 = r10.length;     // Catch: Exception -> L9
        int r0 = 0;
        FontFamily.Builder r1 = null;
    L4:
        if (r0 >= r11) goto L13;
        za1 r2 = r10[r0];     // Catch: Exception -> L9
        Font r3 = new Font.Builder(r8, r2.f).setWeight(r2.b).setSlant(r2.c ? 1 : 0).setTtcIndex(r2.e).setFontVariationSettings(r2.d).build();     // Catch: Exception -> L9 IOException -> L19
        if (r1 != null) goto L11;
        r1 = new FontFamily.Builder(r3);     // Catch: Exception -> L9 IOException -> L19
        goto L12
    L11:
        r1.addFont(r3);     // Catch: Exception -> L9 IOException -> L19
    L12:
        r0 = r0 + 1;
        goto L4
    L13:
        if (r1 != null) goto L15;
        return null;
    L15:
        FontFamily r12 = r1.build();     // Catch: Exception -> L9
        return new Typeface.CustomFallbackBuilder(r12).setStyle(L(r12, r9).getStyle()).build();
    L9:
        e = move-exception;
        Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
        return null;
    }

    @Override // defpackage.vr1
    public final Typeface f(Context r2, ib1[] r3, int r4) {
        FontFamily r1 = M(r3, r2.getContentResolver());     // Catch: Exception -> L8
        if (r1 != null) goto L6;
        return null;
    L6:
        return new Typeface.CustomFallbackBuilder(r1).setStyle(L(r1, r4).getStyle()).build();
    L8:
        e = move-exception;
        Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
        return null;
    }

    @Override // defpackage.vr1
    public final Typeface g(Context r6, List r7, int r8) {
        ContentResolver r9 = r6.getContentResolver();
        FontFamily r0 = M((ib1[]) r7.get(0), r9);     // Catch: Exception -> L12
        if (r0 != null) goto L6;
        return null;
    L6:
        Typeface.CustomFallbackBuilder r2 = new Typeface.CustomFallbackBuilder(r0);     // Catch: Exception -> L12
        int r3 = 1;
    L8:
        if (r3 >= r7.size()) goto L15;
        FontFamily r4 = M((ib1[]) r7.get(r3), r9);     // Catch: Exception -> L12
        if (r4 == null) goto L14;
        r2.addCustomFallback(r4);     // Catch: Exception -> L12
    L14:
        r3 = r3 + 1;     // Catch: Exception -> L12
        goto L8
    L15:
        return r2.setStyle(L(r0, r8).getStyle()).build();
    L12:
        e = move-exception;
        Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
        return null;
    }

    @Override // defpackage.vr1
    public final Typeface h(Context r1, Resources r2, int r3, String r4, int r5) {
        Font r0 = new Font.Builder(r2, r3).build();     // Catch: Exception -> L4
        return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(r0).build()).setStyle(r0.getStyle()).build();
    L4:
        e = move-exception;
        Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
        return null;
    }
}

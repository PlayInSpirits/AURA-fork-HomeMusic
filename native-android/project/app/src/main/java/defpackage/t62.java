package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t62 {
    public final CharSequence a;
    public final TextPaint b;
    public final int c;
    public float d;
    public float e;
    public BoringLayout.Metrics f;
    public boolean g;
    public CharSequence h;

    public t62(CharSequence r1, TextPaint r2, int r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = Float.NaN;
        this.e = Float.NaN;
    }

    public final BoringLayout.Metrics a() {
        if (this.g == true) goto L13;
        TextDirectionHeuristic r0 = ns4.b(this.c);
        int r1 = Build.VERSION.SDK_INT;
        CharSequence r3 = this.a;
        TextPaint r4 = this.b;
        if (r1 < 33) goto L8;
        BoringLayout.Metrics r2 = n3.f(r3, r4, r0);
    L11:
        this.f = r2;
        this.g = true;
        goto L13
    L8:
        if (r0.isRtl(r3, 0, r3.length()) == true) goto L10;
        r2 = BoringLayout.isBoring(r3, r4, null);
        goto L11
    L10:
        r2 = null;
    L13:
        return this.f;
    }

    public final CharSequence b() {
        CharSequence r0 = this.h;
        if (r0 != null) goto L26;
        CharSequence r1 = this.a;
        if ((r1 instanceof Spanned) == false) goto L24;
        Spanned r2 = (Spanned) r1;
        if (bu.q(r2, CharacterStyle.class) == false) goto L24;
        int r4 = 0;
        CharacterStyle[] r3 = (CharacterStyle[]) r2.getSpans(0, r1.length(), CharacterStyle.class);
        if (r3 == null) goto L24;
        if (r3.length == 0) goto L24;
        int r5 = r3.length;
        SpannableString r6 = null;
    L15:
        if (r4 >= r5) goto L22;
        CharacterStyle r7 = r3[r4];
        if ((r7 instanceof MetricAffectingSpan) == true) goto L21;
        if (r6 != null) goto L20;
        r6 = new SpannableString(r1);
    L20:
        r6.removeSpan(r7);
    L21:
        r4 = r4 + 1;
        goto L15
    L22:
        if (r6 == null) goto L24;
        r1 = r6;
    L24:
        this.h = r1;
        return r1;
    L26:
        r0.getClass();
        return r0;
    }

    public final float c() {
        if (Float.isNaN(this.d) == false) goto L5;
        BoringLayout.Metrics r0 = a();
        if (r0 == null) goto L9;
        int r1 = r0.width;
    L10:
        float r2 = r1;
        TextPaint r3 = this.b;
        if (r2 >= 0.0f) goto L14;
        r2 = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), r3));
    L14:
        if (r2 == 0.0f) goto L26;
        CharSequence r4 = this.a;
        if ((r4 instanceof Spanned) == false) goto L23;
        Spanned r5 = (Spanned) r4;
        if (bu.q(r5, i92.class) == false) goto L21;
    L25:
        r2 = r2 + 0.5f;
        goto L26
    L21:
        if (bu.q(r5, h92.class) == true) goto L25;
    L23:
        if (r3.getLetterSpacing() != 0.0f) goto L25;
    L26:
        this.d = r2;
        return r2;
    L9:
        r1 = -1;
        goto L10
    L5:
        return this.d;
    }
}

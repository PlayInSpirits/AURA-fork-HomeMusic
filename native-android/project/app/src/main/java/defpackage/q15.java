package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q15 implements Spannable {
    public boolean n;
    public Spannable o;

    public q15(Spannable r2) {
        this.n = false;
        this.o = r2;
    }

    public final void a() {
        Spannable r0 = this.o;
        if (this.n == false) goto L5;
    L11:
        this.n = true;
        return;
    L5:
        if (Build.VERSION.SDK_INT >= 28) goto L7;
        xi4 r1 = new xi4(25);
    L9:
        if (r1.t(r0) == false) goto L11;
        this.o = new SpannableString(r0);
        goto L11
    L7:
        r1 = new p15(25);
        goto L9
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r1) {
        return this.o.charAt(r1);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.o.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.o.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object r1) {
        return this.o.getSpanEnd(r1);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object r1) {
        return this.o.getSpanFlags(r1);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object r1) {
        return this.o.getSpanStart(r1);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int r1, int r2, Class r3) {
        return this.o.getSpans(r1, r2, r3);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.o.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int r1, int r2, Class r3) {
        return this.o.nextSpanTransition(r1, r2, r3);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object r1) {
        a();
        this.o.removeSpan(r1);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object r1, int r2, int r3, int r4) {
        a();
        this.o.setSpan(r1, r2, r3, r4);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int r1, int r2) {
        return this.o.subSequence(r1, r2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.o.toString();
    }
}

package defpackage;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g00 {
    public static final boolean[] A = null;
    public static final int[] B = null;
    public static final int[] C = null;
    public static final int[] D = null;
    public static final int[] E = null;
    public static final int v = 0;
    public static final int w = 0;
    public static final int[] x = null;
    public static final int[] y = null;
    public static final int[] z = null;
    public final ArrayList a;
    public final SpannableStringBuilder b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    static {
        v = c(2, 2, 2, 0);
        int r2 = c(0, 0, 0, 0);
        w = r2;
        int r3 = c(0, 0, 0, 3);
        x = new int[]{0, 0, 0, 0, 0, 2, 0};
        y = new int[]{0, 0, 0, 0, 0, 0, 2};
        z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{r2, r3, r2, r2, r3, r2, r2};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{r2, r2, r2, r2, r2, r3, r3};
    }

    public g00() {
        this.a = new ArrayList();
        this.b = new SpannableStringBuilder();
        d();
    }

    public static int c(int r4, int r5, int r6, int r7) {
        rr2.q(r4, 4);
        rr2.q(r5, 4);
        rr2.q(r6, 4);
        rr2.q(r7, 4);
        int r0 = 0;
        if (r7 == 0) goto L9;
        if (r7 == 1) goto L9;
        if (r7 != 2) goto L8;
        int r8 = 127;
    L12:
        if (r4 <= 1) goto L14;
        int r9 = 255;
    L15:
        if (r5 <= 1) goto L17;
        int r10 = 255;
    L18:
        if (r6 <= 1) goto L21;
        r0 = 255;
    L21:
        return Color.argb(r8, r9, r10, r0);
    L17:
        r10 = 0;
        goto L18
    L14:
        r9 = 0;
        goto L15
    L8:
        if (r7 != 3) goto L9;
        r8 = 0;
    L9:
        r8 = 255;
        goto L12
    }

    public final void a(char r4) {
        SpannableStringBuilder r1 = this.b;
        if (r4 != '\n') goto L24;
        SpannableString r5 = b();
        ArrayList r0 = this.a;
        r0.add(r5);
        r1.clear();
        if (this.o == (-1)) goto L8;
        this.o = 0;
    L8:
        if (this.p == (-1)) goto L11;
        this.p = 0;
    L11:
        if (this.q == (-1)) goto L14;
        this.q = 0;
    L14:
        if (this.s == (-1)) goto L17;
        this.s = 0;
    L17:
        if (r0.size() >= this.j) goto L23;
        if (r0.size() >= 15) goto L23;
        this.u = r0.size();
        return;
    L23:
        r0.remove(0);
        goto L17
    L24:
        r1.append(r4);
    }

    public final SpannableString b() {
        SpannableStringBuilder r0 = new SpannableStringBuilder(this.b);
        int r1 = r0.length();
        if (r1 <= 0) goto L17;
        if (this.o == (-1)) goto L8;
        r0.setSpan(new StyleSpan(2), this.o, r1, 33);
    L8:
        if (this.p == (-1)) goto L11;
        r0.setSpan(new UnderlineSpan(), this.p, r1, 33);
    L11:
        if (this.q == (-1)) goto L14;
        r0.setSpan(new ForegroundColorSpan(this.r), this.q, r1, 33);
    L14:
        if (this.s == (-1)) goto L17;
        r0.setSpan(new BackgroundColorSpan(this.t), this.s, r1, 33);
    L17:
        return new SpannableString(r0);
    }

    public final void d() {
        this.a.clear();
        this.b.clear();
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.s = -1;
        this.u = 0;
        this.c = false;
        this.d = false;
        this.e = 4;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 15;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        int r0 = w;
        this.n = r0;
        this.r = v;
        this.t = r0;
    }

    public final void e(boolean r6, boolean r7) {
        int r0 = this.o;
        SpannableStringBuilder r2 = this.b;
        if (r0 == (-1)) goto L6;
        if (r6 == true) goto L9;
        r2.setSpan(new StyleSpan(2), this.o, r2.length(), 33);
        this.o = -1;
    L9:
        if (this.p == (-1)) goto L13;
        if (r7 == true) goto L16;
        r2.setSpan(new UnderlineSpan(), this.p, r2.length(), 33);
        this.p = -1;
        return;
    L16:
        return;
    L13:
        if (r7 == false) goto L17;
        this.p = r2.length();
        return;
    L17:
        return;
    L6:
        if (r6 == false) goto L9;
        this.o = r2.length();
        goto L9
    }

    public final void f(int r7, int r8) {
        int r0 = this.q;
        SpannableStringBuilder r2 = this.b;
        if (r0 == (-1)) goto L8;
        if (this.r == r7) goto L8;
        r2.setSpan(new ForegroundColorSpan(this.r), this.q, r2.length(), 33);
    L8:
        if (r7 == v) goto L11;
        this.q = r2.length();
        this.r = r7;
    L11:
        if (this.s == (-1)) goto L16;
        if (this.t == r8) goto L16;
        r2.setSpan(new BackgroundColorSpan(this.t), this.s, r2.length(), 33);
    L16:
        if (r8 == w) goto L19;
        this.s = r2.length();
        this.t = r8;
        return;
    }
}

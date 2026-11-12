package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zf2 {
    public int n;
    public int o;
    public int p;
    public Object q;

    public zf2() {
        if (xi4.o != null) goto L6;
        xi4.o = new xi4(26);
        return;
    }

    public int a(int r2) {
        if (r2 < this.p) goto L5;
        return 0;
    L5:
        return ((ByteBuffer) this.q).getShort(this.o + r2);
    }

    public void b() {
        if (((ag2) this.q).u != this.p) goto L5;
        return;
    L5:
        kf2.c();
    }

    public abstract Object c(View r1);

    public abstract void d(View r1, Object r2);

    public void e() {
    L2:
        int r0 = this.n;
        ag2 r1 = (ag2) this.q;
        if (r0 >= r1.s) goto L7;
        if (r1.p[r0] >= 0) goto L10;
        this.n = r0 + 1;
        goto L2
    L10:
        return;
    }

    public void f(View r4, Object r5) {
        if (Build.VERSION.SDK_INT < this.o) goto L6;
        d(r4, r5);
        return;
    L6:
        z2 r2 = null;
        if (Build.VERSION.SDK_INT < this.o) goto L9;
        Object r0 = c(r4);
    L14:
        if (g(r0, r5) == false) goto L26;
        View.AccessibilityDelegate r1 = j65.d(r4);
        if (r1 != null) goto L19;
    L22:
        if (r2 != null) goto L24;
        r2 = new z2();
    L24:
        j65.o(r4, r2);
        r4.setTag(this.n, r5);
        j65.i(r4, this.p);
        return;
    L19:
        if ((r1 instanceof y2) == false) goto L21;
        r2 = ((y2) r1).a;
        goto L22
    L21:
        r2 = new z2(r1);
        goto L22
    L26:
        return;
    L9:
        r0 = r4.getTag(this.n);
        if (((Class) this.q).isInstance(r0) == true) goto L14;
        r0 = null;
        goto L14
    }

    public abstract boolean g(Object r1, Object r2);

    public boolean hasNext() {
        if (this.n >= ((ag2) this.q).s) goto L6;
        return true;
    L6:
        return false;
    }

    public void remove() {
        ag2 r0 = (ag2) this.q;
        b();
        if (this.o == (-1)) goto L6;
        r0.c();
        r0.k(this.o);
        this.o = -1;
        this.p = r0.u;
        return;
    L6:
        kf2.o("Call next() before removing element from the iterator.");
    }
}

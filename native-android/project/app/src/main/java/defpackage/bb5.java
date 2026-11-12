package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bb5 {
    public final pb5 a;
    public vz1[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public bb5(pb5 r3) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = r3;
        c(r3);
    }

    public final void a() {
        vz1[] r0 = this.b;
        if (r0 == null) goto L19;
        vz1 r1 = r0[0];
        vz1 r2 = r0[1];
        pb5 r3 = this.a;
        if (r2 != null) goto L7;
        r2 = r3.a.h(2);
    L7:
        if (r1 != null) goto L9;
        r1 = r3.a.h(1);
    L9:
        h(vz1.a(r1, r2));
        vz1 r4 = this.b[ud3.N(16)];
        if (r4 == null) goto L12;
        g(r4);
    L12:
        vz1 r5 = this.b[ud3.N(32)];
        if (r5 == null) goto L15;
        e(r5);
    L15:
        vz1 r6 = this.b[ud3.N(64)];
        if (r6 == null) goto L20;
        i(r6);
        return;
    L20:
        return;
    }

    public abstract pb5 b();

    public void c(pb5 r5) {
        int r0 = 1;
    L4:
        if (r0 > 512) goto L9;
        List<Rect> r1 = r5.a.e(r0);
        int r2 = ud3.N(r0);
        Rect[] r3 = (Rect[]) r1.toArray(new Rect[r1.size()]);
        this.c[r2] = r3;
        if (r0 == 8) goto L8;
        List<Rect> r4 = r5.a.f(r0);
        Rect[] r6 = (Rect[]) r4.toArray(new Rect[r4.size()]);
        this.d[r2] = r6;
    L8:
        r0 = r0 << 1;
        goto L4
    }

    public void d(int r4, vz1 r5) {
        if (this.b != null) goto L5;
        this.b = new vz1[10];
    L5:
        int r0 = 1;
    L7:
        if (r0 > 512) goto L13;
        if ((r4 & r0) == 0) goto L12;
        this.b[ud3.N(r0)] = r5;
    L12:
        r0 = r0 << 1;
        goto L7
    }

    public void e(vz1 r1) {
    }

    public abstract void f(vz1 r1);

    public void g(vz1 r1) {
    }

    public abstract void h(vz1 r1);

    public void i(vz1 r1) {
    }

    public bb5() {
        this(new pb5());
    }
}

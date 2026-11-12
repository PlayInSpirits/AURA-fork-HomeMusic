package defpackage;

import android.os.Looper;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class km2 implements lm2, yr2 {
    public final /* synthetic */ mi3 n;

    public /* synthetic */ km2(mi3 r1) {
        this.n = r1;
    }

    @Override // defpackage.lm2
    public void c(bm2 r9) {
        if (r9.Y() == false) goto L26;
        mi3 r0 = r9.y;
        mi3 r8 = this.n;
        if (Objects.equals(r0, r8) == true) goto L27;
        r9.y = r8;
        mi3 r1 = r9.z;
        mi3 r10 = bm2.Y0(r9.x, r8);
        r9.z = r10;
        boolean r11 = r10.equals(r1);
        boolean r2 = true;
        if (r11 == true) goto L11;
        gy3 r12 = r9.u;
        gy3 r3 = r9.v;
        gy3 r4 = bm2.u1(r9.t, r9.s, r9.w, r9.z, r9.I);
        r9.u = r4;
        r9.v = bm2.t1(r4, r9.s, r9.I, r9.w, r9.z);
        boolean r13 = !r9.u.equals(r12);
        boolean r5 = !r9.v.equals(r3);
        r9.i.f(13, new cl2(r9, 2));
    L12:
        if (r5 == false) goto L18;
        sk2 r6 = r9.f1();
        r6.getClass();
        if (Looper.myLooper() != r6.f.getLooper()) goto L16;
        boolean r7 = true;
    L17:
        rr2.w(r7);
        r6.e.getClass();
        goto L18
    L16:
        r7 = false;
    L18:
        if (r13 == false) goto L25;
        sk2 r14 = r9.f1();
        r14.getClass();
        if (Looper.myLooper() == r14.f.getLooper()) goto L23;
        r2 = false;
    L23:
        rr2.w(r2);
        r14.e.u();
        return;
    L25:
        return;
    L11:
        r13 = false;
        r5 = false;
        goto L12
    L27:
        return;
    }

    @Override // defpackage.yr2
    public void f(er2 r1, int r2) {
        r1.t(r2, this.n);
    }
}

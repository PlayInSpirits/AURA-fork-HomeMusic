package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w01 implements ui2 {
    public static final w01 b = null;
    public static final or1 c = null;
    public static final w01 d = null;
    public static final w01 e = null;
    public final /* synthetic */ int a;

    static {
        b = new w01(0);
        c = new or1(24);
        d = new w01(1);
        e = new w01(2);
    }

    public /* synthetic */ w01(int r1) {
        this.a = r1;
    }

    @Override // defpackage.ui2
    public final vi2 a(cf2 r4, List r5, long r6) {
        int r3 = this.a;
        v01 r0 = v01.n;
        switch(r3) {
            case 0: goto L16;
            case 1: goto L14;
            default: goto L4;
        };
    L4:
        int r1 = 0;
        if (nc0.f(r6) == false) goto L7;
        int r7 = nc0.h(r6);
    L9:
        if (nc0.e(r6) == false) goto L12;
        r1 = nc0.g(r6);
    L12:
        return r4.v(r7, r1, r0, new or1(24));
    L7:
        r7 = 0;
        goto L9
    L14:
        return r4.v(nc0.j(r6), nc0.i(r6), r0, new or1(24));
    L16:
        return r4.v(nc0.h(r6), nc0.g(r6), r0, c);
    }
}

package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k72 implements vi2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi2 b;
    public final /* synthetic */ o72 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ vi2 e;

    public /* synthetic */ k72(vi2 vi2Var, o72 o72Var, int i, vi2 vi2Var2, int i2) {
        this.a = i2;
        this.c = o72Var;
        this.d = i;
        this.e = vi2Var2;
        this.b = vi2Var;
    }

    @Override // defpackage.vi2
    public final Map a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.a();
    }

    @Override // defpackage.vi2
    public final int b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.b();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[LOOP:0: B:11:0x002f->B:30:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[SYNTHETIC] */
    @Override // defpackage.vi2
    public final void c() {
        int i = this.a;
        vi2 vi2Var = this.e;
        int i2 = this.d;
        o72 o72Var = this.c;
        switch (i) {
            case 0:
                o72Var.r = i2;
                vi2Var.c();
                f13 f13Var = o72Var.z;
                w03 w03Var = o72Var.y;
                long[] jArr = w03Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = w03Var.b[i6];
                                    jn4 jn4Var = (jn4) w03Var.c[i6];
                                    int i7 = f13Var.i(obj);
                                    if (i7 < 0 || i7 >= o72Var.r) {
                                        if (i7 >= 0) {
                                            Object[] objArr = f13Var.n;
                                            Object obj2 = objArr[i7];
                                            objArr[i7] = gn4.b;
                                        }
                                        if (o72Var.w.b(obj)) {
                                            jn4Var.a();
                                        }
                                        w03Var.k(i6);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 == 8) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        } else if (i3 != length) {
                            i3++;
                        }
                    }
                }
                o72Var.g(o72Var.q);
                break;
            default:
                o72Var.q = i2;
                vi2Var.c();
                if (o72Var.n.u == null) {
                    o72Var.g(o72Var.q);
                }
                break;
        }
    }

    @Override // defpackage.vi2
    public final int d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.d();
    }

    @Override // defpackage.vi2
    public final if1 e() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.e();
    }

    @Override // defpackage.vi2
    public final wf1 f() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.f();
    }

    @Override // defpackage.vi2
    public final if1 g() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.g();
    }
}

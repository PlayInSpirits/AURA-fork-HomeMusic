package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pv extends uo {
    public rm2 u;
    public long v;
    public final /* synthetic */ Shader w;

    public pv(Shader r3) {
        super(6);
        this.w = r3;
        this.v = 9205357640488583168L;
    }

    @Override // defpackage.uo
    public final void d(long r6, gc r8, float r9) {
        Paint r0 = (Paint) r8.b;
        rm2 r1 = this.u;
        Shader r2 = null;
        if (r1 == null) goto L7;
        if (qf4.a(this.v, r6) == false) goto L7;
    L13:
        long r5 = r8.a();
        long r3 = x40.b;
        if (x40.c(r5, r3) == true) goto L16;
        r8.f(r3);
    L16:
        Shader r7 = (Shader) r8.c;
        if (r1 == null) goto L19;
        Shader r10 = (Shader) r1.o;
    L21:
        if (h12.c(r7, r10) == true) goto L26;
        if (r1 == null) goto L24;
        r2 = (Shader) r1.o;
    L24:
        r8.c = r2;
        r0.setShader(r2);
    L26:
        if ((r0.getAlpha() / 255.0f) != r9) goto L28;
        return;
    L28:
        r8.d(r9);
        return;
    L19:
        r10 = null;
    L7:
        if (qf4.b(r6) == false) goto L9;
        this.u = null;
        this.v = 9205357640488583168L;
        r1 = null;
        goto L13
    L9:
        r1 = this.u;
        if (r1 != null) goto L12;
        r1 = new rm2(26, false);
        this.u = r1;
    L12:
        r1.o = this.w;
        this.u = r1;
        this.v = r6;
        goto L13
    }
}

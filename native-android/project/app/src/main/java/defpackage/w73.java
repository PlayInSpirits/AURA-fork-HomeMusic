package defpackage;

import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w73 extends bz4 {
    public static final v73 c = null;
    public final nk1 a;
    public final int b;

    static {
        c = new v73(1);
    }

    public w73(nk1 r1, int r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.bz4
    public final Object a(l32 r10) {
        int r0 = r10.e0();
        int r1 = xa3.w(r0);
        if (r1 == 0) goto L7;
        if (r1 == 2) goto L6;
        Object r2 = null;
    L8:
        if (r2 == null) goto L10;
        ArrayDeque r3 = new ArrayDeque();
    L13:
        if (r10.J() == true) goto L15;
        if ((r2 instanceof List) == false) goto L38;
        r10.q();
    L40:
        if (r3.isEmpty() == true) goto L41;
        r2 = r3.removeLast();
        goto L13
    L41:
        return r2;
    L38:
        r10.s();
        goto L40
    L15:
        if ((r2 instanceof Map) == false) goto L17;
        String r5 = r10.Y();
    L18:
        int r6 = r10.e0();
        int r7 = xa3.w(r6);
        if (r7 == 0) goto L23;
        if (r7 == 2) goto L22;
        Serializable r8 = null;
    L24:
        if (r8 == null) goto L26;
        boolean r9 = true;
    L27:
        if (r8 != null) goto L30;
        r8 = c(r6, r10);
    L30:
        if ((r2 instanceof List) == false) goto L32;
        ((List) r2).add(r8);
    L33:
        if (r9 == false) goto L13;
        r3.addLast(r2);
        r2 = r8;
        goto L13
    L32:
        ((Map) r2).put(r5, r8);
        goto L33
    L26:
        r9 = false;
        goto L27
    L22:
        r10.f();
        r8 = new nb2(true);
        goto L24
    L23:
        r10.b();
        r8 = new ArrayList();
        goto L24
    L17:
        r5 = null;
        goto L18
    L10:
        return c(r0, r10);
    L6:
        r10.f();
        r2 = new nb2(true);
        goto L8
    L7:
        r10.b();
        r2 = new ArrayList();
        goto L8
    }

    @Override // defpackage.bz4
    public final void b(q32 r2, Object r3) {
        if (r3 != null) goto L5;
        r2.F();
        return;
    L5:
        TypeToken r0 = TypeToken.get(r3.getClass());
        bz4 r1 = this.a.g(r0);
        if ((r1 instanceof w73) == false) goto L9;
        r2.j();
        r2.s();
        return;
    L9:
        r1.b(r2, r3);
    }

    public final Serializable c(int r3, l32 r4) {
        int r0 = xa3.w(r3);
        if (r0 == 5) goto L19;
        if (r0 == 6) goto L17;
        if (r0 == 7) goto L15;
        if (r0 != 8) goto L12;
        r4.a0();
        return null;
    L12:
        kf2.o("Unexpected token: ".concat(b11.x(r3)));
        return null;
    L15:
        return Boolean.valueOf(r4.R());
    L17:
        return f34.b(this.b, r4);
    L19:
        return r4.c0();
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vq4 {
    public static final /* synthetic */ int a = 0;

    static {
        vd0 r3 = null;
        new nv0(3, r3, 2);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    public static final Object a(hp4 r5, ln3 r6, jp r7) {
        if ((r7 instanceof uq4) == false) goto L7;
        uq4 r0 = (uq4) r7;
        int r1 = r0.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.q = r1 - Integer.MIN_VALUE;
    L8:
        Object r8 = r0.p;
        int r2 = r0.q;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        ln3 r9 = r0.o;
        hp4 r10 = r0.n;
        kb4.X(r8);
        r6 = r9;
        r5 = r10;
    L18:
        kn3 r11 = (kn3) r8;
        if (b(r11, false) == true) goto L21;
    L15:
        r0.n = r5;
        r0.o = r6;
        r0.q = 1;
        r8 = r5.a(r6, r0);
        xe0 r3 = xe0.n;
        if (r8 != r3) goto L18;
        return r3;
    L21:
        return r11.a.get(0);
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r8);
    L7:
        r0 = new uq4(r7);
        goto L8
    }

    public static boolean b(kn3 r6, boolean r7) {
        List r8 = r6.a;
        int r0 = r8.size();
        int r2 = 0;
    L3:
        boolean r3 = true;
        if (r2 >= r0) goto L19;
        on3 r4 = (on3) r8.get(r2);
        if (r7 == true) goto L8;
        r3 = gi1.g(r4);
    L16:
        if (r3 == false) goto L17;
        r2 = r2 + 1;
        goto L3
    L17:
        return false;
    L8:
        if (r4.c() == false) goto L10;
    L14:
        r3 = false;
        goto L16
    L10:
        if (r4.h == true) goto L14;
        if (r4.d == false) goto L14;
    L19:
        return true;
    }
}

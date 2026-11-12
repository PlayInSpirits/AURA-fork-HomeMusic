package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z81 implements q81 {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;
    public final sf1 q;

    public z81(q81 r3, ne0 r4) {
        this.n = 2;
        this.p = r4;
        this.o = te5.O(r4);
        this.q = new p(r3, null, 18);
    }

    @Override // defpackage.q81
    public final Object b(Object r18, vd0 r19) {
        z81 r0 = this;
        Object r1 = r18;
        int r3 = r0.n;
        j15 r8 = j15.a;
        xe0 r9 = xe0.n;
        sf1 r10 = r0.q;
        Object r11 = r0.o;
        Object r12 = r0.p;
        switch(r3) {
            case 0: goto L30;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        Object r2 = ud3.J0((ne0) r12, r1, r11, (p) r10, r19);
        if (r2 == r9) goto L7;
        return r8;
    L7:
        return r2;
    L9:
        if ((r19 instanceof i91) == false) goto L13;
        i91 r4 = (i91) r19;
        int r14 = r4.o;
        if ((r14 & Integer.MIN_VALUE) == 0) goto L13;
        r4.o = r14 - Integer.MIN_VALUE;
    L14:
        Object r5 = r4.n;
        int r6 = r4.o;
        if (r6 == 0) goto L21;
        if (r6 == 1) goto L20;
        if (r6 != 2) goto L19;
        kb4.X(r5);
        return r8;
    L19:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L20:
        q81 r7 = r4.p;
        kb4.X(r5);
    L25:
        r4.p = null;
        r4.o = 2;
        if (r7.b(r5, r4) == r9) goto L28;
        return r8;
    L28:
        return r9;
    L21:
        kb4.X(r5);
        q81 r13 = (q81) r11;
        Set r15 = (Set) r1;
        r4.p = r13;
        r4.o = 1;
        Object r16 = xl.F((WorkDatabase_Impl) r12, true, (x) r10, r4);
        if (r16 == r9) goto L28;
        r7 = r13;
        r5 = r16;
    L13:
        r4 = new i91(r0, r19);
        goto L14
    L30:
        if ((r19 instanceof y81) == false) goto L34;
        y81 r17 = (y81) r19;
        int r110 = r17.r;
        if ((r110 & Integer.MIN_VALUE) == 0) goto L34;
        r17.r = r110 - Integer.MIN_VALUE;
    L35:
        Object r20 = r17.p;
        int r21 = r17.r;
        if (r21 == 0) goto L43;
        if (r21 == 1) goto L40;
        if (r21 == 2) goto L42;
        if (r21 == 3) goto L40;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L42:
        Object r22 = r17.o;
        z81 r23 = r17.n;
        kb4.X(r20);
        r1 = r22;
        r0 = r23;
    L52:
        if (((Boolean) r20).booleanValue() == true) goto L64;
        ((fx3) r0.p).n = true;
        q81 r24 = (q81) r0.o;
        r17.n = null;
        r17.o = null;
        r17.r = 3;
        if (r24.b(r1, r17) == r9) goto L56;
        return r8;
    L56:
        return r9;
    L64:
        return r8;
    L40:
        kb4.X(r20);
        return r8;
    L43:
        kb4.X(r20);
        if (((fx3) r12).n == false) goto L48;
        r17.r = 1;
        if (((q81) r11).b(r1, r17) == r9) goto L56;
        return r8;
    L48:
        r17.n = r0;
        r17.o = r1;
        r17.r = 2;
        r20 = ((pv3) r10).invoke(r1, r17);
        if (r20 != r9) goto L52;
    L34:
        r17 = new y81(r0, r19);
        goto L35
    }

    public z81(fx3 r2, q81 r3, pv3 r4) {
        this.n = 0;
        this.p = r2;
        this.o = r3;
        this.q = r4;
    }

    public z81(q81 r2, WorkDatabase_Impl r3, x r4) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }
}

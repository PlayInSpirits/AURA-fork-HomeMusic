package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fc0 implements q81 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ fc0(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.q81
    public final Object b(Object r7, vd0 r8) {
        int r0 = this.n;
        j15 r1 = j15.a;
        Object r2 = this.o;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        float r6 = ((Number) r7).floatValue();
        ((rx2) r2).p.h(r6);
        return r1;
    L6:
        ((jx3) r2).n = r7;
        throw new AbortFlowException(this);
    L9:
        if ((r8 instanceof ec0) == false) goto L13;
        ec0 r3 = (ec0) r8;
        int r4 = r3.o;
        if ((r4 & Integer.MIN_VALUE) == 0) goto L13;
        r3.o = r4 - Integer.MIN_VALUE;
    L14:
        Object r9 = r3.n;
        int r10 = r3.o;
        if (r10 == 0) goto L19;
        if (r10 != 1) goto L18;
        kb4.X(r9);
        return r1;
    L18:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L19:
        kb4.X(r9);
        q81 r5 = (q81) r2;
        if ((r7 instanceof sc0) == false) goto L27;
        r3.o = 1;
        Object r11 = r5.b(r7, r3);
        xe0 r12 = xe0.n;
        if (r11 == r12) goto L24;
        return r1;
    L24:
        return r12;
    L27:
        return r1;
    L13:
        r3 = new ec0(this, r8);
        goto L14
    }
}

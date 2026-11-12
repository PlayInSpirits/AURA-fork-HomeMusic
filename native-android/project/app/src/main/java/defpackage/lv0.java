package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lv0 implements q81 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ lv0(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.q81
    public final Object b(Object r12, vd0 r13) {
        int r0 = this.n;
        xe0 r2 = xe0.n;
        Object r6 = this.p;
        j15 r7 = j15.a;
        Object r8 = this.o;
        switch(r0) {
            case 0: goto L48;
            case 1: goto L29;
            case 2: goto L7;
            default: goto L4;
        };
    L4:
        ((c93) r8).a((dd5) r6, (tc0) r12);
        return r7;
    L48:
        q02 r14 = (q02) r12;
        ArrayList r9 = (ArrayList) r8;
        if ((r14 instanceof jv0) == false) goto L52;
        r9.add(r14);
    L57:
        ((b13) r6).setValue(Boolean.valueOf(!r9.isEmpty()));
        return r7;
    L52:
        if ((r14 instanceof kv0) == false) goto L55;
        r9.remove(((kv0) r14).a);
        goto L57
    L55:
        if ((r14 instanceof iv0) == false) goto L57;
        r9.remove(((iv0) r14).a);
        goto L57
    L7:
        if ((r13 instanceof g91) == false) goto L11;
        g91 r1 = (g91) r13;
        int r10 = r1.o;
        if ((r10 & Integer.MIN_VALUE) == 0) goto L11;
        r1.o = r10 - Integer.MIN_VALUE;
    L12:
        Object r11 = r1.n;
        int r15 = r1.o;
        if (r15 == 0) goto L19;
        if (r15 == 1) goto L18;
        if (r15 != 2) goto L17;
        kb4.X(r11);
    L27:
        return r7;
    L17:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        q81 r16 = r1.r;
        Object r17 = r1.q;
        kb4.X(r11);
    L23:
        r1.q = null;
        r1.r = null;
        r1.o = 2;
        if (r16.b(r17, r1) != r2) goto L27;
        return r2;
    L19:
        kb4.X(r11);
        q81 r18 = (q81) r8;
        r1.q = r12;
        r1.r = r18;
        r1.o = 1;
        if (((wf1) r6).invoke(r12, r1) == r2) goto L60;
        r17 = r12;
        r16 = r18;
        goto L23
    L60:
        return r2;
    L11:
        r1 = new g91(this, r13);
        goto L12
    L29:
        if ((r13 instanceof c91) == false) goto L33;
        c91 r3 = (c91) r13;
        int r19 = r3.p;
        if ((r19 & Integer.MIN_VALUE) == 0) goto L33;
        r3.p = r19 - Integer.MIN_VALUE;
    L34:
        Object r110 = r3.o;
        int r4 = r3.p;
        if (r4 == 0) goto L39;
        if (r4 != 1) goto L38;
        r12 = r3.r;
        lv0 this = r3.n;
        kb4.X(r110);
    L43:
        if (((Boolean) r110).booleanValue() == false) goto L45;
        ((jx3) this.p).n = r12;
        throw new AbortFlowException(this);
    L45:
        return r7;
    L38:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L39:
        kb4.X(r110);
        r3.n = this;
        r3.r = r12;
        r3.p = 1;
        r110 = ((wf1) r8).invoke(r12, r3);
        if (r110 != r2) goto L43;
        return r2;
    L33:
        r3 = new c91(this, r13);
        goto L34
    }
}

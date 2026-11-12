package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ed implements le0 {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public ed(ed r3) {
        this.n = 2;
        this.o = r3;
        this.p = new ll(6, (byte) 0);
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 r2) {
        switch(this.n) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return ya4.F(this, r2);
    L7:
        return ya4.F(this, r2);
    L9:
        return ya4.F(this, r2);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 r2) {
        switch(this.n) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return ya4.r(this, r2);
    L7:
        return ya4.r(this, r2);
    L9:
        return ya4.r(this, r2);
    }

    public final Object a(if1 r8, wd0 r9) {
        int r1 = 0;
        int r2 = 1;
        switch(this.n) {
            case 0: goto L45;
            case 1: goto L43;
            default: goto L5;
        };
    L43:
        cz r0 = new cz(1, ya4.x(r9));
        r0.u();
        z40 r10 = (z40) this.p;
        jv r3 = new jv();
        r3.a = r0;
        r3.b = r8;
        r0.w(new kv(r1, r10.a(r3, (mv3) this.o)));
        return r0.q();
    L45:
        bd r4 = (bd) this.p;
        cz r5 = new cz(1, ya4.x(r9));
        r5.u();
        dd r11 = new dd(r5, this, r8);
        if (h12.c(r4.p, (Choreographer) this.o) == false) goto L59;
        Object r7 = r4.r;
        monitor-enter(r7);
        r4.t.add(r11);     // Catch: Throwable -> L53
        if (r4.w == true) goto L55;
        r4.w = true;     // Catch: Throwable -> L53
        r4.p.postFrameCallback(r4.x);     // Catch: Throwable -> L53
    L55:
        monitor-exit(r7);
        r5.w(new cd(r1, r4, r11));
    L61:
        return r5.q();
    L53:
        th = move-exception;
        throw th;
    L59:
        ((Choreographer) this.o).postFrameCallback(r11);
        r5.w(new cd(r2, this, r11));
        goto L61
    L5:
        if ((r9 instanceof df3) == false) goto L9;
        df3 r6 = (df3) r9;
        int r12 = r6.q;
        if ((r12 & Integer.MIN_VALUE) == 0) goto L9;
        r6.q = r12 - Integer.MIN_VALUE;
    L10:
        Object r13 = r6.o;
        xe0 r14 = xe0.n;
        int r15 = r6.q;
        if (r15 == 0) goto L17;
        if (r15 == 1) goto L16;
        if (r15 != 2) goto L15;
        kb4.X(r13);
        return r13;
    L15:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L16:
        r8 = r6.n;
        kb4.X(r13);
    L33:
        ed r16 = (ed) this.o;
        r6.n = null;
        r6.q = 2;
        Object r17 = r16.a(r8, r6);
        if (r17 == r14) goto L36;
        return r17;
    L36:
        return r14;
    L17:
        kb4.X(r13);
        ll r18 = (ll) this.p;
        r6.n = r8;
        r6.q = 1;
        Object r19 = r18.p;
        monitor-enter(r19);
        boolean r20 = r18.o;     // Catch: Throwable -> L40
        monitor-exit(r19);
        if (r20 == false) goto L23;
        Object r21 = j15.a;
    L31:
        if (r21 != r14) goto L33;
    L23:
        cz r22 = new cz(1, ya4.x(r6));
        r22.u();
        Object r23 = r18.p;
        monitor-enter(r23);
        ((ArrayList) r18.q).add(r22);     // Catch: Throwable -> L37
        monitor-exit(r23);
        r22.w(new cd(3, r18, r22));
        r21 = r22.q();
        if (r21 == r14) goto L31;
        r21 = j15.a;
    L37:
        th = move-exception;
        throw th;
    L40:
        th = move-exception;
        throw th;
    L9:
        r6 = new df3(this, r9);
        goto L10
    }

    @Override // defpackage.le0
    public me0 getKey() {
        return rv2.p;
    }

    @Override // defpackage.ne0
    public final Object s(wf1 r2, Object r3) {
        switch(this.n) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return r2.invoke(r3, this);
    L7:
        return r2.invoke(r3, this);
    L9:
        return r2.invoke(r3, this);
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 r2) {
        switch(this.n) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return ya4.C(this, r2);
    L7:
        return ya4.C(this, r2);
    L9:
        return ya4.C(this, r2);
    }

    public ed(Choreographer r2, bd r3) {
        this.n = 0;
        this.o = r2;
        this.p = r3;
    }

    public ed(mv3 r2) {
        this.n = 1;
        this.o = r2;
        this.p = new z40();
    }
}

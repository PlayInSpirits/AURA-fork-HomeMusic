package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ac0 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public /* synthetic */ Object q;

    public /* synthetic */ ac0(Object r1, vd0 r2, int r3) {
        this.o = r3;
        this.q = r1;
        super(2, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        int r1 = 2;
        switch(this.o) {
            case 0: goto L21;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L10;
            case 6: goto L9;
            case 7: goto L7;
            default: goto L5;
        };
    L10:
        ac0 r2 = new ac0(r1, r4);
        r2.q = r3;
        return r2;
    L5:
        return new ac0((jy4) this.q, r4, 8);
    L7:
        return new ac0((ip4) this.q, r4, 7);
    L9:
        return new ac0((x60) this.q, r4, 6);
    L13:
        return new ac0((hy2) this.q, r4, 4);
    L15:
        return new ac0((ea1) this.q, r4, 3);
    L17:
        return new ac0((x81) this.q, r4, r1);
    L19:
        return new ac0((ck0) this.q, r4, 1);
    L21:
        return new ac0((ConstraintTrackingWorker) this.q, r4, 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        we0 r5 = (we0) r3;
        vd0 r6 = (vd0) r4;
        switch(r0) {
            case 0: goto L21;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L9;
            case 7: goto L7;
            default: goto L5;
        };
    L5:
        return ((ac0) create(r5, r6)).invokeSuspend(r1);
    L7:
        return ((ac0) create(r5, r6)).invokeSuspend(r1);
    L9:
        return ((ac0) create(r5, r6)).invokeSuspend(r1);
    L11:
        return ((ac0) create(r5, r6)).invokeSuspend(r1);
    L13:
        return ((ac0) create(r5, r6)).invokeSuspend(r1);
    L15:
        return ((ac0) create(r5, r6)).invokeSuspend(r1);
    L17:
        return ((ac0) create(r5, r6)).invokeSuspend(r1);
    L19:
        return ((ac0) create(r5, r6)).invokeSuspend(r1);
    L21:
        return ((ac0) create(r5, r6)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r14) {
        int r0 = this.o;
        int r1 = 15;
        j15 r2 = j15.a;
        xe0 r4 = xe0.n;
        vd0 r6 = null;
        switch(r0) {
            case 0: goto L81;
            case 1: goto L74;
            case 2: goto L62;
            case 3: goto L53;
            case 4: goto L44;
            case 5: goto L32;
            case 6: goto L23;
            case 7: goto L13;
            default: goto L4;
        };
    L4:
        int r3 = this.p;
        if (r3 == 0) goto L9;
        if (r3 != 1) goto L8;
        kb4.X(r14);
        return r2;
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        kb4.X(r14);
        jy4 r15 = (jy4) this.q;
        this.p = 1;
        if (r15.f(this) == r4) goto L12;
        return r2;
    L12:
        return r4;
    L13:
        ip4 r5 = (ip4) this.q;
        int r7 = this.p;
        if (r7 == 0) goto L19;
        if (r7 == 1) goto L17;
        if (r7 == 2) goto L17;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L17:
        kb4.X(r14);
        return r2;
    L19:
        kb4.X(r14);
        PointerInputEventHandler r16 = r5.D;
        this.p = 2;
        if (r16.invoke(r5, this) == r4) goto L22;
        return r2;
    L22:
        return r4;
    L23:
        int r8 = this.p;
        if (r8 == 0) goto L28;
        if (r8 != 1) goto L27;
        kb4.X(r14);
        return r14;
    L27:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L28:
        kb4.X(r14);
        x60 r17 = (x60) this.q;
        this.p = 1;
        Object r18 = r17.j0(this);
        if (r18 == r4) goto L31;
        return r18;
    L31:
        return r4;
    L32:
        int r9 = this.p;
        if (r9 == 0) goto L37;
        if (r9 != 1) goto L36;
        we0 r10 = (we0) this.q;
        kb4.X(r14);
    L39:
        if (gb.L(r10.e()) == false) goto L104;
        k52 r19 = new k52(15);
        this.q = r10;
        this.p = 1;
        if (vr1.x(getContext()).a(r19, this) != r4) goto L39;
        return r4;
    L104:
        return r2;
    L36:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L37:
        kb4.X(r14);
        r10 = (we0) this.q;
        goto L39
    L44:
        int r11 = this.p;
        if (r11 == 0) goto L49;
        if (r11 != 1) goto L48;
        kb4.X(r14);
        return r14;
    L48:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L49:
        kb4.X(r14);
        aw r110 = ((hy2) this.q).g;
        this.p = 1;
        Object r111 = te5.j(new p(r110, r6, r1), this);
        if (r111 == r4) goto L52;
        return r111;
    L52:
        return r4;
    L53:
        int r12 = this.p;
        if (r12 == 0) goto L58;
        if (r12 != 1) goto L57;
        kb4.X(r14);
        return r2;
    L57:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L58:
        kb4.X(r14);
        ea1 r112 = (ea1) this.q;
        this.p = 1;
        if (xl.h(r112, null, this) == r4) goto L61;
        return r2;
    L61:
        return r4;
    L62:
        int r13 = this.p;
        if (r13 == 0) goto L67;
        if (r13 != 1) goto L66;
        kb4.X(r14);
        return r2;
    L66:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L67:
        kb4.X(r14);
        x81 r113 = (x81) this.q;
        this.p = 1;
        Object r114 = r113.a(n63.n, this);
        if (r114 == r4) goto L71;
        r114 = r2;
    L71:
        if (r114 == r4) goto L73;
        return r2;
    L73:
        return r4;
    L74:
        int r20 = this.p;
        if (r20 == 0) goto L79;
        if (r20 != 1) goto L78;
        kb4.X(r14);
        return r2;
    L78:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L79:
        kb4.X(r14);
        hx3 r21 = new hx3();
        hx3 r22 = new hx3();
        hx3 r115 = new hx3();
        ck0 r116 = (ck0) this.q;
        cd4 r117 = (cd4) r116.B.o;
        e10 r23 = new e10(r21, r22, r115, r116, 1);
        this.p = 1;
        r117.getClass();
        cd4.k(r117, r23, this);
        return r4;
    L81:
        int r24 = this.p;
        if (r24 == 0) goto L86;
        if (r24 != 1) goto L85;
        kb4.X(r14);
        return r14;
    L85:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L86:
        kb4.X(r14);
        ConstraintTrackingWorker r118 = (ConstraintTrackingWorker) this.q;
        this.p = 1;
        Object r119 = ConstraintTrackingWorker.f(r118, this);
        if (r119 == r4) goto L89;
        return r119;
    L89:
        return r4;
    }

    public /* synthetic */ ac0(int r2, vd0 r3) {
        this.o = 5;
        super(r2, r3);
    }
}

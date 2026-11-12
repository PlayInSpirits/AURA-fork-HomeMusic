package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.io.Serializable;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x70 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public Object q;
    public Object r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ x70(Object r1, Object r2, Object r3, Object r4, vd0 r5, int r6) {
        this.o = r6;
        this.q = r1;
        this.r = r2;
        this.s = r3;
        this.t = r4;
        super(2, r5);
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.io.Serializable, java.lang.String[]] */
    @Override // defpackage.jp
    public final vd0 create(Object r11, vd0 r12) {
        int r0 = this.o;
        Object r1 = this.t;
        switch(r0) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L16;
            case 4: goto L15;
            case 5: goto L12;
            case 6: goto L10;
            case 7: goto L8;
            case 8: goto L7;
            default: goto L5;
        };
    L8:
        x70 r3 = new x70((jy4) this.r, (int[]) this.s, (String[]) r1, r12, 7);
        r3.q = r11;
        return r3;
    L10:
        x70 r10 = new x70((hw4) r1, r12);
        r10.s = r11;
        return r10;
    L12:
        x70 r13 = new x70((b13) this.s, (ty1) r1, r12);
        r13.r = r11;
        return r13;
    L16:
        x70 r4 = new x70((p81) this.r, (nl4) this.s, (Float) r1, r12, 3);
        r4.q = r11;
        return r4;
    L5:
        return new x70((oc2) this.q, (dd5) this.r, (qc5) this.s, (Context) r1, r12, 9);
    L7:
        return new x70((jx3) this.q, (tv3) this.r, (ba2) this.s, (ed1) r1, r12, 8);
    L15:
        return new x70((il4) this.q, (p81) this.r, (nl4) this.s, (Float) r1, r12, 4);
    L19:
        return new x70((ConstraintTrackingWorker) this.q, (oc2) this.r, (c52) this.s, (dd5) r1, r12, 2);
    L21:
        return new x70((c52) this.q, (dd5) this.r, (AtomicInteger) this.s, (ic2) r1, r12, 1);
    L23:
        return new x70((a80) this.q, (ScrollCaptureSession) this.r, (Rect) this.s, (Consumer) r1, r12, 0);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r4, Object r5) {
        int r0 = this.o;
        xe0 r1 = xe0.n;
        j15 r2 = j15.a;
        switch(r0) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L12;
            case 6: goto L11;
            case 7: goto L8;
            case 8: goto L7;
            default: goto L5;
        };
    L8:
        ((x70) create((q81) r4, (vd0) r5)).invokeSuspend(r2);
        return r1;
    L12:
        ((x70) create((we0) r4, (vd0) r5)).invokeSuspend(r2);
        return r1;
    L5:
        return ((x70) create((we0) r4, (vd0) r5)).invokeSuspend(r2);
    L7:
        return ((x70) create((we0) r4, (vd0) r5)).invokeSuspend(r2);
    L11:
        return ((x70) create((we0) r4, (vd0) r5)).invokeSuspend(r2);
    L15:
        return ((x70) create((we0) r4, (vd0) r5)).invokeSuspend(r2);
    L17:
        return ((x70) create((gd4) r4, (vd0) r5)).invokeSuspend(r2);
    L19:
        return ((x70) create((we0) r4, (vd0) r5)).invokeSuspend(r2);
    L21:
        return ((x70) create((we0) r4, (vd0) r5)).invokeSuspend(r2);
    L23:
        return ((x70) create((we0) r4, (vd0) r5)).invokeSuspend(r2);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0271 -> B:109:0x023d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0292 -> B:109:0x023d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01f9 -> B:86:0x01c1). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r25) {
        int r1 = this.o;
        j15 r3 = j15.a;
        int r4 = 2;
        Object r5 = this.t;
        xe0 r7 = xe0.n;
        int r8 = 1;
        vd0 r9 = null;
        switch(r1) {
            case 0: goto L192;
            case 1: goto L182;
            case 2: goto L173;
            case 3: goto L154;
            case 4: goto L121;
            case 5: goto L100;
            case 6: goto L72;
            case 7: goto L46;
            case 8: goto L22;
            default: goto L4;
        };
    L4:
        String r2 = ((dd5) this.r).c;
        oc2 r6 = (oc2) this.q;
        int r10 = this.p;
        if (r10 == 0) goto L11;
        if (r10 == 1) goto L10;
        if (r10 != 2) goto L9;
        kb4.X(r25);
        return r25;
    L9:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L10:
        kb4.X(r25);
        Object r11 = r25;
    L14:
        mb1 r13 = (mb1) r11;
        if (r13 == null) goto L20;
        String r12 = pc5.a;
        cx.f().b(r12, "Updating notification for " + r2);
        qc5 r14 = (qc5) this.s;
        UUID r15 = r6.b.a;
        ia4 r16 = (ia4) r14.a.n;
        uy1 r17 = new uy1(r14, r15, r13, (Context) r5, 2);
        r16.getClass();
        ry r18 = vr1.v(new ef0(9, r16, r17));
        this.p = 2;
        Object r0 = fu.e(r18, this);
        if (r0 != r7) goto L210;
    L209:
        return r7;
    L210:
        return r0;
    L20:
        kf2.o(xa3.h("Worker was marked important (", r2, ") but did not provide ForegroundInfo"));
        return null;
    L11:
        kb4.X(r25);
        ry r19 = r6.a();
        this.p = 1;
        r11 = ud5.a(r19, r6, this);
        if (r11 != r7) goto L14;
    L22:
        ed1 r20 = (ed1) r5;
        ba2 r21 = (ba2) this.s;
        tv3 r110 = (tv3) this.r;
        int r22 = this.p;
        if (r22 == 0) goto L30;
        if (r22 != 1) goto L29;
        kb4.X(r25);     // Catch: Throwable -> L27
    L42:
        r21.h().f(r20);
        return r3;
    L29:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L30:
        kb4.X(r25);
        rx2 r23 = (rx2) ((jx3) this.q).n;
        if (r23 == null) goto L33;
        r23.o = te5.a(r110.x);
    L33:
        this.p = 1;     // Catch: Throwable -> L27
        Object r24 = fu.P(r110.a, new qv3(r110, new sv3(r110, null), vr1.x(getContext()), null, 0), this);     // Catch: Throwable -> L27
        if (r24 == r7) goto L37;
        r24 = r3;
    L37:
        if (r24 == r7) goto L40;
        r24 = r3;
    L40:
        if (r24 != r7) goto L42;
        return r7;
    L27:
        th = move-exception;
        r21.h().f(r20);
        throw th;
    L46:
        int[] r26 = (int[]) this.s;
        jy4 r27 = (jy4) this.r;
        int r111 = this.p;
        if (r111 == 0) goto L58;
        if (r111 == 1) goto L57;
        if (r111 == 2) goto L56;
        if (r111 == 3) goto L52;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L52:
        kb4.X(r25);     // Catch: Throwable -> L54
        throw new KotlinNothingValueException();     // Catch: Throwable -> L54
    L56:
        q81 r28 = (q81) this.q;
        kb4.X(r25);
    L67:
        q81 r29 = r28;
    L68:
        jx3 r30 = new jx3();     // Catch: Throwable -> L54
        om1 r31 = r27.i;     // Catch: Throwable -> L54
        e10 r112 = new e10(r30, r29, (String[]) r5, r26);     // Catch: Throwable -> L54
        this.q = null;     // Catch: Throwable -> L54
        this.p = 3;     // Catch: Throwable -> L54
        r31.f(r112, this);     // Catch: Throwable -> L54
        return r7;
    L57:
        r29 = (q81) this.q;
        kb4.X(r25);
        Object r32 = r25;
    L63:
        ac0 r113 = new ac0(r27, r9, 8);
        this.q = r29;
        this.p = 2;
        if (fu.P((ne0) r32, r113, this) == r7) goto L215;
        r28 = r29;
        goto L67
    L215:
        return r7;
    L58:
        kb4.X(r25);
        r29 = (q81) this.q;
        if (r27.h.j(r26) == false) goto L68;
        s24 r114 = r27.a;
        this.q = r29;
        this.p = 1;
        r32 = xl.o(r114, this);
        if (r32 != r7) goto L63;
        return r7;
    L54:
        th = move-exception;
        r27.h.k(r26);
        throw th;
    L72:
        hw4 r33 = (hw4) r5;
        int r34 = this.p;
        if (r34 == 0) goto L85;
        if (r34 == 1) goto L82;
        if (r34 != 2) goto L81;
        we0 r35 = (we0) this.s;
        kb4.X(r25);     // Catch: Throwable -> L79
    L86:
        if (gb.L(r35.e()) == false) goto L96;
        g74 r36 = (g74) r33.b;     // Catch: Throwable -> L79
        aw r37 = r33.f;     // Catch: Throwable -> L79
        this.s = r35;     // Catch: Throwable -> L79
        this.q = r33;     // Catch: Throwable -> L79
        this.r = r36;     // Catch: Throwable -> L79
        this.p = 1;     // Catch: Throwable -> L79
        r37.getClass();     // Catch: Throwable -> L79
        Object r38 = aw.H(r37, this);     // Catch: Throwable -> L79
        if (r38 == r7) goto L217;
        we0 r39 = r35;
        g74 r40 = r36;
        hw4 r115 = r33;
    L92:
        this.s = r39;     // Catch: Throwable -> L79
        this.q = null;     // Catch: Throwable -> L79
        this.r = null;     // Catch: Throwable -> L79
        this.p = 2;     // Catch: Throwable -> L79
        if (hw4.E(r115, r40, (fw4) r38, this) == r7) goto L217;
        r35 = r39;
    L217:
        return r7;
    L96:
        r33.g = null;
        return r3;
    L81:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L82:
        r40 = (g74) this.r;
        hw4 r41 = (hw4) this.q;
        we0 r42 = (we0) this.s;
        kb4.X(r25);     // Catch: Throwable -> L79
        r115 = r41;
        r39 = r42;
        r38 = r25;
        goto L92
    L85:
        kb4.X(r25);
        r35 = (we0) this.s;
    L79:
        th = move-exception;
        r33.g = null;
        throw th;
    L100:
        int r43 = this.p;
        if (r43 == 0) goto L108;
        if (r43 == 1) goto L107;
        if (r43 != 2) goto L105;
        gx3 r44 = (gx3) this.q;
        we0 r45 = (we0) this.r;
        kb4.X(r25);
        gx3 r116 = r44;
        we0 r117 = r45;
    L109:
        ry1 r118 = new ry1((b13) this.s, (ty1) r5, r116, r117, 0);
        this.r = r117;
        this.q = r116;
        this.p = 1;
        if (getContext().K(fz0.g0) == null) goto L112;
        kf2.k();
    L120:
        return null;
    L112:
        if (vr1.x(getContext()).a(r118, this) != r7) goto L115;
        return r7;
    L115:
        if (r116.n != 0.0f) goto L109;
        gc0 r46 = new gc0(r8, new qv3(new wc(7, r117), null));
        sy1 r47 = new sy1(2, null);
        this.r = r117;
        this.q = r116;
        this.p = 2;
        if (ya4.q(r46, r47, this) != r7) goto L109;
        return r7;
    L105:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        goto L120
    L107:
        gx3 r48 = (gx3) this.q;
        we0 r49 = (we0) this.r;
        kb4.X(r25);
        r116 = r48;
        r117 = r49;
        goto L115
    L108:
        kb4.X(r25);
        we0 r50 = (we0) this.r;
        gx3 r51 = new gx3();
        r51.n = 1.0f;
        r117 = r50;
        r116 = r51;
        goto L109
    L121:
        p81 r119 = (p81) this.r;
        nl4 r120 = (nl4) this.s;
        int r52 = this.p;
        if (r52 == 0) goto L131;
        if (r52 == 1) goto L130;
        if (r52 == 2) goto L129;
        if (r52 == 3) goto L130;
        if (r52 == 4) goto L130;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L129:
        kb4.X(r25);
    L141:
        this.p = 3;
        if (r119.a(r120, this) == r7) goto L153;
        return r3;
    L153:
        return r7;
    L130:
        kb4.X(r25);
        return r3;
    L131:
        kb4.X(r25);
        il4 r53 = (il4) this.q;
        if (r53 != id4.a) goto L136;
        this.p = 1;
        if (r119.a(r120, this) == r7) goto L153;
        return r3;
    L136:
        vd0 r121 = null;
        if (r53 != id4.b) goto L144;
        on4 r54 = r120.h();
        f91 r55 = new f91(2, null);
        this.p = 2;
        if (ya4.q(r54, r55, this) != r7) goto L141;
    L144:
        on4 r122 = r120.h();
        hl4 r56 = new hl4(r53, null);
        int r57 = b91.a;
        q01 r123 = q01.n;
        wv r210 = wv.n;
        p81 r58 = ya4.m(ya4.m(new x81(new f10(r56, r122, r123, -2, r210), new pv3(r4, r121, r8), 1)));
        x70 r124 = new x70(r119, r120, (Float) r5, r121, 3);
        this.p = 4;
        Object r59 = ya4.e(new f10(new a91(r124, null), r58, r123, -2, r210), 0).a(n63.n, this);
        if (r59 == r7) goto L148;
        r59 = r3;
    L148:
        if (r59 == r7) goto L151;
        r59 = r3;
    L151:
        if (r59 == r7) goto L153;
        return r3;
    L154:
        nl4 r60 = (nl4) this.s;
        int r61 = this.p;
        if (r61 == 0) goto L160;
        if (r61 != 1) goto L158;
        kb4.X(r25);
        return r3;
    L158:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
    L226:
        return null;
    L160:
        kb4.X(r25);
        int r62 = ((gd4) this.q).ordinal();
        if (r62 == 0) goto L169;
        if (r62 == 1) goto L227;
        if (r62 != 2) goto L168;
        Float r63 = (Float) r5;
        if (r63 == g12.e) goto L167;
        r60.j(null, r63);
        return r3;
    L167:
        er1.l("MutableStateFlow.resetReplayCache is not supported");
        goto L226
    L168:
        er1.n();
        goto L226
    L227:
        return r3;
    L169:
        p81 r64 = (p81) this.r;
        this.p = 1;
        if (r64.a(r60, this) == r7) goto L172;
        return r3;
    L172:
        return r7;
    L173:
        int r65 = this.p;
        if (r65 == 0) goto L178;
        if (r65 != 1) goto L177;
        kb4.X(r25);
        return r25;
    L177:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L178:
        kb4.X(r25);
        this.p = 1;
        Object r66 = ConstraintTrackingWorker.e((ConstraintTrackingWorker) this.q, (oc2) this.r, (c52) this.s, (dd5) r5, this);
        if (r66 == r7) goto L181;
        return r66;
    L181:
        return r7;
    L182:
        int r67 = this.p;
        if (r67 == 0) goto L187;
        if (r67 != 1) goto L186;
        kb4.X(r25);
        Object r68 = r25;
    L190:
        ((AtomicInteger) this.s).set(((Number) r68).intValue());
        ((ic2) r5).cancel(true);
        return r3;
    L186:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L187:
        kb4.X(r25);
        c52 r69 = (c52) this.q;
        dd5 r70 = (dd5) this.r;
        this.p = 1;
        r68 = ic0.a(r69, r70, this);
        if (r68 != r7) goto L190;
        return r7;
    L192:
        int r71 = this.p;
        if (r71 == 0) goto L197;
        if (r71 != 1) goto L196;
        kb4.X(r25);
        Object r72 = r25;
    L200:
        ((Consumer) r5).accept(uo.U((k02) r72));
        return r3;
    L196:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L197:
        kb4.X(r25);
        a80 r73 = (a80) this.q;
        ScrollCaptureSession r74 = (ScrollCaptureSession) this.r;
        Rect r75 = (Rect) this.s;
        k02 r76 = new k02(r75.left, r75.top, r75.right, r75.bottom);
        this.p = 1;
        r72 = a80.a(r73, r74, r76, this);
        if (r72 != r7) goto L200;
        return r7;
    }

    public x70(hw4 r2, vd0 r3) {
        this.o = 6;
        this.t = r2;
        super(2, r3);
    }

    public /* synthetic */ x70(Object r1, Object r2, Serializable r3, vd0 r4, int r5) {
        this.o = r5;
        this.r = r1;
        this.s = r2;
        this.t = r3;
        super(2, r4);
    }

    public x70(b13 r2, ty1 r3, vd0 r4) {
        this.o = 5;
        this.s = r2;
        this.t = r3;
        super(2, r4);
    }
}

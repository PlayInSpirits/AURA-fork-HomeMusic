package defpackage;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ey4 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ jy4 r;

    public /* synthetic */ ey4(jy4 r1, vd0 r2, int r3) {
        this.o = r3;
        this.r = r1;
        super(2, r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        int r0 = this.o;
        jy4 r2 = this.r;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ey4 r1 = new ey4(r2, r4, 2);
        r1.q = r3;
        return r1;
    L6:
        ey4 r5 = new ey4(r2, r4, 1);
        r5.q = r3;
        return r5;
    L8:
        ey4 r6 = new ey4(r2, r4, 0);
        r6.q = r3;
        return r6;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return ((ey4) create((mw4) r3, (vd0) r4)).invokeSuspend(r1);
    L7:
        return ((ey4) create((mw4) r3, (vd0) r4)).invokeSuspend(r1);
    L9:
        return ((ey4) create((ao3) r3, (vd0) r4)).invokeSuspend(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r22) {
        int r1 = this.o;
        lw4 r2 = lw4.o;
        boolean r3 = false;
        xe0 r6 = xe0.n;
        boolean r7 = true;
        jy4 r8 = this.r;
        vd0 r9 = null;
        switch(r1) {
            case 0: goto L72;
            case 1: goto L49;
            default: goto L4;
        };
    L4:
        int r4 = this.p;
        j15 r10 = j15.a;
        if (r4 == 0) goto L12;
        if (r4 == 1) goto L11;
        if (r4 != 2) goto L10;
        kb4.X(r22);
    L46:
        return r10;
    L10:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L11:
        mw4 r5 = (mw4) this.q;
        kb4.X(r22);
        Object r11 = r22;
    L16:
        if (((Boolean) r11).booleanValue() == true) goto L46;
        ll r12 = r8.h;
        long[] r13 = (long[]) r12.q;
        ReentrantLock r14 = (ReentrantLock) r12.p;
        r14.lock();
    L33:
        th = move-exception;
        r14.unlock();
        throw th;
    L20:
        if (r12.o == true) goto L22;
        r14.unlock();
        y73[] r15 = null;
    L43:
        if (r15 == null) goto L46;
        iy4 r16 = new iy4(r15, r8, r5, null);
        this.q = null;
        this.p = 2;
        if (r5.a(r2, r16, this) != r6) goto L46;
        return r6;
    L22:
        r12.o = false;     // Catch: Throwable -> L33
        int r17 = r13.length;     // Catch: Throwable -> L33
        r15 = new y73[r17];     // Catch: Throwable -> L33
        int r18 = 0;
        boolean r19 = false;
    L23:
        if (r18 >= r17) goto L39;
        if (r13[r18] <= 0) goto L27;
        r3 = r7;
    L27:
        boolean[] r20 = (boolean[]) r12.r;     // Catch: Throwable -> L33
        if (r3 == r20[r18]) goto L36;
        r20[r18] = r3;     // Catch: Throwable -> L33
        if (r3 == false) goto L35;
        y73 r21 = y73.o;     // Catch: Throwable -> L33
    L32:
        r19 = true;
    L37:
        r15[r18] = r21;     // Catch: Throwable -> L33
        r18 = r18 + 1;
        r3 = false;
        r7 = true;
        goto L23
    L35:
        r21 = y73.p;     // Catch: Throwable -> L33
        goto L32
    L36:
        r21 = y73.n;     // Catch: Throwable -> L33
        goto L37
    L39:
        if (r19 == true) goto L42;
        r15 = null;
    L42:
        r14.unlock();
        goto L43
    L12:
        kb4.X(r22);
        r5 = (mw4) this.q;
        this.q = r5;
        this.p = 1;
        r11 = r5.d(this);
        if (r11 != r6) goto L16;
        return r6;
    L49:
        int r23 = this.p;
        if (r23 != 0) goto L52;
        kb4.X(r22);
        mw4 r24 = (mw4) this.q;
        this.q = r24;
        this.p = 1;
        Object r25 = r24.d(this);
        if (r25 != r6) goto L63;
        return r6;
    L63:
        if (((Boolean) r25).booleanValue() == true) goto L71;
        ey4 r26 = new ey4(r8, r9, 0);     // Catch: SQLException -> L81
        this.q = null;     // Catch: SQLException -> L81
        this.p = 2;     // Catch: SQLException -> L81
        Object r0 = r24.a(r2, r26, this);     // Catch: SQLException -> L81
        if (r0 == r6) goto L91;
    L68:
        return (Set) r0;
    L91:
        return r6;
    L52:
        if (r23 != 1) goto L54;
        r24 = (mw4) this.q;
        kb4.X(r22);
        r25 = r22;
        goto L63
    L54:
        if (r23 != 2) goto L57;
        kb4.X(r22);     // Catch: SQLException -> L81
        r0 = r22;
        goto L68
    L57:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L71:
        return z01.n;
    L72:
        int r27 = this.p;
        if (r27 == 0) goto L77;
        if (r27 != 1) goto L76;
        kb4.X(r22);
        return r22;
    L76:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L77:
        kb4.X(r22);
        ao3 r28 = (ao3) this.q;
        this.p = 1;
        Object r29 = jy4.a(r8, r28, this);
        if (r29 == r6) goto L80;
        return r29;
    L80:
        return r6;
    }
}

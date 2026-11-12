package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uo4 implements mw4, qu3 {
    public final po4 a;

    public uo4(po4 r1) {
        this.a = r1;
    }

    @Override // defpackage.mw4
    public final Object a(lw4 r1, wf1 r2, ep4 r3) {
        return e(r1, r2, r3);
    }

    @Override // defpackage.yn3
    public final Object b(String r1, if1 r2, wd0 r3) {
        zo4 r0 = this.a.b(r1);
        Object r4 = r2.invoke(r0);     // Catch: Throwable -> L6
        ud3.e(r0, null);
        return r4;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        ud3.e(r0, th);
        throw th;
    }

    @Override // defpackage.qu3
    public final x34 c() {
        return this.a;
    }

    @Override // defpackage.mw4
    public final Object d(ep4 r1) {
        return Boolean.valueOf(this.a.n.v());
    }

    public final Object e(lw4 r9, wf1 r10, wd0 r11) {
        if ((r11 instanceof to4) == false) goto L7;
        to4 r0 = (to4) r11;
        int r1 = r0.r;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.r = r1 - Integer.MIN_VALUE;
    L8:
        Object r12 = r0.p;
        int r2 = r0.r;
        if (r2 == 0) goto L18;
        if (r2 != 1) goto L16;
        we1 r8 = r0.o;
        uo4 r13 = r0.n;
        kb4.X(r12);     // Catch: Throwable -> L14
    L41:
        r8.H();     // Catch: Throwable -> L14
        r8.n();
        if (r8.v() == true) goto L45;
        r13.getClass();
    L45:
        return r12;
    L14:
        th = th;
    L48:
        r8.n();
        if (r8.v() == true) goto L51;
        r13.getClass();
    L51:
        throw th;
    L16:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r12);
        we1 r14 = this.a.n;
        r14.v();
        int r15 = r9.ordinal();
        if (r15 == 0) goto L27;
        if (r15 != 1) goto L22;
        r14.f();
    L52:
        Object r16 = new ao3(1, this);     // Catch: Throwable -> L46
        r0.n = this;     // Catch: Throwable -> L46
        r0.o = r14;     // Catch: Throwable -> L46
        r0.r = 1;     // Catch: Throwable -> L46
        Object r17 = r10.invoke(r16, r0);     // Catch: Throwable -> L46
        Object r18 = xe0.n;
        if (r17 != r18) goto L40;
        return r18;
    L40:
        r13 = this;
        r8 = r14;
        r12 = r17;
    L46:
        th = th;
        r13 = this;
        r8 = r14;
        goto L48
    L22:
        if (r15 != 2) goto L24;
        r14.b();
        goto L52
    L24:
        er1.n();
        return null;
    L27:
        SQLiteDatabase r3 = r14.n;
        r72 r4 = we1.r;
        if (((Method) r4.getValue()) == null) goto L35;
        r72 r5 = we1.q;
        if (((Method) r5.getValue()) == null) goto L35;
        Method r6 = (Method) r4.getValue();
        r6.getClass();
        Method r7 = (Method) r5.getValue();
        r7.getClass();
        Object r19 = r7.invoke(r3, null);
        if (r19 == null) goto L34;
        r6.invoke(r19, new Object[]{0, null, 0, null});
        goto L52
    L34:
        kf2.o("Required value was null.");
    L35:
        r14.b();
    L7:
        r0 = new to4(this, r11);
        goto L8
    }
}

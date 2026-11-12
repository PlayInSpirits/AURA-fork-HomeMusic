package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q31 implements qc2, r83, lm2, wc0, f4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ q31(int r1, va4 r2, Bundle r3) {
        this.n = 4;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.wc0
    public void accept(Object r4) {
        fr2 r0 = (fr2) this.p;
        int r3 = this.o;
        m92 r5 = (m92) ((ic2) r4).get();     // Catch: InterruptedException -> L5 ExecutionException -> L7 CancellationException -> L9
        rr2.s(r5, "LibraryResult must not be null");     // Catch: InterruptedException -> L5 ExecutionException -> L7 CancellationException -> L9
    L18:
        er2 r2 = r0.d;     // Catch: RemoteException -> L15
        r2.getClass();     // Catch: RemoteException -> L15
        r2.r(r3, r5);     // Catch: RemoteException -> L15
        return;
    L15:
        e = move-exception;
        l93.r0("MediaSessionStub", "Failed to send result to browser " + r0, e);
        return;
    L5:
        e = e;
    L11:
        l93.r0("MediaSessionStub", "Library operation failed", e);
        r5 = m92.b(-1);
    L9:
        e = move-exception;
        l93.r0("MediaSessionStub", "Library operation cancelled", e);
        r5 = m92.b(1);
    L7:
        e = e;
        goto L11
    }

    @Override // defpackage.lm2
    public void c(bm2 r13) {
        int r0 = this.n;
        gq0 r2 = gq0.n;
        int r3 = 6;
        boolean r4 = false;
        Object r6 = this.p;
        int r12 = this.o;
        switch(r0) {
            case 2: goto L23;
            case 3: goto L12;
            default: goto L4;
        };
    L4:
        va4 r7 = (va4) r6;
        if (r13.Y() == false) goto L34;
        sk2 r1 = r13.f1();
        r1.getClass();
        if (Looper.myLooper() != r1.f.getLooper()) goto L10;
        r4 = true;
    L10:
        rr2.w(r4);
        mw1 r5 = r1.e.y(r7);
        r5.f(new gk(r13, r5, r12, r3), r2);
        return;
    L34:
        return;
    L12:
        List r8 = (List) r6;
        if (r13.Y() == false) goto L35;
        gy3 r9 = r13.u;
        gy3 r10 = r13.v;
        r13.s = yw1.k(r8);
        gy3 r11 = bm2.u1(r13.t, r8, r13.w, r13.z, r13.I);
        r13.u = r11;
        r13.v = bm2.t1(r11, r8, r13.I, r13.w, r13.z);
        boolean r14 = r13.u.equals(r9);
        r13.v.equals(r10);
        sk2 r15 = r13.f1();
        r15.getClass();
        if (Looper.myLooper() != r15.f.getLooper()) goto L18;
        r4 = true;
    L18:
        rr2.w(r4);
        qk2 r16 = r15.e;
        r16.getClass();
        mw1 r17 = new mw1(new ab4(-6));
        if (r14 == true) goto L21;
        r16.u();
    L21:
        r17.f(new gk(r13, r17, r12, r3), r2);
        return;
    L35:
        return;
    L23:
        yw1 r18 = (yw1) r6;
        if (r13.Y() == false) goto L36;
        gy3 r19 = r13.u;
        gy3 r20 = r13.v;
        r13.t = yw1.k(r18);
        gy3 r21 = bm2.u1(r18, r13.s, r13.w, r13.z, r13.I);
        r13.u = r21;
        r13.v = bm2.t1(r21, r13.s, r13.I, r13.w, r13.z);
        boolean r22 = r13.u.equals(r19);
        r13.v.equals(r20);
        sk2 r23 = r13.f1();
        r23.getClass();
        if (Looper.myLooper() != r23.f.getLooper()) goto L29;
        r4 = true;
    L29:
        rr2.w(r4);
        qk2 r24 = r23.e;
        r24.getClass();
        mw1 r25 = new mw1(new ab4(-6));
        if (r22 == true) goto L32;
        r24.u();
    L32:
        r25.f(new gk(r13, r25, r12, r3), r2);
        return;
    }

    @Override // defpackage.f4
    public boolean h(View r1) {
        ((SideSheetBehavior) this.p).w(this.o);
        return true;
    }

    @Override // defpackage.qc2
    public void invoke(Object r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((oi3) r2).I(((pe4) this.p).w, this.o);
        return;
    L6:
        ((oi3) r2).I(((ph3) this.p).a, this.o);
    }

    @Override // defpackage.r83
    public pb5 x(View r4, pb5 r5) {
        ViewGroup.MarginLayoutParams r0 = (ViewGroup.MarginLayoutParams) this.p;
        int r1 = r5.a.h(2).d;
        r0.bottomMargin = this.o + r1;
        r4.setLayoutParams(r0);
        return r5;
    }

    public /* synthetic */ q31(int r1, gy3 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    public /* synthetic */ q31(int r1, int r2, Object r3) {
        this.n = r2;
        this.p = r3;
        this.o = r1;
    }
}

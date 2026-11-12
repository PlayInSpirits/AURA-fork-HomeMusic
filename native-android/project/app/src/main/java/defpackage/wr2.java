package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wr2 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ tn2 c;

    public wr2(tn2 r1, Looper r2) {
        this.c = r1;
        super(r2);
        this.a = true;
        this.b = true;
    }

    public final void a(boolean r4, boolean r5) {
        boolean r1 = false;
        if (this.a == false) goto L6;
        if (r4 == false) goto L6;
        boolean r6 = true;
    L7:
        this.a = r6;
        if (this.b == false) goto L11;
        if (r5 == false) goto L11;
        r1 = true;
    L11:
        this.b = r1;
        if (hasMessages(1) == true) goto L15;
        sendEmptyMessage(1);
        return;
    L15:
        return;
    L6:
        r6 = false;
        goto L7
    }

    @Override // android.os.Handler
    public final void handleMessage(Message r17) {
        tn2 r2 = this.c;
        kt2 r3 = r2.g;
        if (r17.what != 1) goto L39;
        lk3 r0 = r2.r.n(r2.s.Z0(), r2.s.X0(), r2.r.k);
        r2.r = r0;
        boolean r10 = this.a;
        boolean r11 = this.b;
        lk3 r4 = r3.X(r0);
        na4 r12 = r3.f;
        yw1 r13 = r12.u();
        int r15 = 0;
    L6:
        if (r15 >= r13.size()) goto L37;
        fr2 r6 = (fr2) r13.get(r15);
        yk r1 = r12.C(r6);     // Catch: RemoteException -> L11 DeadObjectException -> L13
        if (r1 == null) goto L15;
        int r7 = r1.s();     // Catch: RemoteException -> L11 DeadObjectException -> L13
    L18:
        lk3 r5 = r12.B(r6);     // Catch: RemoteException -> L11 DeadObjectException -> L13
        if (r5 != null) goto L36;
        r12.A(r6);     // Catch: RemoteException -> L11 DeadObjectException -> L13
        mi3 r9 = ju2.d(r12.t(r6), r2.s.o());     // Catch: RemoteException -> L11 DeadObjectException -> L13
        fr2 r14 = r6;
        er2 r8 = r14.d;     // Catch: RemoteException -> L31 DeadObjectException -> L33
        r8.getClass();     // Catch: RemoteException -> L31 DeadObjectException -> L33
        if (r5 != null) goto L26;
        lk3 r16 = r4;
    L42:
        r8.A(r7, r16, r9, r10, r11);     // Catch: RemoteException -> L29 DeadObjectException -> L41
    L29:
        e = e;
    L34:
        l93.r0("MediaSessionImpl", "Exception in " + r14, e);
    L35:
        r3.f.N(r14);
        goto L36
    L26:
        r16 = r5;
        goto L42
    L33:
        r14 = r14;
    L31:
        e = e;
        r14 = r14;
    L36:
        r15 = r15 + 1;
        goto L6
    L15:
        if (r2.j(r6) == false) goto L37;
        r7 = 0;
        goto L18
    L13:
        r14 = r6;
    L11:
        e = e;
        r14 = r6;
    L37:
        this.a = true;
        this.b = true;
        return;
    L39:
        zr2.c(r17.what, "Invalid message what=");
    }
}

package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rf5 extends ef5 implements gj1, hj1 {
    public static final u02 m = null;
    public final Context f;
    public final Handler g;
    public final u02 h;
    public final Set i;
    public final ml3 j;
    public sd4 k;
    public nq l;

    static {
        m = tf5.a;
    }

    public rf5(Context r2, zw2 r3, ml3 r4) {
        super(0);
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f = r2;
        this.g = r3;
        this.j = r4;
        this.i = (Set) r4.a;
        this.h = m;
    }

    @Override // defpackage.ef5
    public final boolean M0(int r2, Parcel r3, Parcel r4) {
        int r0 = 0;
        switch(r2) {
            case 3: goto L10;
            case 4: goto L9;
            case 5: goto L4;
            case 6: goto L8;
            case 7: goto L7;
            case 8: goto L6;
            case 9: goto L5;
            default: goto L4;
        };
    L4:
        return false;
    L5:
        yf5 r1 = (yf5) mf5.a(r3, yf5.CREATOR);
        mf5.b(r3);
    L11:
        r4.writeNoException();
        return true;
    L6:
        dg5 r5 = (dg5) mf5.a(r3, dg5.CREATOR);
        mf5.b(r3);
        qf5 r6 = new qf5(r0, this, r5);
        this.g.post(r6);
        goto L11
    L7:
        Status r7 = (Status) mf5.a(r3, Status.CREATOR);
        GoogleSignInAccount r8 = (GoogleSignInAccount) mf5.a(r3, GoogleSignInAccount.CREATOR);
        mf5.b(r3);
        goto L11
    L8:
        Status r9 = (Status) mf5.a(r3, Status.CREATOR);
        mf5.b(r3);
        goto L11
    L9:
        Status r10 = (Status) mf5.a(r3, Status.CREATOR);
        mf5.b(r3);
        goto L11
    L10:
        ka0 r11 = (ka0) mf5.a(r3, ka0.CREATOR);
        bf5 r12 = (bf5) mf5.a(r3, bf5.CREATOR);
        mf5.b(r3);
        goto L11
    }

    @Override // defpackage.gj1
    public final void U(int r2) {
        nq r1 = this.l;
        gf5 r3 = (gf5) ((ij1) r1.s).w.get((ve) r1.p);
        if (r3 != null) goto L5;
        return;
    L5:
        if (r3.m == false) goto L8;
        r3.n(new ka0(17));
        return;
    L8:
        r3.U(r2);
    }

    @Override // defpackage.gj1
    public final void X() {
        sd4 r0 = this.k;
        r0.getClass();
        int r2 = 0;
        r0.M.getClass();     // Catch: RemoteException -> L6
        Account r5 = new Account("<<default account>>", "com.google");     // Catch: RemoteException -> L6
        if ("<<default account>>".equals(r5.name) == false) goto L8;
        GoogleSignInAccount r1 = bm4.a(r0.p).b();     // Catch: RemoteException -> L6
    L9:
        Integer r7 = r0.O;     // Catch: RemoteException -> L6
        ji2.m(r7);     // Catch: RemoteException -> L6
        hg5 r6 = new hg5(2, r5, r7.intValue(), r1);     // Catch: RemoteException -> L6
        wf5 r3 = (wf5) r0.e();     // Catch: RemoteException -> L6
        Parcel r4 = Parcel.obtain();     // Catch: RemoteException -> L6
        r4.writeInterfaceToken(r3.g);     // Catch: RemoteException -> L6
        int r8 = mf5.a;     // Catch: RemoteException -> L6
        r4.writeInt(1);     // Catch: RemoteException -> L6
        int r9 = ud3.R0(r4, 20293);     // Catch: RemoteException -> L6
        ud3.T0(r4, 1, 4);     // Catch: RemoteException -> L6
        r4.writeInt(1);     // Catch: RemoteException -> L6
        ud3.M0(r4, 2, r6, 0);     // Catch: RemoteException -> L6
        ud3.S0(r4, r9);     // Catch: RemoteException -> L6
        r4.writeStrongBinder(this);     // Catch: RemoteException -> L6
        Parcel r10 = Parcel.obtain();     // Catch: RemoteException -> L6
        r3.f.transact(12, r4, r10, 0);     // Catch: Throwable -> L13
        r10.readException();     // Catch: Throwable -> L13
        r4.recycle();     // Catch: RemoteException -> L6
        r10.recycle();     // Catch: RemoteException -> L6
        return;
    L13:
        th = move-exception;
        r4.recycle();     // Catch: RemoteException -> L6
        r10.recycle();     // Catch: RemoteException -> L6
        throw th;     // Catch: RemoteException -> L6
    L8:
        r1 = null;
    L6:
        e = move-exception;
        Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
        this.g.post(new qf5(r2, this, new dg5(1, new ka0(8, null), null)));     // Catch: RemoteException -> L19
        return;
    L19:
        Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
    }

    @Override // defpackage.hj1
    public final void m(ka0 r1) {
        this.l.a(r1);
    }
}

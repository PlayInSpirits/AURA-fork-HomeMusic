package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sh1 extends h2 {
    public static final Scope[] B = null;
    public static final p61[] C = null;
    public static final Parcelable.Creator<sh1> CREATOR = null;
    public final String A;
    public final int n;
    public final int o;
    public final int p;
    public String q;
    public IBinder r;
    public Scope[] s;
    public Bundle t;
    public Account u;
    public p61[] v;
    public p61[] w;
    public final boolean x;
    public final int y;
    public boolean z;

    static {
        CREATOR = new rh5(13);
        B = new Scope[0];
        C = new p61[0];
    }

    public sh1(int r2, int r3, int r4, String r5, IBinder r6, Scope[] r7, Bundle r8, Account r9, p61[] r10, p61[] r11, boolean r12, int r13, boolean r14, String r15) {
        if (r7 != null) goto L5;
        r7 = B;
    L5:
        if (r8 != null) goto L7;
        r8 = new Bundle();
    L7:
        p61[] r0 = C;
        if (r10 != null) goto L10;
        r10 = r0;
    L10:
        if (r11 != null) goto L12;
        r11 = r0;
    L12:
        this.n = r2;
        this.o = r3;
        this.p = r4;
        if ("com.google.android.gms".equals(r5) == false) goto L15;
        this.q = "com.google.android.gms";
    L17:
        if (r2 >= 2) goto L33;
        Account r16 = null;
        if (r6 == null) goto L32;
        int r17 = g4.f;
        IInterface r18 = r6.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if ((r18 instanceof eu1) == false) goto L23;
        eu1 r19 = (eu1) r18;
    L24:
        long r20 = Binder.clearCallingIdentity();
        r16 = ((vk5) r19).m();     // Catch: RemoteException -> L27 Throwable -> L29
    L26:
        Binder.restoreCallingIdentity(r20);
        goto L32
    L27:
        Log.w("AccountAccessor", "Remote account accessor probably died");     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        Binder.restoreCallingIdentity(r20);
        throw th;
    L23:
        r19 = new vk5(r6);
    L32:
        this.u = r16;
    L34:
        this.s = r7;
        this.t = r8;
        this.v = r10;
        this.w = r11;
        this.x = r12;
        this.y = r13;
        this.z = r14;
        this.A = r15;
        return;
    L33:
        this.r = r6;
        this.u = r9;
        goto L34
    L15:
        this.q = r5;
        goto L17
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        rh5.a(this, r1, r2);
    }
}

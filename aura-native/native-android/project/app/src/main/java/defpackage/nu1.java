package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nu1 implements pu1 {
    public IBinder e;

    @Override // defpackage.pu1
    public final void A(ju1 ju1Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, bundle);
            this.e.transact(3048, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void A0(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3046, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void B(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3041, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void B0(ju1 ju1Var, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.e.transact(3006, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void C0(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3034, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void D(ju1 ju1Var, int i, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            si0.e(parcelObtain, bundle);
            this.e.transact(3030, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void D0(ju1 ju1Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.e.transact(3017, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void E0(ju1 ju1Var, int i, int i2, int i3, int i4) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(i4);
            this.e.transact(3023, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void F(ju1 ju1Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.e.transact(3052, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void F0(ju1 ju1Var, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.e.transact(3022, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void G(ju1 ju1Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, bundle);
            this.e.transact(3029, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void G0(ju1 ju1Var, int i, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            si0.e(parcelObtain, bundle);
            this.e.transact(3055, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void H(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3040, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void H0(ju1 ju1Var, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.e.transact(3018, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void J(ju1 ju1Var, int i, iw iwVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iwVar);
            this.e.transact(3010, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void K(ju1 ju1Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.e.transact(3053, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void L(ju1 ju1Var, int i, IBinder iBinder, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(1);
            this.e.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void M(ju1 ju1Var, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.e.transact(3020, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void N(ju1 ju1Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.e.transact(3019, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void P(ju1 ju1Var, int i, int i2, int i3, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeStrongBinder(iBinder);
            this.e.transact(3056, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void Q(ju1 ju1Var, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.e.transact(3062, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void R(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3047, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void S(ju1 ju1Var, int i, int i2, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeLong(j);
            this.e.transact(3039, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void T(ju1 ju1Var, int i, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            this.e.transact(3031, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void W(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3036, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void Z(ju1 ju1Var, int i, int i2, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeStrongBinder(iBinder);
            this.e.transact(3032, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void a(ju1 ju1Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, bundle);
            this.e.transact(3014, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void a0(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3042, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    @Override // defpackage.pu1
    public final void b(ju1 ju1Var, int i, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, bundle);
            parcelObtain.writeInt(z ? 1 : 0);
            this.e.transact(3057, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void d(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3025, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void d0(ju1 ju1Var, int i, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeLong(j);
            this.e.transact(3038, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void e0(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3026, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void f0(ju1 ju1Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.e.transact(3037, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void g0(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3005, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void h0(ju1 ju1Var, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.e.transact(3013, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void i0(ju1 ju1Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, bundle);
            this.e.transact(3007, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void j0(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3035, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void k(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3058, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void l(ju1 ju1Var, int i, Bundle bundle, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, bundle);
            parcelObtain.writeLong(j);
            this.e.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void m0(ju1 ju1Var, int i, Surface surface) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, surface);
            this.e.transact(3044, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void n0(ju1 ju1Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, bundle);
            this.e.transact(3015, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void o0(ju1 ju1Var, int i, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, bundle);
            parcelObtain.writeInt(1);
            this.e.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void p(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3059, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void p0(ju1 ju1Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            this.e.transact(3045, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void q(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3024, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void q0(ju1 ju1Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.e.transact(3003, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void r0(ju1 ju1Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, bundle);
            this.e.transact(3027, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void s(ju1 ju1Var, int i, Bundle bundle, Bundle bundle2, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, bundle);
            si0.e(parcelObtain, bundle2);
            parcelObtain.writeInt(z ? 1 : 0);
            this.e.transact(3060, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void t(ju1 ju1Var, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.e.transact(3051, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void t0(ju1 ju1Var, int i, Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, bundle);
            si0.e(parcelObtain, bundle2);
            this.e.transact(3016, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void u(ju1 ju1Var, int i, IBinder iBinder, int i2, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i2);
            parcelObtain.writeLong(j);
            this.e.transact(3012, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void v(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3043, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void v0(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3021, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void w(ju1 ju1Var, int i, float f) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeFloat(f);
            this.e.transact(3028, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void x(ju1 ju1Var, int i, float f) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeFloat(f);
            this.e.transact(3002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void x0(ju1 ju1Var, int i, boolean z, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(i2);
            this.e.transact(3054, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void y(ju1 ju1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            this.e.transact(3004, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void y0(ju1 ju1Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, bundle);
            this.e.transact(3033, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.pu1
    public final void z0(ju1 ju1Var, int i, Surface surface, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(ju1Var);
            parcelObtain.writeInt(i);
            si0.e(parcelObtain, surface);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.e.transact(3061, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}

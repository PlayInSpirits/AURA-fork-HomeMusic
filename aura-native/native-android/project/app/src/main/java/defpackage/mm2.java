package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mm2 extends Binder implements ju1 {
    public final WeakReference e;

    public mm2(bm2 bm2Var) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.e = new WeakReference(bm2Var);
    }

    public static ju1 m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ju1)) {
            return (ju1) iInterfaceQueryLocalInterface;
        }
        iu1 iu1Var = new iu1();
        iu1Var.e = iBinder;
        return iu1Var;
    }

    @Override // defpackage.ju1
    public final void C(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            U(new cn(26, za4.b(bundle)));
        } catch (RuntimeException e) {
            l93.r0("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // defpackage.ju1
    public final void E(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            l93.q0("MediaControllerStub", "Ignoring custom command with null args.");
            return;
        }
        try {
            U(new q31(i, va4.a(bundle), bundle2));
        } catch (RuntimeException e) {
            l93.r0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.ju1
    public final void I(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int iX = X();
            if (iX == -1) {
                return;
            }
            try {
                U(new ef0(18, lk3.r(iX, bundle), new jk3(bundle2.getBoolean(jk3.d, false), bundle2.getBoolean(jk3.e, false))));
            } catch (RuntimeException e) {
                l93.r0("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (RuntimeException e2) {
            l93.r0("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    @Override // defpackage.ju1
    public final void I0(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            K0(i, ab4.a(bundle));
        } catch (RuntimeException e) {
            l93.r0("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    public final void K0(int i, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            bm2 bm2Var = (bm2) this.e.get();
            if (bm2Var == null) {
                return;
            }
            bm2Var.b.y(i, obj);
            bm2Var.f1().a1(new ul(i, 4, bm2Var));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.ju1
    public final void O(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            K0(i, m92.a(bundle));
        } catch (RuntimeException e) {
            l93.r0("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e);
        }
    }

    public final void U(lm2 lm2Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            bm2 bm2Var = (bm2) this.e.get();
            if (bm2Var == null) {
                return;
            }
            f35.W(bm2Var.f1().f, new ws1(14, bm2Var, lm2Var));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final int X() {
        cb4 cb4Var;
        bm2 bm2Var = (bm2) this.e.get();
        if (bm2Var == null || (cb4Var = bm2Var.n) == null) {
            return -1;
        }
        return cb4Var.a.f();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.ju1
    public final void c() {
        U(new er1(23));
    }

    @Override // defpackage.ju1
    public final void e(int i) {
        U(new er1(22));
    }

    @Override // defpackage.ju1
    public final void i(int i, int i2, int i3) {
        U(new v31(i2, i3, 2));
    }

    @Override // defpackage.ju1
    public final void n(List list, int i) {
        if (list == null) {
            return;
        }
        try {
            int iX = X();
            if (iX == -1) {
                return;
            }
            uw1 uw1VarJ = yw1.j();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Bundle bundle = (Bundle) list.get(i2);
                bundle.getClass();
                uw1VarJ.c(j60.i(iX, bundle));
            }
            U(new q31(i, uw1VarJ.f(), 2));
        } catch (RuntimeException e) {
            l93.r0("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        jn2 jn2VarA;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i == 4001) {
            w0(parcel.readInt(), parcel.readString(), parcel.readInt(), (Bundle) gh0.a(parcel, Bundle.CREATOR));
            return true;
        }
        Object[] objArr = 0;
        if (i != 4002) {
            switch (i) {
                case 3001:
                    r(parcel.readInt(), (Bundle) gh0.a(parcel, Bundle.CREATOR));
                    return true;
                case 3002:
                    I0(parcel.readInt(), (Bundle) gh0.a(parcel, Bundle.CREATOR));
                    return true;
                case 3003:
                    O(parcel.readInt(), (Bundle) gh0.a(parcel, Bundle.CREATOR));
                    return true;
                case 3004:
                    s0(parcel.createTypedArrayList(Bundle.CREATOR), parcel.readInt());
                    return true;
                case 3005:
                    int i3 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    E(i3, (Bundle) gh0.a(parcel, creator), (Bundle) gh0.a(parcel, creator));
                    return true;
                case 3006:
                    parcel.readInt();
                    c();
                    return true;
                case 3007:
                    u0(parcel.readInt(), (Bundle) gh0.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case 3008:
                    C(parcel.readInt(), (Bundle) gh0.a(parcel, Bundle.CREATOR));
                    return true;
                case 3009:
                    z(parcel.readInt(), (Bundle) gh0.a(parcel, Bundle.CREATOR));
                    return true;
                case 3010:
                    parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle = (Bundle) gh0.a(parcel, creator2);
                    Bundle bundle2 = (Bundle) gh0.a(parcel, creator2);
                    if (bundle != null && bundle2 != null) {
                        try {
                            try {
                                U(new ef0(19, wa4.a(bundle), mi3.b(bundle2)));
                            } catch (RuntimeException e) {
                                l93.r0("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
                            }
                        } catch (RuntimeException e2) {
                            l93.r0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e2);
                        }
                    }
                    break;
                case 3011:
                    e(parcel.readInt());
                    return true;
                case 3012:
                    parcel.readInt();
                    Bundle bundleN = f35.n((Bundle) gh0.a(parcel, Bundle.CREATOR));
                    if (bundleN == null) {
                        l93.q0("MediaControllerStub", "Ignoring null Bundle for extras");
                        return true;
                    }
                    U(new cn(28, bundleN));
                    return true;
                case 3013:
                    int i4 = parcel.readInt();
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    I(i4, (Bundle) gh0.a(parcel, creator3), (Bundle) gh0.a(parcel, creator3));
                    return true;
                case 3014:
                    U(new cn(parcel.readInt(), (PendingIntent) gh0.a(parcel, PendingIntent.CREATOR)));
                    return true;
                case 3015:
                    parcel.readInt();
                    try {
                        xa4.a((Bundle) gh0.a(parcel, Bundle.CREATOR));
                        U(new er1(21));
                    } catch (RuntimeException e3) {
                        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e3);
                    }
                    break;
                case 3016:
                    n(parcel.createTypedArrayList(Bundle.CREATOR), parcel.readInt());
                    return true;
                case 3017:
                    int i5 = parcel.readInt();
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    Bundle bundle3 = (Bundle) gh0.a(parcel, creator4);
                    Bundle bundle4 = (Bundle) gh0.a(parcel, creator4);
                    Bundle bundle5 = (Bundle) gh0.a(parcel, creator4);
                    if (bundle3 == null || bundle4 == null) {
                        l93.q0("MediaControllerStub", "Ignoring custom command progress update with null args.");
                    } else {
                        try {
                            U(new ij0(i5, va4.a(bundle3), bundle4, bundle5));
                        } catch (RuntimeException e4) {
                            l93.r0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e4);
                        }
                    }
                    break;
                case 3018:
                    i(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel.readInt();
            String string = parcel.readString();
            int i6 = parcel.readInt();
            Bundle bundle6 = (Bundle) gh0.a(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string)) {
                l93.q0("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
            } else if (i6 < 0) {
                xa3.m(i6, "onSearchResultChanged(): Ignoring negative itemCount: ", "MediaControllerStub");
            } else {
                if (bundle6 == null) {
                    jn2VarA = null;
                } else {
                    try {
                        jn2VarA = jn2.a(bundle6);
                    } catch (RuntimeException e5) {
                        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e5);
                    }
                }
                U(new jm2(string, i6, jn2VarA, (int) (objArr == true ? 1 : 0)));
            }
        }
        return true;
    }

    @Override // defpackage.ju1
    public final void r(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            U(new cn(25, oa0.a(bundle)));
        } catch (RuntimeException e) {
            l93.r0("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            c();
        }
    }

    @Override // defpackage.ju1
    public final void s0(List list, int i) {
        if (list == null) {
            return;
        }
        try {
            int iX = X();
            if (iX == -1) {
                return;
            }
            uw1 uw1VarJ = yw1.j();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Bundle bundle = (Bundle) list.get(i2);
                bundle.getClass();
                uw1VarJ.c(j60.i(iX, bundle));
            }
            U(new q31(i, uw1VarJ.f(), 3));
        } catch (RuntimeException e) {
            l93.r0("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e);
        }
    }

    @Override // defpackage.ju1
    public final void u0(int i, Bundle bundle, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(jk3.d, z);
        bundle2.putBoolean(jk3.e, true);
        I(i, bundle, bundle2);
    }

    @Override // defpackage.ju1
    public final void w0(int i, String str, int i2, Bundle bundle) {
        jn2 jn2VarA;
        if (TextUtils.isEmpty(str)) {
            l93.q0("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
            return;
        }
        if (i2 < 0) {
            xa3.m(i2, "onChildrenChanged(): Ignoring negative itemCount: ", "MediaControllerStub");
            return;
        }
        if (bundle == null) {
            jn2VarA = null;
        } else {
            try {
                jn2VarA = jn2.a(bundle);
            } catch (RuntimeException e) {
                l93.r0("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        U(new jm2(str, i2, jn2VarA, 1));
    }

    @Override // defpackage.ju1
    public final void z(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            U(new km2(mi3.b(bundle)));
        } catch (RuntimeException e) {
            l93.r0("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
        }
    }
}

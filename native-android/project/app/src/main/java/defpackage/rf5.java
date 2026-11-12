package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rf5 extends ef5 implements gj1, hj1 {
    public static final u02 m = tf5.a;
    public final Context f;
    public final Handler g;
    public final u02 h;
    public final Set i;
    public final ml3 j;
    public sd4 k;
    public nq l;

    public rf5(Context context, zw2 zw2Var, ml3 ml3Var) {
        super(0);
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f = context;
        this.g = zw2Var;
        this.j = ml3Var;
        this.i = (Set) ml3Var.a;
        this.h = m;
    }

    @Override // defpackage.ef5
    public final boolean M0(int i, Parcel parcel, Parcel parcel2) {
        int i2 = 0;
        switch (i) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                mf5.b(parcel);
                break;
            case 4:
                mf5.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                mf5.b(parcel);
                break;
            case 7:
                mf5.b(parcel);
                break;
            case 8:
                dg5 dg5Var = (dg5) mf5.a(parcel, dg5.CREATOR);
                mf5.b(parcel);
                this.g.post(new qf5(i2, this, dg5Var));
                break;
            case 9:
                mf5.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.gj1
    public final void U(int i) {
        nq nqVar = this.l;
        gf5 gf5Var = (gf5) ((ij1) nqVar.s).w.get((ve) nqVar.p);
        if (gf5Var != null) {
            if (gf5Var.m) {
                gf5Var.n(new ka0(17));
            } else {
                gf5Var.U(i);
            }
        }
    }

    @Override // defpackage.gj1
    public final void X() {
        sd4 sd4Var = this.k;
        sd4Var.getClass();
        int i = 0;
        try {
            sd4Var.M.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? bm4.a(sd4Var.p).b() : null;
            Integer num = sd4Var.O;
            ji2.m(num);
            hg5 hg5Var = new hg5(2, account, num.intValue(), googleSignInAccountB);
            wf5 wf5Var = (wf5) sd4Var.e();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(wf5Var.g);
            int i2 = mf5.a;
            parcelObtain.writeInt(1);
            int iR0 = ud3.R0(parcelObtain, 20293);
            ud3.T0(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            ud3.M0(parcelObtain, 2, hg5Var, 0);
            ud3.S0(parcelObtain, iR0);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                wf5Var.f.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.g.post(new qf5(i, this, new dg5(1, new ka0(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.hj1
    public final void m(ka0 ka0Var) {
        this.l.a(ka0Var);
    }
}

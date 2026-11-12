package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wg5 extends BasePendingResult {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg5(if5 if5Var, int i) {
        super(if5Var);
        this.k = i;
        ji2.n(if5Var, "GoogleApiClient must not be null");
        ji2.n(fn.a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t14 b(Status status) {
        int i = this.k;
        return status;
    }

    public final void f(me meVar) {
        switch (this.k) {
            case 0:
                sg5 sg5Var = (sg5) meVar;
                bh5 bh5Var = (bh5) sg5Var.e();
                ug5 ug5Var = new ug5(this, 0);
                GoogleSignInOptions googleSignInOptions = sg5Var.L;
                Parcel parcelM = bh5Var.m();
                int i = pg5.a;
                parcelM.writeStrongBinder(ug5Var);
                pg5.c(parcelM, googleSignInOptions);
                bh5Var.U(parcelM, 102);
                break;
            default:
                sg5 sg5Var2 = (sg5) meVar;
                bh5 bh5Var2 = (bh5) sg5Var2.e();
                ug5 ug5Var2 = new ug5(this, 1);
                GoogleSignInOptions googleSignInOptions2 = sg5Var2.L;
                Parcel parcelM2 = bh5Var2.m();
                int i2 = pg5.a;
                parcelM2.writeStrongBinder(ug5Var2);
                pg5.c(parcelM2, googleSignInOptions2);
                bh5Var2.U(parcelM2, 103);
                break;
        }
    }

    public final void g(Status status) {
        ji2.h("Failed result must not be success", !(status.n <= 0));
        e(b(status));
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kg5 extends dj1 {
    public static final rf2 l = new rf2("Auth.Api.Identity.CredentialSaving.API", new u02(6), new pa(6));
    public static final rf2 m = new rf2("Auth.Api.Identity.SignIn.API", new u02(7), new pa(6));
    public final String k;

    public kg5(HiddenActivity hiddenActivity, xg5 xg5Var) {
        super(hiddenActivity, hiddenActivity, l, xg5Var, cj1.c);
        this.k = mg5.a();
    }

    public static td4 c(Intent intent) throws ApiException {
        Status status = Status.t;
        if (intent == null) {
            throw new ApiException(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : su3.o(byteArrayExtra, creator));
        if (status2 == null) {
            throw new ApiException(Status.v);
        }
        if (status2.n > 0) {
            throw new ApiException(status2);
        }
        Parcelable.Creator<td4> creator2 = td4.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        td4 td4Var = (td4) (byteArrayExtra2 != null ? su3.o(byteArrayExtra2, creator2) : null);
        if (td4Var != null) {
            return td4Var;
        }
        throw new ApiException(status);
    }

    public kg5(HiddenActivity hiddenActivity, dh5 dh5Var) {
        super(hiddenActivity, hiddenActivity, m, dh5Var, cj1.c);
        this.k = mg5.a();
    }

    public kg5(Context context, dh5 dh5Var) {
        super(context, null, m, dh5Var, cj1.c);
        this.k = mg5.a();
    }
}

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
    public static final rf2 l = null;
    public static final rf2 m = null;
    public final String k;

    static {
        pa r0 = new pa(6);
        l = new rf2("Auth.Api.Identity.CredentialSaving.API", new u02(6), r0);
        pa r1 = new pa(6);
        m = new rf2("Auth.Api.Identity.SignIn.API", new u02(7), r1);
    }

    public kg5(HiddenActivity r7, xg5 r8) {
        super(r7, r7, l, r8, cj1.c);
        this.k = mg5.a();
    }

    public static td4 c(Intent r4) {
        Status r0 = Status.t;
        if (r4 == null) goto L26;
        Parcelable.Creator<Status> r1 = Status.CREATOR;
        byte[] r2 = r4.getByteArrayExtra("status");
        k44 r3 = null;
        if (r2 != null) goto L7;
        k44 r5 = null;
    L8:
        Status r6 = (Status) r5;
        if (r6 == null) goto L24;
        if (r6.n > 0) goto L22;
        Parcelable.Creator<td4> r7 = td4.CREATOR;
        byte[] r8 = r4.getByteArrayExtra("sign_in_credential");
        if (r8 == null) goto L16;
        r3 = su3.o(r8, r7);
    L16:
        td4 r9 = (td4) r3;
        if (r9 == null) goto L20;
        return r9;
    L20:
        throw new ApiException(r0);
    L22:
        throw new ApiException(r6);
    L24:
        throw new ApiException(Status.v);
    L7:
        r5 = su3.o(r2, r1);
        goto L8
    L26:
        throw new ApiException(r0);
    }

    public kg5(HiddenActivity r7, dh5 r8) {
        super(r7, r7, m, r8, cj1.c);
        this.k = mg5.a();
    }

    public kg5(Context r7, dh5 r8) {
        cj1 r5 = cj1.c;
        super(r7, null, m, r8, r5);
        this.k = mg5.a();
    }
}

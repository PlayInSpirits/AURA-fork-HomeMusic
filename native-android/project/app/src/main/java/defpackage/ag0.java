package defpackage;

import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ag0 implements OutcomeReceiver {
    public final /* synthetic */ wo0 a;

    public ag0(wo0 wo0Var, bg0 bg0Var) {
        this.a = wo0Var;
    }

    public final void onError(Throwable th) {
        GetCredentialException getCredentialExceptionL = bn.l(th);
        getCredentialExceptionL.getClass();
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        String type = getCredentialExceptionL.getType();
        type.getClass();
        this.a.F(rr2.T(getCredentialExceptionL.getMessage(), type));
    }

    public final void onResult(Object obj) {
        GetCredentialResponse getCredentialResponseO = bn.o(obj);
        getCredentialResponseO.getClass();
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        Credential credential = getCredentialResponseO.getCredential();
        credential.getClass();
        String type = credential.getType();
        type.getClass();
        Bundle data = credential.getData();
        data.getClass();
        this.a.G(new mh1(gb.p(type, data)));
    }
}

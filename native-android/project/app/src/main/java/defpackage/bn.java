package defpackage;

import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class bn {
    public static /* synthetic */ void C() {
    }

    public static /* bridge */ /* synthetic */ CredentialManager g(Object obj) {
        return (CredentialManager) obj;
    }

    public static /* synthetic */ CredentialOption.Builder j(Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle, bundle2);
    }

    public static /* bridge */ /* synthetic */ GetCredentialException l(Throwable th) {
        return (GetCredentialException) th;
    }

    public static /* synthetic */ GetCredentialRequest.Builder m(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    public static /* bridge */ /* synthetic */ GetCredentialResponse o(Object obj) {
        return (GetCredentialResponse) obj;
    }

    public static /* synthetic */ void t() {
    }
}

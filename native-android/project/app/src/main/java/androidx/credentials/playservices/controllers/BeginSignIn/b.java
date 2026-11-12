package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.exceptions.GetCredentialUnknownException;
import defpackage.jx3;
import defpackage.mh1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ CredentialProviderBeginSignInController o;
    public final /* synthetic */ Object p;

    public /* synthetic */ b(CredentialProviderBeginSignInController credentialProviderBeginSignInController, Object obj, int i) {
        this.n = i;
        this.o = credentialProviderBeginSignInController;
        this.p = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                CredentialProviderBeginSignInController$handleResponse$3.invoke$lambda$0(this.o, (mh1) this.p);
                break;
            case 1:
                CredentialProviderBeginSignInController$handleResponse$4.invoke$lambda$0(this.o, (jx3) this.p);
                break;
            default:
                CredentialProviderBeginSignInController$handleResponse$6.invoke$lambda$0(this.o, (GetCredentialUnknownException) this.p);
                break;
        }
    }
}

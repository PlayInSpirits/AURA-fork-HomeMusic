package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.exceptions.GetCredentialException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ CredentialProviderBeginSignInController o;
    public final /* synthetic */ GetCredentialException p;

    public /* synthetic */ a(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException, int i) {
        this.n = i;
        this.o = credentialProviderBeginSignInController;
        this.p = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        GetCredentialException getCredentialException = this.p;
        CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.o;
        switch (i) {
            case 0:
                CredentialProviderBeginSignInController$handleResponse$2.invoke$lambda$0(credentialProviderBeginSignInController, getCredentialException);
                break;
            default:
                CredentialProviderBeginSignInController$handleResponse$5.invoke$lambda$0(credentialProviderBeginSignInController, getCredentialException);
                break;
        }
    }
}

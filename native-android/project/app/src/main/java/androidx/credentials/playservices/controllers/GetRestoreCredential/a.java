package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.exceptions.GetCredentialException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ CredentialProviderGetDigitalCredentialController o;
    public final /* synthetic */ GetCredentialException p;

    public /* synthetic */ a(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, GetCredentialException getCredentialException, int i) {
        this.n = i;
        this.o = credentialProviderGetDigitalCredentialController;
        this.p = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        GetCredentialException getCredentialException = this.p;
        CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = this.o;
        switch (i) {
            case 0:
                CredentialProviderGetDigitalCredentialController$handleResponse$2.invoke$lambda$0(credentialProviderGetDigitalCredentialController, getCredentialException);
                break;
            default:
                CredentialProviderGetDigitalCredentialController$handleResponse$5.invoke$lambda$0(credentialProviderGetDigitalCredentialController, getCredentialException);
                break;
        }
    }
}

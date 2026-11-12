package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController o;
    public final /* synthetic */ Throwable p;

    public /* synthetic */ c(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th, int i) {
        this.n = i;
        this.o = credentialProviderCreatePublicKeyCredentialController;
        this.p = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$7.invoke$lambda$0(this.o, this.p);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.AnonymousClass2.invoke$lambda$0(this.o, this.p);
                break;
        }
    }
}

package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.exceptions.CreateCredentialException;
import defpackage.lf0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController o;
    public final /* synthetic */ Object p;

    public /* synthetic */ a(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Object obj, int i) {
        this.n = i;
        this.o = credentialProviderCreatePublicKeyCredentialController;
        this.p = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        Object obj = this.p;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.o;
        switch (i) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$2.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, (CreateCredentialException) obj);
                break;
            case 1:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$4.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, (CreateCredentialException) obj);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$5.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, (lf0) obj);
                break;
        }
    }
}

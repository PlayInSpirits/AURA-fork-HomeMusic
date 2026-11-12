package androidx.credentials.playservices.controllers.CreatePassword;

import androidx.credentials.exceptions.CreateCredentialException;
import defpackage.lf0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ CredentialProviderCreatePasswordController o;
    public final /* synthetic */ Object p;

    public /* synthetic */ a(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, Object obj, int i) {
        this.n = i;
        this.o = credentialProviderCreatePasswordController;
        this.p = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        Object obj = this.p;
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.o;
        switch (i) {
            case 0:
                CredentialProviderCreatePasswordController$handleResponse$2.invoke$lambda$0(credentialProviderCreatePasswordController, (CreateCredentialException) obj);
                break;
            default:
                CredentialProviderCreatePasswordController$handleResponse$3.invoke$lambda$0(credentialProviderCreatePasswordController, (lf0) obj);
                break;
        }
    }
}

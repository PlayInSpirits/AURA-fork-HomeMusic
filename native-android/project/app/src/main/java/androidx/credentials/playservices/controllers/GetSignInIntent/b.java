package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.exceptions.GetCredentialUnknownException;
import defpackage.jx3;
import defpackage.mh1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ CredentialProviderGetSignInIntentController o;
    public final /* synthetic */ Object p;

    public /* synthetic */ b(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Object obj, int i) {
        this.n = i;
        this.o = credentialProviderGetSignInIntentController;
        this.p = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                CredentialProviderGetSignInIntentController$handleResponse$3.invoke$lambda$0(this.o, (mh1) this.p);
                break;
            case 1:
                CredentialProviderGetSignInIntentController$handleResponse$4.invoke$lambda$0(this.o, (jx3) this.p);
                break;
            case 2:
                CredentialProviderGetSignInIntentController$handleResponse$6.invoke$lambda$0(this.o, (GetCredentialUnknownException) this.p);
                break;
            default:
                CredentialProviderGetSignInIntentController.AnonymousClass1.invoke$lambda$0(this.o, (Exception) this.p);
                break;
        }
    }
}

package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.exceptions.GetCredentialException;
import defpackage.if1;
import defpackage.j15;
import defpackage.q42;
import defpackage.wo0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderGetDigitalCredentialController$handleResponse$2 extends q42 implements if1 {
    final /* synthetic */ CredentialProviderGetDigitalCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetDigitalCredentialController$handleResponse$2(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController) {
        super(1);
        this.this$0 = credentialProviderGetDigitalCredentialController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, GetCredentialException getCredentialException) {
        ((wo0) credentialProviderGetDigitalCredentialController.getCallback()).F(getCredentialException);
    }

    public final void invoke(GetCredentialException getCredentialException) {
        getCredentialException.getClass();
        this.this$0.getExecutor().execute(new a(this.this$0, getCredentialException, 0));
    }

    @Override // defpackage.if1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GetCredentialException) obj);
        return j15.a;
    }
}

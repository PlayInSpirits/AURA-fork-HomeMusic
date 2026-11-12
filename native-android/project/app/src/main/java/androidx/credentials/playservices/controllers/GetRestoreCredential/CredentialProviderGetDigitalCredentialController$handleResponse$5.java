package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import defpackage.gf1;
import defpackage.j15;
import defpackage.q42;
import defpackage.vf0;
import defpackage.wo0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderGetDigitalCredentialController$handleResponse$5 extends q42 implements gf1 {
    final /* synthetic */ GetCredentialException $providerException;
    final /* synthetic */ CredentialProviderGetDigitalCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetDigitalCredentialController$handleResponse$5(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, GetCredentialException getCredentialException) {
        super(0);
        this.this$0 = credentialProviderGetDigitalCredentialController;
        this.$providerException = getCredentialException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, GetCredentialException getCredentialException) {
        vf0 callback = credentialProviderGetDigitalCredentialController.getCallback();
        if (getCredentialException == null) {
            getCredentialException = new GetCredentialUnknownException("Unexpected configuration error");
        }
        ((wo0) callback).F(getCredentialException);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m49invoke() {
        this.this$0.getExecutor().execute(new a(this.this$0, this.$providerException, 1));
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m49invoke();
        return j15.a;
    }
}

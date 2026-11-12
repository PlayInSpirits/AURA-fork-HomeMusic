package androidx.credentials.playservices.controllers.GetRestoreCredential;

import defpackage.gf1;
import defpackage.j15;
import defpackage.mh1;
import defpackage.q42;
import defpackage.wo0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderGetDigitalCredentialController$handleResponse$4 extends q42 implements gf1 {
    final /* synthetic */ mh1 $response;
    final /* synthetic */ CredentialProviderGetDigitalCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetDigitalCredentialController$handleResponse$4(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, mh1 mh1Var) {
        super(0);
        this.this$0 = credentialProviderGetDigitalCredentialController;
        this.$response = mh1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, mh1 mh1Var) {
        ((wo0) credentialProviderGetDigitalCredentialController.getCallback()).G(mh1Var);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m48invoke() {
        this.this$0.getExecutor().execute(new c(0, this.this$0, this.$response));
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m48invoke();
        return j15.a;
    }
}

package androidx.credentials.playservices.controllers.BeginSignIn;

import defpackage.gf1;
import defpackage.j15;
import defpackage.mh1;
import defpackage.q42;
import defpackage.wo0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderBeginSignInController$handleResponse$3 extends q42 implements gf1 {
    final /* synthetic */ mh1 $response;
    final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$3(CredentialProviderBeginSignInController credentialProviderBeginSignInController, mh1 mh1Var) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$response = mh1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, mh1 mh1Var) {
        ((wo0) credentialProviderBeginSignInController.getCallback()).G(mh1Var);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m19invoke() {
        this.this$0.getExecutor().execute(new b(this.this$0, this.$response, 0));
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m19invoke();
        return j15.a;
    }
}

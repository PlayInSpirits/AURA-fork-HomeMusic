package androidx.credentials.playservices.controllers.GetSignInIntent;

import defpackage.gf1;
import defpackage.j15;
import defpackage.mh1;
import defpackage.q42;
import defpackage.wo0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderGetSignInIntentController$handleResponse$3 extends q42 implements gf1 {
    final /* synthetic */ mh1 $response;
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, mh1 mh1Var) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$response = mh1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, mh1 mh1Var) {
        ((wo0) credentialProviderGetSignInIntentController.getCallback()).G(mh1Var);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m56invoke() {
        this.this$0.getExecutor().execute(new b(this.this$0, this.$response, 0));
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m56invoke();
        return j15.a;
    }
}

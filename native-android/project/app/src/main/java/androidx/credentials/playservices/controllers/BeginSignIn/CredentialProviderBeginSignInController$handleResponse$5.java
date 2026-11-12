package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.exceptions.GetCredentialException;
import defpackage.gf1;
import defpackage.j15;
import defpackage.q42;
import defpackage.wo0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderBeginSignInController$handleResponse$5 extends q42 implements gf1 {
    final /* synthetic */ GetCredentialException $e;
    final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$5(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$e = getCredentialException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        ((wo0) credentialProviderBeginSignInController.getCallback()).F(getCredentialException);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m21invoke() {
        this.this$0.getExecutor().execute(new a(this.this$0, this.$e, 1));
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m21invoke();
        return j15.a;
    }
}

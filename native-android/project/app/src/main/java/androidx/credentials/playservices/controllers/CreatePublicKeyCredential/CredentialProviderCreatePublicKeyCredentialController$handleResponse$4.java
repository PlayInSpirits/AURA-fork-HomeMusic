package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.exceptions.CreateCredentialException;
import defpackage.gf1;
import defpackage.h12;
import defpackage.j15;
import defpackage.q42;
import defpackage.vf0;
import defpackage.wo0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$4 extends q42 implements gf1 {
    final /* synthetic */ CreateCredentialException $exception;
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$exception = createCredentialException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException) {
        vf0 vf0Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (vf0Var != null) {
            ((wo0) vf0Var).F(createCredentialException);
        } else {
            h12.Q("callback");
            throw null;
        }
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m27invoke() {
        Executor executor = this.this$0.executor;
        if (executor != null) {
            executor.execute(new a(this.this$0, this.$exception, 1));
        } else {
            h12.Q("executor");
            throw null;
        }
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m27invoke();
        return j15.a;
    }
}

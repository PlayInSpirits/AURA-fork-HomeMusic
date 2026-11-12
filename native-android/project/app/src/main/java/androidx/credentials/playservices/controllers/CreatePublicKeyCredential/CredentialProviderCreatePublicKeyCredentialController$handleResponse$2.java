package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.exceptions.CreateCredentialException;
import defpackage.h12;
import defpackage.if1;
import defpackage.j15;
import defpackage.q42;
import defpackage.vf0;
import defpackage.wo0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$2 extends q42 implements if1 {
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        super(1);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
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

    public final void invoke(CreateCredentialException createCredentialException) {
        createCredentialException.getClass();
        Executor executor = this.this$0.executor;
        if (executor != null) {
            executor.execute(new a(this.this$0, createCredentialException, 0));
        } else {
            h12.Q("executor");
            throw null;
        }
    }

    @Override // defpackage.if1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CreateCredentialException) obj);
        return j15.a;
    }
}

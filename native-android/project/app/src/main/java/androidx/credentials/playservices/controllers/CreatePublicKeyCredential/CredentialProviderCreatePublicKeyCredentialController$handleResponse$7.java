package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import defpackage.gf1;
import defpackage.h;
import defpackage.h12;
import defpackage.j15;
import defpackage.q42;
import defpackage.vf0;
import defpackage.wo0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$7 extends q42 implements gf1 {
    final /* synthetic */ Throwable $t;
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$t = th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        vf0 vf0Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (vf0Var == null) {
            h12.Q("callback");
            throw null;
        }
        ((wo0) vf0Var).F(new CreatePublicKeyCredentialDomException(new h(26), th.getMessage()));
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m30invoke() {
        Executor executor = this.this$0.executor;
        if (executor != null) {
            executor.execute(new c(this.this$0, this.$t, 0));
        } else {
            h12.Q("executor");
            throw null;
        }
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m30invoke();
        return j15.a;
    }
}

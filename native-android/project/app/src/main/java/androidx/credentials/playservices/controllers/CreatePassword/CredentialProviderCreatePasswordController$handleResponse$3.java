package androidx.credentials.playservices.controllers.CreatePassword;

import defpackage.gf1;
import defpackage.h12;
import defpackage.j15;
import defpackage.lf0;
import defpackage.q42;
import defpackage.vf0;
import defpackage.wo0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderCreatePasswordController$handleResponse$3 extends q42 implements gf1 {
    final /* synthetic */ lf0 $response;
    final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$3(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, lf0 lf0Var) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
        this.$response = lf0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, lf0 lf0Var) {
        vf0 vf0Var = credentialProviderCreatePasswordController.callback;
        if (vf0Var != null) {
            ((wo0) vf0Var).G(lf0Var);
        } else {
            h12.Q("callback");
            throw null;
        }
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m24invoke() {
        Executor executor = this.this$0.executor;
        if (executor != null) {
            executor.execute(new a(this.this$0, this.$response, 1));
        } else {
            h12.Q("executor");
            throw null;
        }
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m24invoke();
        return j15.a;
    }
}

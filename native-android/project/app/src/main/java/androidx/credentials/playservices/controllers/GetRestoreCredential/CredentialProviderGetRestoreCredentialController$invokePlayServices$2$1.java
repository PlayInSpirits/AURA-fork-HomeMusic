package androidx.credentials.playservices.controllers.GetRestoreCredential;

import defpackage.gf1;
import defpackage.j15;
import defpackage.jx3;
import defpackage.q42;
import defpackage.vf0;
import defpackage.wo0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1 extends q42 implements gf1 {
    final /* synthetic */ vf0 $callback;
    final /* synthetic */ Executor $executor;
    final /* synthetic */ jx3 $getException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1(Executor executor, vf0 vf0Var, jx3 jx3Var) {
        super(0);
        this.$executor = executor;
        this.$callback = vf0Var;
        this.$getException = jx3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(vf0 vf0Var, jx3 jx3Var) {
        ((wo0) vf0Var).F(jx3Var.n);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m55invoke() {
        this.$executor.execute(new c(4, this.$callback, this.$getException));
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m55invoke();
        return j15.a;
    }
}

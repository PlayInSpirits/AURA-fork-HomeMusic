package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.exceptions.GetCredentialException;
import defpackage.gf1;
import defpackage.j15;
import defpackage.q42;
import defpackage.vf0;
import defpackage.wo0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderGetDigitalCredentialController$invokePlayServices$2$1 extends q42 implements gf1 {
    final /* synthetic */ vf0 $callback;
    final /* synthetic */ Executor $executor;
    final /* synthetic */ GetCredentialException $getException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetDigitalCredentialController$invokePlayServices$2$1(Executor executor, vf0 vf0Var, GetCredentialException getCredentialException) {
        super(0);
        this.$executor = executor;
        this.$callback = vf0Var;
        this.$getException = getCredentialException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(vf0 vf0Var, GetCredentialException getCredentialException) {
        ((wo0) vf0Var).F(getCredentialException);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m50invoke() {
        this.$executor.execute(new c(1, this.$callback, this.$getException));
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m50invoke();
        return j15.a;
    }
}

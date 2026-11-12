package androidx.credentials.playservices;

import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import defpackage.gf1;
import defpackage.j15;
import defpackage.q42;
import defpackage.vf0;
import defpackage.wo0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl$onClearCredential$5$1$1 extends q42 implements gf1 {
    final /* synthetic */ vf0 $callback;
    final /* synthetic */ Exception $e;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$5$1$1(Exception exc, Executor executor, vf0 vf0Var) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
        this.$callback = vf0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(vf0 vf0Var, Exception exc) {
        ((wo0) vf0Var).F(new ClearCredentialUnknownException(exc.getMessage()));
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7invoke() {
        Log.w("PlayServicesImpl", "During clear credential sign out failed with " + this.$e);
        this.$executor.execute(new b(this.$callback, this.$e, 1));
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m7invoke();
        return j15.a;
    }
}

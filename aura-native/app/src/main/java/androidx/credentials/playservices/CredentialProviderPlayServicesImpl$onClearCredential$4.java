package androidx.credentials.playservices;

import android.os.CancellationSignal;
import android.util.Log;
import defpackage.gf1;
import defpackage.if1;
import defpackage.j15;
import defpackage.q42;
import defpackage.vf0;
import defpackage.wo0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl$onClearCredential$4 extends q42 implements if1 {
    final /* synthetic */ vf0 $callback;
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$4(CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$executor = executor;
        this.$callback = vf0Var;
    }

    public final void invoke(Void r4) {
        CredentialProviderPlayServicesImpl.Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(this.$cancellationSignal, new AnonymousClass1(this.$executor, this.$callback));
    }

    @Override // defpackage.if1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Void) obj);
        return j15.a;
    }

    /* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends q42 implements gf1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Executor executor, vf0 vf0Var) {
            super(0);
            this.$executor = executor;
            this.$callback = vf0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(vf0 vf0Var) {
            ((wo0) vf0Var).G(null);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke() {
            Log.i("PlayServicesImpl", "During clear credential, signed out successfully!");
            this.$executor.execute(new a(this.$callback, 2));
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m6invoke();
            return j15.a;
        }
    }
}

package androidx.credentials.playservices.controllers.GetRestoreCredential;

import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import defpackage.gf1;
import defpackage.if1;
import defpackage.j15;
import defpackage.mh1;
import defpackage.q42;
import defpackage.rh1;
import defpackage.vf0;
import defpackage.wo0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class CredentialProviderGetRestoreCredentialController$invokePlayServices$1 extends q42 implements if1 {
    final /* synthetic */ vf0 $callback;
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ Executor $executor;
    final /* synthetic */ CredentialProviderGetRestoreCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController$invokePlayServices$1(CredentialProviderGetRestoreCredentialController credentialProviderGetRestoreCredentialController, CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var) {
        super(1);
        this.this$0 = credentialProviderGetRestoreCredentialController;
        this.$cancellationSignal = cancellationSignal;
        this.$executor = executor;
        this.$callback = vf0Var;
    }

    public final void invoke(rh1 rh1Var) {
        try {
            CredentialProviderGetRestoreCredentialController credentialProviderGetRestoreCredentialController = this.this$0;
            rh1Var.getClass();
            mh1 convertResponseToCredentialManager = credentialProviderGetRestoreCredentialController.convertResponseToCredentialManager(rh1Var);
            CredentialProviderController.Companion companion = CredentialProviderController.Companion;
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.$cancellationSignal, new AnonymousClass1(this.$executor, this.$callback, convertResponseToCredentialManager));
        } catch (Exception e) {
            CredentialProviderController.Companion companion2 = CredentialProviderController.Companion;
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.$cancellationSignal, new AnonymousClass2(this.$executor, this.$callback, e));
        }
    }

    /* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    /* renamed from: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends q42 implements gf1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ Executor $executor;
        final /* synthetic */ mh1 $response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Executor executor, vf0 vf0Var, mh1 mh1Var) {
            super(0);
            this.$executor = executor;
            this.$callback = vf0Var;
            this.$response = mh1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(vf0 vf0Var, mh1 mh1Var) {
            ((wo0) vf0Var).G(mh1Var);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m52invoke() {
            this.$executor.execute(new c(2, this.$callback, this.$response));
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m52invoke();
            return j15.a;
        }
    }

    /* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    /* renamed from: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends q42 implements gf1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ Exception $e;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Executor executor, vf0 vf0Var, Exception exc) {
            super(0);
            this.$executor = executor;
            this.$callback = vf0Var;
            this.$e = exc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(vf0 vf0Var, Exception exc) {
            ((wo0) vf0Var).F(exc instanceof NoCredentialException ? (GetCredentialException) exc : new GetCredentialUnknownException(exc.getMessage()));
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m53invoke() {
            this.$executor.execute(new c(3, this.$callback, this.$e));
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m53invoke();
            return j15.a;
        }
    }

    @Override // defpackage.if1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((rh1) obj);
        return j15.a;
    }
}

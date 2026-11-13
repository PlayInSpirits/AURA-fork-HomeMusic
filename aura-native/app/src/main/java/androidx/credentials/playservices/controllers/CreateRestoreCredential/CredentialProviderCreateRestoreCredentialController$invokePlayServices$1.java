package androidx.credentials.playservices.controllers.CreateRestoreCredential;

import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import defpackage.gf1;
import defpackage.if1;
import defpackage.j15;
import defpackage.lf0;
import defpackage.q42;
import defpackage.rf0;
import defpackage.vf0;
import defpackage.wo0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class CredentialProviderCreateRestoreCredentialController$invokePlayServices$1 extends q42 implements if1 {
    final /* synthetic */ vf0 $callback;
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ Executor $executor;
    final /* synthetic */ CredentialProviderCreateRestoreCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreateRestoreCredentialController$invokePlayServices$1(CredentialProviderCreateRestoreCredentialController credentialProviderCreateRestoreCredentialController, CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var) {
        super(1);
        this.this$0 = credentialProviderCreateRestoreCredentialController;
        this.$cancellationSignal = cancellationSignal;
        this.$executor = executor;
        this.$callback = vf0Var;
    }

    public final void invoke(rf0 rf0Var) {
        try {
            CredentialProviderCreateRestoreCredentialController credentialProviderCreateRestoreCredentialController = this.this$0;
            rf0Var.getClass();
            lf0 convertResponseToCredentialManager = credentialProviderCreateRestoreCredentialController.convertResponseToCredentialManager(rf0Var);
            CredentialProviderController.Companion companion = CredentialProviderController.Companion;
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.$cancellationSignal, new AnonymousClass1(this.$executor, this.$callback, convertResponseToCredentialManager));
        } catch (Exception e) {
            CredentialProviderController.Companion companion2 = CredentialProviderController.Companion;
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.$cancellationSignal, new AnonymousClass2(this.$executor, this.$callback, e));
        }
    }

    /* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    /* renamed from: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends q42 implements gf1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ Executor $executor;
        final /* synthetic */ lf0 $response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Executor executor, vf0 vf0Var, lf0 lf0Var) {
            super(0);
            this.$executor = executor;
            this.$callback = vf0Var;
            this.$response = lf0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(vf0 vf0Var, lf0 lf0Var) {
            ((wo0) vf0Var).G(lf0Var);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m35invoke() {
            this.$executor.execute(new a(this.$callback, this.$response, 0));
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m35invoke();
            return j15.a;
        }
    }

    /* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    /* renamed from: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2, reason: invalid class name */
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
            ((wo0) vf0Var).F(new CreateCredentialUnknownException(exc.getMessage()));
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m37invoke() {
            this.$executor.execute(new a(this.$callback, this.$e, 1));
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m37invoke();
            return j15.a;
        }
    }

    @Override // defpackage.if1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((rf0) obj);
        return j15.a;
    }
}

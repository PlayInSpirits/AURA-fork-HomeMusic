package androidx.credentials.playservices.controllers.GetRestoreCredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.bk;
import defpackage.cg0;
import defpackage.cj1;
import defpackage.eg0;
import defpackage.gb;
import defpackage.gf1;
import defpackage.h12;
import defpackage.if1;
import defpackage.j15;
import defpackage.jw;
import defpackage.jx3;
import defpackage.kh1;
import defpackage.le;
import defpackage.mh1;
import defpackage.om1;
import defpackage.p61;
import defpackage.q42;
import defpackage.qh1;
import defpackage.r61;
import defpackage.rh1;
import defpackage.si0;
import defpackage.vf0;
import defpackage.wo0;
import defpackage.xf0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderGetRestoreCredentialController extends CredentialProviderController<kh1, qh1, rh1, mh1, GetCredentialException> {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1(CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var, Exception exc) {
        exc.getClass();
        jx3 jx3Var = new jx3();
        jx3Var.n = new GetCredentialUnknownException("Get restore credential failed for unknown reason, failure: " + exc.getMessage());
        if (exc instanceof ApiException) {
            Status status = ((ApiException) exc).n;
            if (status.n == 40201) {
                jx3Var.n = new GetCredentialUnknownException("The restore credential internal service had a failure, failure: " + exc.getMessage());
            } else {
                jx3Var.n = new GetCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + status.n);
            }
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1(executor, vf0Var, jx3Var));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public qh1 convertRequestToPlayServices(kh1 kh1Var) {
        kh1Var.getClass();
        for (xf0 xf0Var : kh1Var.a) {
        }
        h12.Q("credentialOption");
        throw null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public mh1 convertResponseToCredentialManager(rh1 rh1Var) {
        rh1Var.getClass();
        return new mh1(gb.p("androidx.credentials.TYPE_RESTORE_CREDENTIAL", rh1Var.n));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(kh1 kh1Var, vf0 vf0Var, Executor executor, CancellationSignal cancellationSignal) {
        kh1Var.getClass();
        vf0Var.getClass();
        executor.getClass();
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        qh1 qh1VarConvertRequestToPlayServices = convertRequestToPlayServices(kh1Var);
        Context context = this.context;
        context.getClass();
        r61 r61Var = new r61(context, null, r61.l, le.a, cj1.c);
        qh1VarConvertRequestToPlayServices.getClass();
        bk bkVarB = bk.b();
        bkVarB.r = new p61[]{si0.e};
        char c = 0;
        om1 om1Var = new om1(c, 3);
        om1Var.o = qh1VarConvertRequestToPlayServices;
        bkVarB.q = om1Var;
        bkVarB.o = 1695;
        jw jwVarB = r61Var.b(0, bkVarB.a());
        jwVarB.getClass();
        jwVarB.k(new cg0(new AnonymousClass1(cancellationSignal, executor, vf0Var), 1));
        jwVarB.d(new eg0(cancellationSignal, executor, vf0Var, c));
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class AnonymousClass1 extends q42 implements if1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ CancellationSignal $cancellationSignal;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var) {
            super(1);
            this.$cancellationSignal = cancellationSignal;
            this.$executor = executor;
            this.$callback = vf0Var;
        }

        public final void invoke(rh1 rh1Var) {
            try {
                CredentialProviderGetRestoreCredentialController credentialProviderGetRestoreCredentialController = CredentialProviderGetRestoreCredentialController.this;
                rh1Var.getClass();
                mh1 mh1VarConvertResponseToCredentialManager = credentialProviderGetRestoreCredentialController.convertResponseToCredentialManager(rh1Var);
                CredentialProviderController.Companion companion = CredentialProviderController.Companion;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.$cancellationSignal, new C00011(this.$executor, this.$callback, mh1VarConvertResponseToCredentialManager));
            } catch (Exception e) {
                CredentialProviderController.Companion companion2 = CredentialProviderController.Companion;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.$cancellationSignal, new AnonymousClass2(this.$executor, this.$callback, e));
            }
        }

        /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
        public static final class C00011 extends q42 implements gf1 {
            final /* synthetic */ vf0 $callback;
            final /* synthetic */ Executor $executor;
            final /* synthetic */ mh1 $response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00011(Executor executor, vf0 vf0Var, mh1 mh1Var) {
                super(0);
                this.$executor = executor;
                this.$callback = vf0Var;
                this.$response = mh1Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$0(vf0 vf0Var, mh1 mh1Var) {
                ((wo0) vf0Var).G(mh1Var);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m52invoke() {
                this.$executor.execute(new c(2, this.$callback, this.$response));
            }

            @Override // defpackage.gf1
            public /* bridge */ /* synthetic */ Object invoke() {
                m52invoke();
                return j15.a;
            }
        }

        /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
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

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
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
}

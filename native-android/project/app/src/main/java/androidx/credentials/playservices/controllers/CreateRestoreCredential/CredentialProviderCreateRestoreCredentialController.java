package androidx.credentials.playservices.controllers.CreateRestoreCredential;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.restorecredential.CreateRestoreCredentialDomException;
import androidx.credentials.exceptions.restorecredential.E2eeUnavailableException;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.gf1;
import defpackage.if1;
import defpackage.j15;
import defpackage.jx3;
import defpackage.kf2;
import defpackage.lf0;
import defpackage.nf0;
import defpackage.pf0;
import defpackage.q42;
import defpackage.qf0;
import defpackage.rf0;
import defpackage.vf0;
import defpackage.wo0;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderCreateRestoreCredentialController extends CredentialProviderController<qf0, pf0, rf0, lf0, CreateCredentialException> {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreateRestoreCredentialController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
    }

    private static final void invokePlayServices$lambda$1(CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var, Exception exc) {
        exc.getClass();
        jx3 jx3Var = new jx3();
        jx3Var.n = new CreateCredentialUnknownException("Create restore credential failed for unknown reason, failure: " + exc.getMessage());
        if (exc instanceof ApiException) {
            Status status = ((ApiException) exc).n;
            switch (status.n) {
                case 40201:
                    jx3Var.n = new CreateCredentialUnknownException("The restore credential internal service had a failure, failure: " + exc.getMessage());
                    break;
                case 40202:
                    jx3Var.n = new CreateRestoreCredentialDomException("The request did not match the fido spec, failure: " + exc.getMessage(), "androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR");
                    break;
                case 40203:
                    jx3Var.n = new E2eeUnavailableException("E2ee is not available on the device. Check whether the backup and screen lock are enabled.", "androidx.credentials.TYPE_E2EE_UNAVAILABLE_EXCEPTION");
                    break;
                default:
                    jx3Var.n = new CreateCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + status.n);
                    break;
            }
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1(executor, vf0Var, jx3Var));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ pf0 convertRequestToPlayServices(qf0 qf0Var) {
        if (qf0Var == null) {
            return convertRequestToPlayServices2((qf0) null);
        }
        kf2.k();
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public lf0 convertResponseToCredentialManager(rf0 rf0Var) throws CreateCredentialUnknownException {
        rf0Var.getClass();
        Bundle bundle = rf0Var.n;
        bundle.getClass();
        String string = bundle.getString("androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE");
        if (string == null) {
            throw new CreateCredentialUnknownException("The response bundle did not contain the response data. This should not happen.");
        }
        nf0 nf0Var = new nf0();
        if (string.length() != 0) {
            try {
                new JSONObject(string);
                return nf0Var;
            } catch (Exception unused) {
            }
        }
        kf2.n("registrationResponseJson must not be empty, and must be a valid JSON");
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ void invokePlayServices(qf0 qf0Var, vf0 vf0Var, Executor executor, CancellationSignal cancellationSignal) {
        if (qf0Var == null) {
            invokePlayServices2((qf0) null, vf0Var, executor, cancellationSignal);
        } else {
            kf2.k();
        }
    }

    /* JADX INFO: renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(qf0 qf0Var, vf0 vf0Var, Executor executor, CancellationSignal cancellationSignal) {
        throw null;
    }

    /* JADX INFO: renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public pf0 convertRequestToPlayServices2(qf0 qf0Var) {
        throw null;
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1, reason: invalid class name */
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

        public final void invoke(rf0 rf0Var) {
            try {
                CredentialProviderCreateRestoreCredentialController credentialProviderCreateRestoreCredentialController = CredentialProviderCreateRestoreCredentialController.this;
                rf0Var.getClass();
                lf0 lf0VarConvertResponseToCredentialManager = credentialProviderCreateRestoreCredentialController.convertResponseToCredentialManager(rf0Var);
                CredentialProviderController.Companion companion = CredentialProviderController.Companion;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.$cancellationSignal, new C00001(this.$executor, this.$callback, lf0VarConvertResponseToCredentialManager));
            } catch (Exception e) {
                CredentialProviderController.Companion companion2 = CredentialProviderController.Companion;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.$cancellationSignal, new AnonymousClass2(this.$executor, this.$callback, e));
            }
        }

        /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
        public static final class C00001 extends q42 implements gf1 {
            final /* synthetic */ vf0 $callback;
            final /* synthetic */ Executor $executor;
            final /* synthetic */ lf0 $response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00001(Executor executor, vf0 vf0Var, lf0 lf0Var) {
                super(0);
                this.$executor = executor;
                this.$callback = vf0Var;
                this.$response = lf0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$0(vf0 vf0Var, lf0 lf0Var) {
                ((wo0) vf0Var).G(lf0Var);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m35invoke() {
                this.$executor.execute(new a(this.$callback, this.$response, 0));
            }

            @Override // defpackage.gf1
            public /* bridge */ /* synthetic */ Object invoke() {
                m35invoke();
                return j15.a;
            }
        }

        /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2, reason: invalid class name */
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
                ((wo0) vf0Var).F(new CreateCredentialUnknownException(exc.getMessage()));
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
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
}

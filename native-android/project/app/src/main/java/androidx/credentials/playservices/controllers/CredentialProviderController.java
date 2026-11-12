package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import defpackage.b11;
import defpackage.gf1;
import defpackage.if1;
import defpackage.j15;
import defpackage.jx3;
import defpackage.q42;
import defpackage.vf0;
import defpackage.wf1;
import defpackage.wo0;
import defpackage.xj0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {
    public static final Companion Companion = new Companion(null);
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, gf1 gf1Var) {
        Companion.cancelOrCallbackExceptionOrResult(cancellationSignal, gf1Var);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i, wf1 wf1Var, if1 if1Var, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i, wf1Var, if1Var, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i, wf1 wf1Var, if1 if1Var, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeGet(i, wf1Var, if1Var, cancellationSignal);
    }

    public abstract T2 convertRequestToPlayServices(T1 t1);

    public abstract R1 convertResponseToCredentialManager(R2 r2);

    public abstract void invokePlayServices(T1 t1, vf0 vf0Var, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle bundle, wf1 wf1Var, Executor executor, vf0 vf0Var, CancellationSignal cancellationSignal) {
        bundle.getClass();
        wf1Var.getClass();
        executor.getClass();
        vf0Var.getClass();
        if (!bundle.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass1(executor, vf0Var, wf1Var.invoke(bundle.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), bundle.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 xj0Var) {
            this();
        }

        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, gf1 gf1Var) {
            gf1Var.getClass();
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            gf1Var.invoke();
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int i) {
            return b11.j(i, "activity with result code: ", " indicating not RESULT_OK");
        }

        public final boolean maybeReportErrorResultCodeCreate(int i, wf1 wf1Var, if1 if1Var, CancellationSignal cancellationSignal) {
            wf1Var.getClass();
            if1Var.getClass();
            if (i == -1) {
                return false;
            }
            jx3 jx3Var = new jx3();
            jx3Var.n = new CreateCredentialUnknownException(generateErrorStringUnknown$credentials_play_services_auth_release(i));
            if (i == 0) {
                jx3Var.n = new CreateCredentialCancellationException(generateErrorStringCanceled$credentials_play_services_auth_release());
            }
            wf1Var.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(if1Var, jx3Var));
            return true;
        }

        public final boolean maybeReportErrorResultCodeGet(int i, wf1 wf1Var, if1 if1Var, CancellationSignal cancellationSignal) {
            wf1Var.getClass();
            if1Var.getClass();
            if (i == -1) {
                return false;
            }
            jx3 jx3Var = new jx3();
            jx3Var.n = new GetCredentialUnknownException(generateErrorStringUnknown$credentials_play_services_auth_release(i));
            if (i == 0) {
                jx3Var.n = new GetCredentialCancellationException(generateErrorStringCanceled$credentials_play_services_auth_release());
            }
            wf1Var.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(if1Var, jx3Var));
            return true;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class AnonymousClass1 extends q42 implements gf1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ E1 $exception;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Executor executor, vf0 vf0Var, E1 e1) {
            super(0);
            this.$executor = executor;
            this.$callback = vf0Var;
            this.$exception = e1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(vf0 vf0Var, Object obj) {
            ((wo0) vf0Var).F(obj);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m43invoke() {
            Executor executor = this.$executor;
            final vf0 vf0Var = this.$callback;
            final E1 e1 = this.$exception;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.a
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderController.AnonymousClass1.invoke$lambda$0(vf0Var, e1);
                }
            });
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m43invoke();
            return j15.a;
        }
    }
}

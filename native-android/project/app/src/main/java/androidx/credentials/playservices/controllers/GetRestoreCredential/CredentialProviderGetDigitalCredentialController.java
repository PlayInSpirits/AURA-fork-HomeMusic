package androidx.credentials.playservices.controllers.GetRestoreCredential;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.IdentityCredentialApiHiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import defpackage.a3;
import defpackage.bk;
import defpackage.cg0;
import defpackage.cj1;
import defpackage.dg0;
import defpackage.gb;
import defpackage.h12;
import defpackage.hf3;
import defpackage.if1;
import defpackage.j15;
import defpackage.jw;
import defpackage.kb4;
import defpackage.kf2;
import defpackage.kh1;
import defpackage.le;
import defpackage.lh1;
import defpackage.mh1;
import defpackage.p61;
import defpackage.q42;
import defpackage.r61;
import defpackage.rr2;
import defpackage.si1;
import defpackage.v02;
import defpackage.vf0;
import defpackage.xf0;
import defpackage.xj0;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderGetDigitalCredentialController extends CredentialProviderController<kh1, GetCredentialRequest, lh1, mh1, GetCredentialException> {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DigitalCredentialClient";
    public vf0 callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderGetDigitalCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1] */
    public CredentialProviderGetDigitalCredentialController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                bundle.getClass();
                if (this.this$0.maybeReportErrorFromResultReceiver(bundle, new CredentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final GetCredentialException fromGmsException(Throwable th) {
        if (th instanceof com.google.android.gms.identitycredentials.GetCredentialException) {
            rr2.T(th.getMessage(), null);
            throw null;
        }
        if (!(th instanceof ApiException)) {
            return new GetCredentialUnknownException("Get digital credential failed, failure: " + th);
        }
        int i = ((ApiException) th).n.n;
        if (i == 16) {
            return new GetCredentialCancellationException(th.getMessage());
        }
        if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(i))) {
            return new GetCredentialInterruptedException(th.getMessage());
        }
        return new GetCredentialUnknownException("Get digital credential failed, failure: " + th);
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    private static /* synthetic */ void getResultReceiver$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var, Exception exc) {
        exc.getClass();
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderGetDigitalCredentialController$invokePlayServices$2$1(executor, vf0Var, credentialProviderGetDigitalCredentialController.fromGmsException(exc)));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public GetCredentialRequest convertRequestToPlayServices(kh1 kh1Var) {
        kh1Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (xf0 xf0Var : kh1Var.a) {
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        return new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public mh1 convertResponseToCredentialManager(lh1 lh1Var) {
        lh1Var.getClass();
        return new mh1(gb.p("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", lh1Var.n.o));
    }

    public final vf0 getCallback() {
        vf0 vf0Var = this.callback;
        if (vf0Var != null) {
            return vf0Var;
        }
        h12.Q("callback");
        throw null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        h12.Q("executor");
        throw null;
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        String string;
        Bundle bundle;
        mh1 mh1Var;
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release() + " which  does not match what was given " + i);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeGet(i2, CredentialProviderGetDigitalCredentialController$handleResponse$1.INSTANCE, new CredentialProviderGetDigitalCredentialController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        if (intent == null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetDigitalCredentialController$handleResponse$3(this));
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        GetCredentialException getCredentialExceptionT = null;
        if (i3 >= 34) {
            mh1Var = a3.b(intent);
        } else {
            Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
            mh1Var = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new mh1(gb.p(string, bundle));
        }
        if (mh1Var != null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetDigitalCredentialController$handleResponse$4(this, mh1Var));
            return;
        }
        if (i3 >= 34) {
            getCredentialExceptionT = a3.a(intent);
        } else {
            int i4 = GetCredentialException.p;
            Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
            if (bundleExtra2 != null) {
                String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                if (string2 == null) {
                    kf2.n("Bundle was missing exception type.");
                    return;
                }
                getCredentialExceptionT = rr2.T(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
            }
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetDigitalCredentialController$handleResponse$5(this, getCredentialExceptionT));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(kh1 kh1Var, vf0 vf0Var, Executor executor, CancellationSignal cancellationSignal) {
        kh1Var.getClass();
        vf0Var.getClass();
        executor.getClass();
        this.cancellationSignal = cancellationSignal;
        setCallback(vf0Var);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        GetCredentialRequest getCredentialRequestConvertRequestToPlayServices = convertRequestToPlayServices(kh1Var);
        Context context = this.context;
        context.getClass();
        r61 r61Var = new r61(context, null, v02.a, le.a, cj1.c);
        getCredentialRequestConvertRequestToPlayServices.getClass();
        bk bkVarB = bk.b();
        bkVarB.r = new p61[]{kb4.c};
        si1 si1Var = new si1(2, false);
        si1Var.o = getCredentialRequestConvertRequestToPlayServices;
        bkVarB.q = si1Var;
        bkVarB.o = 32701;
        jw jwVarB = r61Var.b(0, bkVarB.a());
        jwVarB.getClass();
        jwVarB.k(new cg0(new AnonymousClass1(cancellationSignal, this), 0));
        jwVarB.d(new dg0(this, cancellationSignal, executor, vf0Var, 0));
    }

    public final void setCallback(vf0 vf0Var) {
        vf0Var.getClass();
        this.callback = vf0Var;
    }

    public final void setExecutor(Executor executor) {
        executor.getClass();
        this.executor = executor;
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 xj0Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController$invokePlayServices$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class AnonymousClass1 extends q42 implements if1 {
        final /* synthetic */ CancellationSignal $cancellationSignal;
        final /* synthetic */ CredentialProviderGetDigitalCredentialController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CancellationSignal cancellationSignal, CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController) {
            super(1);
            this.$cancellationSignal = cancellationSignal;
            this.this$0 = credentialProviderGetDigitalCredentialController;
        }

        public final void invoke(hf3 hf3Var) {
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.$cancellationSignal)) {
                return;
            }
            Intent intent = new Intent(this.this$0.context, (Class<?>) IdentityCredentialApiHiddenActivity.class);
            intent.setFlags(65536);
            CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = this.this$0;
            intent.putExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, credentialProviderGetDigitalCredentialController.toIpcFriendlyResultReceiver(credentialProviderGetDigitalCredentialController.resultReceiver));
            intent.putExtra(CredentialProviderBaseController.EXTRA_GET_CREDENTIAL_INTENT, hf3Var.n);
            this.this$0.context.startActivity(intent);
        }

        @Override // defpackage.if1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((hf3) obj);
            return j15.a;
        }
    }
}

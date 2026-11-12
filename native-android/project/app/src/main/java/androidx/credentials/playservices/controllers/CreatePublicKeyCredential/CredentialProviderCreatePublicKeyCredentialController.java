package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import defpackage.a0;
import defpackage.gf1;
import defpackage.h;
import defpackage.h12;
import defpackage.hn;
import defpackage.j15;
import defpackage.jn;
import defpackage.kf2;
import defpackage.kn;
import defpackage.lf0;
import defpackage.ln;
import defpackage.nf0;
import defpackage.of0;
import defpackage.q42;
import defpackage.rj5;
import defpackage.su3;
import defpackage.vf0;
import defpackage.vr3;
import defpackage.wo0;
import defpackage.xj0;
import defpackage.xr3;
import defpackage.ya4;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<of0, xr3, vr3, lf0, CreateCredentialException> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CreatePublicKey";
    private vf0 callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                bundle.getClass();
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
                CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor = this.this$0.executor;
                if (executor == null) {
                    h12.Q("executor");
                    throw null;
                }
                vf0 vf0Var = this.this$0.callback;
                if (vf0Var == null) {
                    h12.Q("callback");
                    throw null;
                }
                if (credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(bundle, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, vf0Var, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreatePublicKeyCredentialDomException JSONExceptionToPKCError(JSONException jSONException) {
        String message = jSONException.getMessage();
        return (message == null || message.length() <= 0) ? new CreatePublicKeyCredentialDomException(new h(4), "Unknown error") : new CreatePublicKeyCredentialDomException(new h(4), message);
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        vf0 vf0Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (vf0Var == null) {
            h12.Q("callback");
            throw null;
        }
        ((wo0) vf0Var).F(new CreatePublicKeyCredentialDomException(new h(26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ xr3 convertRequestToPlayServices(of0 of0Var) {
        if (of0Var == null) {
            return convertRequestToPlayServices2((of0) null);
        }
        kf2.k();
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public lf0 convertResponseToCredentialManager(vr3 vr3Var) throws CreateCredentialUnknownException {
        JSONObject jSONObjectB;
        vr3Var.getClass();
        try {
            ln lnVar = vr3Var.s;
            rj5 rj5Var = vr3Var.p;
            try {
                JSONObject jSONObject = new JSONObject();
                if (rj5Var != null && rj5Var.j().length > 0) {
                    jSONObject.put("rawId", ya4.n(rj5Var.j()));
                }
                String str = vr3Var.u;
                if (str != null) {
                    jSONObject.put("authenticatorAttachment", str);
                }
                String str2 = vr3Var.o;
                if (str2 != null && lnVar == null) {
                    jSONObject.put("type", str2);
                }
                String str3 = vr3Var.n;
                if (str3 != null) {
                    jSONObject.put("id", str3);
                }
                String str4 = "response";
                jn jnVar = vr3Var.r;
                boolean z = true;
                if (jnVar != null) {
                    jSONObjectB = jnVar.b();
                } else {
                    kn knVar = vr3Var.q;
                    if (knVar != null) {
                        jSONObjectB = knVar.b();
                    } else {
                        z = false;
                        if (lnVar != null) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("code", lnVar.n.n);
                                String str5 = lnVar.o;
                                if (str5 != null) {
                                    jSONObject2.put("message", str5);
                                }
                                str4 = "error";
                                jSONObjectB = jSONObject2;
                            } catch (JSONException e) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                            }
                        } else {
                            jSONObjectB = null;
                        }
                    }
                }
                if (jSONObjectB != null) {
                    jSONObject.put(str4, jSONObjectB);
                }
                hn hnVar = vr3Var.t;
                if (hnVar != null) {
                    jSONObject.put("clientExtensionResults", hnVar.b());
                } else if (z) {
                    jSONObject.put("clientExtensionResults", new JSONObject());
                }
                String string = jSONObject.toString();
                string.getClass();
                new Bundle().putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", string);
                nf0 nf0Var = new nf0();
                if (string.length() != 0) {
                    try {
                        new JSONObject(string);
                        return nf0Var;
                    } catch (Exception unused) {
                    }
                }
                throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
            } catch (JSONException e2) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
            }
        } catch (Throwable th) {
            throw new CreateCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
        }
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release() + " does not match what was given " + i);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePublicKeyCredentialController$handleResponse$1.INSTANCE, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                return;
            }
            Executor executor = this.executor;
            if (executor != null) {
                executor.execute(new a0(15, this));
                return;
            } else {
                h12.Q("executor");
                throw null;
            }
        }
        vr3 vr3Var = (vr3) su3.o(byteArrayExtra, vr3.CREATOR);
        vr3Var.getClass();
        CreateCredentialException createCredentialExceptionPublicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(vr3Var);
        if (createCredentialExceptionPublicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(this, createCredentialExceptionPublicKeyCredentialResponseContainsError));
            return;
        }
        try {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(this, convertResponseToCredentialManager(vr3Var)));
        } catch (JSONException e) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(this, e));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(this, th));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ void invokePlayServices(of0 of0Var, vf0 vf0Var, Executor executor, CancellationSignal cancellationSignal) {
        if (of0Var == null) {
            invokePlayServices2((of0) null, vf0Var, executor, cancellationSignal);
        } else {
            kf2.k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 xj0Var) {
            this();
        }

        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            context.getClass();
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(of0 of0Var, vf0 vf0Var, Executor executor, CancellationSignal cancellationSignal) {
        throw null;
    }

    /* JADX INFO: renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public xr3 convertRequestToPlayServices2(of0 of0Var) {
        throw null;
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class AnonymousClass3 extends q42 implements gf1 {
        public AnonymousClass3() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
            vf0 vf0Var = credentialProviderCreatePublicKeyCredentialController.callback;
            if (vf0Var == null) {
                h12.Q("callback");
                throw null;
            }
            ((wo0) vf0Var).F(new CreateCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m34invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                h12.Q("executor");
                throw null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.d
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.AnonymousClass3.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController);
                }
            });
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m34invoke();
            return j15.a;
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class AnonymousClass1 extends q42 implements gf1 {
        final /* synthetic */ JSONException $e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JSONException jSONException) {
            super(0);
            this.$e = jSONException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
            vf0 vf0Var = credentialProviderCreatePublicKeyCredentialController.callback;
            if (vf0Var == null) {
                h12.Q("callback");
                throw null;
            }
            ((wo0) vf0Var).F(credentialProviderCreatePublicKeyCredentialController.JSONExceptionToPKCError(jSONException));
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m32invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor != null) {
                executor.execute(new b(CredentialProviderCreatePublicKeyCredentialController.this, this.$e, 1));
            } else {
                h12.Q("executor");
                throw null;
            }
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m32invoke();
            return j15.a;
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class AnonymousClass2 extends q42 implements gf1 {
        final /* synthetic */ Throwable $t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Throwable th) {
            super(0);
            this.$t = th;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
            vf0 vf0Var = credentialProviderCreatePublicKeyCredentialController.callback;
            if (vf0Var == null) {
                h12.Q("callback");
                throw null;
            }
            ((wo0) vf0Var).F(new CreateCredentialUnknownException(th.getMessage()));
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m33invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor != null) {
                executor.execute(new c(CredentialProviderCreatePublicKeyCredentialController.this, this.$t, 1));
            } else {
                h12.Q("executor");
                throw null;
            }
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m33invoke();
            return j15.a;
        }
    }
}

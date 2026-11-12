package androidx.credentials.playservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.common.api.ApiException;
import defpackage.am1;
import defpackage.as;
import defpackage.bk;
import defpackage.bs;
import defpackage.c05;
import defpackage.cg0;
import defpackage.cj1;
import defpackage.cs;
import defpackage.dh5;
import defpackage.fh0;
import defpackage.h45;
import defpackage.ji2;
import defpackage.jw;
import defpackage.kg5;
import defpackage.le;
import defpackage.oz4;
import defpackage.p61;
import defpackage.pa;
import defpackage.r44;
import defpackage.r61;
import defpackage.rf2;
import defpackage.th1;
import defpackage.xg5;
import defpackage.xj0;
import defpackage.xr3;
import defpackage.yr;
import defpackage.zr;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class HiddenActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_VALUE = 1;
    private static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    private static final String TAG = "HiddenActivity";
    private boolean mWaitingForActivityResult;
    private ResultReceiver resultReceiver;

    private final void handleBeginSignIn() {
        jw jwVarB;
        cs csVar = (cs) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (csVar != null) {
            kg5 kg5Var = new kg5(this, new dh5());
            new yr(false, null, null, true, null, null, false);
            yr yrVar = csVar.o;
            ji2.m(yrVar);
            bs bsVar = csVar.n;
            ji2.m(bsVar);
            as asVar = csVar.s;
            ji2.m(asVar);
            zr zrVar = csVar.t;
            ji2.m(zrVar);
            cs csVar2 = new cs(bsVar, yrVar, kg5Var.k, csVar.q, csVar.r, asVar, zrVar, csVar.u);
            bk bkVarB = bk.b();
            bkVarB.r = new p61[]{new p61("auth_api_credentials_begin_sign_in", 8L)};
            bkVarB.q = new oz4(kg5Var, csVar2);
            bkVarB.p = false;
            bkVarB.o = 1553;
            jwVarB = kg5Var.b(0, bkVarB.a());
            jwVarB.k(new cg0(new HiddenActivity$handleBeginSignIn$1$1(this, intExtra), 5));
            jwVarB.d(new am1(this, 3));
        } else {
            jwVarB = null;
        }
        if (jwVarB == null) {
            Log.i(TAG, "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity hiddenActivity, Exception exc) {
        exc.getClass();
        String str = ((exc instanceof ApiException) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ApiException) exc).n.n))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        resultReceiver.getClass();
        hiddenActivity.setupFailure(resultReceiver, str, "During begin sign in, failure response from one tap: " + exc.getMessage());
    }

    private final void handleCreatePassword() {
        jw jwVarB;
        r44 r44Var = (r44) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int i = 1;
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (r44Var != null) {
            kg5 kg5Var = new kg5(this, new xg5());
            r44 r44Var2 = new r44(r44Var.n, kg5Var.k, r44Var.p);
            bk bkVarB = bk.b();
            bkVarB.r = new p61[]{fh0.j};
            bkVarB.q = new h45(kg5Var, r44Var2, 5);
            bkVarB.p = false;
            bkVarB.o = 1536;
            jwVarB = kg5Var.b(0, bkVarB.a());
            jwVarB.k(new cg0(new HiddenActivity$handleCreatePassword$1$1(this, intExtra), 3));
            jwVarB.d(new am1(this, i));
        } else {
            jwVarB = null;
        }
        if (jwVarB == null) {
            Log.i(TAG, "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity hiddenActivity, Exception exc) {
        exc.getClass();
        String str = ((exc instanceof ApiException) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ApiException) exc).n.n))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        resultReceiver.getClass();
        hiddenActivity.setupFailure(resultReceiver, str, "During save password, found password failure response from one tap " + exc.getMessage());
    }

    private final void handleCreatePublicKeyCredential() {
        HiddenActivity hiddenActivity;
        jw jwVarB;
        xr3 xr3Var = (xr3) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (xr3Var != null) {
            rf2 rf2Var = r61.k;
            pa paVar = new pa(7);
            Looper mainLooper = getMainLooper();
            ji2.n(mainLooper, "Looper must not be null.");
            cj1 cj1Var = new cj1(paVar, mainLooper);
            hiddenActivity = this;
            r61 r61Var = new r61(hiddenActivity, this, rf2Var, le.a, cj1Var);
            bk bkVarB = bk.b();
            bkVarB.q = new h45(r61Var, xr3Var, 6);
            bkVarB.o = 5407;
            jwVarB = r61Var.b(0, bkVarB.a());
            jwVarB.k(new cg0(new HiddenActivity$handleCreatePublicKeyCredential$1$1(hiddenActivity, intExtra), 2));
            jwVarB.d(new am1(hiddenActivity, 0));
        } else {
            hiddenActivity = this;
            jwVarB = null;
        }
        if (jwVarB == null) {
            Log.w(TAG, "During create public key credential, request is null, so nothing to launch for public key credentials");
            hiddenActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity hiddenActivity, Exception exc) {
        exc.getClass();
        String str = ((exc instanceof ApiException) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ApiException) exc).n.n))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        resultReceiver.getClass();
        hiddenActivity.setupFailure(resultReceiver, str, "During create public key credential, fido registration failure: " + exc.getMessage());
    }

    private final void handleGetSignInIntent() {
        jw jwVarB;
        th1 th1Var = (th1) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (th1Var != null) {
            kg5 kg5Var = new kg5(this, new dh5());
            String str = th1Var.n;
            ji2.m(str);
            String str2 = th1Var.q;
            th1 th1Var2 = new th1(str, th1Var.o, kg5Var.k, str2, th1Var.r, th1Var.s);
            bk bkVarB = bk.b();
            bkVarB.r = new p61[]{fh0.k};
            c05 c05Var = new c05();
            c05Var.n = th1Var2;
            bkVarB.q = c05Var;
            bkVarB.o = 1555;
            jwVarB = kg5Var.b(0, bkVarB.a());
            jwVarB.k(new cg0(new HiddenActivity$handleGetSignInIntent$1$1(this, intExtra), 4));
            jwVarB.d(new am1(this, 2));
        } else {
            jwVarB = null;
        }
        if (jwVarB == null) {
            Log.i(TAG, "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity hiddenActivity, Exception exc) {
        exc.getClass();
        String str = ((exc instanceof ApiException) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ApiException) exc).n.n))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        resultReceiver.getClass();
        hiddenActivity.setupFailure(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFailure(ResultReceiver resultReceiver, String str, String str2) {
        CredentialProviderBaseController.Companion.reportError$credentials_play_services_auth_release(resultReceiver, str, str2);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            CredentialProviderBaseController.Companion.reportResult$credentials_play_services_auth_release(resultReceiver, i, i2, intent);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(bundle);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                        handleBeginSignIn();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                        handleCreatePublicKeyCredential();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                        handleCreatePassword();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                        handleGetSignInIntent();
                        return;
                    }
                    break;
            }
        }
        Log.w(TAG, "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 xj0Var) {
            this();
        }

        private Companion() {
        }
    }
}

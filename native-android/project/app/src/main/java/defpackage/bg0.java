package defpackage;

import android.content.Context;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bg0 implements yf0 {
    public final CredentialManager a;

    public bg0(nc1 nc1Var) {
        this.a = bn.g(nc1Var.getSystemService("credential"));
    }

    @Override // defpackage.yf0
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    @Override // defpackage.yf0
    public final void onGetCredential(Context context, kh1 kh1Var, CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var) throws Throwable {
        wo0 wo0Var = (wo0) vf0Var;
        zf0 zf0Var = new zf0(0, wo0Var);
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            zf0Var.invoke();
            return;
        }
        ag0 ag0Var = new ag0(wo0Var, this);
        bn.t();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builderM = bn.m(bundle);
        for (xf0 xf0Var : kh1Var.a) {
            bn.C();
            xf0Var.getClass();
            builderM.addCredentialOption(bn.j(xf0Var.a, xf0Var.b).setIsSystemProviderRequired(true).setAllowedProviders(xf0Var.c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builderM.build();
        getCredentialRequestBuild.getClass();
        credentialManager.getCredential((nc1) context, getCredentialRequestBuild, cancellationSignal, executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) ag0Var);
    }
}

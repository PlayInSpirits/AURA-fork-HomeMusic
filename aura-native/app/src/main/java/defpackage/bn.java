/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.graphics.ColorSpace;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.window.BackEvent;
import com.eddyizm.tempus.service.MediaService;
import defpackage.g41;
import defpackage.h41;
import defpackage.nc1;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class bn {
    public static ColorSpace.Named A() {
        return ColorSpace.Named.BT2020_PQ;
    }

    public static String B(GetCredentialException getCredentialException) {
        return getCredentialException.getMessage();
    }

    public static void C() {
    }

    public static float D(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static float a(UiModeManager uiModeManager) {
        return uiModeManager.getContrast();
    }

    public static float b(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static int c(Context context) {
        return context.getDeviceId();
    }

    public static int d(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static Context e(Context context, int n16) {
        return context.createDeviceContext(n16);
    }

    public static Credential f(GetCredentialResponse getCredentialResponse) {
        return getCredentialResponse.getCredential();
    }

    public static CredentialManager g(Object object) {
        return (CredentialManager)object;
    }

    public static CredentialOption.Builder h(CredentialOption.Builder builder) {
        return builder.setIsSystemProviderRequired(true);
    }

    public static CredentialOption.Builder i(CredentialOption.Builder builder, Set set) {
        return builder.setAllowedProviders(set);
    }

    public static CredentialOption.Builder j(Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle, bundle2);
    }

    public static CredentialOption k(CredentialOption.Builder builder) {
        return builder.build();
    }

    public static GetCredentialException l(Throwable throwable) {
        return (GetCredentialException)throwable;
    }

    public static GetCredentialRequest.Builder m(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    public static GetCredentialRequest n(GetCredentialRequest.Builder builder) {
        return builder.build();
    }

    public static GetCredentialResponse o(Object object) {
        return (GetCredentialResponse)object;
    }

    public static ColorSpace.Named p() {
        return ColorSpace.Named.BT2020_HLG;
    }

    public static Bundle q(Credential credential) {
        return credential.getData();
    }

    public static String r(Credential credential) {
        return credential.getType();
    }

    public static String s(GetCredentialException getCredentialException) {
        return getCredentialException.getType();
    }

    public static void t() {
    }

    public static void u(Context context, g41 g412) {
        context.unregisterDeviceIdChangeListener(g412);
    }

    public static void v(CredentialManager credentialManager, nc1 nc12, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, OutcomeReceiver outcomeReceiver) {
        credentialManager.getCredential((Context)nc12, getCredentialRequest, cancellationSignal, executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>)outcomeReceiver);
    }

    public static void w(GetCredentialRequest.Builder builder, CredentialOption credentialOption) {
        builder.addCredentialOption(credentialOption);
    }

    public static void x(AudioTrack.Builder builder, Context context) {
        builder.setContext(context);
    }

    public static void y(MediaService mediaService, h41 h412, g41 g412) {
        ((Context)mediaService).registerDeviceIdChangeListener(h412, g412);
    }

    public static float z(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}


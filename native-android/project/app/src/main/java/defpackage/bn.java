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
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class bn {
    public static /* bridge */ /* synthetic */ ColorSpace.Named A() {
        return ColorSpace.Named.BT2020_PQ;
    }

    public static /* bridge */ /* synthetic */ String B(GetCredentialException r0) {
        return r0.getMessage();
    }

    public static /* synthetic */ void C() {
    }

    public static /* bridge */ /* synthetic */ float D(BackEvent r0) {
        return r0.getProgress();
    }

    public static /* bridge */ /* synthetic */ float a(UiModeManager r0) {
        return r0.getContrast();
    }

    public static /* bridge */ /* synthetic */ float b(BackEvent r0) {
        return r0.getTouchX();
    }

    public static /* bridge */ /* synthetic */ int c(Context r0) {
        return r0.getDeviceId();
    }

    public static /* bridge */ /* synthetic */ int d(BackEvent r0) {
        return r0.getSwipeEdge();
    }

    public static /* bridge */ /* synthetic */ Context e(Context r0, int r1) {
        return r0.createDeviceContext(r1);
    }

    public static /* bridge */ /* synthetic */ Credential f(GetCredentialResponse r0) {
        return r0.getCredential();
    }

    public static /* bridge */ /* synthetic */ CredentialManager g(Object r0) {
        return (CredentialManager) r0;
    }

    public static /* bridge */ /* synthetic */ CredentialOption.Builder h(CredentialOption.Builder r1) {
        return r1.setIsSystemProviderRequired(true);
    }

    public static /* bridge */ /* synthetic */ CredentialOption.Builder i(CredentialOption.Builder r0, Set r1) {
        return r0.setAllowedProviders(r1);
    }

    public static /* synthetic */ CredentialOption.Builder j(Bundle r2, Bundle r3) {
        return new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", r2, r3);
    }

    public static /* bridge */ /* synthetic */ CredentialOption k(CredentialOption.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ GetCredentialException l(Throwable r0) {
        return (GetCredentialException) r0;
    }

    public static /* synthetic */ GetCredentialRequest.Builder m(Bundle r1) {
        return new GetCredentialRequest.Builder(r1);
    }

    public static /* bridge */ /* synthetic */ GetCredentialRequest n(GetCredentialRequest.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ GetCredentialResponse o(Object r0) {
        return (GetCredentialResponse) r0;
    }

    public static /* bridge */ /* synthetic */ ColorSpace.Named p() {
        return ColorSpace.Named.BT2020_HLG;
    }

    public static /* bridge */ /* synthetic */ Bundle q(Credential r0) {
        return r0.getData();
    }

    public static /* bridge */ /* synthetic */ String r(Credential r0) {
        return r0.getType();
    }

    public static /* bridge */ /* synthetic */ String s(GetCredentialException r0) {
        return r0.getType();
    }

    public static /* synthetic */ void t() {
    }

    public static /* bridge */ /* synthetic */ void u(Context r0, g41 r1) {
        r0.unregisterDeviceIdChangeListener(r1);
    }

    public static /* bridge */ /* synthetic */ void v(CredentialManager r0, nc1 r1, GetCredentialRequest r2, CancellationSignal r3, Executor r4, OutcomeReceiver r5) {
        r0.getCredential(r1, r2, r3, r4, r5);
    }

    public static /* bridge */ /* synthetic */ void w(GetCredentialRequest.Builder r0, CredentialOption r1) {
        r0.addCredentialOption(r1);
    }

    public static /* bridge */ /* synthetic */ void x(AudioTrack.Builder r0, Context r1) {
        r0.setContext(r1);
    }

    public static /* bridge */ /* synthetic */ void y(MediaService r0, h41 r1, g41 r2) {
        r0.registerDeviceIdChangeListener(r1, r2);
    }

    public static /* bridge */ /* synthetic */ float z(BackEvent r0) {
        return r0.getTouchY();
    }
}

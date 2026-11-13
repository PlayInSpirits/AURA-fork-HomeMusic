package androidx.credentials.playservices.controllers.BeginSignIn;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import defpackage.gf1;
import defpackage.j15;
import defpackage.q42;
import defpackage.wf1;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController$handleResponse$1 extends q42 implements wf1 {
    public static final CredentialProviderBeginSignInController$handleResponse$1 INSTANCE = new CredentialProviderBeginSignInController$handleResponse$1();

    public CredentialProviderBeginSignInController$handleResponse$1() {
        super(2);
    }

    @Override // defpackage.wf1
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CancellationSignal) obj, (gf1) obj2);
        return j15.a;
    }

    public final void invoke(CancellationSignal cancellationSignal, gf1 gf1Var) {
        gf1Var.getClass();
        CredentialProviderController.Companion companion = CredentialProviderController.Companion;
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, gf1Var);
    }
}

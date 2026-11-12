package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.exceptions.GetCredentialUnknownException;
import defpackage.gf1;
import defpackage.j15;
import defpackage.q42;
import defpackage.wo0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderGetDigitalCredentialController$handleResponse$3 extends q42 implements gf1 {
    final /* synthetic */ CredentialProviderGetDigitalCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetDigitalCredentialController$handleResponse$3(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController) {
        super(0);
        this.this$0 = credentialProviderGetDigitalCredentialController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController) {
        ((wo0) credentialProviderGetDigitalCredentialController.getCallback()).F(new GetCredentialUnknownException("No provider data returned."));
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m47invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.b
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetDigitalCredentialController$handleResponse$3.invoke$lambda$0(credentialProviderGetDigitalCredentialController);
            }
        });
    }

    @Override // defpackage.gf1
    public /* bridge */ /* synthetic */ Object invoke() {
        m47invoke();
        return j15.a;
    }
}

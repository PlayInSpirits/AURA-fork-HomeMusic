package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.exceptions.GetCredentialException;
import defpackage.jx3;
import defpackage.mh1;
import defpackage.vf0;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                CredentialProviderGetDigitalCredentialController$handleResponse$4.invoke$lambda$0((CredentialProviderGetDigitalCredentialController) this.o, (mh1) this.p);
                break;
            case 1:
                CredentialProviderGetDigitalCredentialController$invokePlayServices$2$1.invoke$lambda$0((vf0) this.o, (GetCredentialException) this.p);
                break;
            case 2:
                CredentialProviderGetRestoreCredentialController.AnonymousClass1.C00011.invoke$lambda$0((vf0) this.o, (mh1) this.p);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                CredentialProviderGetRestoreCredentialController.AnonymousClass1.AnonymousClass2.invoke$lambda$0((vf0) this.o, (Exception) this.p);
                break;
            default:
                CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1.invoke$lambda$0((vf0) this.o, (jx3) this.p);
                break;
        }
    }
}

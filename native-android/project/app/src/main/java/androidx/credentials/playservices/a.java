package androidx.credentials.playservices;

import defpackage.vf0;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ vf0 o;

    public /* synthetic */ a(vf0 vf0Var, int i) {
        this.n = i;
        this.o = vf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        vf0 vf0Var = this.o;
        switch (i) {
            case 0:
                CredentialProviderPlayServicesImpl.AnonymousClass1.invoke$lambda$0(vf0Var);
                break;
            case 1:
                CredentialProviderPlayServicesImpl.AnonymousClass2.AnonymousClass1.invoke$lambda$0(vf0Var);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.AnonymousClass4.AnonymousClass1.invoke$lambda$0(vf0Var);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                CredentialProviderPlayServicesImpl.C00021.invoke$lambda$0(vf0Var);
                break;
            case 4:
                CredentialProviderPlayServicesImpl.C00031.invoke$lambda$0(vf0Var);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.C00042.invoke$lambda$0(vf0Var);
                break;
            default:
                CredentialProviderPlayServicesImpl.AnonymousClass3.invoke$lambda$0(vf0Var);
                break;
        }
    }
}

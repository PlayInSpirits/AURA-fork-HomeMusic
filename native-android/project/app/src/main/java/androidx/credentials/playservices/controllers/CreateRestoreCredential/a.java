package androidx.credentials.playservices.controllers.CreateRestoreCredential;

import defpackage.jx3;
import defpackage.lf0;
import defpackage.vf0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ vf0 o;
    public final /* synthetic */ Object p;

    public /* synthetic */ a(vf0 vf0Var, Object obj, int i) {
        this.n = i;
        this.o = vf0Var;
        this.p = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                CredentialProviderCreateRestoreCredentialController.AnonymousClass1.C00001.invoke$lambda$0(this.o, (lf0) this.p);
                break;
            case 1:
                CredentialProviderCreateRestoreCredentialController.AnonymousClass1.AnonymousClass2.invoke$lambda$0(this.o, (Exception) this.p);
                break;
            default:
                CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1.invoke$lambda$0(this.o, (jx3) this.p);
                break;
        }
    }
}

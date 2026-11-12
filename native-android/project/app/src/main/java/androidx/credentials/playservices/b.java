package androidx.credentials.playservices;

import defpackage.jx3;
import defpackage.vf0;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ vf0 o;
    public final /* synthetic */ Serializable p;

    public /* synthetic */ b(vf0 vf0Var, Serializable serializable, int i) {
        this.n = i;
        this.o = vf0Var;
        this.p = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                CredentialProviderPlayServicesImpl$onClearCredential$3$1.invoke$lambda$0(this.o, (jx3) this.p);
                break;
            default:
                CredentialProviderPlayServicesImpl$onClearCredential$5$1$1.invoke$lambda$0(this.o, (Exception) this.p);
                break;
        }
    }
}

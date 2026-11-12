package defpackage;

import androidx.credentials.playservices.HiddenActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class am1 implements e93 {
    public final /* synthetic */ int n;
    public final /* synthetic */ HiddenActivity o;

    public /* synthetic */ am1(HiddenActivity hiddenActivity, int i) {
        this.n = i;
        this.o = hiddenActivity;
    }

    @Override // defpackage.e93
    public final void a(Exception exc) {
        int i = this.n;
        HiddenActivity hiddenActivity = this.o;
        switch (i) {
            case 0:
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(hiddenActivity, exc);
                break;
            case 1:
                HiddenActivity.handleCreatePassword$lambda$14$lambda$13(hiddenActivity, exc);
                break;
            case 2:
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(hiddenActivity, exc);
                break;
            default:
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(hiddenActivity, exc);
                break;
        }
    }
}

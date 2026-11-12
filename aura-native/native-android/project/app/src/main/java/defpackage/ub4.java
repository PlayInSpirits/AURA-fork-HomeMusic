package defpackage;

import app.homemusic.R;
import com.eddyizm.tempus.interfaces.DialogClickCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ub4 implements DialogClickCallback {
    public final /* synthetic */ vb4 n;

    public ub4(vb4 vb4Var) {
        this.n = vb4Var;
    }

    @Override // com.eddyizm.tempus.interfaces.DialogClickCallback
    public final void onNegativeClick() {
        this.n.h0("streaming_cache_storage").w(R.string.streaming_cache_storage_internal_dialog_negative_button);
    }

    @Override // com.eddyizm.tempus.interfaces.DialogClickCallback
    public final void onPositiveClick() {
        this.n.h0("streaming_cache_storage").w(R.string.streaming_cache_storage_external_dialog_positive_button);
    }
}

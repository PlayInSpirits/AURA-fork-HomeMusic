package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m64 implements n64 {
    public final ScrollFeedbackProvider n;

    public m64(NestedScrollView r1) {
        this.n = ScrollFeedbackProvider.createProvider(r1);
    }

    @Override // defpackage.n64
    public final void onScrollLimit(int r1, int r2, int r3, boolean r4) {
        this.n.onScrollLimit(r1, r2, r3, r4);
    }

    @Override // defpackage.n64
    public final void onScrollProgress(int r1, int r2, int r3, int r4) {
        this.n.onScrollProgress(r1, r2, r3, r4);
    }
}

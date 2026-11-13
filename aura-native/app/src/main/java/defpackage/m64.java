package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class m64 implements n64 {
    public final ScrollFeedbackProvider n;

    public m64(NestedScrollView nestedScrollView) {
        this.n = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.n64
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.n.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.n64
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.n.onScrollProgress(i, i2, i3, i4);
    }
}

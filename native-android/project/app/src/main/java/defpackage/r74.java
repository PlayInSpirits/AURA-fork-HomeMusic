package defpackage;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r74 implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView a;

    public r74(SearchView r1) {
        this.a = r1;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View r1, boolean r2) {
        SearchView r0 = this.a;
        View.OnFocusChangeListener r3 = r0.b0;
        if (r3 == null) goto L6;
        r3.onFocusChange(r0, r2);
        return;
    }
}

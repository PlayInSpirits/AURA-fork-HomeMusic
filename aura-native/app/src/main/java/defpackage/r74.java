package defpackage;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class r74 implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView a;

    public r74(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.b0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}

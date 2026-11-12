package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s74 implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView a;

    public s74(SearchView r1) {
        this.a = r1;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView r1, int r2, KeyEvent r3) {
        this.a.q();
        return true;
    }
}

package defpackage;

import android.widget.ImageButton;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m85 extends ImageButton {
    public int n;

    public final void a(int r1, boolean r2) {
        super.setVisibility(r1);
        if (r2 == false) goto L6;
        this.n = r1;
        return;
    }

    public final int getUserSetVisibility() {
        return this.n;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int r2) {
        a(r2, true);
    }
}

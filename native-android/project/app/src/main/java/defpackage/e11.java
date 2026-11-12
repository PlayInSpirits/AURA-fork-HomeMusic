package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e11 extends ft4 {
    public final /* synthetic */ g11 n;

    public e11(g11 r1) {
        this.n = r1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r1) {
        this.n.a().a();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        this.n.a().b();
    }
}

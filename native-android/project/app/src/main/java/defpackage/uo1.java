package defpackage;

import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public enum uo1 {
    LIKE(R.string.homemusic_selection_like, R.drawable.ic_favorites_outlined),
    UNLIKE(R.string.homemusic_selection_unlike, R.drawable.ic_favorite),
    DELETE(R.string.homemusic_liked_remove, R.drawable.ic_delete);

    public static final y41 p = new y41(27);
    public final int n;
    public final int o;

    uo1(int i, int i2) {
        this.n = i;
        this.o = i2;
    }
}

package defpackage;

import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum uo1 extends Enum {
    public static final y41 p = null;
    public static final uo1 q = null;
    public static final uo1 r = null;
    public static final uo1 s = null;
    public static final /* synthetic */ uo1[] t = null;
    public final int n;
    public final int o;

    static {
        uo1 r0 = new uo1("LIKE", 0, R.string.homemusic_selection_like, R.drawable.ic_favorites_outlined);
        q = r0;
        uo1 r1 = new uo1("UNLIKE", 1, R.string.homemusic_selection_unlike, R.drawable.ic_favorite);
        r = r1;
        uo1 r2 = new uo1("DELETE", 2, R.string.homemusic_liked_remove, R.drawable.ic_delete);
        s = r2;
        t = new uo1[]{r0, r1, r2};
        p = new y41(27);
    }

    public uo1(String r1, int r2, int r3, int r4) {
        super(r1, r2);
        this.n = r3;
        this.o = r4;
    }

    public static uo1 valueOf(String r1) {
        return (uo1) Enum.valueOf(uo1.class, r1);
    }

    public static uo1[] values() {
        return (uo1[]) t.clone();
    }
}

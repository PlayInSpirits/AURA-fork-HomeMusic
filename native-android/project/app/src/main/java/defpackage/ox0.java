package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum ox0 extends Enum {
    public static final ox0 o = null;
    public static final ox0 p = null;
    public static final ox0 q = null;
    public static final /* synthetic */ ox0[] r = null;
    public final TimeUnit n;

    static {
        ox0 r0 = new ox0("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        o = r0;
        ox0 r1 = new ox0("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        ox0 r2 = new ox0("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        p = r2;
        ox0 r3 = new ox0("SECONDS", 3, TimeUnit.SECONDS);
        q = r3;
        r = new ox0[]{r0, r1, r2, r3, new ox0("MINUTES", 4, TimeUnit.MINUTES), new ox0("HOURS", 5, TimeUnit.HOURS), new ox0("DAYS", 6, TimeUnit.DAYS)};
    }

    public ox0(String r1, int r2, TimeUnit r3) {
        super(r1, r2);
        this.n = r3;
    }

    public static ox0 valueOf(String r1) {
        return (ox0) Enum.valueOf(ox0.class, r1);
    }

    public static ox0[] values() {
        return (ox0[]) r.clone();
    }
}

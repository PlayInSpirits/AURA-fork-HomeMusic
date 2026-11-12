package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum e42 extends Enum {
    public static final /* synthetic */ e42[] n = null;

    static {
        n = new e42[]{new e42("PUBLIC", 0), new e42("PROTECTED", 1), new e42("INTERNAL", 2), new e42("PRIVATE", 3)};
    }

    public static e42 valueOf(String r1) {
        return (e42) Enum.valueOf(e42.class, r1);
    }

    public static e42[] values() {
        return (e42[]) n.clone();
    }
}

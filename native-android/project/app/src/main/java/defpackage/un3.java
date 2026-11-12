package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class un3 {
    public static String a(int r1) {
        if (r1 != 1) goto L5;
        return "Touch";
    L5:
        if (r1 != 2) goto L7;
        return "Mouse";
    L7:
        if (r1 != 3) goto L9;
        return "Stylus";
    L9:
        if (r1 == 4) goto L12;
        return "Unknown";
    L12:
        return "Eraser";
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ie {
    public static final /* synthetic */ int a = 0;

    static {
        new he("");
    }

    public static final boolean a(int r4, int r5, int r6, int r7) {
        boolean r0 = false;
        if (r4 != r5) goto L5;
        boolean r2 = true;
    L6:
        if (r6 != r7) goto L8;
        boolean r3 = true;
    L9:
        boolean r8 = r2 | r3;
        if (r4 != r6) goto L12;
        boolean r9 = true;
    L13:
        boolean r10 = r8 & r9;
        if (r4 >= r7) goto L16;
        boolean r11 = true;
    L17:
        if (r6 >= r5) goto L20;
        r0 = true;
    L20:
        return (r11 & r0) | r10;
    L16:
        r11 = false;
        goto L17
    L12:
        r9 = false;
        goto L13
    L8:
        r3 = false;
        goto L9
    L5:
        r2 = false;
        goto L6
    }
}

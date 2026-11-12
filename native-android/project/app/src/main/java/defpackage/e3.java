package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 extends b3 {
    public static e3 c;

    @Override // defpackage.b3
    public final int[] f(int r5) {
        int r0 = j().length();
        if (r0 <= 0) goto L38;
        if (r5 >= r0) goto L39;
        if (r5 >= 0) goto L9;
        r5 = 0;
    L9:
        if (r5 >= r0) goto L19;
        if (j().charAt(r5) != '\n') goto L19;
        if (j().charAt(r5) == '\n') goto L18;
        if (r5 == 0) goto L19;
        if (j().charAt(r5 - 1) == '\n') goto L19;
    L18:
        r5 = r5 + 1;
    L19:
        if (r5 < r0) goto L22;
        return null;
    L22:
        int r1 = r5 + 1;
    L23:
        if (r1 >= r0) goto L28;
        if (o(r1) == true) goto L28;
        r1 = r1 + 1;
    L28:
        return i(r5, r1);
    L39:
        return null;
    L38:
        return null;
    }

    @Override // defpackage.b3
    public final int[] m(int r5) {
        int r0 = j().length();
        if (r0 <= 0) goto L39;
        if (r5 <= 0) goto L40;
        if (r5 <= r0) goto L10;
        r5 = r0;
    L10:
        if (r5 <= 0) goto L16;
        if (j().charAt(r5 - 1) != '\n') goto L16;
        if (o(r5) == true) goto L16;
        r5 = r5 - 1;
    L16:
        if (r5 > 0) goto L19;
        return null;
    L19:
        int r1 = r5 - 1;
    L20:
        if (r1 <= 0) goto L29;
        if (j().charAt(r1) == '\n') goto L27;
        if (r1 == 0) goto L29;
        if (j().charAt(r1 - 1) == '\n') goto L29;
    L27:
        r1 = r1 - 1;
    L29:
        return i(r1, r5);
    L40:
        return null;
    L39:
        return null;
    }

    public final boolean o(int r3) {
        if (r3 > 0) goto L4;
        return false;
    L4:
        if (j().charAt(r3 - 1) != '\n') goto L6;
        return false;
    L6:
        if (r3 != j().length()) goto L8;
        return true;
    L8:
        if (j().charAt(r3) != '\n') goto L15;
        return true;
    L15:
        return false;
    }
}

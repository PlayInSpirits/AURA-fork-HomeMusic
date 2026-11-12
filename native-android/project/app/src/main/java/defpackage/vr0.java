package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vr0 {
    public final ur0 a;

    static {
        new vr0("", 0, 0);
    }

    public vr0(String r2, int r3, int r4) {
        this.a = new ur0(r2, r3, r4);
    }

    public static vr0 a(int r6, int r7, boolean r8, int r9, int r10, int r11, int r12) {
        if (r8 == false) goto L5;
        int r13 = r6 / 2;
        int r14 = r7 / 2;
        StringBuilder r15 = b11.t("M0,", " A", r14, r13, ",");
        r15.append(r14);
        r15.append(" 0 1,1 ");
        r15.append(r6);
        r15.append(",");
        r15.append(r14);
        r15.append(" A");
        r15.append(r13);
        r15.append(",");
        r15.append(r14);
        r15.append(" 0 1,1 0,");
        r15.append(r14);
        r15.append(" Z");
        String r16 = r15.toString();
    L18:
        return new vr0(r16, r6, r7);
    L5:
        StringBuilder r17 = new StringBuilder("M ");
        int r2 = Math.min(r6 / 2, r7 / 2);
        int r18 = Math.min(r2, r9);
        int r19 = Math.min(r2, r10);
        int r110 = Math.min(r2, r11);
        int r111 = Math.min(r2, r12);
        r17.append(r18);
        r17.append(",0 L ");
        r17.append(r6 - r19);
        r17.append(",0");
        if (r19 <= 0) goto L8;
        r17.append(" A ");
        r17.append(r19);
        r17.append(",");
        r17.append(r19);
        r17.append(" 0 0,1 ");
        r17.append(r6);
        r17.append(",");
        r17.append(r19);
    L8:
        r17.append(" L ");
        r17.append(r6);
        r17.append(",");
        r17.append(r7 - r110);
        if (r110 <= 0) goto L11;
        r17.append(" A ");
        r17.append(r110);
        r17.append(",");
        r17.append(r110);
        r17.append(" 0 0,1 ");
        r17.append(r6 - r110);
        r17.append(",");
        r17.append(r7);
    L11:
        r17.append(" L ");
        r17.append(r111);
        r17.append(",");
        r17.append(r7);
        if (r111 <= 0) goto L14;
        r17.append(" A ");
        r17.append(r111);
        r17.append(",");
        r17.append(r111);
        r17.append(" 0 0,1 0,");
        r17.append(r7 - r111);
    L14:
        if (r18 <= 0) goto L16;
        r17.append(" L 0,");
        r17.append(r18);
        r17.append(" A ");
        r17.append(r18);
        r17.append(",");
        r17.append(r18);
        r17.append(" 0 0,1 ");
        r17.append(r18);
        r17.append(",0");
    L16:
        r17.append(" Z");
        r16 = r17.toString();
        goto L18
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof vr0) == true) goto L10;
        return false;
    L10:
        return this.a.equals(((vr0) r2).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

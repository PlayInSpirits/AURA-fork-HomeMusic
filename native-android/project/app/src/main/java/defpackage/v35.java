package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v35 extends u35 {
    public cf3[] a;
    public String b;
    public int c;

    public v35(v35 r5) {
        this.a = null;
        int r0 = 0;
        this.c = 0;
        this.b = r5.b;
        cf3[] r6 = r5.a;
        cf3[] r1 = new cf3[r6.length];
    L4:
        if (r0 >= r6.length) goto L6;
        r1[r0] = new cf3(r6[r0]);
        r0 = r0 + 1;
        goto L4
    L6:
        this.a = r1;
    }

    public cf3[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(cf3[] r8) {
        cf3[] r0 = this.a;
        int r1 = 0;
        if (r0 == null) goto L27;
        if (r8 == null) goto L27;
        if (r0.length != r8.length) goto L27;
        int r2 = 0;
    L11:
        if (r2 >= r0.length) goto L18;
        cf3 r3 = r0[r2];
        char r4 = r3.a;
        cf3 r5 = r8[r2];
        if (r4 != r5.a) goto L27;
        if (r3.b.length != r5.b.length) goto L27;
        r2 = r2 + 1;
        goto L11
    L18:
        cf3[] r7 = this.a;
        int r6 = 0;
    L20:
        if (r6 >= r8.length) goto L26;
        r7[r6].a = r8[r6].a;
        int r9 = 0;
    L22:
        float[] r10 = r8[r6].b;
        if (r9 >= r10.length) goto L25;
        r7[r6].b[r9] = r10[r9];
        r9 = r9 + 1;
        goto L22
    L25:
        r6 = r6 + 1;
        goto L20
    L26:
        return;
    L27:
        cf3[] r11 = new cf3[r8.length];
    L29:
        if (r1 >= r8.length) goto L31;
        r11[r1] = new cf3(r8[r1]);
        r1 = r1 + 1;
        goto L29
    L31:
        this.a = r11;
    }

    public v35() {
        this.a = null;
        this.c = 0;
    }
}

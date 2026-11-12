package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ji1 implements Appendable {
    public final Appendable n;
    public boolean o;

    public ji1(Appendable r2) {
        this.o = true;
        this.n = r2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence r5, int r6, int r7) {
        if (r5 != null) goto L4;
        r5 = "";
    L4:
        boolean r0 = this.o;
        Appendable r1 = this.n;
        boolean r2 = false;
        if (r0 == false) goto L8;
        this.o = false;
        r1.append("  ");
    L8:
        if (r5.length() > 0) goto L10;
    L12:
        this.o = r2;
        r1.append(r5, r6, r7);
        return this;
    L10:
        if (r5.charAt(r7 - 1) != '\n') goto L12;
        r2 = true;
        goto L12
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence r3) {
        if (r3 != null) goto L4;
        r3 = "";
    L4:
        append(r3, 0, r3.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char r4) {
        boolean r0 = this.o;
        Appendable r1 = this.n;
        boolean r2 = false;
        if (r0 == false) goto L6;
        this.o = false;
        r1.append("  ");
    L6:
        if (r4 != '\n') goto L8;
        r2 = true;
    L8:
        this.o = r2;
        r1.append(r4);
        return this;
    }
}

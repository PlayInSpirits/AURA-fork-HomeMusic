package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class is {
    public static final byte[] e = null;
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        e = new byte[1792];
        int r1 = 0;
    L3:
        if (r1 >= 1792) goto L5;
        e[r1] = Character.getDirectionality(r1);
        r1 = r1 + 1;
        goto L3
    }

    public is(CharSequence r1) {
        this.a = r1;
        this.b = r1.length();
    }

    public final byte a() {
        int r0 = this.c - 1;
        CharSequence r1 = this.a;
        char r2 = r1.charAt(r0);
        this.d = r2;
        boolean r3 = Character.isLowSurrogate(r2);
        int r4 = this.c;
        if (r3 == false) goto L6;
        int r5 = Character.codePointBefore(r1, r4);
        this.c -= Character.charCount(r5);
        return Character.getDirectionality(r5);
    L6:
        this.c = r4 - 1;
        char r6 = this.d;
        if (r6 >= 1792) goto L10;
        return e[r6];
    L10:
        return Character.getDirectionality(r6);
    }
}

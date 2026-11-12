package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u10 implements ro3 {
    public static String a(char r6) {
        char[] r0 = new char[6];
        int r2 = 0;
        r0[0] = '\\';
        r0[1] = 'u';
        r0[2] = 0;
        r0[3] = 0;
        r0[4] = 0;
        r0[5] = 0;
    L3:
        if (r2 >= 4) goto L6;
        r0[5 - r2] = "0123456789ABCDEF".charAt(r6 & 15);
        r6 = (char) (r6 >> 4);
        r2 = r2 + 1;
        goto L3
    L6:
        return String.copyValueOf(r0);
    }

    public static u10 b(String r4) {
        int r0 = r4.length();
        if (r0 == 0) goto L15;
        int r1 = 0;
        if (r0 == 1) goto L13;
        if (r0 == 2) goto L11;
        return new p10(r4);
    L11:
        return new s10(r4.charAt(0), r4.charAt(1));
    L13:
        return new r10(r4.charAt(0), r1);
    L15:
        return o10.s;
    }

    public abstract boolean c(char r1);

    public u10 d() {
        return new p10(this);
    }
}

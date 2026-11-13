package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class u10 implements ro3 {
    public static String a(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static u10 b(String str) {
        int length = str.length();
        if (length != 0) {
            return length != 1 ? length != 2 ? new p10(str) : new s10(str.charAt(0), str.charAt(1)) : new r10(str.charAt(0), 0);
        }
        return o10.s;
    }

    public abstract boolean c(char c);

    public u10 d() {
        return new p10(this);
    }
}

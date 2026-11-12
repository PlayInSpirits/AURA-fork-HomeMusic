package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 extends b3 {
    public static e3 c;

    @Override // defpackage.b3
    public final int[] f(int i) {
        int length = j().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && j().charAt(i) == '\n' && (j().charAt(i) == '\n' || (i != 0 && j().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !o(i2)) {
            i2++;
        }
        return i(i, i2);
    }

    @Override // defpackage.b3
    public final int[] m(int i) {
        int length = j().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && j().charAt(i - 1) == '\n' && !o(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (j().charAt(i2) == '\n' || (i2 != 0 && j().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return i(i2, i);
    }

    public final boolean o(int i) {
        if (i <= 0 || j().charAt(i - 1) == '\n') {
            return false;
        }
        return i == j().length() || j().charAt(i) == '\n';
    }
}

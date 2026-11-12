package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gm {
    public static final gm e = null;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        e = new gm(-1, -1, -1);
    }

    public gm(int r1, int r2, int r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        if (f35.L(r3) == false) goto L5;
        int r4 = f35.t(r3) * r2;
    L6:
        this.d = r4;
        return;
    L5:
        r4 = -1;
        goto L6
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof gm) == true) goto L8;
        return false;
    L8:
        gm r6 = (gm) r5;
        if (this.a == r6.a) goto L11;
    L15:
        return false;
    L11:
        if (this.b != r6.b) goto L15;
        if (this.c != r6.c) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
    }
}

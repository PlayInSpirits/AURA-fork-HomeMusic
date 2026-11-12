package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ml {
    public static final ml d = null;
    public final int a;
    public final int b;
    public final jx1 c;

    static {
        if (Build.VERSION.SDK_INT < 33) goto L8;
        ix1 r1 = new ix1(4);
        int r4 = 1;
    L5:
        if (r4 > 10) goto L7;
        r1.c(Integer.valueOf(f35.s(r4)));
        r4 = r4 + 1;
        goto L5
    L7:
        ml r0 = new ml(2, r1.g());
    L9:
        d = r0;
        return;
    L8:
        r0 = new ml(2, 10);
        goto L9
    }

    public ml(int r2, Set r3) {
        this.a = r2;
        jx1 r4 = jx1.k(r3);
        this.c = r4;
        o15 r5 = r4.h();
        int r6 = 0;
    L4:
        if (r5.hasNext() == false) goto L6;
        r6 = Math.max(r6, Integer.bitCount(((Integer) r5.next()).intValue()));
        goto L4
    L6:
        this.b = r6;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ml) == true) goto L8;
        return false;
    L8:
        ml r6 = (ml) r5;
        if (this.a == r6.a) goto L11;
    L15:
        return false;
    L11:
        if (this.b != r6.b) goto L15;
        if (Objects.equals(this.c, r6.c) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        int r0 = ((this.a * 31) + this.b) * 31;
        jx1 r2 = this.c;
        if (r2 != null) goto L5;
        int r3 = 0;
    L7:
        return r0 + r3;
    L5:
        r3 = r2.hashCode();
        goto L7
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public ml(int r1, int r2) {
        this.a = r1;
        this.b = r2;
        this.c = null;
    }
}

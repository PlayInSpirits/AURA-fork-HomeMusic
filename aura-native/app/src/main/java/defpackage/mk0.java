/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.hg3;
import defpackage.k35;
import defpackage.l51;
import java.util.ArrayDeque;

public final class mk0 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final k35 c = new k35();
    public hg3 d;
    public int e;
    public int f;
    public long g;

    public final long a(l51 l512, int n16) {
        byte[] byArray = this.a;
        l512.readFully(byArray, 0, n16);
        long l16 = 0L;
        for (int i16 = 0; i16 < n16; ++i16) {
            l16 = l16 << 8 | (long)(byArray[i16] & 0xFF);
        }
        return l16;
    }
}


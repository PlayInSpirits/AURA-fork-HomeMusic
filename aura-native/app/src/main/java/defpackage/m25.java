/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.os.SystemClock;
import defpackage.ne4;

public final class m25
implements ne4 {
    public final long n;
    public final long o;
    public final long p;

    public m25(long l16, long l17, long l18) {
        this.n = l16;
        this.o = l17;
        this.p = l18;
    }

    @Override
    public final long get() {
        return Math.min(SystemClock.elapsedRealtime() - this.o + this.n, this.p);
    }
}


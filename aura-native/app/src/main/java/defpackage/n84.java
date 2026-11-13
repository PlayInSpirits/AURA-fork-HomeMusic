/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.f35;
import defpackage.rr2;

public final class n84 {
    public static final n84 c;
    public static final n84 d;
    public final long a;
    public final long b;

    static {
        n84 n842 = new n84(0L, 0L);
        new n84(Long.MAX_VALUE, Long.MAX_VALUE);
        c = new n84(Long.MAX_VALUE, 0L);
        new n84(0L, Long.MAX_VALUE);
        d = n842;
    }

    public n84(long l16, long l17) {
        boolean bl5 = false;
        boolean bl6 = l16 >= 0L;
        rr2.l(bl6);
        bl6 = bl5;
        if (l17 >= 0L) {
            bl6 = true;
        }
        rr2.l(bl6);
        this.a = l16;
        this.b = l17;
    }

    public final long a(long l16, long l17, long l18) {
        long l19;
        block16: {
            block13: {
                boolean bl5;
                block15: {
                    block14: {
                        boolean bl6;
                        block12: {
                            boolean bl7;
                            long l26;
                            long l27;
                            block11: {
                                block10: {
                                    l27 = this.a;
                                    l26 = this.b;
                                    if (l27 == 0L && l26 == 0L) {
                                        return l16;
                                    }
                                    String string = f35.a;
                                    long l28 = l16 - l27;
                                    bl7 = true;
                                    bl6 = (l27 ^ l16) >= 0L;
                                    if ((l27 = bl6 | (bl5 = (l16 ^ l28) >= 0L) ? l28 : (l28 >>> 63 ^ 1L) + Long.MAX_VALUE) == Long.MIN_VALUE && l28 != Long.MIN_VALUE) break block10;
                                    l19 = l27;
                                    if (l27 != Long.MAX_VALUE) break block11;
                                    l19 = l27;
                                    if (l28 == Long.MAX_VALUE) break block11;
                                }
                                l19 = Long.MIN_VALUE;
                            }
                            l27 = f35.a(l16, l26);
                            bl6 = l19 <= l17 && l17 <= l27;
                            bl5 = l19 <= l18 && l18 <= l27 ? bl7 : false;
                            if (!bl6 || !bl5) break block12;
                            if (Math.abs(l17 - l16) > Math.abs(l18 - l16)) break block13;
                            break block14;
                        }
                        if (!bl6) break block15;
                    }
                    return l17;
                }
                if (!bl5) break block16;
            }
            return l18;
        }
        return l19;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && n84.class == object.getClass()) {
            object = (n84)object;
            if (this.a == ((n84)object).a && this.b == ((n84)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int)this.a * 31 + (int)this.b;
    }
}


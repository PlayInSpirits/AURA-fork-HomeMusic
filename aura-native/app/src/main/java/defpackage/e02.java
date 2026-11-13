/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public abstract class e02 {
    public long[] a;
    public int[] b;
    public Object[] c;
    public int d;
    public int e;

    public final boolean a(int n16) {
        int n17 = Integer.hashCode(n16) * -862048943;
        int n18 = n17 ^ n17 << 16;
        int n19 = this.d;
        int n26 = n18 >>> 7 & n19;
        n17 = 0;
        while (true) {
            block5: {
                block4: {
                    long[] lArray = this.a;
                    int n27 = n26 >> 3;
                    int n28 = (n26 & 7) << 3;
                    long l16 = lArray[n27];
                    long l17 = lArray[n27 + 1] << 64 - n28 & -((long)n28) >> 63 | l16 >>> n28;
                    l16 = (long)(n18 & 0x7F) * 0x101010101010101L ^ l17;
                    for (l16 = (l16 ^ 0xFFFFFFFFFFFFFFFFL) & l16 - 0x101010101010101L & 0x8080808080808080L; l16 != 0L; l16 &= l16 - 1L) {
                        n28 = (Long.numberOfTrailingZeros(l16) >> 3) + n26 & n19;
                        if (this.b[n28] != n16) continue;
                        n16 = n28;
                        break block4;
                    }
                    if ((l17 & (l17 ^ 0xFFFFFFFFFFFFFFFFL) << 6 & 0x8080808080808080L) == 0L) break block5;
                    n16 = -1;
                }
                return n16 >= 0;
            }
            n26 = n26 + (n17 += 8) & n19;
        }
    }

    public final Object b(int n16) {
        int n17 = Integer.hashCode(n16) * -862048943;
        int n18 = n17 ^ n17 << 16;
        int n19 = this.d;
        int n26 = n18 >>> 7 & n19;
        n17 = 0;
        while (true) {
            block7: {
                block6: {
                    long[] lArray = this.a;
                    int n27 = n26 >> 3;
                    int n28 = (n26 & 7) << 3;
                    long l16 = lArray[n27];
                    long l17 = lArray[n27 + 1] << 64 - n28 & -((long)n28) >> 63 | l16 >>> n28;
                    l16 = (long)(n18 & 0x7F) * 0x101010101010101L ^ l17;
                    for (l16 = (l16 ^ 0xFFFFFFFFFFFFFFFFL) & l16 - 0x101010101010101L & 0x8080808080808080L; l16 != 0L; l16 &= l16 - 1L) {
                        n27 = (Long.numberOfTrailingZeros(l16) >> 3) + n26 & n19;
                        if (this.b[n27] != n16) continue;
                        n16 = n27;
                        break block6;
                    }
                    if ((l17 & (l17 ^ 0xFFFFFFFFFFFFFFFFL) << 6 & 0x8080808080808080L) == 0L) break block7;
                    n16 = -1;
                }
                if (n16 >= 0) {
                    return this.c[n16];
                }
                return null;
            }
            n26 = n26 + (n17 += 8) & n19;
        }
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof e02)) {
            return false;
        }
        e02 e022 = (e02)object;
        if (e022.e != this.e) {
            return false;
        }
        int[] nArray = this.b;
        Object[] objectArray = this.c;
        long[] lArray = this.a;
        int n16 = lArray.length - 2;
        if (n16 >= 0) {
            int n17 = 0;
            while (true) {
                long l16;
                if ((((l16 = lArray[n17]) ^ 0xFFFFFFFFFFFFFFFFL) << 7 & l16 & 0x8080808080808080L) != -9187201950435737472L) {
                    int n18 = 8 - (~(n17 - n16) >>> 31);
                    for (int i16 = 0; i16 < n18; ++i16) {
                        if ((0xFFL & l16) < 128L) {
                            int n19 = (n17 << 3) + i16;
                            int n26 = nArray[n19];
                            object = objectArray[n19];
                            if (object == null ? e022.b(n26) != null || !e022.a(n26) : !object.equals(e022.b(n26))) {
                                return false;
                            }
                        }
                        l16 >>= 8;
                    }
                    if (n18 != 8) break;
                }
                if (n17 == n16) break;
                ++n17;
            }
        }
        return true;
    }

    public final int hashCode() {
        int[] nArray = this.b;
        Object[] objectArray = this.c;
        long[] lArray = this.a;
        int n16 = lArray.length - 2;
        if (n16 >= 0) {
            int n17;
            int n18 = 0;
            int n19 = 0;
            while (true) {
                long l16 = lArray[n18];
                n17 = n19;
                if (((l16 ^ 0xFFFFFFFFFFFFFFFFL) << 7 & l16 & 0x8080808080808080L) != -9187201950435737472L) {
                    int n26 = 8 - (~(n18 - n16) >>> 31);
                    for (n17 = 0; n17 < n26; ++n17) {
                        int n27 = n19;
                        if ((0xFFL & l16) < 128L) {
                            n27 = (n18 << 3) + n17;
                            int n28 = nArray[n27];
                            Object object = objectArray[n27];
                            n28 = Integer.hashCode(n28);
                            n27 = object != null ? object.hashCode() : 0;
                            n27 = n19 + (n27 ^ n28);
                        }
                        l16 >>= 8;
                        n19 = n27;
                    }
                    if (n26 == 8) {
                        n17 = n19;
                    } else {
                        return n19;
                    }
                }
                if (n18 == n16) break;
                ++n18;
                n19 = n17;
            }
            return n17;
        }
        return 0;
    }

    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder("{");
        int[] nArray = this.b;
        Object[] objectArray = this.c;
        long[] lArray = this.a;
        int n16 = lArray.length - 2;
        if (n16 >= 0) {
            int n17 = 0;
            int n18 = 0;
            while (true) {
                long l16 = lArray[n17];
                int n19 = n18;
                if (((l16 ^ 0xFFFFFFFFFFFFFFFFL) << 7 & l16 & 0x8080808080808080L) != -9187201950435737472L) {
                    int n26 = 8 - (~(n17 - n16) >>> 31);
                    for (n19 = 0; n19 < n26; ++n19) {
                        int n27 = n18;
                        if ((0xFFL & l16) < 128L) {
                            n27 = (n17 << 3) + n19;
                            int n28 = nArray[n27];
                            Object object = objectArray[n27];
                            stringBuilder.append(n28);
                            stringBuilder.append("=");
                            Object object2 = object;
                            if (object == this) {
                                object2 = "(this)";
                            }
                            stringBuilder.append(object2);
                            n27 = ++n18;
                            if (n18 < this.e) {
                                stringBuilder.append(", ");
                                n27 = n18;
                            }
                        }
                        l16 >>= 8;
                        n18 = n27;
                    }
                    if (n26 != 8) break;
                    n19 = n18;
                }
                if (n17 == n16) break;
                ++n17;
                n18 = n19;
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


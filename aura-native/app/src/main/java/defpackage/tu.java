/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.qv4;
import defpackage.rr2;
import java.util.Arrays;

public final class tu {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public tu() {
        this.c = new long[10];
        this.d = new Object[10];
    }

    public tu(int n16, int n17) {
        switch (n17) {
            default: {
                this.c = new qv4[n16];
                this.b = 0;
                return;
            }
            case 2: 
        }
        this.b = -1;
        this.a = n16;
    }

    public tu(int n16, int n17, float[] fArray, float[] fArray2) {
        this.a = n16;
        boolean bl5 = (long)fArray.length * 2L == (long)fArray2.length * 3L;
        rr2.l(bl5);
        this.c = fArray;
        this.d = fArray2;
        this.b = n17;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(long l16, Object object) {
        synchronized (this) {
            int n16;
            int n17;
            int n18 = this.b;
            if (n18 > 0 && l16 <= ((long[])this.c)[((n17 = this.a) + n18 - 1) % (n16 = ((Object[])this.d).length)]) {
                this.b();
            }
            this.c();
            n18 = this.a;
            n16 = this.b;
            Object[] objectArray = (Object[])this.d;
            n18 = (n18 + n16) % objectArray.length;
            ((long[])this.c)[n18] = l16;
            objectArray[n18] = object;
            this.b = n16 + 1;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        synchronized (this) {
            this.a = 0;
            this.b = 0;
            Arrays.fill((Object[])this.d, null);
            return;
        }
    }

    public void c() {
        int n16 = ((Object[])this.d).length;
        if (this.b < n16) {
            return;
        }
        int n17 = n16 * 2;
        long[] lArray = new long[n17];
        Object[] objectArray = new Object[n17];
        n17 = this.a;
        System.arraycopy((long[])this.c, n17, lArray, 0, n16 -= n17);
        System.arraycopy((Object[])this.d, this.a, objectArray, 0, n16);
        n17 = this.a;
        if (n17 > 0) {
            System.arraycopy((long[])this.c, 0, lArray, n16, n17);
            System.arraycopy((Object[])this.d, 0, objectArray, n16, this.a);
        }
        this.c = lArray;
        this.d = objectArray;
        this.a = 0;
    }

    public Object d(boolean bl5, long l16) {
        long l17;
        Object object = null;
        long l18 = Long.MAX_VALUE;
        while (this.b > 0 && ((l17 = l16 - ((long[])this.c)[this.a]) >= 0L || !bl5 && -l17 < l18)) {
            object = this.g();
            l18 = l17;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object e() {
        synchronized (this) {
            if (this.b != 0) return this.g();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object f(long l16) {
        synchronized (this) {
            return this.d(true, l16);
        }
    }

    public Object g() {
        boolean bl5 = this.b > 0;
        rr2.w(bl5);
        Object[] objectArray = (Object[])this.d;
        int n16 = this.a;
        Object object = objectArray[n16];
        objectArray[n16] = null;
        this.a = (n16 + 1) % objectArray.length;
        --this.b;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int h() {
        synchronized (this) {
            return this.b;
        }
    }
}


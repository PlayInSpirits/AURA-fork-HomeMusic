/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ei5;
import defpackage.gi5;
import defpackage.o15;
import java.util.Iterator;

public final class qi5
extends gi5 {
    public static final Object[] v;
    public static final qi5 w;
    public final transient Object[] q;
    public final transient int r;
    public final transient Object[] s;
    public final transient int t;
    public final transient int u;

    static {
        Object[] objectArray = new Object[]{};
        v = objectArray;
        w = new qi5(0, 0, 0, objectArray, objectArray);
    }

    public qi5(int n16, int n17, int n18, Object[] objectArray, Object[] objectArray2) {
        this.q = objectArray;
        this.r = n16;
        this.s = objectArray2;
        this.t = n17;
        this.u = n18;
    }

    @Override
    public final int a(Object[] objectArray) {
        Object[] objectArray2 = this.q;
        int n16 = this.u;
        System.arraycopy(objectArray2, 0, objectArray, 0, n16);
        return n16;
    }

    @Override
    public final int b() {
        return this.u;
    }

    @Override
    public final boolean contains(Object object) {
        Object[] objectArray;
        if (object != null && (objectArray = this.s).length != 0) {
            Object object2;
            int n16 = (int)((long)Integer.rotateLeft((int)((long)object.hashCode() * -862048943L), 15) * 461845907L);
            while ((object2 = objectArray[n16 &= this.t]) != null) {
                if (object2.equals(object)) {
                    return true;
                }
                ++n16;
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return 0;
    }

    @Override
    public final o15 e() {
        return this.i().k(0);
    }

    @Override
    public final Object[] f() {
        return this.q;
    }

    @Override
    public final int hashCode() {
        return this.r;
    }

    @Override
    public final Iterator iterator() {
        return this.i().k(0);
    }

    @Override
    public final ei5 j() {
        Object[] objectArray = this.q;
        return ei5.i(this.u, objectArray);
    }

    @Override
    public final int size() {
        return this.u;
    }
}


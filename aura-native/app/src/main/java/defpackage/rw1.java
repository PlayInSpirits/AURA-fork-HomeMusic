/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.gy3;
import defpackage.o15;
import defpackage.vw1;
import defpackage.yw1;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

public abstract class rw1
extends AbstractCollection
implements Serializable {
    public static final Object[] n = new Object[0];

    public yw1 a() {
        if (this.isEmpty()) {
            vw1 vw12 = yw1.o;
            return gy3.r;
        }
        Object[] objectArray = this.toArray(n);
        vw1 vw13 = yw1.o;
        return yw1.i(objectArray.length, objectArray);
    }

    @Override
    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int b(int n16, Object[] objectArray) {
        o15 o152 = this.h();
        while (o152.hasNext()) {
            objectArray[n16] = o152.next();
            ++n16;
        }
        return n16;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract boolean contains(Object var1);

    public Object[] d() {
        return null;
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean g();

    public abstract o15 h();

    @Override
    public Iterator iterator() {
        return this.h();
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(n);
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        Object[] objectArray2;
        objectArray.getClass();
        int n16 = this.size();
        if (objectArray.length < n16) {
            objectArray2 = this.d();
            if (objectArray2 != null) {
                return Arrays.copyOfRange(objectArray2, this.f(), this.e(), objectArray.getClass());
            }
            if (objectArray.length != 0) {
                objectArray = Arrays.copyOf(objectArray, 0);
            }
            objectArray2 = Arrays.copyOf(objectArray, n16);
        } else {
            objectArray2 = objectArray;
            if (objectArray.length > n16) {
                objectArray[n16] = null;
                objectArray2 = objectArray;
            }
        }
        this.b(0, objectArray2);
        return objectArray2;
    }
}


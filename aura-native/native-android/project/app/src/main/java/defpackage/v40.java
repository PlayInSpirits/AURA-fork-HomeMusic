package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v40 extends u40 {
    public static void n0(Iterable iterable, AbstractCollection abstractCollection) {
        abstractCollection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static final boolean o0(Iterable iterable, if1 if1Var, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) if1Var.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean p0(List list, if1 if1Var) {
        int i;
        list.getClass();
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof x32) || (list instanceof y32)) {
                return o0(list, if1Var, true);
            }
            jz4.M(list, "kotlin.collections.MutableIterable");
            throw null;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) if1Var.invoke(obj)).booleanValue()) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int size2 = list.size() - 1;
        if (i <= size2) {
            while (true) {
                list.remove(size2);
                if (size2 == i) {
                    break;
                }
                size2--;
            }
        }
        return true;
    }

    public static Object q0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        kf2.m("List is empty.");
        return null;
    }

    public static Object r0(AbstractList abstractList) {
        abstractList.getClass();
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }
}

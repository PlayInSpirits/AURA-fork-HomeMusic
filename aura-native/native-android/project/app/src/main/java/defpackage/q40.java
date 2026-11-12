package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class q40 extends v40 {
    public static String B0(Iterable iterable, String str, String str2, String str3, if1 if1Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            if1Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        z0(iterable, sb, str4, str5, str6, "...", if1Var);
        return sb.toString();
    }

    public static Object C0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        kf2.m("List is empty.");
        return null;
    }

    public static Object D0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable E0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList F0(Object obj, Collection collection) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList G0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            v40.n0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List H0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return Q0(iterable);
        }
        List listS0 = S0(iterable);
        Collections.reverse(listS0);
        return listS0;
    }

    public static Object I0(List list) {
        int size = list.size();
        if (size == 0) {
            kf2.m("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        kf2.n("List has more than one element.");
        return null;
    }

    public static List J0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listS0 = S0(iterable);
            u40.l0(listS0);
            return listS0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Q0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List K0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listS0 = S0(iterable);
            u40.m0(listS0, comparator);
            return listS0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Q0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List L0(List list, int i) {
        list.getClass();
        if (i < 0) {
            kf2.e(b11.j(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return u01.n;
        }
        if (i >= list.size()) {
            return Q0(list);
        }
        if (i == 1) {
            return gb.O(v0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return gb.R(arrayList);
    }

    public static List M0(List list, int i) {
        if (i < 0) {
            kf2.e(b11.j(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return u01.n;
        }
        int size = list.size();
        if (i >= size) {
            return Q0(list);
        }
        if (i == 1) {
            return gb.O(C0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] N0(List list) {
        list.getClass();
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static final void O0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] P0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List Q0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return gb.R(S0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return u01.n;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return gb.O(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList R0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List S0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        O0(iterable, arrayList);
        return arrayList;
    }

    public static Set T0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return kb4.S(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(lg2.W(collection.size()));
                O0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            O0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : kb4.S(linkedHashSet2.iterator().next());
            }
        }
        return z01.n;
    }

    public static boolean s0(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    gb.c0();
                    throw null;
                }
                if (h12.c(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static List t0(ArrayList arrayList) {
        return Q0(new LinkedHashSet(arrayList));
    }

    public static List u0(Iterable iterable, int i) {
        ArrayList arrayList;
        Object objC0;
        if (i < 0) {
            kf2.e(b11.j(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return Q0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return u01.n;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    objC0 = C0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        kf2.m("Collection is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objC0 = next;
                }
                return gb.O(objC0);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return gb.R(arrayList);
    }

    public static Object v0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return w0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        kf2.m("Collection is empty.");
        return null;
    }

    public static Object w0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        kf2.m("List is empty.");
        return null;
    }

    public static Object x0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object y0(List list, int i) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void z0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, if1 if1Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            si0.j(sb, obj, if1Var);
        }
        sb.append(charSequence3);
    }
}

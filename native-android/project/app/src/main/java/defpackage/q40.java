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
    public static /* synthetic */ void A0(ArrayList r7, StringBuilder r8) {
        z0(r7, r8, "\n", "", "", "...", null);
    }

    public static String B0(Iterable r7, String r8, String r9, String r10, if1 r11, int r12) {
        if ((r12 & 1) == 0) goto L5;
        r8 = ", ";
    L5:
        String r2 = r8;
        if ((r12 & 2) == 0) goto L8;
        String r3 = "";
    L10:
        if ((r12 & 4) == 0) goto L12;
        String r4 = "";
    L14:
        if ((r12 & 32) == 0) goto L16;
        r11 = null;
    L16:
        r7.getClass();
        StringBuilder r1 = new StringBuilder();
        z0(r7, r1, r2, r3, r4, "...", r11);
        return r1.toString();
    L12:
        r4 = r10;
        goto L14
    L8:
        r3 = r9;
        goto L10
    }

    public static Object C0(List r1) {
        r1.getClass();
        if (r1.isEmpty() == false) goto L5;
        kf2.m("List is empty.");
        return null;
    L5:
        return r1.get(r1.size() - 1);
    }

    public static Object D0(List r1) {
        r1.getClass();
        if (r1.isEmpty() == false) goto L7;
        return null;
    L7:
        return r1.get(r1.size() - 1);
    }

    public static Comparable E0(ArrayList r3) {
        Iterator r4 = r3.iterator();
        if (r4.hasNext() == true) goto L6;
        return null;
    L6:
        Comparable r0 = (Comparable) r4.next();
    L8:
        if (r4.hasNext() == false) goto L12;
        Comparable r1 = (Comparable) r4.next();
        if (r0.compareTo(r1) >= 0) goto L8;
        r0 = r1;
        goto L8
    L12:
        return r0;
    }

    public static ArrayList F0(Object r2, Collection r3) {
        r3.getClass();
        ArrayList r0 = new ArrayList(r3.size() + 1);
        r0.addAll(r3);
        r0.add(r2);
        return r0;
    }

    public static ArrayList G0(Collection r3, Iterable r4) {
        r3.getClass();
        r4.getClass();
        if ((r4 instanceof Collection) == false) goto L6;
        int r1 = r3.size();
        Collection r5 = (Collection) r4;
        ArrayList r0 = new ArrayList(r5.size() + r1);
        r0.addAll(r3);
        r0.addAll(r5);
        return r0;
    L6:
        ArrayList r2 = new ArrayList(r3);
        v40.n0(r4, r2);
        return r2;
    }

    public static List H0(Iterable r2) {
        r2.getClass();
        if ((r2 instanceof Collection) == true) goto L5;
    L8:
        List r3 = S0(r2);
        Collections.reverse(r3);
        return r3;
    L5:
        if (((Collection) r2).size() > 1) goto L8;
        return Q0(r2);
    }

    public static Object I0(List r3) {
        int r0 = r3.size();
        if (r0 != 0) goto L5;
        kf2.m("List is empty.");
        return null;
    L5:
        if (r0 == 1) goto L7;
        kf2.n("List has more than one element.");
        return null;
    L7:
        return r3.get(0);
    }

    public static List J0(Iterable r3) {
        r3.getClass();
        if ((r3 instanceof Collection) == false) goto L13;
        Collection r0 = (Collection) r3;
        if (r0.size() <= 1) goto L7;
        Object[] r4 = r0.toArray(new Comparable[0]);
        Comparable[] r1 = (Comparable[]) r4;
        r1.getClass();
        if (r1.length <= 1) goto L11;
        Arrays.sort(r1);
    L11:
        r4.getClass();
        List r5 = Arrays.asList(r4);
        r5.getClass();
        return r5;
    L7:
        return Q0(r3);
    L13:
        List r6 = S0(r3);
        u40.l0(r6);
        return r6;
    }

    public static List K0(Iterable r3, Comparator r4) {
        r3.getClass();
        if ((r3 instanceof Collection) == false) goto L13;
        Collection r0 = (Collection) r3;
        if (r0.size() <= 1) goto L7;
        Object[] r5 = r0.toArray(new Object[0]);
        r5.getClass();
        if (r5.length <= 1) goto L11;
        Arrays.sort(r5, r4);
    L11:
        List r6 = Arrays.asList(r5);
        r6.getClass();
        return r6;
    L7:
        return Q0(r3);
    L13:
        List r7 = S0(r3);
        u40.m0(r7, r4);
        return r7;
    }

    public static List L0(List r4, int r5) {
        r4.getClass();
        if (r5 < 0) goto L22;
        if (r5 != 0) goto L8;
        return u01.n;
    L8:
        if (r5 < r4.size()) goto L12;
        return Q0(r4);
    L12:
        if (r5 == 1) goto L14;
        ArrayList r1 = new ArrayList(r5);
        Iterator r6 = r4.iterator();
        int r2 = 0;
    L17:
        if (r6.hasNext() == false) goto L21;
        r1.add(r6.next());
        r2 = r2 + 1;
        if (r2 != r5) goto L17;
    L21:
        return gb.R(r1);
    L14:
        return gb.O(v0(r4));
    L22:
        kf2.e(b11.j(r5, "Requested element count ", " is less than zero."));
        return null;
    }

    public static List M0(List r3, int r4) {
        if (r4 < 0) goto L24;
        if (r4 == 0) goto L5;
        int r0 = r3.size();
        if (r4 < r0) goto L11;
        return Q0(r3);
    L11:
        if (r4 == 1) goto L13;
        ArrayList r1 = new ArrayList(r4);
        if ((r3 instanceof RandomAccess) == false) goto L19;
        int r5 = r0 - r4;
    L17:
        if (r5 >= r0) goto L23;
        r1.add(r3.get(r5));
        r5 = r5 + 1;
    L23:
        return r1;
    L19:
        ListIterator r6 = r3.listIterator(r0 - r4);
    L21:
        if (r6.hasNext() == false) goto L23;
        r1.add(r6.next());
        goto L21
    L13:
        return gb.O(C0(r3));
    L5:
        return u01.n;
    L24:
        kf2.e(b11.j(r4, "Requested element count ", " is less than zero."));
        return null;
    }

    public static boolean[] N0(List r4) {
        r4.getClass();
        boolean[] r0 = new boolean[r4.size()];
        Iterator r5 = r4.iterator();
        int r1 = 0;
    L4:
        if (r5.hasNext() == false) goto L6;
        r0[r1] = ((Boolean) r5.next()).booleanValue();
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    public static final void O0(Iterable r1, AbstractCollection r2) {
        r1.getClass();
        Iterator r3 = r1.iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        r2.add(r3.next());
        goto L4
    }

    public static int[] P0(List r4) {
        r4.getClass();
        int[] r0 = new int[r4.size()];
        Iterator r5 = r4.iterator();
        int r1 = 0;
    L4:
        if (r5.hasNext() == false) goto L6;
        r0[r1] = ((Number) r5.next()).intValue();
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    public static List Q0(Iterable r3) {
        r3.getClass();
        if ((r3 instanceof Collection) == false) goto L19;
        Collection r0 = (Collection) r3;
        int r1 = r0.size();
        if (r1 == 0) goto L17;
        if (r1 == 1) goto L11;
        return new ArrayList(r0);
    L11:
        if ((r3 instanceof List) == false) goto L13;
        Object r4 = ((List) r3).get(0);
    L15:
        return gb.O(r4);
    L13:
        r4 = r0.iterator().next();
        goto L15
    L17:
        return u01.n;
    L19:
        return gb.R(S0(r3));
    }

    public static ArrayList R0(Collection r1) {
        r1.getClass();
        return new ArrayList(r1);
    }

    public static final List S0(Iterable r1) {
        r1.getClass();
        if ((r1 instanceof Collection) == true) goto L5;
        ArrayList r0 = new ArrayList();
        O0(r1, r0);
        return r0;
    L5:
        return new ArrayList((Collection) r1);
    }

    public static Set T0(Iterable r3) {
        r3.getClass();
        if ((r3 instanceof Collection) == false) goto L15;
        Collection r0 = (Collection) r3;
        int r2 = r0.size();
        if (r2 == 0) goto L22;
        if (r2 == 1) goto L10;
        LinkedHashSet r1 = new LinkedHashSet(lg2.W(r0.size()));
        O0(r3, r1);
        return r1;
    L10:
        if ((r3 instanceof List) == false) goto L12;
        Object r4 = ((List) r3).get(0);
    L14:
        return kb4.S(r4);
    L12:
        r4 = r0.iterator().next();
    L22:
        return z01.n;
    L15:
        LinkedHashSet r5 = new LinkedHashSet();
        O0(r3, r5);
        int r6 = r5.size();
        if (r6 == 0) goto L22;
        if (r6 == 1) goto L20;
        return r5;
    L20:
        return kb4.S(r5.iterator().next());
    }

    public static boolean s0(Iterable r3, Object r4) {
        r3.getClass();
        if ((r3 instanceof Collection) == false) goto L7;
        return ((Collection) r3).contains(r4);
    L7:
        if ((r3 instanceof List) == false) goto L9;
        int r5 = ((List) r3).indexOf(r4);
    L21:
        if (r5 < 0) goto L24;
        return true;
    L24:
        return false;
    L9:
        Iterator r6 = r3.iterator();
        int r0 = 0;
    L11:
        if (r6.hasNext() == false) goto L20;
        Object r2 = r6.next();
        if (r0 < 0) goto L18;
        if (h12.c(r4, r2) == true) goto L16;
        r0 = r0 + 1;
        goto L11
    L16:
        r5 = r0;
        goto L21
    L18:
        gb.c0();
        throw null;
    L20:
        r5 = -1;
        goto L21
    }

    public static List t0(ArrayList r1) {
        return Q0(new LinkedHashSet(r1));
    }

    public static List u0(Iterable r3, int r4) {
        if (r4 < 0) goto L51;
        if (r4 != 0) goto L8;
        return Q0(r3);
    L8:
        if ((r3 instanceof Collection) == false) goto L41;
        int r1 = ((Collection) r3).size() - r4;
        if (r1 > 0) goto L14;
        return u01.n;
    L14:
        if (r1 == 1) goto L16;
        ArrayList r0 = new ArrayList(r1);
        if ((r3 instanceof List) == true) goto L32;
    L42:
        Iterator r5 = r3.iterator();
        int r2 = 0;
    L44:
        if (r5.hasNext() == false) goto L50;
        Object r6 = r5.next();
        if (r2 >= r4) goto L47;
        r2 = r2 + 1;
        goto L44
    L47:
        r0.add(r6);
        goto L44
    L50:
        return gb.R(r0);
    L32:
        if ((r3 instanceof RandomAccess) == false) goto L36;
        List r7 = (List) r3;
        int r8 = r7.size();
    L34:
        if (r4 >= r8) goto L40;
        r0.add(r7.get(r4));
        r4 = r4 + 1;
    L40:
        return r0;
    L36:
        ListIterator r9 = ((List) r3).listIterator(r4);
    L38:
        if (r9.hasNext() == false) goto L40;
        r0.add(r9.next());
        goto L38
    L16:
        if ((r3 instanceof List) == false) goto L18;
        Object r10 = C0((List) r3);
    L26:
        return gb.O(r10);
    L18:
        Iterator r11 = r3.iterator();
        if (r11.hasNext() == false) goto L27;
        Object r12 = r11.next();
    L22:
        if (r11.hasNext() == false) goto L24;
        r12 = r11.next();
        goto L22
    L24:
        r10 = r12;
        goto L26
    L27:
        kf2.m("Collection is empty.");
        return null;
    L41:
        r0 = new ArrayList();
        goto L42
    L51:
        kf2.e(b11.j(r4, "Requested element count ", " is less than zero."));
        return null;
    }

    public static Object v0(Iterable r1) {
        r1.getClass();
        if ((r1 instanceof List) == true) goto L5;
        Iterator r2 = r1.iterator();
        if (r2.hasNext() == true) goto L9;
        kf2.m("Collection is empty.");
        return null;
    L9:
        return r2.next();
    L5:
        return w0((List) r1);
    }

    public static Object w0(List r1) {
        r1.getClass();
        if (r1.isEmpty() == false) goto L5;
        kf2.m("List is empty.");
        return null;
    L5:
        return r1.get(0);
    }

    public static Object x0(List r1) {
        r1.getClass();
        if (r1.isEmpty() == false) goto L7;
        return null;
    L7:
        return r1.get(0);
    }

    public static Object y0(List r1, int r2) {
        r1.getClass();
        if (r2 >= 0) goto L5;
        return null;
    L5:
        if (r2 < r1.size()) goto L7;
        return null;
    L7:
        return r1.get(r2);
    }

    public static final void z0(Iterable r1, StringBuilder r2, CharSequence r3, CharSequence r4, CharSequence r5, CharSequence r6, if1 r7) {
        r1.getClass();
        r2.append(r4);
        Iterator r8 = r1.iterator();
        int r9 = 0;
    L4:
        if (r8.hasNext() == false) goto L9;
        Object r10 = r8.next();
        r9 = r9 + 1;
        if (r9 <= 1) goto L8;
        r2.append(r3);
    L8:
        si0.j(r2, r10, r7);
        goto L4
    L9:
        r2.append(r5);
    }
}

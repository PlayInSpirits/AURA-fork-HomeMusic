package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ji5 extends fi5 implements NavigableMap {
    public static final ji5 s = null;
    public final transient ri5 p;
    public final transient ei5 q;
    public final transient ji5 r;

    static {
        ri5 r0 = ki5.m(ni5.o);
        xh5 r2 = ei5.o;
        s = new ji5(r0, pi5.r, null);
    }

    public ji5(ri5 r1, ei5 r2, ji5 r3) {
        this.p = r1;
        this.q = r2;
        this.r = r3;
    }

    public static ji5 b(TreeMap r11) {
        ni5 r0 = ni5.o;
        Comparator r1 = r11.comparator();
        int r2 = 1;
        int r3 = 0;
        if (r1 != null) goto L5;
    L4:
        boolean r4 = true;
    L7:
        Collection r12 = r11.entrySet();
        if ((r12 instanceof Collection) == true) goto L14;
        Iterator r13 = r12.iterator();
        ArrayList r5 = new ArrayList();
        r13.getClass();
    L11:
        if (r13.hasNext() == false) goto L13;
        r5.add(r13.next());
        goto L11
    L13:
        r12 = r5;
    L14:
        Map.Entry[] r14 = (Map.Entry[]) r12.toArray(fi5.o);
        int r6 = r14.length;
        if (r6 == 0) goto L49;
        if (r6 == 1) goto L31;
        Object[] r7 = new Object[r6];
        Object[] r8 = new Object[r6];
        if (r4 == false) goto L22;
    L20:
        if (r3 >= r6) goto L30;
        Map.Entry r9 = r14[r3];
        Objects.requireNonNull(r9);
        Object r10 = r9.getKey();
        Object r15 = r9.getValue();
        fh0.B(r10, r15);
        r7[r3] = r10;
        r8[r3] = r15;
        r3 = r3 + 1;
    L30:
        return new ji5(new ri5(ei5.i(r6, r7), r0), ei5.i(r6, r8), null);
    L22:
        Arrays.sort(r14, 0, r6, new jb2(11));
        Map.Entry r16 = r14[0];
        Objects.requireNonNull(r16);
        Object r17 = r16.getKey();
        r7[0] = r17;
        Object r18 = r16.getValue();
        r8[0] = r18;
        fh0.B(r7[0], r18);
    L23:
        if (r2 >= r6) goto L30;
        Map.Entry r19 = r14[r2 - 1];
        Objects.requireNonNull(r19);
        Map.Entry r20 = r14[r2];
        Objects.requireNonNull(r20);
        Object r21 = r20.getKey();
        Object r110 = r20.getValue();
        fh0.B(r21, r110);
        r7[r2] = r21;
        r8[r2] = r110;
        if (r0.compare(r17, r21) == 0) goto L28;
        r2 = r2 + 1;
        r17 = r21;
        goto L23
    L28:
        throw new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(r19) + " and " + String.valueOf(r20));
    L31:
        Map.Entry r111 = r14[0];
        Objects.requireNonNull(r111);
        Object r22 = r111.getKey();
        Object r112 = r111.getValue();
        Object[] r23 = {r22};
        int r24 = 0;
    L33:
        if (r24 >= 1) goto L39;
        if (r23[r24] == null) goto L37;
        r24 = r24 + 1;
        goto L33
    L37:
        nz2.n(f34.f(r24, "at index "));
        return null;
    L39:
        ri5 r25 = new ri5(ei5.i(1, r23), r0);
        Object[] r113 = {r112};
    L40:
        if (r3 >= 1) goto L47;
        if (r113[r3] == null) goto L44;
        r3 = r3 + 1;
        goto L40
    L44:
        nz2.n(f34.f(r3, "at index "));
        return null;
    L47:
        return new ji5(r25, ei5.i(1, r113), null);
    L49:
        return c(r0);
    L5:
        if (r0 == r1) goto L4;
        r4 = false;
        goto L7
    }

    public static ji5 c(Comparator r3) {
        if (ni5.o == r3) goto L7;
        ri5 r4 = ki5.m(r3);
        xh5 r1 = ei5.o;
        return new ji5(r4, pi5.r, null);
    L7:
        return s;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object r2) {
        return f(r2, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object r1) {
        Map.Entry r0 = ceilingEntry(r1);
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.p.q;
    }

    public final ji5 d(Object r2, boolean r3) {
        r2.getClass();
        return g(0, this.p.n(r2, r3));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.p.k();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        ji5 r0 = this.r;
        if (r0 != null) goto L14;
        boolean r1 = isEmpty();
        ri5 r2 = this.p;
        if (r1 == false) goto L13;
        Comparator r3 = r2.q;
        if ((r3 instanceof oi5) == false) goto L9;
        oi5 r4 = (oi5) r3;
    L11:
        return c(r4.a());
    L9:
        r4 = new vh5(r3);
        goto L11
    L13:
        return new ji5((ri5) r2.k(), this.q.g(), this);
    L14:
        return r0;
    }

    public final ji5 e(Object r2, boolean r3, Object r4, boolean r5) {
        r2.getClass();
        r4.getClass();
        if (this.p.q.compare(r2, r4) <= 0) goto L5;
        kf2.n(hw.S("expected fromKey <= toKey but %s > %s", new Object[]{r2, r4}));
        return null;
    L5:
        return d(r4, r5).f(r2, r3);
    }

    public final ji5 f(Object r2, boolean r3) {
        r2.getClass();
        return g(this.p.o(r2, r3), this.q.size());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty() == false) goto L7;
        return null;
    L7:
        return (Map.Entry) a().i().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.p.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object r2) {
        return d(r2, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object r1) {
        Map.Entry r0 = floorEntry(r1);
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getKey();
    }

    public final ji5 g(int r3, int r4) {
        ei5 r0 = this.q;
        if (r3 == 0) goto L5;
    L8:
        ri5 r2 = this.p;
        if (r3 != r4) goto L13;
        return c(r2.q);
    L13:
        return new ji5(r2.p(r3, r4), r0.h(r3, r4), null);
    L5:
        if (r4 == r0.size()) goto L7;
        r3 = 0;
        goto L8
    L7:
        return this;
    }

    @Override // defpackage.fi5, java.util.Map
    public final Object get(Object r4) {
        ri5 r0 = this.p;
        if (r4 != null) goto L14;
    L4:
        int r5 = -1;
    L8:
        if (r5 != (-1)) goto L12;
        return null;
    L12:
        return this.q.get(r5);
    L14:
        r5 = Collections.binarySearch(r0.s, r4, r0.q);     // Catch: ClassCastException -> L13
        if (r5 >= 0) goto L8;
        goto L8
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object r2) {
        return d(r2, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object r2) {
        return f(r2, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object r1) {
        Map.Entry r0 = higherEntry(r1);
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getKey();
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.p;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty() == false) goto L7;
        return null;
    L7:
        return (Map.Entry) a().i().get(this.q.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.p.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object r2) {
        return d(r2, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object r1) {
        Map.Entry r0 = lowerEntry(r1);
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.p;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.q.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object r3, Object r4) {
        return e(r3, true, r4, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object r2) {
        return f(r2, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.q;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap headMap(Object r1, boolean r2) {
        return d(r1, r2);
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap tailMap(Object r1, boolean r2) {
        return f(r1, r2);
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap subMap(Object r1, boolean r2, Object r3, boolean r4) {
        return e(r1, r2, r3, r4);
    }
}

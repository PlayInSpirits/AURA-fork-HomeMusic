package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tg2 extends a1 {
    public final /* synthetic */ int n;
    public final Object o;

    public tg2(List r2) {
        this.n = 1;
        r2.getClass();
        this.o = r2;
    }

    @Override // defpackage.y
    public final int a() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((List) r1).size();
    L7:
        return ((Matcher) ((jv3) r1).n).groupCount() + 1;
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.contains(r2);
    L7:
        if ((r2 instanceof String) == true) goto L10;
        return false;
    L10:
        return super.contains((String) r2);
    }

    @Override // java.util.List
    public final Object get(int r5) {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        List r2 = (List) r1;
        if (r5 >= 0) goto L7;
    L10:
        StringBuilder r6 = f34.j(r5, "Element index ", " must be in range [");
        r6.append(new j02(0, gb.E(this), 1));
        r6.append("].");
        throw new IndexOutOfBoundsException(r6.toString());
    L7:
        if (r5 > gb.E(this)) goto L10;
        return r2.get(gb.E(this) - r5);
    L12:
        String r4 = ((Matcher) ((jv3) r1).n).group(r5);
        if (r4 != null) goto L16;
        return "";
    L16:
        return r4;
    }

    @Override // defpackage.a1, java.util.List
    public /* bridge */ int indexOf(Object r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.indexOf(r2);
    L7:
        if ((r2 instanceof String) == true) goto L10;
        return -1;
    L10:
        return super.indexOf((String) r2);
    }

    @Override // defpackage.a1, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch(this.n) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.iterator();
    L7:
        return new f24(this, 0);
    }

    @Override // defpackage.a1, java.util.List
    public /* bridge */ int lastIndexOf(Object r2) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.lastIndexOf(r2);
    L7:
        if ((r2 instanceof String) == true) goto L10;
        return -1;
    L10:
        return super.lastIndexOf((String) r2);
    }

    @Override // defpackage.a1, java.util.List
    public ListIterator listIterator() {
        switch(this.n) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.listIterator();
    L7:
        return new f24(this, 0);
    }

    public tg2(jv3 r2) {
        this.n = 0;
        this.o = r2;
    }

    @Override // defpackage.a1, java.util.List
    public ListIterator listIterator(int r2) {
        switch(this.n) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.listIterator(r2);
    L7:
        return new f24(this, r2);
    }
}

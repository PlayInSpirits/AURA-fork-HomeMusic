package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tg2 extends a1 {
    public final /* synthetic */ int n = 1;
    public final Object o;

    public tg2(List list) {
        list.getClass();
        this.o = list;
    }

    @Override // defpackage.y
    public final int a() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return ((Matcher) ((jv3) obj).n).groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.n) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.n;
        Object obj = this.o;
        switch (i2) {
            case 0:
                String strGroup = ((Matcher) ((jv3) obj).n).group(i);
                return strGroup == null ? "" : strGroup;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= gb.E(this)) {
                    return list.get(gb.E(this) - i);
                }
                StringBuilder sbJ = f34.j(i, "Element index ", " must be in range [");
                sbJ.append(new j02(0, gb.E(this), 1));
                sbJ.append("].");
                throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // defpackage.a1, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.n) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.a1, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.n) {
            case 1:
                return new f24(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.a1, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.n) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.a1, java.util.List
    public ListIterator listIterator() {
        switch (this.n) {
            case 1:
                return new f24(this, 0);
            default:
                return super.listIterator();
        }
    }

    public tg2(jv3 jv3Var) {
        this.o = jv3Var;
    }

    @Override // defpackage.a1, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.n) {
            case 1:
                return new f24(this, i);
            default:
                return super.listIterator(i);
        }
    }
}

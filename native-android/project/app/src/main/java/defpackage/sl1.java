package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sl1 {
    public final ArrayList a = new ArrayList(20);

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        e35.G(str);
        e35.H(str2, str);
        e35.p(this, str, str2);
    }

    public final void b(String str) {
        int iR0 = qm4.r0(str, ':', 1, 4);
        if (iR0 != -1) {
            e35.p(this, str.substring(0, iR0), str.substring(iR0 + 1));
        } else if (str.charAt(0) == ':') {
            e35.p(this, "", str.substring(1));
        } else {
            e35.p(this, "", str);
        }
    }

    public final tl1 c() {
        return new tl1((String[]) this.a.toArray(new String[0]));
    }

    public final String d(String str) {
        str.getClass();
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 2;
        int iN = q05.n(size, 0, -2);
        if (iN > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iN) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public final void e(String str) {
        str.getClass();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}

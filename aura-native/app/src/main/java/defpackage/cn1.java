package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class cn1 extends dn1 {
    public static final cn1 l;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final tb1 h;
    public final List i;
    public final Map j;
    public final List k;

    static {
        List list = Collections.EMPTY_LIST;
        l = new cn1("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public cn1(String str, List list, List list2, List list3, List list4, List list5, List list6, tb1 tb1Var, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((bn1) list2.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f = Collections.unmodifiableList(list4);
        this.g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.h = tb1Var;
        this.i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.j = Collections.unmodifiableMap(map);
        this.k = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((an1) list.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    fm4 fm4Var = (fm4) list2.get(i3);
                    if (fm4Var.o == i && fm4Var.p == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.dn1
    public final Object a(List list) {
        ArrayList c = c(this.e, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new cn1(this.a, this.b, c, list2, c(this.f, 1, list), c(this.g, 2, list), list2, this.h, this.i, this.c, this.j, this.k);
    }
}

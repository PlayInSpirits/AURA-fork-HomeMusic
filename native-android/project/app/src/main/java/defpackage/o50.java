package defpackage;

import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o50 {
    public final m50 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final boolean j;
    public final int k;
    public final int l;

    public o50(String[] strArr, boolean z) {
        byte[] bArr;
        this.j = z;
        int length = 0;
        for (String str : strArr) {
            if (this.j) {
                byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
                byte length2 = (byte) bytes.length;
                int length3 = bytes.length;
                bArr = new byte[length3 + 3];
                System.arraycopy(bytes, 0, bArr, 2, length2);
                bArr[1] = length2;
                bArr[0] = length2;
                bArr[length3 + 2] = 0;
            } else {
                char[] charArray = str.toCharArray();
                int length4 = charArray.length * 2;
                bArr = new byte[length4 + 4];
                byte[] bArrS = g12.S((short) charArray.length);
                bArr[0] = bArrS[0];
                bArr[1] = bArrS[1];
                for (int i = 0; i < charArray.length; i++) {
                    byte[] bArrJ = g12.j(charArray[i]);
                    int i2 = i * 2;
                    bArr[i2 + 2] = bArrJ[0];
                    bArr[i2 + 3] = bArrJ[1];
                }
                bArr[length4 + 2] = 0;
                bArr[length4 + 3] = 0;
            }
            Pair pair = new Pair(bArr, Collections.EMPTY_LIST);
            this.f.add(Integer.valueOf(length));
            byte[] bArr2 = (byte[]) pair.first;
            length += bArr2.length;
            this.h.add(bArr2);
            this.i.add((List) pair.second);
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int size2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            List list = (List) obj;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    this.f.add(Integer.valueOf(length));
                    throw null;
                }
                kf2.k();
                throw null;
            }
            this.g.add(Integer.valueOf(size2));
            size2 += (list.size() * 12) + 4;
        }
        int i4 = length % 4;
        int i5 = i4 == 0 ? 0 : 4 - i4;
        this.k = i5;
        int size3 = this.h.size();
        this.b = size3;
        this.c = this.h.size() - strArr.length;
        boolean z2 = this.h.size() - strArr.length > 0;
        if (!z2) {
            this.g.clear();
            this.i.clear();
        }
        int size4 = (this.g.size() * 4) + (size3 * 4) + 28;
        this.d = size4;
        int i6 = length + i5;
        this.e = z2 ? size4 + i6 : 0;
        int i7 = size4 + i6 + (z2 ? size2 : 0);
        this.l = i7;
        this.a = new m50(i7, (short) 1, (short) 28);
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream) {
        this.a.a(byteArrayOutputStream);
        byteArrayOutputStream.write(g12.b(this.b));
        byteArrayOutputStream.write(g12.b(this.c));
        int i = 0;
        byteArrayOutputStream.write(g12.b(this.j ? 256 : 0));
        byteArrayOutputStream.write(g12.b(this.d));
        byteArrayOutputStream.write(g12.b(this.e));
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            byteArrayOutputStream.write(g12.b(((Integer) obj).intValue()));
        }
        ArrayList arrayList2 = this.g;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            byteArrayOutputStream.write(g12.b(((Integer) obj2).intValue()));
        }
        ArrayList arrayList3 = this.h;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList3.get(i4);
            i4++;
            byteArrayOutputStream.write((byte[]) obj3);
        }
        int i5 = this.k;
        if (i5 > 0) {
            byteArrayOutputStream.write(new byte[i5]);
        }
        ArrayList arrayList4 = this.i;
        int size4 = arrayList4.size();
        while (i < size4) {
            Object obj4 = arrayList4.get(i);
            i++;
            Iterator it = ((List) obj4).iterator();
            if (it.hasNext()) {
                throw xa3.d(it);
            }
            byteArrayOutputStream.write(g12.b(-1));
        }
    }
}

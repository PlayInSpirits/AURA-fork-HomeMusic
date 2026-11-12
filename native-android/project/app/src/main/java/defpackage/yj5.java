package defpackage;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yj5 extends ak5 {
    public final int n;
    public final ji5 o;

    public yj5(ji5 r4) {
        r4.getClass();
        this.o = r4;
        o15 r5 = r4.a().e();
        int r0 = 0;
    L4:
        if (r5.hasNext() == false) goto L11;
        Map.Entry r1 = (Map.Entry) r5.next();
        int r2 = ((ak5) r1.getKey()).b();
        if (r0 >= r2) goto L8;
        r0 = r2;
    L8:
        int r3 = ((ak5) r1.getValue()).b();
        if (r0 >= r3) goto L4;
        r0 = r3;
        goto L4
    L11:
        int r6 = r0 + 1;
        this.n = r6;
        if (r6 > 8) goto L15;
        return;
    L15:
        throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override // defpackage.ak5
    public final int a() {
        return ak5.d((byte) -96);
    }

    @Override // defpackage.ak5
    public final int b() {
        return this.n;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r5) {
        ak5 r6 = (ak5) r5;
        int r0 = r6.a();
        int r1 = ak5.d((byte) -96);
        if (r1 != r0) goto L5;
        ji5 r7 = ((yj5) r6).o;
        ji5 r4 = this.o;
        if (r4.q.size() != r7.q.size()) goto L9;
        o15 r8 = r4.a().e();
        o15 r9 = r7.a().e();
    L12:
        if (r8.hasNext() == false) goto L14;
    L18:
        Map.Entry r2 = (Map.Entry) r8.next();
        Map.Entry r3 = (Map.Entry) r9.next();
        int r10 = ((ak5) r2.getKey()).compareTo((ak5) r3.getKey());
        if (r10 != 0) goto L20;
        int r11 = ((ak5) r2.getValue()).compareTo((ak5) r3.getValue());
        if (r11 == 0) goto L12;
        return r11;
    L20:
        return r10;
    L14:
        if (r9.hasNext() == true) goto L18;
        return 0;
    L9:
        return r4.q.size() - r7.q.size();
    L5:
        return r1 - r6.a();
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if (r4 != null) goto L9;
        return false;
    L9:
        if (yj5.class == r4.getClass()) goto L12;
        return false;
    L12:
        return this.o.equals(((yj5) r4).o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(ak5.d((byte) -96)), this.o});
    }

    public final String toString() {
        ji5 r5 = this.o;
        if (r5.isEmpty() == false) goto L6;
        return "{}";
    L6:
        LinkedHashMap r0 = new LinkedHashMap();
        o15 r6 = r5.a().e();
    L8:
        if (r6.hasNext() == false) goto L10;
        Map.Entry r1 = (Map.Entry) r6.next();
        r0.put(((ak5) r1.getKey()).toString().replace("\n", "\n  "), ((ak5) r1.getValue()).toString().replace("\n", "\n  "));
        goto L8
    L10:
        z45 r7 = new z45(8);
        StringBuilder r2 = new StringBuilder("{\n  ");
        uo.V(r2, r0.entrySet().iterator(), r7);     // Catch: IOException -> L14
        r2.append("\n}");
        return r2.toString();
    L14:
        e = move-exception;
        throw new AssertionError(e);
    }
}

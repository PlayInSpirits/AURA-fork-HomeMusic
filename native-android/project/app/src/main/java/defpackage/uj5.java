package defpackage;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uj5 extends ak5 {
    public final ei5 n;
    public final int o;

    public uj5(pi5 r4) {
        r4.getClass();
        this.n = r4;
        int r5 = 0;
        int r0 = 0;
    L3:
        ei5 r1 = this.n;
        if (r5 >= r1.size()) goto L9;
        int r2 = ((ak5) r1.get(r5)).b();
        if (r0 >= r2) goto L8;
        r0 = r2;
    L8:
        r5 = r5 + 1;
        goto L3
    L9:
        int r3 = r0 + 1;
        this.o = r3;
        if (r3 > 8) goto L13;
        return;
    L13:
        throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override // defpackage.ak5
    public final int a() {
        return ak5.d((byte) -128);
    }

    @Override // defpackage.ak5
    public final int b() {
        return this.o;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r5) {
        ak5 r6 = (ak5) r5;
        int r0 = r6.a();
        int r1 = ak5.d((byte) -128);
        if (r1 != r0) goto L5;
        ei5 r7 = ((uj5) r6).n;
        ei5 r4 = this.n;
        if (r4.size() != r7.size()) goto L9;
        int r2 = 0;
    L12:
        if (r2 >= r4.size()) goto L17;
        int r3 = ((ak5) r4.get(r2)).compareTo((ak5) r7.get(r2));
        if (r3 != 0) goto L15;
        r2 = r2 + 1;
        goto L12
    L15:
        return r3;
    L17:
        return 0;
    L9:
        return r4.size() - r7.size();
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
        if (uj5.class == r4.getClass()) goto L12;
        return false;
    L12:
        return this.n.equals(((uj5) r4).n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(ak5.d((byte) -128)), this.n});
    }

    public final String toString() {
        ei5 r6 = this.n;
        if (r6.isEmpty() == false) goto L6;
        return "[]";
    L6:
        ArrayList r0 = new ArrayList();
        int r1 = r6.size();
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L9;
        r0.add(((ak5) r6.get(r2)).toString().replace("\n", "\n  "));
        r2 = r2 + 1;
        goto L7
    L9:
        StringBuilder r7 = new StringBuilder("[\n  ");
        Iterator r3 = r0.iterator();
    L19:
        e = move-exception;
        throw new AssertionError(e);
    L11:
        if (r3.hasNext() == false) goto L17;
        r7.append(z45.a(r3.next()));     // Catch: IOException -> L19
    L14:
        if (r3.hasNext() == false) goto L17;
        r7.append(",\n  ");     // Catch: IOException -> L19
        r7.append(z45.a(r3.next()));     // Catch: IOException -> L19
    L17:
        r7.append("\n]");
        return r7.toString();
    }
}

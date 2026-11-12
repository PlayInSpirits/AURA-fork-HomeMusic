package defpackage;

import com.eddyizm.tempus.subsonic.models.AlbumID3;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w60 implements Comparator {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ w60(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.Comparator
    public final int compare(Object r6, Object r7) {
        int r0 = this.n;
        Object r5 = this.o;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ik2 r8 = (ik2) r5;
        return r8.e(r7) - r8.e(r6);
    L6:
        if1[] r9 = (if1[]) r5;
        int r1 = r9.length;
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L27;
        if1 r3 = r9[r2];
        int r4 = fu.l((Comparable) r3.invoke(r6), (Comparable) r3.invoke(r7));
        if (r4 != 0) goto L12;
        r2 = r2 + 1;
        goto L7
    L12:
        return r4;
    L27:
        return 0;
    L13:
        int r10 = ((ca1) r5).compare(r6, r7);
        if (r10 != 0) goto L28;
        String r11 = ((AlbumID3) r6).getName();
        String r12 = "";
        if (r11 == null) goto L19;
        Locale r13 = Locale.ROOT;
        r13.getClass();
        String r14 = r11.toLowerCase(r13);
        r14.getClass();
    L20:
        String r15 = ((AlbumID3) r7).getName();
        if (r15 == null) goto L24;
        Locale r16 = Locale.ROOT;
        r16.getClass();
        r12 = r15.toLowerCase(r16);
        r12.getClass();
    L24:
        return fu.l(r14, r12);
    L19:
        r14 = "";
        goto L20
    L28:
        return r10;
    }
}

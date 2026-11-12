package defpackage;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hh2 implements Comparator {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ hh2(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.util.Comparator
    public final int compare(Object r3, Object r4) {
        int r0 = this.n;
        Object r2 = this.o;
        switch(r0) {
            case 0: goto L17;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        int r5 = ((hh2) r2).compare(r3, r4);
        if (r5 == 0) goto L8;
        return r5;
    L8:
        return fu.l(Integer.valueOf(((i94) r3).f), Integer.valueOf(((i94) r4).f));
    L9:
        int r6 = ((Comparator) r2).compare(r3, r4);
        if (r6 != 0) goto L27;
        c72 r7 = ((i94) r3).c;
        c72 r8 = ((i94) r4).c;
        if (r7.w() != r8.w()) goto L16;
        return h12.j(r7.u(), r8.u());
    L16:
        return Float.compare(r7.w(), r8.w());
    L27:
        return r6;
    L17:
        MaterialButton r9 = (MaterialButton) r3;
        MaterialButton r10 = (MaterialButton) r4;
        MaterialButtonToggleGroup r11 = (MaterialButtonToggleGroup) r2;
        int r1 = Boolean.valueOf(r9.B).compareTo(Boolean.valueOf(r10.B));
        if (r1 != 0) goto L28;
        int r12 = Boolean.valueOf(r9.isPressed()).compareTo(Boolean.valueOf(r10.isPressed()));
        if (r12 == 0) goto L24;
        return r12;
    L24:
        return Integer.valueOf(r11.indexOfChild(r9)).compareTo(Integer.valueOf(r11.indexOfChild(r10)));
    L28:
        return r1;
    }
}

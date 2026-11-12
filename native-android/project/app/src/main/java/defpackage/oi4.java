package defpackage;

import android.widget.Button;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oi4 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SongListPageFragment b;

    public /* synthetic */ oi4(SongListPageFragment r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.a83
    public final void b(Object r5) {
        int r0 = this.a;
        SongListPageFragment r4 = this.b;
        boolean r1 = false;
        switch(r0) {
            case 0: goto L44;
            case 1: goto L13;
            default: goto L4;
        };
    L4:
        Boolean r6 = (Boolean) r5;
        if (r4.p0 == null) goto L53;
        String r2 = (String) r4.o0.b.d();
        ni4 r7 = r4.p0;
        if (r6 != null) goto L9;
    L11:
        r7.s(r2, r1);
        return;
    L9:
        if (r6.booleanValue() == false) goto L11;
        r1 = true;
        goto L11
    L53:
        return;
    L13:
        List r8 = (List) r5;
        if (r4.l0 == null) goto L54;
        String r9 = r4.n0.e;
        r9.getClass();
        byte r3 = -1;
        switch(r9.hashCode()) {
            case -1749690986: goto L35;
            case -241049756: goto L31;
            case 1434555764: goto L27;
            case 1594154365: goto L23;
            case 2022304170: goto L19;
            default: goto L38;
        };
    L38:
        switch(r3) {
            case 0: goto L41;
            case 1: goto L40;
            case 2: goto L40;
            case 3: goto L40;
            case 4: goto L41;
            default: goto L42;
        };
    L40:
        ((Button) r4.l0.g).setVisibility(0);
        goto L42
    L41:
        ((Button) r4.l0.g).setVisibility(8);
    L42:
        ((Button) r4.l0.f).setOnClickListener(new pi4(r4, 1));
        return;
    L19:
        if (r9.equals("MEDIA_BY_YEAR") == false) goto L38;
        r3 = 4;
        goto L38
    L23:
        if (r9.equals("MEDIA_BY_GENRES") == false) goto L38;
        r3 = 3;
        goto L38
    L27:
        if (r9.equals("MEDIA_BY_ARTIST") == false) goto L38;
        r3 = 2;
        goto L38
    L31:
        if (r9.equals("MEDIA_STARRED") == false) goto L38;
        r3 = 1;
        goto L38
    L35:
        if (r9.equals("MEDIA_BY_GENRE") == false) goto L38;
        r3 = 0;
        goto L38
    L54:
        return;
    L44:
        String r10 = (String) r5;
        if (r4.p0 == null) goto L55;
        Boolean r11 = (Boolean) r4.o0.c.d();
        ni4 r12 = r4.p0;
        if (r11 != null) goto L49;
    L51:
        r12.s(r10, r1);
        return;
    L49:
        if (r11.booleanValue() == false) goto L51;
        r1 = true;
        goto L51
    }
}

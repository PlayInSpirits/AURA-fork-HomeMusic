package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.eddyizm.tempus.model.HomeSector;
import com.eddyizm.tempus.viewmodel.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zo1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ cp1 o;

    public /* synthetic */ zo1(cp1 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r3 = 0;
        cp1 r8 = this.o;
        switch(r0) {
            case 0: goto L40;
            case 1: goto L36;
            case 2: goto L29;
            case 3: goto L19;
            case 4: goto L16;
            case 5: goto L14;
            case 6: goto L12;
            default: goto L5;
        };
    L12:
        r8.j0();
        return;
    L14:
        r8.j0();
        return;
    L16:
        r8.j0();
        return;
    L36:
        tc1 r9 = r8.l0;
        if (r9 == null) goto L210;
        r9.w.setVisibility(0);
        return;
    L210:
        return;
    L40:
        r8.I0 = false;
        if (r8.l0 != null) goto L43;
        return;
    L43:
        if (r8.n0.D == null) goto L211;
        ArrayList r1 = new ArrayList();
        if (r8.l0.H.getVisibility() != 0) goto L49;
        r1.add(r8.l0.H);
    L49:
        if (r8.l0.z.getVisibility() != 0) goto L52;
        r1.add(r8.l0.z);
    L52:
        if (r8.l0.D.getVisibility() != 0) goto L54;
        r1.add(r8.l0.D);
    L54:
        View r4 = r8.H0;
        if (r4 == null) goto L57;
        r1.add(r4);
    L57:
        Iterator r5 = r8.n0.D.iterator();
    L59:
        if (r5.hasNext() == false) goto L148;
        HomeSector r6 = (HomeSector) r5.next();
        if (r6.isVisible() == false) goto L59;
        String r7 = r6.getId();
        r7.getClass();
        byte r10 = -1;
        switch(r7.hashCode()) {
            case -2094083455: goto L127;
            case -2006276604: goto L123;
            case -1789557476: goto L119;
            case -1592116610: goto L115;
            case -780460034: goto L111;
            case -696297063: goto L107;
            case -566475945: goto L103;
            case -157044973: goto L99;
            case 432127394: goto L95;
            case 588550171: goto L91;
            case 835285363: goto L87;
            case 1618036502: goto L83;
            case 1651435997: goto L79;
            case 1871209635: goto L75;
            case 1893512951: goto L71;
            case 2113438488: goto L67;
            default: goto L130;
        };
    L130:
        switch(r10) {
            case 0: goto L147;
            case 1: goto L146;
            case 2: goto L145;
            case 3: goto L144;
            case 4: goto L143;
            case 5: goto L142;
            case 6: goto L141;
            case 7: goto L140;
            case 8: goto L139;
            case 9: goto L138;
            case 10: goto L137;
            case 11: goto L136;
            case 12: goto L135;
            case 13: goto L134;
            case 14: goto L133;
            case 15: goto L132;
            default: goto L59;
        };
    L132:
        r1.add(r8.l0.x);
        goto L59
    L133:
        r1.add(r8.l0.t);
        goto L59
    L134:
        r1.add(r8.l0.v);
        goto L59
    L135:
        r1.add(r8.l0.f0);
        goto L59
    L136:
        r1.add(r8.l0.r);
        goto L59
    L137:
        r1.add(r8.l0.P);
        goto L59
    L138:
        r1.add(r8.l0.p);
        goto L59
    L139:
        r1.add(r8.l0.u);
        goto L59
    L140:
        r1.add(r8.l0.j0);
        goto L59
    L141:
        r1.add(r8.l0.n);
        goto L59
    L142:
        r1.add(r8.l0.l);
        goto L59
    L143:
        r1.add(r8.l0.a0);
        goto L59
    L144:
        r1.add(r8.l0.o);
        goto L59
    L145:
        r1.add(r8.l0.m);
        goto L59
    L146:
        r1.add(r8.l0.s);
        goto L59
    L147:
        r1.add(r8.l0.n0);
        goto L59
    L67:
        if (r7.equals("HOME_SECTOR_MADE_FOR_YOU") == false) goto L130;
        r10 = 15;
        goto L130
    L71:
        if (r7.equals("HOME_SECTOR_RADIO_STATION") == false) goto L130;
        r10 = 14;
        goto L130
    L75:
        if (r7.equals("HOME_SECTOR_LAST_PLAYED") == false) goto L130;
        r10 = 13;
        goto L130
    L79:
        if (r7.equals("HOME_SECTOR_STARRED_ALBUMS") == false) goto L130;
        r10 = 12;
        goto L130
    L83:
        if (r7.equals("HOME_SECTOR_MOST_PLAYED") == false) goto L130;
        r10 = 11;
        goto L130
    L87:
        if (r7.equals("HOME_SECTOR_PINNED_PLAYLISTS") == false) goto L130;
        r10 = 10;
        goto L130
    L91:
        if (r7.equals("HOME_SECTOR_TOP_SONGS") == false) goto L130;
        r10 = 9;
        goto L130
    L95:
        if (r7.equals("HOME_SECTOR_RECENTLY_ADDED") == false) goto L130;
        r10 = 8;
        goto L130
    L99:
        if (r7.equals("HOME_SECTOR_STARRED_ARTISTS") == false) goto L130;
        r10 = 7;
        goto L130
    L103:
        if (r7.equals("HOME_SECTOR_DISCOVERY") == false) goto L130;
        r10 = 6;
        goto L130
    L107:
        if (r7.equals("HOME_SECTOR_BEST_OF") == false) goto L130;
        r10 = 5;
        goto L130
    L111:
        if (r7.equals("HOME_SECTOR_SHARED") == false) goto L130;
        r10 = 4;
        goto L130
    L115:
        if (r7.equals("HOME_SECTOR_FLASHBACK") == false) goto L130;
        r10 = 3;
        goto L130
    L119:
        if (r7.equals("HOME_SECTOR_CONTINUE_LISTENING") == false) goto L130;
        r10 = 2;
        goto L130
    L123:
        if (r7.equals("HOME_SECTOR_NEW_RELEASES") == false) goto L130;
        r10 = 1;
        goto L130
    L127:
        if (r7.equals("HOME_SECTOR_STARRED_TRACKS") == false) goto L130;
        r10 = 0;
        goto L130
    L148:
        r1.add(r8.l0.w);
        LinearLayout r11 = r8.l0.q;
        if (r11.getChildCount() != r1.size()) goto L157;
        int r2 = 0;
    L152:
        if (r2 >= r1.size()) goto L212;
        if (r11.getChildAt(r2) != r1.get(r2)) goto L157;
        r2 = r2 + 1;
        goto L152
    L212:
        return;
    L157:
        r11.removeAllViews();
        int r12 = r1.size();
    L158:
        if (r3 >= r12) goto L213;
        Object r13 = r1.get(r3);
        r3 = r3 + 1;
        r11.addView((View) r13);
        goto L158
    L213:
        return;
    L211:
        return;
    L5:
        if (r8.T != null) goto L7;
        return;
    L7:
        if (r8.l0 != null) goto L9;
        return;
    L9:
        if (ud3.V() == false) goto L203;
        r8.n0.g(r8.v());
        return;
    L203:
        return;
    L19:
        if (r8.G0 != null) goto L21;
        return;
    L21:
        if (r8.l0 == null) goto L206;
        List r14 = q40.K0(ud3.A().values(), new jb2(1));
        boolean r15 = r14.isEmpty();
        tc1 r16 = r8.l0;
        if (r15 == false) goto L26;
        r16.m.setVisibility(8);
        return;
    L26:
        r16.m.setVisibility(0);
        zd0 r17 = r8.G0;
        r17.r = r14;
        r17.d();
        return;
    L206:
        return;
    L29:
        if (r8.T != null) goto L31;
        return;
    L31:
        if (r8.l0 == null) goto L208;
        b r18 = r8.n0;
        if (r18 == null) goto L209;
        r18.A.k(ud3.s());
        return;
    L209:
        return;
    }
}

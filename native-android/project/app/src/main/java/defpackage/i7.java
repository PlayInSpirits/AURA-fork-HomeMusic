package defpackage;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.eddyizm.tempus.subsonic.models.PlayQueue;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i7 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i7(int r1, Object r2, Object r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.a83
    public final void b(Object r8) {
        int r0 = this.a;
        int r1 = -1;
        Object r5 = this.b;
        Object r6 = this.c;
        switch(r0) {
            case 0: goto L57;
            case 1: goto L51;
            case 2: goto L39;
            case 3: goto L27;
            case 4: goto L9;
            default: goto L4;
        };
    L4:
        List r9 = (List) r8;
        if (r9 == null) goto L66;
        ((ad2) r6).j(this);
        PlaylistPageFragment r7 = (PlaylistPageFragment) r5;
        r7.v0 = false;
        r7.h0(r9);
        return;
    L66:
        return;
    L9:
        PlayQueue r10 = (PlayQueue) r8;
        wk3 r11 = (wk3) r5;
        ((aj3) r6).c().j(this);
        if (r10 != null) goto L12;
    L24:
        Toast.makeText(r11.Z(), "No saved queue found", 0).show();
    L25:
        r11.k0();
        return;
    L12:
        if (r10.getEntries() == null) goto L24;
        if (r10.getEntries().isEmpty() == true) goto L24;
        int r12 = 0;
    L17:
        if (r12 >= r10.getEntries().size()) goto L22;
        if (r10.getEntries().get(r12).getId().equals(r10.getCurrent()) == true) goto L23;
        r12 = r12 + 1;
    L23:
        bo2.q(r11.v0, r10.getEntries(), r12, "queue");
        Toast.makeText(r11.Z(), "Queue loaded", 0).show();
        goto L25
    L22:
        r12 = 0;
        goto L23
    L27:
        List r13 = (List) r8;
        ao2 r14 = (ao2) r6;
        ((k03) r5).j(this);
        if (r13 == null) goto L35;
        if (r13.isEmpty() == true) goto L35;
        List r15 = bo2.a(r14, r13);
        if (r15.isEmpty() == true) goto L35;
        Log.d("MediaManager", "Continuous Play: adding " + r15.size() + " similar tracks");
        int r16 = bo2.b(r14, r15);
        bo2.c.set(false);
        is3.b(r14.b(), r16, r15.size());
        return;
    L35:
        if (xa3.u("fallback_to_random_tracks", false) == false) goto L37;
        Log.w("MediaManager", "Continuous Play: no new similar tracks, falling back to random songs");
        k03 r17 = xi4.q(25, null, null);
        r17.f(new i7(this, r17, 2));
        return;
    L37:
        Log.w("MediaManager", "Continuous Play: no new similar tracks, random fallback disabled");
        bo2.c.set(false);
        is3.b(r14.b(), -1, 0);
        return;
    L39:
        List r18 = (List) r8;
        ao2 r2 = (ao2) ((i7) r6).c;
        ((k03) r5).j(this);
        if (r18 != null) goto L42;
    L47:
        Log.w("MediaManager", "Continuous Play: random fallback also empty");
    L48:
        int r19 = 0;
    L49:
        bo2.c.set(false);
        is3.b(r2.b(), r1, r19);
        return;
    L42:
        if (r18.isEmpty() == true) goto L47;
        List r20 = bo2.a(r2, r18);
        if (r20.isEmpty() == true) goto L46;
        Log.d("MediaManager", "Continuous Play: adding " + r20.size() + " random tracks");
        r1 = bo2.b(r2, r20);
        r19 = r20.size();
        goto L49
    L46:
        Log.w("MediaManager", "Continuous Play: random tracks already in queue");
        goto L48
    L51:
        List r21 = (List) r8;
        ((k03) r5).j(this);
        if (r21 != null) goto L54;
        return;
    L54:
        if (r21.isEmpty() == true) goto L70;
        ((xd0) r6).accept(r21);
        return;
    L70:
        return;
    L57:
        List r22 = (List) r8;
        if (r22 != null) goto L60;
    L62:
        ((k03) r5).j(this);
        return;
    L60:
        if (r22.isEmpty() == true) goto L62;
        au0.w((Context) r6).a(gi1.H(r22), (List) r22.stream().map(new hu3(6)).collect(Collectors.toList()), false);
        goto L62
    }

    public /* synthetic */ i7(Object r1, k03 r2, int r3) {
        this.a = r3;
        this.c = r1;
        this.b = r2;
    }
}

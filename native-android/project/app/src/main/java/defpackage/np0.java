package defpackage;

import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.preference.ListPreference;
import app.homemusic.R;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.eddyizm.tempus.subsonic.models.PlayQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class np0 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ np0(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.a83
    public final void b(Object r10) {
        int r0 = this.a;
        int r5 = 0;
        Object r6 = this.b;
        switch(r0) {
            case 0: goto L83;
            case 1: goto L59;
            case 2: goto L44;
            case 3: goto L20;
            case 4: goto L12;
            default: goto L4;
        };
    L4:
        List r11 = (List) r10;
        cl4 r7 = (cl4) r6;
        if (r11 != null) goto L7;
    L9:
        r7.d.i(new ArrayList());
    L10:
        r7.c.y(-1, false).j(this);
        return;
    L7:
        if (r11.isEmpty() == true) goto L9;
        k03 r1 = r7.d;
        Objects.requireNonNull(r1);
        r7.c(r11, new xj(r1, 3));
        goto L10
    L12:
        List r12 = (List) r10;
        bl4 r8 = (bl4) r6;
        if (r12 != null) goto L15;
    L17:
        r8.d.i(new ArrayList());
    L18:
        r8.c.getClass();
        rv2.o(-1, false).j(this);
        return;
    L15:
        if (r12.isEmpty() == true) goto L17;
        k03 r2 = r8.d;
        Objects.requireNonNull(r2);
        r8.c(r12, new xj(r2, 2));
        goto L18
    L20:
        List r13 = (List) r10;
        vb4 r9 = (vb4) r6;
        ListPreference r14 = (ListPreference) r9.h0("active_music_folder_id");
        if (r14 == null) goto L112;
        if (r13 == null) goto L113;
        ArrayList r3 = new ArrayList();
        ArrayList r4 = new ArrayList();
        r3.add(r9.s(R.string.settings_music_library_all));
        r4.add("default");
        ArrayList r15 = new ArrayList();
        Iterator r16 = r13.iterator();
    L26:
        if (r16.hasNext() == false) goto L35;
        MusicFolder r17 = (MusicFolder) r16.next();
        if (r17.getId() == null) goto L26;
        r15.add(r17.getId());
        if (r17.getName() == null) goto L33;
        String r18 = r17.getName();
    L34:
        r3.add(r18);
        r4.add(r17.getId());
        goto L26
    L33:
        r18 = r17.getId();
        goto L34
    L35:
        r14.G((CharSequence[]) r3.toArray(new CharSequence[0]));
        r14.i0 = (CharSequence[]) r4.toArray(new CharSequence[0]);
        String r19 = ud3.k();
        if (r19 != null) goto L38;
    L42:
        r9.C0 = Integer.valueOf(r15.size());
        r9.l0();
        r9.s0(r14);
        return;
    L38:
        if (r15.isEmpty() == true) goto L42;
        if (r15.contains(r19) == true) goto L42;
        r14.H("default");
        r9.v0.d(null);
        goto L42
    L113:
        return;
    L112:
        return;
    L44:
        final PlayQueue r110 = (PlayQueue) r10;
        xi3 r20 = (xi3) r6;
        r20.p0.c().j(this);
        if (r20.o0 != null) goto L47;
        return;
    L47:
        if (u52.c().a == true) goto L117;
        if (r110 != null) goto L51;
    L57:
        ((ImageButton) ((ae1) r20.o0.q).e).setVisibility(8);
        ((ImageButton) ((ae1) r20.o0.q).e).setOnClickListener(null);
        return;
    L51:
        if (r110.getEntries() == null) goto L57;
        if (r110.getEntries().isEmpty() == true) goto L57;
        int r21 = IntStream.range(0, r110.getEntries().size()).filter(new vi3(r110)).findFirst().orElse(-1);
        if (r21 == (-1)) goto L115;
        ((ImageButton) ((ae1) r20.o0.q).e).setVisibility(0);
        ((ImageButton) ((ae1) r20.o0.q).e).setOnClickListener(new wi3(this, r110, r21, r5));
        return;
    L115:
        return;
    L117:
        return;
    L59:
        List r111 = (List) r10;
        cp1 r22 = (cp1) ((i4) r6).o;
        if (r111 != null) goto L62;
    L79:
        r22.l0.H.setVisibility(8);
        if (r22.l() == null) goto L118;
        r22.l().runOnUiThread(new qa1(6, this));
        return;
    L118:
        return;
    L62:
        if (r111.isEmpty() == true) goto L79;
        if (ud3.o() != null) goto L71;
        eu0 r23 = au0.w(r22.Z());
        Iterator r112 = r111.iterator();
        int r24 = 0;
    L67:
        if (r112.hasNext() == false) goto L77;
        Child r25 = (Child) r112.next();
        String r26 = r25.getId();
        r23.getClass();
        if (eu0.d(r26) == true) goto L67;
        r23.b(gi1.G(r25), new Download(r25), false);
        r24 = r24 + 1;
    L77:
        if (r24 <= 0) goto L79;
        Toast.makeText(r22.Z(), r22.r().getQuantityString(R.plurals.songs_download_started, r24, new Object[]{Integer.valueOf(r24)}), 0).show();
        goto L79
    L71:
        Iterator r113 = r111.iterator();
        r24 = 0;
    L73:
        if (r113.hasNext() == false) goto L77;
        Child r27 = (Child) r113.next();
        if (g51.e(r27) != null) goto L73;
        i51.a(r22.Z(), r27);
        r24 = r24 + 1;
        goto L73
    L83:
        pp0 r28 = (pp0) r6;
        if (((ba2) r10) != null) goto L86;
        return;
    L86:
        if (r28.s0 == false) goto L120;
        View r114 = r28.a0();
        if (r114.getParent() == null) goto L90;
        kf2.o("DialogFragment can not be attached to a container view");
        return;
    L90:
        if (r28.w0 != null) goto L92;
        return;
    L92:
        if (ld1.I(3) == false) goto L94;
        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + r28.w0);
    L94:
        r28.w0.setContentView(r114);
        return;
    }
}

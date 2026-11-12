package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.model.DownloadStack;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.DownloadFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f7 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f7(int r1, Object r2, Object r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.a83
    public final void b(Object r12) {
        int r0 = this.a;
        byte r1 = 4;
        int r2 = 0;
        Object r3 = this.c;
        Object r11 = this.b;
        switch(r0) {
            case 0: goto L58;
            case 1: goto L18;
            case 2: goto L10;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        im3 r13 = (im3) r11;
        r13.getClass();
        ((k03) r3).i(Boolean.valueOf(((List) r12).stream().anyMatch(new tj(4, r13))));
        return;
    L6:
        aj3 r14 = (aj3) r11;
        Child r15 = (Child) r12;
        if (Objects.equals(r14.u, (String) r3) == false) goto L66;
        r14.n.i(r15);
        return;
    L66:
        return;
    L10:
        cp1 r16 = (cp1) r11;
        boolean[] r4 = (boolean[]) r3;
        List r17 = (List) r12;
        if (r4[0] == true) goto L67;
        if (r17 != null) goto L14;
        return;
    L14:
        if (r17.isEmpty() == true) goto L69;
        new Handler(Looper.getMainLooper()).postDelayed(new v6(r16, r4, r17, 14), 300);
        return;
    L69:
        return;
    L67:
        return;
    L18:
        DownloadFragment r18 = (DownloadFragment) r11;
        List r5 = (List) r3;
        ArrayList r19 = (ArrayList) r12;
        RecyclerView r6 = (RecyclerView) r18.l0.f;
        r18.Z();
        r6.setLayoutManager(new LinearLayoutManager(1));
        DownloadStack r7 = (DownloadStack) r19.get(r19.size() - 1);
        String r8 = r7.getId();
        r8.getClass();
        int r9 = 3;
        switch(r8.hashCode()) {
            case -2125974859: goto L41;
            case -940056789: goto L37;
            case 155496896: goto L33;
            case 901055809: goto L29;
            case 906399829: goto L26;
            case 918779933: goto L22;
            default: goto L20;
        };
    L20:
        r1 = -1;
    L44:
        switch(r1) {
            case 0: goto L51;
            case 1: goto L50;
            case 2: goto L49;
            case 3: goto L48;
            case 4: goto L47;
            case 5: goto L46;
            default: goto L52;
        };
    L46:
        r18.p0.s("download_type_track", r7.getId(), r7.getView(), r5);
        goto L52
    L47:
        r18.p0.s("download_type_track", r7.getId(), r7.getView(), r5);
        goto L52
    L48:
        r18.p0.s("download_type_track", r7.getId(), r7.getView(), r5);
        goto L52
    L49:
        r18.p0.s("download_type_track", r7.getId(), r7.getView(), r5);
        goto L52
    L50:
        r18.p0.s("download_type_track", r7.getId(), r7.getView(), r5);
        goto L52
    L51:
        r18.p0.s("download_type_album", r7.getId(), r7.getView(), r5);
    L52:
        ImageView r10 = (ImageView) r18.l0.d;
        if (r19.size() > 1) goto L56;
        r2 = 8;
    L56:
        r10.setVisibility(r2);
        r18.X().i().a(r18.v(), new xs0(r18, r19.size()));
        ((TextView) r18.l0.i).setOnClickListener(new ws0(r18, r9));
        return;
    L22:
        if (r8.equals("download_type_track") == false) goto L60;
        r1 = 5;
        goto L44
    L60:
        r1 = -1;
        goto L44
    L26:
        if (r8.equals("download_type_genre") == true) goto L44;
        r1 = -1;
        goto L44
    L29:
        if (r8.equals("download_type_album") == false) goto L62;
        r1 = 3;
        goto L44
    L62:
        r1 = -1;
        goto L44
    L33:
        if (r8.equals("download_type_playlist") == false) goto L63;
        r1 = 2;
        goto L44
    L63:
        r1 = -1;
        goto L44
    L37:
        if (r8.equals("download_type_year") == false) goto L64;
        r1 = 1;
        goto L44
    L64:
        r1 = -1;
        goto L44
    L41:
        if (r8.equals("download_type_artist") == false) goto L65;
        r1 = 0;
        goto L44
    L65:
        r1 = -1;
        goto L44
    L58:
        List r20 = (List) r12;
        ((TextView) r3).setOnClickListener(new a7((AlbumBottomSheetDialog) r11, gi1.H(r20), (List) r20.stream().map(new hu3(6)).collect(Collectors.toList()), r20, 0));
    }
}

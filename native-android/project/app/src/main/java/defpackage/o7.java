package defpackage;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.SearchView;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Genre;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.subsonic.models.PodcastChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o7 extends Filter {
    public final /* synthetic */ int a;
    public Filterable b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ o7(dw3 r1, int r2) {
        this.a = r2;
        this.b = (Filterable) r1;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object r2) {
        switch(this.a) {
            case 4: goto L7;
            default: goto L5;
        };
    L5:
        return super.convertResultToString(r2);
    L7:
        return ((pg0) this.b).c((Cursor) r2);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence r6) {
        String r1 = "";
        String r2 = null;
        int r3 = 0;
        switch(this.a) {
            case 0: goto L127;
            case 1: goto L113;
            case 2: goto L100;
            case 3: goto L86;
            case 4: goto L65;
            case 5: goto L52;
            case 6: goto L44;
            case 7: goto L31;
            case 8: goto L18;
            default: goto L4;
        };
    L4:
        ni4 r5 = (ni4) this.b;
        ArrayList r0 = new ArrayList();
        if (r6 != null) goto L7;
    L15:
        r0.addAll(r5.u);
    L16:
        Filter.FilterResults r7 = new Filter.FilterResults();
        r7.values = r0;
        return r7;
    L7:
        if (r6.length() == 0) goto L15;
        String r8 = r6.toString().toLowerCase().trim();
        r5.w = r8;
        Iterator r9 = r5.u.iterator();
    L11:
        if (r9.hasNext() == false) goto L16;
        Child r4 = (Child) r9.next();
        if (r4.getTitle().toLowerCase().contains(r8) == false) goto L11;
        r0.add(r4);
        goto L11
    L18:
        ej r10 = (ej) this.b;
        ArrayList r11 = new ArrayList();
        if (r6 != null) goto L21;
    L28:
        r11.addAll(r10.s);
    L29:
        Filter.FilterResults r12 = new Filter.FilterResults();
        r12.values = r11;
        return r12;
    L21:
        if (r6.length() == 0) goto L28;
        String r13 = r6.toString().toLowerCase().trim();
        ArrayList r14 = r10.s;
        int r15 = r14.size();
    L24:
        if (r3 >= r15) goto L29;
        Object r16 = r14.get(r3);
        r3 = r3 + 1;
        PodcastChannel r17 = (PodcastChannel) r16;
        if (r17.getTitle().toLowerCase().contains(r13) == false) goto L24;
        r11.add(r17);
        goto L24
    L31:
        ej r18 = (ej) this.b;
        ArrayList r19 = new ArrayList();
        if (r6 != null) goto L34;
    L41:
        r19.addAll(r18.s);
    L42:
        Filter.FilterResults r20 = new Filter.FilterResults();
        r20.values = r19;
        r20.count = r19.size();
        return r20;
    L34:
        if (r6.length() == 0) goto L41;
        String r21 = r6.toString().toLowerCase().trim();
        ArrayList r22 = r18.s;
        int r23 = r22.size();
    L37:
        if (r3 >= r23) goto L42;
        Object r24 = r22.get(r3);
        r3 = r3 + 1;
        Playlist r25 = (Playlist) r24;
        if (r25.getName().toLowerCase().contains(r21) == false) goto L37;
        r19.add(r25);
        goto L37
    L44:
        Filter.FilterResults r26 = new Filter.FilterResults();
        if (r6 == null) goto L47;
        r2 = r6.toString();
    L47:
        if (r2 == null) goto L50;
        r1 = r2;
    L50:
        r26.values = r1;
        return r26;
    L52:
        ej r27 = (ej) this.b;
        ArrayList r28 = new ArrayList();
        if (r6 != null) goto L55;
    L62:
        r28.addAll(r27.s);
    L63:
        Filter.FilterResults r29 = new Filter.FilterResults();
        r29.values = r28;
        return r29;
    L55:
        if (r6.length() == 0) goto L62;
        String r30 = r6.toString().toLowerCase().trim();
        ArrayList r31 = r27.s;
        int r32 = r31.size();
    L58:
        if (r3 >= r32) goto L63;
        Object r33 = r31.get(r3);
        r3 = r3 + 1;
        Genre r34 = (Genre) r33;
        if (r34.getGenre().toLowerCase().contains(r30) == false) goto L58;
        r28.add(r34);
        goto L58
    L65:
        co4 r35 = (co4) ((pg0) this.b);
        SearchView r36 = r35.x;
        if (r6 == null) goto L70;
        r1 = r6.toString();
    L70:
        if (r36.getVisibility() == 0) goto L72;
    L80:
        Cursor r37 = null;
    L81:
        Filter.FilterResults r38 = new Filter.FilterResults();
        if (r37 == null) goto L84;
        r38.count = r37.getCount();
        r38.values = r37;
    L85:
        return r38;
    L84:
        r38.count = 0;
        r38.values = null;
        goto L85
    L72:
        if (r36.getWindowVisibility() != 0) goto L80;
        r37 = r35.f(r35.y, r1);     // Catch: RuntimeException -> L78
        if (r37 == null) goto L80;
        r37.getCount();     // Catch: RuntimeException -> L78
    L78:
        e = move-exception;
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        goto L80
    L86:
        b8 r39 = (b8) this.b;
        ArrayList r40 = new ArrayList();
        if (r6 != null) goto L89;
    L97:
        r40.addAll(r39.s);
    L98:
        Filter.FilterResults r41 = new Filter.FilterResults();
        r41.values = r40;
        return r41;
    L89:
        if (r6.length() == 0) goto L97;
        String r42 = r6.toString().toLowerCase().trim();
        r39.u = r42;
        Iterator r43 = r39.s.iterator();
    L93:
        if (r43.hasNext() == false) goto L98;
        ArtistID3 r44 = (ArtistID3) r43.next();
        if (r44.getName().toLowerCase().contains(r42) == false) goto L93;
        r40.add(r44);
        goto L93
    L100:
        ej r45 = (ej) this.b;
        ArrayList r46 = new ArrayList();
        if (r6 != null) goto L103;
    L110:
        r46.addAll(r45.s);
    L111:
        Filter.FilterResults r47 = new Filter.FilterResults();
        r47.values = r46;
        return r47;
    L103:
        if (r6.length() == 0) goto L110;
        String r48 = r6.toString().toLowerCase().trim();
        ArrayList r49 = r45.s;
        int r50 = r49.size();
    L106:
        if (r3 >= r50) goto L111;
        Object r51 = r49.get(r3);
        r3 = r3 + 1;
        ArtistID3 r52 = (ArtistID3) r51;
        if (r52.getName().toLowerCase().contains(r48) == false) goto L106;
        r46.add(r52);
        goto L106
    L113:
        b8 r53 = (b8) this.b;
        ArrayList r54 = new ArrayList();
        if (r6 != null) goto L116;
    L124:
        r54.addAll(r53.s);
    L125:
        Filter.FilterResults r55 = new Filter.FilterResults();
        r55.values = r54;
        return r55;
    L116:
        if (r6.length() == 0) goto L124;
        String r56 = r6.toString().toLowerCase().trim();
        r53.u = r56;
        Iterator r57 = r53.s.iterator();
    L120:
        if (r57.hasNext() == false) goto L125;
        AlbumID3 r58 = (AlbumID3) r57.next();
        if (r58.getName().toLowerCase().contains(r56) == false) goto L120;
        r54.add(r58);
        goto L120
    L127:
        q7 r59 = (q7) this.b;
        ArrayList r60 = new ArrayList();
        if (r6 != null) goto L130;
    L138:
        r60.addAll(r59.t);
    L139:
        Filter.FilterResults r61 = new Filter.FilterResults();
        r61.values = r60;
        return r61;
    L130:
        if (r6.length() == 0) goto L138;
        String r62 = r6.toString().toLowerCase().trim();
        Iterator r63 = r59.t.iterator();
    L134:
        if (r63.hasNext() == false) goto L139;
        AlbumID3 r64 = (AlbumID3) r63.next();
        if (r64.getName().toLowerCase().contains(r62) == false) goto L134;
        r60.add(r64);
        goto L134
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence r3, Filter.FilterResults r4) {
        switch(this.a) {
            case 0: goto L43;
            case 1: goto L41;
            case 2: goto L36;
            case 3: goto L34;
            case 4: goto L29;
            case 5: goto L27;
            case 6: goto L16;
            case 7: goto L11;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        ((ni4) this.b).v.b((List) r4.values, new jq3(9, this));
        return;
    L6:
        ej r2 = (ej) this.b;
        r2.r.clear();
        if (r4.count <= 0) goto L9;
        r2.r.addAll((List) r4.values);
    L9:
        r2.d();
        return;
    L11:
        ej r5 = (ej) this.b;
        r5.r.clear();
        Object r6 = r4.values;
        if (r6 == null) goto L14;
        r5.r.addAll((List) r6);
    L14:
        r5.d();
        return;
    L16:
        q7 r7 = (q7) this.b;
        String r8 = null;
        if (r4 == null) goto L19;
        Object r9 = r4.values;
    L21:
        if ((r9 instanceof String) == false) goto L23;
        r8 = (String) r9;
    L23:
        if (r8 != null) goto L25;
        r8 = "";
    L25:
        r7.v = r8;
        r7.t = su3.q(r8, r7.s);
        r7.d();
        return;
    L19:
        r9 = null;
        goto L21
    L27:
        ej r10 = (ej) this.b;
        r10.r = (ArrayList) r4.values;
        r10.d();
        return;
    L29:
        pg0 r11 = (pg0) this.b;
        Cursor r12 = r11.p;
        Object r13 = r4.values;
        if (r13 == null) goto L45;
        if (r13 == r12) goto L46;
        r11.b((Cursor) r13);
        return;
    L46:
        return;
    L45:
        return;
    L34:
        b8 r14 = (b8) this.b;
        r14.t = (List) r4.values;
        r14.d();
        return;
    L36:
        ej r15 = (ej) this.b;
        r15.r.clear();
        if (r4.count <= 0) goto L39;
        r15.r.addAll((List) r4.values);
    L39:
        r15.d();
        return;
    L41:
        b8 r16 = (b8) this.b;
        r16.t = (List) r4.values;
        r16.d();
        return;
    L43:
        q7 r17 = (q7) this.b;
        r17.s = (List) r4.values;
        r17.d();
    }

    public /* synthetic */ o7() {
        this.a = 4;
    }
}

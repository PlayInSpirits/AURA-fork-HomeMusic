package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.SearchResult3;
import com.eddyizm.tempus.ui.fragment.SearchFragment;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k74 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchFragment b;

    public /* synthetic */ k74(SearchFragment r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.a83
    public final void b(Object r11) {
        int r0 = this.a;
        boolean r2 = true;
        int r3 = 1;
        boolean r4 = true;
        SearchFragment r10 = this.b;
        switch(r0) {
            case 0: goto L50;
            case 1: goto L40;
            case 2: goto L35;
            default: goto L4;
        };
    L4:
        SearchResult3 r12 = (SearchResult3) r11;
        if (r10.l0 != null) goto L7;
        return;
    L7:
        if (r12.getArtists() == null) goto L13;
        LinearLayout r1 = (LinearLayout) r10.l0.h;
        if (r12.getArtists().isEmpty() == true) goto L11;
        int r5 = 0;
    L12:
        r1.setVisibility(r5);
        vi r6 = r10.p0;
        r6.u = r12.getArtists();
        r6.d();
    L15:
        if (r12.getAlbums() == null) goto L21;
        LinearLayout r7 = (LinearLayout) r10.l0.g;
        if (r12.getAlbums().isEmpty() == true) goto L19;
        int r8 = 0;
    L20:
        r7.setVisibility(r8);
        r10.q0.p(r12.getAlbums());
        r3 = r3 + 1;
    L23:
        if (r12.getSongs() == null) goto L29;
        LinearLayout r9 = (LinearLayout) r10.l0.j;
        if (r12.getSongs().isEmpty() == true) goto L27;
        int r13 = 0;
    L28:
        r9.setVisibility(r13);
        r10.r0.r(r12.getSongs());
        r3 = r3 + 1;
    L30:
        ae1 r14 = r10.l0;
        if (r3 != 0) goto L33;
        ((LinearLayout) r14.f).setVisibility(0);
        return;
    L33:
        ((LinearLayout) r14.f).setVisibility(8);
        return;
    L27:
        r13 = 8;
        goto L28
    L29:
        r10.r0.r(Collections.EMPTY_LIST);
        ((LinearLayout) r10.l0.j).setVisibility(8);
        goto L30
    L19:
        r8 = 8;
        goto L20
    L21:
        r10.q0.p(Collections.EMPTY_LIST);
        ((LinearLayout) r10.l0.g).setVisibility(8);
        goto L23
    L11:
        r5 = 8;
        goto L12
    L13:
        vi r15 = r10.p0;
        r15.u = Collections.EMPTY_LIST;
        r15.d();
        ((LinearLayout) r10.l0.h).setVisibility(8);
        r3 = 0;
        goto L15
    L35:
        ((LinearLayout) r10.l0.k).removeAllViews();
        Iterator r16 = ((List) r11).iterator();
    L37:
        if (r16.hasNext() == false) goto L39;
        String r17 = (String) r16.next();
        View r18 = LayoutInflater.from(((LinearLayout) r10.l0.k).getContext()).inflate(R.layout.item_search_suggestion, (LinearLayout) r10.l0.k, false);
        ImageView r19 = (ImageView) r18.findViewById(R.id.search_suggestion_icon);
        TextView r20 = (TextView) r18.findViewById(R.id.search_suggestion_title);
        ImageView r21 = (ImageView) r18.findViewById(R.id.search_suggestion_delete_icon);
        r19.setImageDrawable(r10.r().getDrawable(R.drawable.ic_search, null));
        r20.setText(r17);
        r21.setVisibility(8);
        r18.setOnClickListener(new l74(r10, r17, 2));
        ((LinearLayout) r10.l0.k).addView(r18);
        goto L37
    L39:
        return;
    L40:
        Boolean r110 = (Boolean) r11;
        if (r10.r0 == null) goto L63;
        String r22 = (String) r10.o0.b.d();
        ni4 r111 = r10.r0;
        if (r110 != null) goto L45;
    L47:
        r4 = false;
    L48:
        r111.s(r22, r4);
        return;
    L45:
        if (r110.booleanValue() == false) goto L47;
    L63:
        return;
    L50:
        String r112 = (String) r11;
        if (r10.r0 == null) goto L64;
        Boolean r23 = (Boolean) r10.o0.c.d();
        ni4 r113 = r10.r0;
        if (r23 != null) goto L55;
    L57:
        r2 = false;
    L58:
        r113.s(r112, r2);
        return;
    L55:
        if (r23.booleanValue() == false) goto L57;
    }
}

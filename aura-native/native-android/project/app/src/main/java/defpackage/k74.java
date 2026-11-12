package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.SearchResult3;
import com.eddyizm.tempus.ui.fragment.SearchFragment;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k74 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchFragment b;

    public /* synthetic */ k74(SearchFragment searchFragment, int i) {
        this.a = i;
        this.b = searchFragment;
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
    public final void b(Object obj) {
        int i = this.a;
        int i2 = 1;
        SearchFragment searchFragment = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (searchFragment.r0 != null) {
                    Boolean bool = (Boolean) searchFragment.o0.c.d();
                    searchFragment.r0.s(str, bool != null && bool.booleanValue());
                }
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                if (searchFragment.r0 != null) {
                    searchFragment.r0.s((String) searchFragment.o0.b.d(), bool2 != null && bool2.booleanValue());
                }
                break;
            case 2:
                ((LinearLayout) searchFragment.l0.k).removeAllViews();
                for (String str2 : (List) obj) {
                    View viewInflate = LayoutInflater.from(((LinearLayout) searchFragment.l0.k).getContext()).inflate(R.layout.item_search_suggestion, (ViewGroup) searchFragment.l0.k, false);
                    ImageView imageView = (ImageView) viewInflate.findViewById(R.id.search_suggestion_icon);
                    TextView textView = (TextView) viewInflate.findViewById(R.id.search_suggestion_title);
                    ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.search_suggestion_delete_icon);
                    imageView.setImageDrawable(searchFragment.r().getDrawable(R.drawable.ic_search, null));
                    textView.setText(str2);
                    imageView2.setVisibility(8);
                    viewInflate.setOnClickListener(new l74(searchFragment, str2, 2));
                    ((LinearLayout) searchFragment.l0.k).addView(viewInflate);
                }
                break;
            default:
                SearchResult3 searchResult3 = (SearchResult3) obj;
                if (searchFragment.l0 != null) {
                    if (searchResult3.getArtists() != null) {
                        ((LinearLayout) searchFragment.l0.h).setVisibility(!searchResult3.getArtists().isEmpty() ? 0 : 8);
                        vi viVar = searchFragment.p0;
                        viVar.u = searchResult3.getArtists();
                        viVar.d();
                    } else {
                        vi viVar2 = searchFragment.p0;
                        viVar2.u = Collections.EMPTY_LIST;
                        viVar2.d();
                        ((LinearLayout) searchFragment.l0.h).setVisibility(8);
                        i2 = 0;
                    }
                    if (searchResult3.getAlbums() != null) {
                        ((LinearLayout) searchFragment.l0.g).setVisibility(!searchResult3.getAlbums().isEmpty() ? 0 : 8);
                        searchFragment.q0.p(searchResult3.getAlbums());
                        i2++;
                    } else {
                        searchFragment.q0.p(Collections.EMPTY_LIST);
                        ((LinearLayout) searchFragment.l0.g).setVisibility(8);
                    }
                    if (searchResult3.getSongs() != null) {
                        ((LinearLayout) searchFragment.l0.j).setVisibility(!searchResult3.getSongs().isEmpty() ? 0 : 8);
                        searchFragment.r0.r(searchResult3.getSongs());
                        i2++;
                    } else {
                        searchFragment.r0.r(Collections.EMPTY_LIST);
                        ((LinearLayout) searchFragment.l0.j).setVisibility(8);
                    }
                    ae1 ae1Var = searchFragment.l0;
                    if (i2 == 0) {
                        ((LinearLayout) ae1Var.f).setVisibility(0);
                    } else {
                        ((LinearLayout) ae1Var.f).setVisibility(8);
                    }
                }
                break;
        }
    }
}

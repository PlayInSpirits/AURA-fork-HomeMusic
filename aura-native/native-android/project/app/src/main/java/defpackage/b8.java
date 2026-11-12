package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b8 extends dw3 implements Filterable {
    public final /* synthetic */ int q;
    public final ClickCallback r;
    public List s;
    public List t;
    public String u;
    public final Filter v;

    public b8(ClickCallback clickCallback, int i) {
        this.q = i;
        switch (i) {
            case 1:
                this.v = new o7(this, 3);
                this.r = clickCallback;
                List list = Collections.EMPTY_LIST;
                this.t = list;
                this.s = list;
                this.u = "";
                break;
            default:
                this.v = new o7(this, 1);
                this.r = clickCallback;
                List list2 = Collections.EMPTY_LIST;
                this.t = list2;
                this.s = list2;
                this.u = "";
                break;
        }
    }

    @Override // defpackage.dw3
    public final int a() {
        switch (this.q) {
            case 0:
                break;
        }
        return this.t.size();
    }

    @Override // defpackage.dw3
    public long b(int i) {
        switch (this.q) {
            case 1:
                return i;
            default:
                return super.b(i);
        }
    }

    @Override // defpackage.dw3
    public int c(int i) {
        switch (this.q) {
            case 1:
                return 0;
            default:
                return super.c(i);
        }
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        switch (this.q) {
            case 0:
                a8 a8Var = (a8) cx3Var;
                AlbumID3 albumID3 = (AlbumID3) this.t.get(i);
                x12 x12Var = a8Var.u;
                x12Var.e.setText(albumID3.getName());
                x12Var.c.setText(albumID3.getArtist());
                Context context = a8Var.a.getContext();
                String coverArtId = albumID3.getCoverArtId();
                vz3 vz3VarT = b11.g(context, coverArtId, 2, a.c(context), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K(x12Var.b);
                break;
            default:
                jj jjVar = (jj) cx3Var;
                ArtistID3 artistID3 = (ArtistID3) this.t.get(i);
                x12 x12Var2 = jjVar.u;
                x12Var2.e.setText(artistID3.getName());
                if (artistID3.getAlbumCount() > 0) {
                    x12Var2.c.setText("Album count: " + artistID3.getAlbumCount());
                } else {
                    x12Var2.c.setVisibility(8);
                }
                Context context2 = jjVar.a.getContext();
                String coverArtId2 = artistID3.getCoverArtId();
                vz3 vz3VarT2 = b11.g(context2, coverArtId2, 3, a.c(context2), coverArtId2 != null ? wg0.b(ud3.t(), coverArtId2) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT2 = (vz3) vz3VarT2.l();
                }
                vz3VarT2.K(x12Var2.b);
                break;
        }
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        switch (this.q) {
            case 0:
                break;
        }
        return (o7) this.v;
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        switch (this.q) {
            case 0:
                View viewI = b11.i(viewGroup, R.layout.item_horizontal_album, viewGroup, false);
                int i2 = R.id.album_artist_text_view;
                TextView textView = (TextView) uo.s(viewI, R.id.album_artist_text_view);
                if (textView != null) {
                    i2 = R.id.album_cover_image_view;
                    ImageView imageView = (ImageView) uo.s(viewI, R.id.album_cover_image_view);
                    if (imageView != null) {
                        i2 = R.id.album_more_button;
                        FrameLayout frameLayout = (FrameLayout) uo.s(viewI, R.id.album_more_button);
                        if (frameLayout != null) {
                            i2 = R.id.album_title_text_view;
                            TextView textView2 = (TextView) uo.s(viewI, R.id.album_title_text_view);
                            if (textView2 != null) {
                                return new a8(this, new x12((ConstraintLayout) viewI, textView, imageView, frameLayout, textView2));
                            }
                        }
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI.getResources().getResourceName(i2)));
                return null;
            default:
                View viewI2 = b11.i(viewGroup, R.layout.item_horizontal_artist, viewGroup, false);
                int i3 = R.id.artist_cover_image_view;
                ImageView imageView2 = (ImageView) uo.s(viewI2, R.id.artist_cover_image_view);
                if (imageView2 != null) {
                    i3 = R.id.artist_info_text_view;
                    TextView textView3 = (TextView) uo.s(viewI2, R.id.artist_info_text_view);
                    if (textView3 != null) {
                        i3 = R.id.artist_more_button;
                        FrameLayout frameLayout2 = (FrameLayout) uo.s(viewI2, R.id.artist_more_button);
                        if (frameLayout2 != null) {
                            i3 = R.id.artist_name_text_view;
                            TextView textView4 = (TextView) uo.s(viewI2, R.id.artist_name_text_view);
                            if (textView4 != null) {
                                return new jj(this, new x12((ConstraintLayout) viewI2, imageView2, textView3, frameLayout2, textView4));
                            }
                        }
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI2.getResources().getResourceName(i3)));
                return null;
        }
    }

    public final void p(String str) {
        switch (this.q) {
            case 0:
                switch (str) {
                    case "ALBUM_ORDER_BY_NAME":
                        this.t.sort(Comparator.comparing(new m7(6)));
                        break;
                    case "ALBUM_ORDER_BY_LEAST_RECENTLY_STARRED":
                        this.t.sort(Comparator.comparing(new m7(7), Comparator.nullsLast(Comparator.naturalOrder())));
                        break;
                    case "ALBUM_ORDER_BY_MOST_RECENTLY_STARRED":
                        this.t.sort(Comparator.comparing(new m7(7), Comparator.nullsLast(Comparator.reverseOrder())));
                        break;
                }
                d();
                break;
            default:
                switch (str.hashCode()) {
                    case -1637097955:
                        if (!str.equals("ARTIST_ORDER_BY_LEAST_RECENTLY_STARRED")) {
                        }
                        break;
                    case -1566758907:
                        if (!str.equals("ARTIST_ORDER_BY_MOST_RECENTLY_STARRED")) {
                        }
                        break;
                    case 1636222570:
                        if (!str.equals("ARTIST_ORDER_BY_NAME")) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instruction units count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.b8.p(java.lang.String):void");
            }
        }
}

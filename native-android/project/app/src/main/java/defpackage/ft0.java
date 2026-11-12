package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.DownloadFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ft0 extends dw3 {
    public final DownloadFragment q;
    public String s;
    public String t;
    public List u;
    public List v;
    public List w;
    public final HashMap x = new HashMap();
    public String r = "download_type_track";

    public ft0(DownloadFragment downloadFragment) {
        this.q = downloadFragment;
        List list = Collections.EMPTY_LIST;
        this.u = list;
        this.w = list;
    }

    public static String p(String str, String str2, List list) {
        if (str2 == null) {
            return "0";
        }
        switch (str) {
            case "download_type_artist":
                return String.valueOf(list.stream().filter(new at0(10, str2)).count());
            case "download_type_year":
                return String.valueOf(list.stream().filter(new at0(9, str2)).count());
            case "download_type_playlist":
                return String.valueOf(list.stream().filter(new at0(11, str2)).count());
            case "download_type_album":
                return String.valueOf(list.stream().filter(new at0(1, str2)).count());
            case "download_type_genre":
                return String.valueOf(list.stream().filter(new at0(5, str2)).count());
            case "download_type_track":
                return String.valueOf(list.stream().filter(new at0(0, str2)).count());
            default:
                return "0";
        }
    }

    public static List q(String str, String str2, List list) {
        if (str2 != null) {
            str.getClass();
            switch (str) {
                case "download_type_artist":
                    return (List) list.stream().filter(new at0(7, str2)).collect(Collectors.toList());
                case "download_type_year":
                    return (List) list.stream().filter(new at0(6, str2)).collect(Collectors.toList());
                case "download_type_playlist":
                    return (List) list.stream().filter(new at0(8, str2)).collect(Collectors.toList());
                case "download_type_album":
                    return (List) list.stream().filter(new at0(3, str2)).collect(Collectors.toList());
                case "download_type_genre":
                    return (List) list.stream().filter(new at0(4, str2)).collect(Collectors.toList());
                case "download_type_track":
                    return (List) list.stream().filter(new at0(2, str2)).collect(Collectors.toList());
            }
        }
        return list;
    }

    public static boolean r(Child child, Child child2) {
        return (child.getAlbumId() == null || child2.getAlbumId() == null) ? Objects.equals(child.getAlbum(), child2.getAlbum()) : Objects.equals(child.getAlbumId(), child2.getAlbumId());
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.w.size();
    }

    @Override // defpackage.dw3
    public final long b(int i) {
        return i;
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        et0 et0Var = (et0) cx3Var;
        View view = et0Var.a;
        lv4 lv4Var = et0Var.u;
        String str = this.r;
        str.getClass();
        switch (str) {
            case "download_type_artist":
                Child child = (Child) this.w.get(i);
                ((TextView) lv4Var.s).setText(child.getArtist());
                TextView textView = (TextView) lv4Var.r;
                ImageView imageView = (ImageView) lv4Var.t;
                textView.setText(view.getContext().getString(R.string.download_item_single_subtitle_formatter, p("download_type_artist", child.getArtistId(), this.u)));
                Context context = view.getContext();
                String coverArtId = child.getCoverArtId();
                vz3 vz3VarT = b11.g(context, coverArtId, 9, a.c(context), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K(imageView);
                imageView.setVisibility(0);
                ((FrameLayout) lv4Var.q).setVisibility(0);
                ((LinearLayout) lv4Var.o).setVisibility(8);
                break;
            case "download_type_year":
                Child child2 = (Child) this.w.get(i);
                ((TextView) lv4Var.s).setText(String.valueOf(child2.getYear()));
                ((TextView) lv4Var.r).setText(view.getContext().getString(R.string.download_item_single_subtitle_formatter, p("download_type_year", child2.getYear().toString(), this.u)));
                ((ImageView) lv4Var.t).setVisibility(8);
                ((FrameLayout) lv4Var.q).setVisibility(0);
                ((LinearLayout) lv4Var.o).setVisibility(8);
                break;
            case "download_type_playlist":
                Child child3 = (Child) this.w.get(i);
                if (child3 instanceof Download) {
                    Download download = (Download) child3;
                    ((TextView) lv4Var.s).setText(download.getPlaylistName());
                    TextView textView2 = (TextView) lv4Var.r;
                    ImageView imageView2 = (ImageView) lv4Var.t;
                    textView2.setText(view.getContext().getString(R.string.download_item_single_subtitle_formatter, p("download_type_playlist", download.getPlaylistId(), this.u)));
                    String playlistId = download.getPlaylistId();
                    String coverArtId2 = (String) this.x.get(playlistId);
                    if (coverArtId2 == null) {
                        new Thread(new ct0(this, playlistId, et0Var, i)).start();
                        coverArtId2 = download.getCoverArtId();
                    }
                    Context context2 = view.getContext();
                    vz3 vz3VarT2 = b11.g(context2, coverArtId2, 9, a.c(context2), coverArtId2 != null ? wg0.b(ud3.t(), coverArtId2) : null).T(xv0.b());
                    if (ud3.R()) {
                        vz3VarT2 = (vz3) vz3VarT2.l();
                    }
                    vz3VarT2.K(imageView2);
                    imageView2.setVisibility(0);
                    ((FrameLayout) lv4Var.q).setVisibility(0);
                    ((LinearLayout) lv4Var.o).setVisibility(8);
                    break;
                }
                break;
            case "download_type_album":
                Child child4 = (Child) this.w.get(i);
                ((TextView) lv4Var.s).setText(child4.getAlbum());
                TextView textView3 = (TextView) lv4Var.r;
                ImageView imageView3 = (ImageView) lv4Var.t;
                LinearLayout linearLayout = (LinearLayout) lv4Var.o;
                textView3.setText(view.getContext().getString(R.string.download_item_single_subtitle_formatter, p("download_type_album", child4.getAlbumId(), this.u)));
                TextView textView4 = (TextView) lv4Var.p;
                String albumArtist = child4.getAlbumArtist();
                if (albumArtist == null || albumArtist.isEmpty()) {
                    albumArtist = null;
                }
                if (albumArtist == null) {
                    albumArtist = child4.getArtist();
                }
                textView4.setText(albumArtist);
                Context context3 = view.getContext();
                String coverArtId3 = child4.getCoverArtId();
                vz3 vz3VarT3 = b11.g(context3, coverArtId3, 9, a.c(context3), coverArtId3 != null ? wg0.b(ud3.t(), coverArtId3) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT3 = (vz3) vz3VarT3.l();
                }
                vz3VarT3.K(imageView3);
                imageView3.setVisibility(0);
                ((FrameLayout) lv4Var.q).setVisibility(0);
                linearLayout.setVisibility(0);
                if (i > 0) {
                    int i2 = i - 1;
                    if (this.w.get(i2) != null) {
                        Child child5 = (Child) this.w.get(i2);
                        Child child6 = (Child) this.w.get(i);
                        String albumArtist2 = child5.getAlbumArtist();
                        if (albumArtist2 == null || albumArtist2.isEmpty()) {
                            albumArtist2 = null;
                        }
                        String albumArtist3 = child6.getAlbumArtist();
                        if (albumArtist3 == null || albumArtist3.isEmpty()) {
                            albumArtist3 = null;
                        }
                        if (!((albumArtist2 == null && albumArtist3 == null) ? r(child5, child6) : Objects.equals(albumArtist2, albumArtist3))) {
                            linearLayout.setPadding(0, (int) view.getContext().getResources().getDimension(R.dimen.downloaded_item_padding), 0, 0);
                        }
                    }
                    break;
                }
                if (i > 0) {
                    linearLayout.setVisibility(8);
                    break;
                }
                break;
            case "download_type_genre":
                Child child7 = (Child) this.w.get(i);
                ((TextView) lv4Var.s).setText(child7.getGenre());
                ((TextView) lv4Var.r).setText(view.getContext().getString(R.string.download_item_single_subtitle_formatter, p("download_type_genre", child7.getGenre(), this.u)));
                ((ImageView) lv4Var.t).setVisibility(8);
                ((FrameLayout) lv4Var.q).setVisibility(0);
                ((LinearLayout) lv4Var.o).setVisibility(8);
                break;
            case "download_type_track":
                Child child8 = (Child) this.w.get(i);
                ((TextView) lv4Var.s).setText(child8.getTitle());
                TextView textView5 = (TextView) lv4Var.r;
                ImageView imageView4 = (ImageView) lv4Var.t;
                LinearLayout linearLayout2 = (LinearLayout) lv4Var.o;
                textView5.setText(view.getContext().getString(R.string.song_subtitle_formatter, child8.getArtist(), e03.g(child8.getDuration()), e03.f(child8)));
                ((TextView) lv4Var.p).setText(child8.getAlbum());
                Context context4 = view.getContext();
                String coverArtId4 = child8.getCoverArtId();
                vz3 vz3VarT4 = b11.g(context4, coverArtId4, 9, a.c(context4), coverArtId4 != null ? wg0.b(ud3.t(), coverArtId4) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT4 = (vz3) vz3VarT4.l();
                }
                vz3VarT4.K(imageView4);
                imageView4.setVisibility(0);
                ((FrameLayout) lv4Var.q).setVisibility(0);
                linearLayout2.setVisibility(0);
                if (i > 0) {
                    int i3 = i - 1;
                    if (this.w.get(i3) != null && !r((Child) this.w.get(i3), (Child) this.w.get(i))) {
                        linearLayout2.setPadding(0, (int) view.getContext().getResources().getDimension(R.dimen.downloaded_item_padding), 0, 0);
                    }
                    break;
                }
                if (i > 0) {
                    linearLayout2.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        View viewI = b11.i(viewGroup, R.layout.item_horizontal_download, viewGroup, false);
        int i2 = R.id.divider;
        LinearLayout linearLayout = (LinearLayout) uo.s(viewI, R.id.divider);
        if (linearLayout != null) {
            i2 = R.id.downloaded_item_more_button;
            FrameLayout frameLayout = (FrameLayout) uo.s(viewI, R.id.downloaded_item_more_button);
            if (frameLayout != null) {
                i2 = R.id.downloaded_item_pre_text_view;
                TextView textView = (TextView) uo.s(viewI, R.id.downloaded_item_pre_text_view);
                if (textView != null) {
                    i2 = R.id.downloaded_item_subtitle_text_view;
                    TextView textView2 = (TextView) uo.s(viewI, R.id.downloaded_item_subtitle_text_view);
                    if (textView2 != null) {
                        i2 = R.id.downloaded_item_title_text_view;
                        TextView textView3 = (TextView) uo.s(viewI, R.id.downloaded_item_title_text_view);
                        if (textView3 != null) {
                            i2 = R.id.item_cover_image_view;
                            ImageView imageView = (ImageView) uo.s(viewI, R.id.item_cover_image_view);
                            if (imageView != null) {
                                return new et0(this, new lv4((ConstraintLayout) viewI, linearLayout, frameLayout, textView, textView2, textView3, imageView));
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewI.getResources().getResourceName(i2)));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    public final void s(String str, String str2, String str3, List list) {
        List listQ;
        String str4 = str3 != null ? str : str2;
        this.r = str4;
        this.s = str2;
        this.t = str3;
        this.u = list;
        str4.getClass();
        final int i = 0;
        final int i2 = 5;
        final int i3 = 4;
        switch (str4) {
            case "download_type_artist":
                listQ = q(this.s, this.t, (List) list.stream().filter(new c7(6)).filter(q05.j(new m7(19))).sorted(Comparator.comparing(new m7(20), Comparator.nullsLast(Comparator.naturalOrder()))).collect(Collectors.toList()));
                break;
            case "download_type_year":
                listQ = q(this.s, this.t, (List) list.stream().filter(new c7(8)).filter(q05.j(new m7(15))).collect(Collectors.toList()));
                break;
            case "download_type_playlist":
                listQ = q(this.s, this.t, (List) list.stream().filter(new c7(4)).filter(q05.j(new m7(16))).collect(Collectors.toList()));
                break;
            case "download_type_album":
                listQ = q(this.s, this.t, (List) list.stream().filter(new c7(5)).filter(q05.j(new m7(18))).collect(Collectors.toList()));
                break;
            case "download_type_genre":
                listQ = q(this.s, this.t, (List) list.stream().filter(new c7(7)).filter(q05.j(new m7(21))).collect(Collectors.toList()));
                break;
            case "download_type_track":
                listQ = q(this.s, this.t, (List) list.stream().filter(new c7(3)).filter(q05.j(new m7(17))).collect(Collectors.toList()));
                break;
            default:
                listQ = Collections.EMPTY_LIST;
                break;
        }
        this.w = listQ;
        List arrayList = new ArrayList(list);
        if (this.t != null) {
            String str5 = this.s;
            str5.getClass();
            switch (str5) {
                case "download_type_artist":
                    final int i4 = 2;
                    arrayList = (List) arrayList.stream().filter(new Predicate(this) { // from class: bt0
                        public final /* synthetic */ ft0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int i5 = i4;
                            ft0 ft0Var = this.b;
                            Child child = (Child) obj;
                            ft0Var.getClass();
                            switch (i5) {
                                case 0:
                                    return Objects.equals(child.getGenre(), ft0Var.t);
                                case 1:
                                    return Objects.equals(child.getYear(), Integer.valueOf(ft0Var.t));
                                case 2:
                                    return Objects.equals(child.getArtistId(), ft0Var.t);
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    return (child instanceof Download) && Objects.equals(((Download) child).getPlaylistId(), ft0Var.t);
                                case 4:
                                    return child.getId().equals(ft0Var.t);
                                default:
                                    return Objects.equals(child.getAlbumId(), ft0Var.t);
                            }
                        }
                    }).collect(Collectors.toList());
                    break;
                case "download_type_year":
                    final int i5 = 1;
                    arrayList = (List) arrayList.stream().filter(new Predicate(this) { // from class: bt0
                        public final /* synthetic */ ft0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int i6 = i5;
                            ft0 ft0Var = this.b;
                            Child child = (Child) obj;
                            ft0Var.getClass();
                            switch (i6) {
                                case 0:
                                    return Objects.equals(child.getGenre(), ft0Var.t);
                                case 1:
                                    return Objects.equals(child.getYear(), Integer.valueOf(ft0Var.t));
                                case 2:
                                    return Objects.equals(child.getArtistId(), ft0Var.t);
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    return (child instanceof Download) && Objects.equals(((Download) child).getPlaylistId(), ft0Var.t);
                                case 4:
                                    return child.getId().equals(ft0Var.t);
                                default:
                                    return Objects.equals(child.getAlbumId(), ft0Var.t);
                            }
                        }
                    }).collect(Collectors.toList());
                    break;
                case "download_type_playlist":
                    final int i6 = 3;
                    arrayList = (List) arrayList.stream().filter(new Predicate(this) { // from class: bt0
                        public final /* synthetic */ ft0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int i7 = i6;
                            ft0 ft0Var = this.b;
                            Child child = (Child) obj;
                            ft0Var.getClass();
                            switch (i7) {
                                case 0:
                                    return Objects.equals(child.getGenre(), ft0Var.t);
                                case 1:
                                    return Objects.equals(child.getYear(), Integer.valueOf(ft0Var.t));
                                case 2:
                                    return Objects.equals(child.getArtistId(), ft0Var.t);
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    return (child instanceof Download) && Objects.equals(((Download) child).getPlaylistId(), ft0Var.t);
                                case 4:
                                    return child.getId().equals(ft0Var.t);
                                default:
                                    return Objects.equals(child.getAlbumId(), ft0Var.t);
                            }
                        }
                    }).collect(Collectors.toList());
                    break;
                case "download_type_album":
                    arrayList = (List) arrayList.stream().filter(new Predicate(this) { // from class: bt0
                        public final /* synthetic */ ft0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int i7 = i2;
                            ft0 ft0Var = this.b;
                            Child child = (Child) obj;
                            ft0Var.getClass();
                            switch (i7) {
                                case 0:
                                    return Objects.equals(child.getGenre(), ft0Var.t);
                                case 1:
                                    return Objects.equals(child.getYear(), Integer.valueOf(ft0Var.t));
                                case 2:
                                    return Objects.equals(child.getArtistId(), ft0Var.t);
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    return (child instanceof Download) && Objects.equals(((Download) child).getPlaylistId(), ft0Var.t);
                                case 4:
                                    return child.getId().equals(ft0Var.t);
                                default:
                                    return Objects.equals(child.getAlbumId(), ft0Var.t);
                            }
                        }
                    }).collect(Collectors.toList());
                    break;
                case "download_type_genre":
                    arrayList = (List) arrayList.stream().filter(new Predicate(this) { // from class: bt0
                        public final /* synthetic */ ft0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int i7 = i;
                            ft0 ft0Var = this.b;
                            Child child = (Child) obj;
                            ft0Var.getClass();
                            switch (i7) {
                                case 0:
                                    return Objects.equals(child.getGenre(), ft0Var.t);
                                case 1:
                                    return Objects.equals(child.getYear(), Integer.valueOf(ft0Var.t));
                                case 2:
                                    return Objects.equals(child.getArtistId(), ft0Var.t);
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    return (child instanceof Download) && Objects.equals(((Download) child).getPlaylistId(), ft0Var.t);
                                case 4:
                                    return child.getId().equals(ft0Var.t);
                                default:
                                    return Objects.equals(child.getAlbumId(), ft0Var.t);
                            }
                        }
                    }).collect(Collectors.toList());
                    break;
                case "download_type_track":
                    arrayList = (List) arrayList.stream().filter(new Predicate(this) { // from class: bt0
                        public final /* synthetic */ ft0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int i7 = i3;
                            ft0 ft0Var = this.b;
                            Child child = (Child) obj;
                            ft0Var.getClass();
                            switch (i7) {
                                case 0:
                                    return Objects.equals(child.getGenre(), ft0Var.t);
                                case 1:
                                    return Objects.equals(child.getYear(), Integer.valueOf(ft0Var.t));
                                case 2:
                                    return Objects.equals(child.getArtistId(), ft0Var.t);
                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    return (child instanceof Download) && Objects.equals(((Download) child).getPlaylistId(), ft0Var.t);
                                case 4:
                                    return child.getId().equals(ft0Var.t);
                                default:
                                    return Objects.equals(child.getAlbumId(), ft0Var.t);
                            }
                        }
                    }).collect(Collectors.toList());
                    break;
            }
        }
        this.v = arrayList;
        d();
    }
}

package defpackage;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class en3 extends dw3 {
    public final ClickCallback q;
    public List r;
    public List s;

    public en3(ClickCallback clickCallback) {
        this.q = clickCallback;
        List list = Collections.EMPTY_LIST;
        this.r = list;
        this.s = list;
    }

    @Override // defpackage.dw3
    public final int a() {
        List list = this.r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // defpackage.dw3
    public final long b(int i) {
        return i;
    }

    @Override // defpackage.dw3
    public final int c(int i) {
        return 0;
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        String string;
        dn3 dn3Var = (dn3) cx3Var;
        PodcastEpisode podcastEpisode = (PodcastEpisode) this.r.get(i);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d");
        View view = dn3Var.a;
        w12 w12Var = dn3Var.u;
        Context context = view.getContext();
        Date publishDate = podcastEpisode.getPublishDate();
        String format = publishDate != null ? simpleDateFormat.format(publishDate) : context.getString(R.string.podcast_release_no_date);
        Integer duration = podcastEpisode.getDuration();
        if (duration != null) {
            long intValue = duration.intValue();
            Pattern pattern = e03.a;
            long j = intValue / 60;
            string = j < 60 ? String.format(Locale.getDefault(), "%01d min", Long.valueOf(j)) : String.format(Locale.getDefault(), "%d h %02d min", Long.valueOf(j / 60), Long.valueOf(j % 60));
        } else {
            string = context.getString(R.string.podcast_release_unknown_duration);
        }
        String string2 = context.getString(R.string.podcast_release_date_duration_formatter, format, string);
        ((TextView) w12Var.g).setText(podcastEpisode.getTitle());
        ((TextView) w12Var.f).setText(podcastEpisode.getArtist());
        ((TextView) w12Var.e).setText(string2);
        TextView textView = (TextView) w12Var.d;
        String description = podcastEpisode.getDescription();
        Pattern pattern2 = e03.a;
        textView.setText(description != null ? Html.fromHtml(description, 63).toString() : "");
        Context context2 = view.getContext();
        String coverArtId = podcastEpisode.getCoverArtId();
        vz3 T = b11.g(context2, coverArtId, 7, a.c(context2), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
        if (ud3.R()) {
            T = (vz3) T.l();
        }
        T.K((ImageView) w12Var.c);
        ((Button) w12Var.j).setEnabled(podcastEpisode.getStatus().equals("completed"));
        ((Button) w12Var.i).setVisibility(podcastEpisode.getStatus().equals("completed") ? 0 : 8);
        ((Button) w12Var.h).setVisibility(podcastEpisode.getStatus().equals("completed") ? 8 : 0);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        View i2 = b11.i(viewGroup, R.layout.item_home_podcast_episode, viewGroup, false);
        int i3 = R.id.podcast_cover_image_view;
        ImageView imageView = (ImageView) uo.s(i2, R.id.podcast_cover_image_view);
        if (imageView != null) {
            i3 = R.id.podcast_description_text;
            TextView textView = (TextView) uo.s(i2, R.id.podcast_description_text);
            if (textView != null) {
                i3 = R.id.podcast_download_request_button;
                Button button = (Button) uo.s(i2, R.id.podcast_download_request_button);
                if (button != null) {
                    i3 = R.id.podcast_more_button;
                    Button button2 = (Button) uo.s(i2, R.id.podcast_more_button);
                    if (button2 != null) {
                        i3 = R.id.podcast_play_button;
                        Button button3 = (Button) uo.s(i2, R.id.podcast_play_button);
                        if (button3 != null) {
                            i3 = R.id.podcast_releases_and_duration_label;
                            TextView textView2 = (TextView) uo.s(i2, R.id.podcast_releases_and_duration_label);
                            if (textView2 != null) {
                                i3 = R.id.podcast_subtitle_label;
                                TextView textView3 = (TextView) uo.s(i2, R.id.podcast_subtitle_label);
                                if (textView3 != null) {
                                    i3 = R.id.podcast_title_label;
                                    TextView textView4 = (TextView) uo.s(i2, R.id.podcast_title_label);
                                    if (textView4 != null) {
                                        i3 = R.id.podcast_upper_divider;
                                        View s = uo.s(i2, R.id.podcast_upper_divider);
                                        if (s != null) {
                                            return new dn3(this, new w12((ConstraintLayout) i2, imageView, textView, button, button2, button3, textView2, textView3, textView4, s));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(i2.getResources().getResourceName(i3)));
        return null;
    }

    public final void p(List list) {
        if (list == null) {
            List list2 = Collections.EMPTY_LIST;
            this.s = list2;
            this.r = list2;
        } else {
            List list3 = (List) list.stream().filter(new c7(17)).collect(Collectors.toList());
            this.s = list3;
            this.r = (List) list3.stream().filter(new c7(18)).collect(Collectors.toList());
        }
        d();
    }

    public final void q(String str) {
        if (this.s == null) {
            this.s = Collections.EMPTY_LIST;
        }
        if (str.equals("PODCAST_FILTER_BY_ALL")) {
            this.r = this.s;
        } else if (str.equals("PODCAST_FILTER_BY_DOWNLOAD")) {
            this.r = (List) this.s.stream().filter(new c7(19)).collect(Collectors.toList());
        }
        if (this.r == null) {
            this.r = Collections.EMPTY_LIST;
        }
        d();
    }
}

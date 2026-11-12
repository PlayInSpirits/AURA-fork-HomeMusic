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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class en3 extends dw3 {
    public final ClickCallback q;
    public List r;
    public List s;

    public en3(ClickCallback r1) {
        this.q = r1;
        List r2 = Collections.EMPTY_LIST;
        this.r = r2;
        this.s = r2;
    }

    @Override // defpackage.dw3
    public final int a() {
        List r0 = this.r;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.size();
    }

    @Override // defpackage.dw3
    public final long b(int r1) {
        return r1;
    }

    @Override // defpackage.dw3
    public final int c(int r1) {
        return 0;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r9, int r10) {
        dn3 r11 = (dn3) r9;
        PodcastEpisode r8 = (PodcastEpisode) this.r.get(r10);
        SimpleDateFormat r12 = new SimpleDateFormat("MMM d");
        View r0 = r11.a;
        w12 r13 = r11.u;
        Context r1 = r0.getContext();
        Date r2 = r8.getPublishDate();
        if (r2 == null) goto L5;
        String r14 = r12.format(r2);
    L6:
        Integer r3 = r8.getDuration();
        if (r3 == null) goto L12;
        long r4 = r3.intValue();
        Pattern r5 = e03.a;
        long r6 = r4 / 60;
        if (r6 >= 60) goto L11;
        String r7 = String.format(Locale.getDefault(), "%01d min", new Object[]{Long.valueOf(r6)});
    L13:
        String r15 = r1.getString(R.string.podcast_release_date_duration_formatter, new Object[]{r14, r7});
        ((TextView) r13.g).setText(r8.getTitle());
        ((TextView) r13.f).setText(r8.getArtist());
        ((TextView) r13.e).setText(r15);
        TextView r16 = (TextView) r13.d;
        String r17 = r8.getDescription();
        Pattern r18 = e03.a;
        if (r17 == null) goto L16;
        String r19 = Html.fromHtml(r17, 63).toString();
    L17:
        r16.setText(r19);
        Context r110 = r0.getContext();
        String r20 = r8.getCoverArtId();
        c04 r21 = a.c(r110);
        if (r20 == null) goto L20;
        String r22 = wg0.b(ud3.t(), r20);
    L21:
        vz3 r111 = b11.g(r110, r20, 7, r21, r22).T(xv0.b());
        if (ud3.R() == false) goto L24;
        r111 = (vz3) r111.l();
    L24:
        r111.K((ImageView) r13.c);
        ((Button) r13.j).setEnabled(r8.getStatus().equals("completed"));
        Button r112 = (Button) r13.i;
        int r23 = 8;
        if (r8.getStatus().equals("completed") == false) goto L27;
        int r24 = 0;
    L28:
        r112.setVisibility(r24);
        Button r25 = (Button) r13.h;
        if (r8.getStatus().equals("completed") == true) goto L32;
        r23 = 0;
    L32:
        r25.setVisibility(r23);
        return;
    L27:
        r24 = 8;
        goto L28
    L20:
        r22 = null;
        goto L21
    L16:
        r19 = "";
        goto L17
    L11:
        r7 = String.format(Locale.getDefault(), "%d h %02d min", new Object[]{Long.valueOf(r6 / 60), Long.valueOf(r6 % 60)});
        goto L13
    L12:
        r7 = r1.getString(R.string.podcast_release_unknown_duration);
        goto L13
    L5:
        r14 = r1.getString(R.string.podcast_release_no_date);
        goto L6
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r13, int r14) {
        View r15 = b11.i(r13, R.layout.item_home_podcast_episode, r13, false);
        int r16 = R.id.podcast_cover_image_view;
        ImageView r3 = (ImageView) uo.s(r15, R.id.podcast_cover_image_view);
        if (r3 == null) goto L22;
        r16 = R.id.podcast_description_text;
        TextView r4 = (TextView) uo.s(r15, R.id.podcast_description_text);
        if (r4 == null) goto L22;
        r16 = R.id.podcast_download_request_button;
        Button r5 = (Button) uo.s(r15, R.id.podcast_download_request_button);
        if (r5 == null) goto L22;
        r16 = R.id.podcast_more_button;
        Button r6 = (Button) uo.s(r15, R.id.podcast_more_button);
        if (r6 == null) goto L22;
        r16 = R.id.podcast_play_button;
        Button r7 = (Button) uo.s(r15, R.id.podcast_play_button);
        if (r7 == null) goto L22;
        r16 = R.id.podcast_releases_and_duration_label;
        TextView r8 = (TextView) uo.s(r15, R.id.podcast_releases_and_duration_label);
        if (r8 == null) goto L22;
        r16 = R.id.podcast_subtitle_label;
        TextView r9 = (TextView) uo.s(r15, R.id.podcast_subtitle_label);
        if (r9 == null) goto L22;
        r16 = R.id.podcast_title_label;
        TextView r10 = (TextView) uo.s(r15, R.id.podcast_title_label);
        if (r10 == null) goto L22;
        r16 = R.id.podcast_upper_divider;
        View r11 = uo.s(r15, R.id.podcast_upper_divider);
        if (r11 == null) goto L22;
        return new dn3(this, new w12((ConstraintLayout) r15, r3, r4, r5, r6, r7, r8, r9, r10, r11));
    L22:
        nz2.n("Missing required view with ID: ".concat(r15.getResources().getResourceName(r16)));
        return null;
    }

    public final void p(List r3) {
        if (r3 != null) goto L4;
        List r4 = Collections.EMPTY_LIST;
        this.s = r4;
        this.r = r4;
    L5:
        d();
        return;
    L4:
        List r5 = (List) r3.stream().filter(new c7(17)).collect(Collectors.toList());
        this.s = r5;
        this.r = (List) r5.stream().filter(new c7(18)).collect(Collectors.toList());
        goto L5
    }

    public final void q(String r3) {
        if (this.s != null) goto L6;
        this.s = Collections.EMPTY_LIST;
    L6:
        if (r3.equals("PODCAST_FILTER_BY_ALL") == false) goto L8;
        this.r = this.s;
    L13:
        if (this.r != null) goto L15;
        this.r = Collections.EMPTY_LIST;
    L15:
        d();
        return;
    L8:
        if (r3.equals("PODCAST_FILTER_BY_DOWNLOAD") == false) goto L13;
        this.r = (List) this.s.stream().filter(new c7(19)).collect(Collectors.toList());
        goto L13
    }
}

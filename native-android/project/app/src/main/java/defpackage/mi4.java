package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mi4 extends cx3 {
    public final y12 u;
    public final /* synthetic */ ni4 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public mi4(ni4 ni4Var, y12 y12Var) {
        this.v = ni4Var;
        ConstraintLayout constraintLayout = y12Var.a;
        super(constraintLayout);
        this.u = y12Var;
        final int i = 1;
        y12Var.q.setSelected(true);
        y12Var.p.setSelected(true);
        final int i2 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: li4
            public final /* synthetic */ mi4 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                mi4 mi4Var = this.o;
                switch (i3) {
                    case 0:
                        ni4 ni4Var2 = mi4Var.v;
                        int iC = mi4Var.c();
                        if (iC != -1) {
                            rm3 rm3Var = ni4Var2.B;
                            ClickCallback clickCallback = ni4Var2.q;
                            pk pkVar = ni4Var2.v;
                            if (rm3Var == null || ((LinkedHashSet) rm3Var.n).isEmpty()) {
                                Child child = (Child) pkVar.f.get(iC);
                                Bundle bundle = new Bundle();
                                List listSubList = pkVar.f;
                                int iC2 = mi4Var.c();
                                Pattern pattern = e03.a;
                                if (!listSubList.isEmpty() && listSubList.size() > 100) {
                                    int i4 = iC2 < 15 ? 0 : iC2 - 15;
                                    listSubList = listSubList.subList(i4, Math.min(i4 + 100, listSubList.size()));
                                }
                                bundle.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(listSubList));
                                List list = pkVar.f;
                                int iC3 = mi4Var.c();
                                if (!list.isEmpty() && list.size() > 100) {
                                    iC3 = Math.min(iC3, 15);
                                }
                                bundle.putInt("ITEM_POSITION", iC3);
                                if (!u52.c().a) {
                                    if (!child.getId().equals(ni4Var2.x)) {
                                        clickCallback.onMediaClick(bundle);
                                    } else {
                                        Log.i("SongHorizontalAdapter", "Tapping on currently playing song, toggling playback");
                                        try {
                                            bj2 bj2Var = (bj2) ni4Var2.A.get();
                                            Log.i("SongHorizontalAdapter", "MediaBrowser retrieved, isPlaying: " + ni4Var2.y);
                                            if (ni4Var2.y) {
                                                bj2Var.c();
                                            } else {
                                                bj2Var.m0();
                                            }
                                        } catch (InterruptedException e) {
                                            e = e;
                                            Log.e("SongHorizontalAdapter", "Error getting MediaBrowser", e);
                                            return;
                                        } catch (ExecutionException e2) {
                                            e = e2;
                                            Log.e("SongHorizontalAdapter", "Error getting MediaBrowser", e);
                                            return;
                                        }
                                    }
                                } else if (!child.getId().equals(u52.c().x)) {
                                    clickCallback.onMediaClick(bundle);
                                } else {
                                    u52.a(u52.c().k ? "pause" : "play", 0L);
                                }
                            } else {
                                mi4Var.t();
                            }
                            break;
                        }
                        break;
                    default:
                        rm3 rm3Var2 = mi4Var.v.B;
                        if (rm3Var2 == null || ((LinkedHashSet) rm3Var2.n).isEmpty()) {
                            mi4Var.s();
                        } else {
                            mi4Var.t();
                        }
                        break;
                }
            }
        });
        constraintLayout.setOnLongClickListener(new q6(24, this));
        y12Var.o.setOnClickListener(new View.OnClickListener(this) { // from class: li4
            public final /* synthetic */ mi4 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                mi4 mi4Var = this.o;
                switch (i3) {
                    case 0:
                        ni4 ni4Var2 = mi4Var.v;
                        int iC = mi4Var.c();
                        if (iC != -1) {
                            rm3 rm3Var = ni4Var2.B;
                            ClickCallback clickCallback = ni4Var2.q;
                            pk pkVar = ni4Var2.v;
                            if (rm3Var == null || ((LinkedHashSet) rm3Var.n).isEmpty()) {
                                Child child = (Child) pkVar.f.get(iC);
                                Bundle bundle = new Bundle();
                                List listSubList = pkVar.f;
                                int iC2 = mi4Var.c();
                                Pattern pattern = e03.a;
                                if (!listSubList.isEmpty() && listSubList.size() > 100) {
                                    int i4 = iC2 < 15 ? 0 : iC2 - 15;
                                    listSubList = listSubList.subList(i4, Math.min(i4 + 100, listSubList.size()));
                                }
                                bundle.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(listSubList));
                                List list = pkVar.f;
                                int iC3 = mi4Var.c();
                                if (!list.isEmpty() && list.size() > 100) {
                                    iC3 = Math.min(iC3, 15);
                                }
                                bundle.putInt("ITEM_POSITION", iC3);
                                if (!u52.c().a) {
                                    if (!child.getId().equals(ni4Var2.x)) {
                                        clickCallback.onMediaClick(bundle);
                                    } else {
                                        Log.i("SongHorizontalAdapter", "Tapping on currently playing song, toggling playback");
                                        try {
                                            bj2 bj2Var = (bj2) ni4Var2.A.get();
                                            Log.i("SongHorizontalAdapter", "MediaBrowser retrieved, isPlaying: " + ni4Var2.y);
                                            if (ni4Var2.y) {
                                                bj2Var.c();
                                            } else {
                                                bj2Var.m0();
                                            }
                                        } catch (InterruptedException e) {
                                            e = e;
                                            Log.e("SongHorizontalAdapter", "Error getting MediaBrowser", e);
                                            return;
                                        } catch (ExecutionException e2) {
                                            e = e2;
                                            Log.e("SongHorizontalAdapter", "Error getting MediaBrowser", e);
                                            return;
                                        }
                                    }
                                } else if (!child.getId().equals(u52.c().x)) {
                                    clickCallback.onMediaClick(bundle);
                                } else {
                                    u52.a(u52.c().k ? "pause" : "play", 0L);
                                }
                            } else {
                                mi4Var.t();
                            }
                            break;
                        }
                        break;
                    default:
                        rm3 rm3Var2 = mi4Var.v.B;
                        if (rm3Var2 == null || ((LinkedHashSet) rm3Var2.n).isEmpty()) {
                            mi4Var.s();
                        } else {
                            mi4Var.t();
                        }
                        break;
                }
            }
        });
    }

    public final void s() {
        Bundle bundle = new Bundle();
        ni4 ni4Var = this.v;
        bundle.putParcelable("TRACK_OBJECT", (Parcelable) ni4Var.v.f.get(c()));
        bundle.putInt("ITEM_POSITION", c());
        ni4Var.q.onMediaLongClick(bundle);
    }

    public final boolean t() {
        int iC = c();
        if (iC == -1) {
            return false;
        }
        ni4 ni4Var = this.v;
        rm3 rm3Var = ni4Var.B;
        Child child = (Child) ni4Var.v.f.get(iC);
        rm3Var.getClass();
        child.getClass();
        LinkedHashSet linkedHashSet = (LinkedHashSet) rm3Var.n;
        if (!linkedHashSet.remove(child.getId())) {
            linkedHashSet.add(child.getId());
        }
        vo1 vo1Var = (vo1) rm3Var.o;
        if (vo1Var == null) {
            return true;
        }
        vo1Var.invoke();
        return true;
    }
}

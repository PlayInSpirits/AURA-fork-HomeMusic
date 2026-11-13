package com.eddyizm.tempus.homemusic;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import defpackage.df;
import defpackage.h12;
import defpackage.io1;
import defpackage.jv3;
import defpackage.nz2;
import defpackage.p6;
import defpackage.pt0;
import defpackage.q40;
import defpackage.qm4;
import defpackage.r40;
import defpackage.t6;
import defpackage.ti;
import defpackage.uo;
import defpackage.ux3;
import defpackage.ws1;
import defpackage.xm4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class HubShareActivity extends df {
    public static final ux3 P = new ux3("https?://\\S+");
    public jv3 N;
    public boolean O;

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ClipData clipData;
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        super.onCreate(bundle);
        int i = 0;
        View inflate = getLayoutInflater().inflate(R.layout.activity_hub_share, (ViewGroup) null, false);
        int i2 = R.id.hub_share_close;
        MaterialButton materialButton = (MaterialButton) uo.s(inflate, R.id.hub_share_close);
        if (materialButton != null) {
            i2 = R.id.hub_share_progress;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) uo.s(inflate, R.id.hub_share_progress);
            if (circularProgressIndicator != null) {
                i2 = R.id.hub_share_text;
                TextView textView = (TextView) uo.s(inflate, R.id.hub_share_text);
                if (textView != null) {
                    jv3 jv3Var = new jv3();
                    jv3Var.n = materialButton;
                    jv3Var.o = circularProgressIndicator;
                    jv3Var.p = textView;
                    this.N = jv3Var;
                    setContentView((LinearLayout) inflate);
                    jv3 jv3Var2 = this.N;
                    if (jv3Var2 == null) {
                        h12.Q("bind");
                        throw null;
                    }
                    ((MaterialButton) jv3Var2.n).setOnClickListener(new p6(20, this));
                    if (!pt0.c()) {
                        Toast.makeText(this, R.string.homemusic_share_login_first, 1).show();
                        startActivity(new Intent(this, (Class<?>) MainActivity.class).addFlags(268435456));
                        finish();
                        return;
                    }
                    if (bundle != null || this.O) {
                        return;
                    }
                    this.O = true;
                    Intent intent = getIntent();
                    intent.getClass();
                    ArrayList arrayList = new ArrayList();
                    String action = intent.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -1173264947) {
                            if (hashCode == -58484670 && action.equals("android.intent.action.SEND_MULTIPLE")) {
                                ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                                if (parcelableArrayListExtra != null) {
                                    arrayList.addAll(parcelableArrayListExtra);
                                }
                            }
                        } else if (action.equals("android.intent.action.SEND")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class);
                                parcelableExtra = (Parcelable) parcelableExtra2;
                            } else {
                                parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
                            }
                            Uri uri = (Uri) parcelableExtra;
                            if (uri != null) {
                                arrayList.add(uri);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && (clipData = intent.getClipData()) != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i3 = 0; i3 < itemCount; i3++) {
                            Uri uri2 = clipData.getItemAt(i3).getUri();
                            if (uri2 != null) {
                                arrayList.add(uri2);
                            }
                        }
                    }
                    List t0 = q40.t0(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = t0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        String type = getContentResolver().getType((Uri) next);
                        String lowerCase = ((type == null && (type = intent.getType()) == null) ? "" : type).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (xm4.k0(lowerCase, "image/", false)) {
                            arrayList2.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : t0) {
                        String type2 = getContentResolver().getType((Uri) obj);
                        if (type2 == null && (type2 = intent.getType()) == null) {
                            type2 = "";
                        }
                        String lowerCase2 = type2.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        if (xm4.k0(lowerCase2, "audio/", false) || lowerCase2.equals("application/ogg")) {
                            arrayList3.add(obj);
                        }
                    }
                    String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
                    CharSequence charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT");
                    ArrayList i0 = ti.i0(new String[]{stringExtra, charSequenceExtra != null ? charSequenceExtra.toString() : null});
                    ArrayList arrayList4 = new ArrayList(r40.k0(i0, 10));
                    int size = i0.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj2 = i0.get(i4);
                        i4++;
                        arrayList4.add(qm4.K0((String) obj2).toString());
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int size2 = arrayList4.size();
                    while (i < size2) {
                        Object obj3 = arrayList4.get(i);
                        i++;
                        if (((String) obj3).length() > 0) {
                            arrayList5.add(obj3);
                        }
                    }
                    String B0 = q40.B0(q40.t0(arrayList5), " ", null, null, null, 62);
                    if (arrayList2.isEmpty() && arrayList3.isEmpty() && B0.length() == 0) {
                        String string = getString(R.string.homemusic_share_unsupported);
                        string.getClass();
                        p(string);
                        return;
                    } else {
                        String string2 = getString(R.string.homemusic_share_connecting);
                        string2.getClass();
                        io1.b.post(new ws1(this, string2, 2));
                        io1.a.execute(new t6(arrayList2, this, arrayList3, B0, 8));
                        return;
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public final void p(String str) {
        jv3 jv3Var = this.N;
        if (jv3Var == null) {
            h12.Q("bind");
            throw null;
        }
        ((CircularProgressIndicator) jv3Var.o).setVisibility(8);
        jv3 jv3Var2 = this.N;
        if (jv3Var2 == null) {
            h12.Q("bind");
            throw null;
        }
        ((TextView) jv3Var2.p).setText(str);
        jv3 jv3Var3 = this.N;
        if (jv3Var3 != null) {
            ((MaterialButton) jv3Var3.n).setVisibility(0);
        } else {
            h12.Q("bind");
            throw null;
        }
    }
}

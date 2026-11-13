.class public Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;
.super Ldefpackage/zt;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public B0:Ljava/util/ArrayList;

.field public C0:Ljava/lang/String;

.field public D0:Ljava/lang/String;

.field public E0:Ldefpackage/bl2;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/zt;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .line 1
    const p3, 0x7f0d0022

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p2, p0, Ldefpackage/kc1;->s:Landroid/os/Bundle;

    .line 10
    .line 11
    if-eqz p2, :cond_5

    .line 12
    .line 13
    const-string p3, "download_group"

    .line 14
    .line 15
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->B0:Ljava/util/ArrayList;

    .line 20
    .line 21
    if-nez p3, :cond_0

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    const-string p3, "download_group_title"

    .line 26
    .line 27
    invoke-virtual {p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->C0:Ljava/lang/String;

    .line 32
    .line 33
    const-string p3, "download_group_subtitle"

    .line 34
    .line 35
    invoke-virtual {p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->D0:Ljava/lang/String;

    .line 40
    .line 41
    const p2, 0x7f0a0443

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Landroid/view/ViewGroup;

    .line 49
    .line 50
    invoke-static {p2}, Ldefpackage/q05;->u(Landroid/view/ViewGroup;)V

    .line 51
    .line 52
    .line 53
    const p2, 0x7f0a0467

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    check-cast p3, Landroid/widget/TextView;

    .line 61
    .line 62
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->B0:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const/4 v2, 0x1

    .line 69
    if-le v1, v2, :cond_1

    .line 70
    .line 71
    move v1, v0

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const/16 v1, 0x8

    .line 74
    .line 75
    :goto_0
    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    const p3, 0x7f0a0518

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Landroid/widget/TextView;

    .line 86
    .line 87
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->B0:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-le v3, v2, :cond_2

    .line 94
    .line 95
    const v3, 0x7f1300f7

    .line 96
    .line 97
    .line 98
    :goto_1
    invoke-virtual {p0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    goto :goto_2

    .line 107
    :cond_2
    const v3, 0x7f1300f6

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :goto_2
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    .line 113
    .line 114
    const v1, 0x7f0a0281

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Landroid/widget/ImageView;

    .line 122
    .line 123
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->B0:Ljava/util/ArrayList;

    .line 128
    .line 129
    new-instance v5, Ljava/util/Random;

    .line 130
    .line 131
    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    .line 132
    .line 133
    .line 134
    iget-object v6, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->B0:Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 149
    .line 150
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-static {v3}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    if-eqz v4, :cond_3

    .line 159
    .line 160
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    invoke-static {v6, v4}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    goto :goto_3

    .line 169
    :cond_3
    const/4 v6, 0x0

    .line 170
    :goto_3
    invoke-static {v3, v4, v2, v5, v6}, Ldefpackage/b11;->g(Landroid/content/Context;Ljava/lang/String;ILdefpackage/c04;Ljava/lang/String;)Ldefpackage/vz3;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-static {}, Ldefpackage/xv0;->b()Ldefpackage/xv0;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-virtual {v3, v4}, Ldefpackage/vz3;->T(Ldefpackage/xv0;)Ldefpackage/vz3;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_4

    .line 187
    .line 188
    invoke-virtual {v3}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    check-cast v3, Ldefpackage/vz3;

    .line 193
    .line 194
    :cond_4
    invoke-virtual {v3, v1}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 195
    .line 196
    .line 197
    const v1, 0x7f0a0284

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    check-cast v1, Landroid/widget/TextView;

    .line 205
    .line 206
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->C0:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 212
    .line 213
    .line 214
    const v1, 0x7f0a0283

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    check-cast v1, Landroid/widget/TextView;

    .line 222
    .line 223
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->D0:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object p2

    .line 235
    check-cast p2, Landroid/widget/TextView;

    .line 236
    .line 237
    new-instance v1, Ldefpackage/cu0;

    .line 238
    .line 239
    invoke-direct {v1, p0, v0}, Ldefpackage/cu0;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 243
    .line 244
    .line 245
    const p2, 0x7f0a0464

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    check-cast p2, Landroid/widget/TextView;

    .line 253
    .line 254
    new-instance v0, Ldefpackage/cu0;

    .line 255
    .line 256
    invoke-direct {v0, p0, v2}, Ldefpackage/cu0;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 260
    .line 261
    .line 262
    const p2, 0x7f0a0093

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    check-cast p2, Landroid/widget/TextView;

    .line 270
    .line 271
    new-instance v0, Ldefpackage/cu0;

    .line 272
    .line 273
    const/4 v1, 0x2

    .line 274
    invoke-direct {v0, p0, v1}, Ldefpackage/cu0;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    check-cast p2, Landroid/widget/TextView;

    .line 285
    .line 286
    new-instance p3, Ldefpackage/cu0;

    .line 287
    .line 288
    const/4 v0, 0x3

    .line 289
    invoke-direct {p3, p0, v0}, Ldefpackage/cu0;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 293
    .line 294
    .line 295
    return-object p1

    .line 296
    :cond_5
    :goto_4
    invoke-virtual {p0}, Ldefpackage/zt;->n0()V

    .line 297
    .line 298
    .line 299
    return-object p1
.end method

.method public final R()V
    .locals 9

    .line 1
    invoke-super {p0}, Ldefpackage/pp0;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->B0:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    new-instance v3, Ldefpackage/cb4;

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Landroid/content/ComponentName;

    .line 19
    .line 20
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-class v5, Lcom/eddyizm/tempus/service/MediaService;

    .line 25
    .line 26
    invoke-direct {v1, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, v0, v1}, Ldefpackage/cb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 30
    .line 31
    .line 32
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 33
    .line 34
    new-instance v5, Ldefpackage/aj2;

    .line 35
    .line 36
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Ldefpackage/f35;->x()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    new-instance v7, Ldefpackage/bl2;

    .line 44
    .line 45
    invoke-direct {v7, v6}, Ldefpackage/bl2;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v3, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 49
    .line 50
    invoke-interface {v0}, Ldefpackage/bb4;->e()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    new-instance v0, Ldefpackage/xc5;

    .line 57
    .line 58
    new-instance v1, Ldefpackage/x7;

    .line 59
    .line 60
    invoke-direct {v1, v2}, Ldefpackage/x7;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    new-instance v8, Ldefpackage/fi0;

    .line 64
    .line 65
    invoke-direct {v8, v1}, Ldefpackage/fi0;-><init>(Ldefpackage/x7;)V

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x4

    .line 69
    invoke-direct {v0, v1, v8}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    move-object v8, v0

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    const/4 v0, 0x0

    .line 75
    goto :goto_0

    .line 76
    :goto_1
    new-instance v1, Ldefpackage/bj2;

    .line 77
    .line 78
    invoke-direct/range {v1 .. v8}, Ldefpackage/sk2;-><init>(Landroid/content/Context;Ldefpackage/cb4;Landroid/os/Bundle;Ldefpackage/qk2;Landroid/os/Looper;Ldefpackage/bl2;Ldefpackage/xc5;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Landroid/os/Handler;

    .line 82
    .line 83
    invoke-direct {v0, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v7, v1, v0}, Ldefpackage/b11;->w(Ldefpackage/bl2;Ldefpackage/bj2;Landroid/os/Handler;)V

    .line 87
    .line 88
    .line 89
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->E0:Ldefpackage/bl2;

    .line 90
    .line 91
    :cond_1
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/DownloadedBottomSheetDialog;->E0:Ldefpackage/bl2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Ldefpackage/sk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0}, Ldefpackage/pp0;->S()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

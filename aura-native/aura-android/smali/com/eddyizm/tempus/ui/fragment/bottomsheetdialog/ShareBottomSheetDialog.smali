.class public Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;
.super Lzt;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public B0:Lcom/eddyizm/tempus/viewmodel/b;

.field public C0:Lrc4;

.field public D0:Lcom/eddyizm/tempus/subsonic/models/Share;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzt;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .line 1
    const p3, 0x7f0d0027

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
    iget-object p2, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 10
    .line 11
    if-eqz p2, :cond_6

    .line 12
    .line 13
    const-string p3, "share_object"

    .line 14
    .line 15
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Ll70;->d()Le75;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-static {p2}, Lgh0;->r(Lf75;)Lb75;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {p2, v1}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    new-instance v2, Lbq4;

    .line 44
    .line 45
    invoke-direct {v2, p3, v1, p2}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 46
    .line 47
    .line 48
    const-class p2, Lcom/eddyizm/tempus/viewmodel/b;

    .line 49
    .line 50
    invoke-static {p2}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, Li30;->b()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    const/4 v1, 0x0

    .line 59
    const-string v3, "Local and anonymous classes can not be ViewModels"

    .line 60
    .line 61
    if-eqz p3, :cond_5

    .line 62
    .line 63
    const-string v4, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 64
    .line 65
    invoke-virtual {v4, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {v2, p2, p3}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    check-cast p2, Lcom/eddyizm/tempus/viewmodel/b;

    .line 74
    .line 75
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;->B0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 76
    .line 77
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p2}, Ll70;->d()Le75;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    invoke-static {p2}, Lgh0;->r(Lf75;)Lb75;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {p2, v2}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    new-instance v5, Lbq4;

    .line 94
    .line 95
    invoke-direct {v5, p3, v2, p2}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 96
    .line 97
    .line 98
    const-class p2, Lrc4;

    .line 99
    .line 100
    invoke-static {p2}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p2}, Li30;->b()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    if-eqz p3, :cond_4

    .line 109
    .line 110
    invoke-virtual {v4, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    invoke-virtual {v5, p2, p3}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    check-cast p2, Lrc4;

    .line 119
    .line 120
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;->C0:Lrc4;

    .line 121
    .line 122
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 123
    .line 124
    iput-object p3, p2, Lrc4;->d:Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 125
    .line 126
    const p2, 0x7f0a0572

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    check-cast p2, Landroid/widget/ImageView;

    .line 134
    .line 135
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;->C0:Lrc4;

    .line 136
    .line 137
    iget-object p3, p3, Lrc4;->d:Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 138
    .line 139
    invoke-virtual {p3}, Lcom/eddyizm/tempus/subsonic/models/Share;->getEntries()Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    if-eqz p3, :cond_1

    .line 144
    .line 145
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-nez v2, :cond_1

    .line 150
    .line 151
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p3

    .line 155
    check-cast p3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 156
    .line 157
    invoke-virtual {p3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    goto :goto_0

    .line 162
    :cond_1
    move-object p3, v1

    .line 163
    :goto_0
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-static {v2}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    if-eqz p3, :cond_2

    .line 172
    .line 173
    invoke-static {}, Lud3;->t()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-static {v1, p3}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    :cond_2
    const/4 v4, 0x1

    .line 182
    invoke-static {v2, p3, v4, v3, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 183
    .line 184
    .line 185
    move-result-object p3

    .line 186
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {p3, v1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 191
    .line 192
    .line 193
    move-result-object p3

    .line 194
    invoke-static {}, Lud3;->R()Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_3

    .line 199
    .line 200
    invoke-virtual {p3}, Llq;->l()Llq;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    check-cast p3, Lvz3;

    .line 205
    .line 206
    :cond_3
    invoke-virtual {p3, p2}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 207
    .line 208
    .line 209
    const p2, 0x7f0a0577

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    check-cast p2, Landroid/widget/TextView;

    .line 217
    .line 218
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;->C0:Lrc4;

    .line 219
    .line 220
    iget-object p3, p3, Lrc4;->d:Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 221
    .line 222
    invoke-virtual {p3}, Lcom/eddyizm/tempus/subsonic/models/Share;->getDescription()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p3

    .line 226
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setSelected(Z)V

    .line 230
    .line 231
    .line 232
    const p2, 0x7f0a0575

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    check-cast p2, Landroid/widget/TextView;

    .line 240
    .line 241
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 242
    .line 243
    .line 244
    move-result-object p3

    .line 245
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 246
    .line 247
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Share;->getExpires()Ljava/util/Date;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-static {v1}, Lg12;->x(Ljava/util/Date;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    const v2, 0x7f130525

    .line 260
    .line 261
    .line 262
    invoke-virtual {p3, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p3

    .line 266
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setSelected(Z)V

    .line 270
    .line 271
    .line 272
    const p2, 0x7f0a0177

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    check-cast p2, Landroid/widget/TextView;

    .line 280
    .line 281
    new-instance p3, Lqc4;

    .line 282
    .line 283
    invoke-direct {p3, p0, v0}, Lqc4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 287
    .line 288
    .line 289
    const p2, 0x7f0a064a

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 293
    .line 294
    .line 295
    move-result-object p2

    .line 296
    check-cast p2, Landroid/widget/TextView;

    .line 297
    .line 298
    new-instance p3, Lqc4;

    .line 299
    .line 300
    invoke-direct {p3, p0, v4}, Lqc4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 304
    .line 305
    .line 306
    const p2, 0x7f0a019f

    .line 307
    .line 308
    .line 309
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 310
    .line 311
    .line 312
    move-result-object p2

    .line 313
    check-cast p2, Landroid/widget/TextView;

    .line 314
    .line 315
    new-instance p3, Lqc4;

    .line 316
    .line 317
    const/4 v0, 0x2

    .line 318
    invoke-direct {p3, p0, v0}, Lqc4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ShareBottomSheetDialog;I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 322
    .line 323
    .line 324
    return-object p1

    .line 325
    :cond_4
    invoke-static {v3}, Lkf2;->n(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    return-object v1

    .line 329
    :cond_5
    invoke-static {v3}, Lkf2;->n(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    return-object v1

    .line 333
    :cond_6
    :goto_1
    invoke-virtual {p0}, Lzt;->n0()V

    .line 334
    .line 335
    .line 336
    return-object p1
.end method

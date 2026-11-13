.class public Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Ldefpackage/z40;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ldefpackage/bn3;

.field public o0:Ldefpackage/en3;

.field public p0:Ldefpackage/bl2;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/kc1;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    check-cast p3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d0084

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const p2, 0x7f0a00da

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    check-cast p3, Lcom/google/android/material/appbar/AppBarLayout;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz p3, :cond_7

    .line 28
    .line 29
    move-object v3, p1

    .line 30
    check-cast v3, Landroid/widget/LinearLayout;

    .line 31
    .line 32
    const p2, 0x7f0a04cf

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    check-cast p3, Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz p3, :cond_7

    .line 42
    .line 43
    const p2, 0x7f0a04d0

    .line 44
    .line 45
    .line 46
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    move-object v4, p3

    .line 51
    check-cast v4, Landroid/widget/TextView;

    .line 52
    .line 53
    if-eqz v4, :cond_7

    .line 54
    .line 55
    const p2, 0x7f0a04d3

    .line 56
    .line 57
    .line 58
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    check-cast p3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 63
    .line 64
    if-eqz p3, :cond_7

    .line 65
    .line 66
    const p2, 0x7f0a04dd

    .line 67
    .line 68
    .line 69
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    move-object v5, p3

    .line 74
    check-cast v5, Landroid/widget/Button;

    .line 75
    .line 76
    if-eqz v5, :cond_7

    .line 77
    .line 78
    const p2, 0x7f0a04de

    .line 79
    .line 80
    .line 81
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    move-object v6, p3

    .line 86
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 87
    .line 88
    if-eqz v6, :cond_7

    .line 89
    .line 90
    const p2, 0x7f0a04df

    .line 91
    .line 92
    .line 93
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    check-cast p3, Landroid/widget/TextView;

    .line 98
    .line 99
    if-eqz p3, :cond_7

    .line 100
    .line 101
    const p2, 0x7f0a061b

    .line 102
    .line 103
    .line 104
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    move-object v7, p3

    .line 109
    check-cast v7, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 110
    .line 111
    if-eqz v7, :cond_7

    .line 112
    .line 113
    const p2, 0x7f0a064b

    .line 114
    .line 115
    .line 116
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    if-eqz v8, :cond_7

    .line 121
    .line 122
    new-instance v2, Ldefpackage/z40;

    .line 123
    .line 124
    invoke-direct/range {v2 .. v8}, Ldefpackage/z40;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 125
    .line 126
    .line 127
    iput-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 128
    .line 129
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    invoke-static {p1, p3}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    new-instance v2, Ldefpackage/bq4;

    .line 146
    .line 147
    invoke-direct {v2, p2, p3, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 148
    .line 149
    .line 150
    const-class p1, Ldefpackage/bn3;

    .line 151
    .line 152
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    if-eqz p2, :cond_6

    .line 161
    .line 162
    const-string p3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 163
    .line 164
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    invoke-virtual {v2, p1, p2}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p1, Ldefpackage/bn3;

    .line 173
    .line 174
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->n0:Ldefpackage/bn3;

    .line 175
    .line 176
    iget-object p1, p0, Ldefpackage/kc1;->s:Landroid/os/Bundle;

    .line 177
    .line 178
    if-eqz p1, :cond_0

    .line 179
    .line 180
    const-string p2, "PODCAST_CHANNEL_OBJECT"

    .line 181
    .line 182
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    move-object v1, p1

    .line 187
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 188
    .line 189
    :cond_0
    if-nez v1, :cond_2

    .line 190
    .line 191
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 192
    .line 193
    if-eqz p0, :cond_1

    .line 194
    .line 195
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 196
    .line 197
    if-eqz p0, :cond_1

    .line 198
    .line 199
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 200
    .line 201
    .line 202
    :cond_1
    return-object v3

    .line 203
    :cond_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->n0:Ldefpackage/bn3;

    .line 204
    .line 205
    iput-object v1, p1, Ldefpackage/bn3;->d:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 206
    .line 207
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 208
    .line 209
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 210
    .line 211
    iget-object p2, p2, Ldefpackage/z40;->q:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast p2, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 214
    .line 215
    invoke-virtual {p1, p2}, Ldefpackage/df;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 216
    .line 217
    .line 218
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 219
    .line 220
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    const/4 p2, 0x1

    .line 225
    if-eqz p1, :cond_3

    .line 226
    .line 227
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 228
    .line 229
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p1, p2}, Ldefpackage/l93;->f0(Z)V

    .line 234
    .line 235
    .line 236
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 237
    .line 238
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-virtual {p1}, Ldefpackage/l93;->g0()V

    .line 243
    .line 244
    .line 245
    :cond_3
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 246
    .line 247
    iget-object p1, p1, Ldefpackage/z40;->q:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 250
    .line 251
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->n0:Ldefpackage/bn3;

    .line 252
    .line 253
    iget-object p3, p3, Ldefpackage/bn3;->d:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 254
    .line 255
    invoke-virtual {p3}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getTitle()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p3

    .line 259
    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 260
    .line 261
    .line 262
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 263
    .line 264
    iget-object p1, p1, Ldefpackage/z40;->q:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 267
    .line 268
    new-instance p3, Ldefpackage/an3;

    .line 269
    .line 270
    invoke-direct {p3, p0, p2}, Ldefpackage/an3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 274
    .line 275
    .line 276
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 277
    .line 278
    iget-object p1, p1, Ldefpackage/z40;->q:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 281
    .line 282
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->n0:Ldefpackage/bn3;

    .line 283
    .line 284
    iget-object p3, p3, Ldefpackage/bn3;->d:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 285
    .line 286
    invoke-virtual {p3}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getTitle()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p3

    .line 290
    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 291
    .line 292
    .line 293
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->n0:Ldefpackage/bn3;

    .line 294
    .line 295
    iget-object p1, p1, Ldefpackage/bn3;->d:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 296
    .line 297
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getDescription()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-static {p1}, Ldefpackage/e03;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 306
    .line 307
    if-eqz p3, :cond_5

    .line 308
    .line 309
    iget-object p3, p3, Ldefpackage/z40;->n:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast p3, Landroid/widget/TextView;

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-nez v1, :cond_4

    .line 322
    .line 323
    move v1, v0

    .line 324
    goto :goto_0

    .line 325
    :cond_4
    const/16 v1, 0x8

    .line 326
    .line 327
    :goto_0
    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 328
    .line 329
    .line 330
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 331
    .line 332
    iget-object p3, p3, Ldefpackage/z40;->n:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast p3, Landroid/widget/TextView;

    .line 335
    .line 336
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 337
    .line 338
    .line 339
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 340
    .line 341
    iget-object p1, p1, Ldefpackage/z40;->o:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast p1, Landroid/widget/Button;

    .line 344
    .line 345
    new-instance p3, Ldefpackage/an3;

    .line 346
    .line 347
    invoke-direct {p3, p0, v0}, Ldefpackage/an3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 351
    .line 352
    .line 353
    :cond_5
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 354
    .line 355
    iget-object p1, p1, Ldefpackage/z40;->p:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 358
    .line 359
    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 360
    .line 361
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 362
    .line 363
    .line 364
    invoke-direct {p3, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 368
    .line 369
    .line 370
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 371
    .line 372
    iget-object p1, p1, Ldefpackage/z40;->p:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 375
    .line 376
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 377
    .line 378
    .line 379
    move-result-object p3

    .line 380
    invoke-static {p3}, Ldefpackage/g12;->v(Landroid/content/Context;)Ldefpackage/is0;

    .line 381
    .line 382
    .line 383
    move-result-object p3

    .line 384
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->i(Ldefpackage/kw3;)V

    .line 385
    .line 386
    .line 387
    new-instance p1, Ldefpackage/en3;

    .line 388
    .line 389
    invoke-direct {p1, p0}, Ldefpackage/en3;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V

    .line 390
    .line 391
    .line 392
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->o0:Ldefpackage/en3;

    .line 393
    .line 394
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 395
    .line 396
    iget-object p3, p3, Ldefpackage/z40;->p:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast p3, Landroidx/recyclerview/widget/RecyclerView;

    .line 399
    .line 400
    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 401
    .line 402
    .line 403
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->n0:Ldefpackage/bn3;

    .line 404
    .line 405
    iget-object p3, p1, Ldefpackage/bn3;->c:Ldefpackage/hh3;

    .line 406
    .line 407
    iget-object p1, p1, Ldefpackage/bn3;->d:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 408
    .line 409
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getId()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    invoke-static {p1, p2}, Ldefpackage/hh3;->l(Ljava/lang/String;Z)Ldefpackage/k03;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 421
    .line 422
    .line 423
    move-result-object p2

    .line 424
    new-instance p3, Ldefpackage/d8;

    .line 425
    .line 426
    const/16 v0, 0x17

    .line 427
    .line 428
    invoke-direct {p3, v0, p0}, Ldefpackage/d8;-><init>(ILjava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {p1, p2, p3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 432
    .line 433
    .line 434
    return-object v3

    .line 435
    :cond_6
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 436
    .line 437
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    return-object v1

    .line 441
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object p0

    .line 449
    const-string p1, "Missing required view with ID: "

    .line 450
    .line 451
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    return-object v1
.end method

.method public final J()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 6
    .line 7
    return-void
.end method

.method public final R()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    new-instance v3, Ldefpackage/cb4;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Landroid/content/ComponentName;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const-class v5, Lcom/eddyizm/tempus/service/MediaService;

    .line 21
    .line 22
    invoke-direct {v1, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v3, v0, v1}, Ldefpackage/cb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 26
    .line 27
    .line 28
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 29
    .line 30
    new-instance v5, Ldefpackage/aj2;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ldefpackage/f35;->x()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    new-instance v7, Ldefpackage/bl2;

    .line 40
    .line 41
    invoke-direct {v7, v6}, Ldefpackage/bl2;-><init>(Landroid/os/Looper;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v3, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 45
    .line 46
    invoke-interface {v0}, Ldefpackage/bb4;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    new-instance v0, Ldefpackage/xc5;

    .line 53
    .line 54
    new-instance v1, Ldefpackage/x7;

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ldefpackage/x7;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    new-instance v8, Ldefpackage/fi0;

    .line 60
    .line 61
    invoke-direct {v8, v1}, Ldefpackage/fi0;-><init>(Ldefpackage/x7;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    invoke-direct {v0, v1, v8}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    move-object v8, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    const/4 v0, 0x0

    .line 71
    goto :goto_0

    .line 72
    :goto_1
    new-instance v1, Ldefpackage/bj2;

    .line 73
    .line 74
    invoke-direct/range {v1 .. v8}, Ldefpackage/sk2;-><init>(Landroid/content/Context;Ldefpackage/cb4;Landroid/os/Bundle;Ldefpackage/qk2;Landroid/os/Looper;Ldefpackage/bl2;Ldefpackage/xc5;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Landroid/os/Handler;

    .line 78
    .line 79
    invoke-direct {v0, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v7, v1, v0}, Ldefpackage/b11;->w(Ldefpackage/bl2;Ldefpackage/bj2;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->p0:Ldefpackage/bl2;

    .line 86
    .line 87
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->p0:Ldefpackage/bl2;

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/sk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 8
    .line 9
    return-void
.end method

.method public final onPodcastEpisodeAltClick(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    const-string v0, "PODCAST_OBJECT"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->n0:Ldefpackage/bn3;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getId()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, Ldefpackage/bn3;->c:Ldefpackage/hh3;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getId()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ldefpackage/pn4;->h()Ldefpackage/wo0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const-string v2, "PodcastClient"

    .line 44
    .line 45
    const-string v3, "downloadPodcastEpisode()"

    .line 46
    .line 47
    invoke-static {v2, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    iget-object v2, v0, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ldefpackage/hn3;

    .line 53
    .line 54
    iget-object v0, v0, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ldefpackage/pn4;

    .line 57
    .line 58
    invoke-virtual {v0}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v2, v0, v1}, Ldefpackage/hn3;->b(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v1, Ldefpackage/pz1;

    .line 67
    .line 68
    const/16 v2, 0xe

    .line 69
    .line 70
    invoke-direct {v1, v2, p1}, Ldefpackage/pz1;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    sget-object v0, Ldefpackage/qg4;->E:[I

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const v1, 0x7f13041b

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const/4 v1, -0x1

    .line 94
    invoke-static {p1, v0, v1}, Ldefpackage/qg4;->h(Landroid/view/View;Ljava/lang/CharSequence;I)Ldefpackage/qg4;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->u()Landroid/widget/FrameLayout;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p1, p0}, Ldefpackage/fr;->e(Landroid/widget/FrameLayout;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ldefpackage/qg4;->j()V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final onPodcastEpisodeClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->p0:Ldefpackage/bl2;

    .line 2
    .line 3
    const-string v1, "PODCAST_OBJECT"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 10
    .line 11
    sget-object v1, Ldefpackage/bo2;->a:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-boolean v1, v1, Ldefpackage/v52;->a:Z

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, Ldefpackage/ws1;

    .line 24
    .line 25
    const/16 v2, 0x11

    .line 26
    .line 27
    invoke-direct {v1, v2, v0, p1}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 31
    .line 32
    invoke-virtual {v0, v1, p1}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const p1, 0x7f1302c0

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Ldefpackage/u52;->h(I)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 43
    .line 44
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 45
    .line 46
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Ldefpackage/au;

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    invoke-virtual {p0, p1}, Ldefpackage/au;->d(Z)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final onPodcastEpisodeLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a04cb

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

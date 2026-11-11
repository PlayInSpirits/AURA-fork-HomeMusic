.class public final Lni4;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/Filterable;


# instance fields
.field public A:Lbl2;

.field public B:Lrm3;

.field public final C:Lo7;

.field public final q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

.field public final r:Z

.field public final s:Z

.field public final t:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

.field public u:Ljava/util/List;

.field public final v:Lpk;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Z

.field public z:Ljava/util/List;


# direct methods
.method public constructor <init>(Lle1;Lcom/eddyizm/tempus/interfaces/ClickCallback;ZZLcom/eddyizm/tempus/subsonic/models/AlbumID3;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lpk;

    .line 5
    .line 6
    new-instance v1, Lhh3;

    .line 7
    .line 8
    const/16 v2, 0x1d

    .line 9
    .line 10
    invoke-direct {v1, v2}, Lhh3;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Lpk;-><init>(Lni4;Lhh3;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lni4;->v:Lpk;

    .line 17
    .line 18
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 19
    .line 20
    iput-object v0, p0, Lni4;->z:Ljava/util/List;

    .line 21
    .line 22
    new-instance v1, Lo7;

    .line 23
    .line 24
    const/16 v2, 0x9

    .line 25
    .line 26
    invoke-direct {v1, p0, v2}, Lo7;-><init>(Ldw3;I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lni4;->C:Lo7;

    .line 30
    .line 31
    iput-object p2, p0, Lni4;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 32
    .line 33
    iput-boolean p3, p0, Lni4;->r:Z

    .line 34
    .line 35
    iput-boolean p4, p0, Lni4;->s:Z

    .line 36
    .line 37
    iput-object v0, p0, Lni4;->u:Ljava/util/List;

    .line 38
    .line 39
    const-string p2, ""

    .line 40
    .line 41
    iput-object p2, p0, Lni4;->w:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p5, p0, Lni4;->t:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    invoke-virtual {p0, p2}, Ldw3;->o(Z)V

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    new-instance p3, Lji4;

    .line 52
    .line 53
    invoke-direct {p3, p0, p2}, Lji4;-><init>(Lni4;I)V

    .line 54
    .line 55
    .line 56
    sget-object p2, Lg51;->d:Lk03;

    .line 57
    .line 58
    new-instance p4, Ld8;

    .line 59
    .line 60
    const/16 p5, 0xf

    .line 61
    .line 62
    invoke-direct {p4, p5, p3}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, p1, p4}, Lad2;->e(Lba2;La83;)V

    .line 66
    .line 67
    .line 68
    new-instance p2, Lji4;

    .line 69
    .line 70
    const/4 p3, 0x1

    .line 71
    invoke-direct {p2, p0, p3}, Lji4;-><init>(Lni4;I)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, p2}, Lkb4;->N(Lba2;Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lni4;->v:Lpk;

    .line 2
    .line 3
    iget-object p0, p0, Lpk;->f:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final b(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final g(Lcx3;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    check-cast v2, Lmi4;

    .line 8
    .line 9
    iget-object v3, v0, Lni4;->v:Lpk;

    .line 10
    .line 11
    iget-object v4, v3, Lpk;->f:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 18
    .line 19
    iget-object v5, v2, Lmi4;->u:Ly12;

    .line 20
    .line 21
    iget-object v6, v5, Ly12;->q:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    iget-object v6, v5, Ly12;->p:Landroid/widget/TextView;

    .line 31
    .line 32
    iget-object v7, v5, Ly12;->m:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 33
    .line 34
    iget-object v8, v5, Ly12;->r:Landroid/widget/ImageView;

    .line 35
    .line 36
    iget-object v9, v5, Ly12;->t:Landroid/widget/TextView;

    .line 37
    .line 38
    iget-object v10, v5, Ly12;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 39
    .line 40
    iget-object v11, v5, Ly12;->f:Landroid/widget/TextView;

    .line 41
    .line 42
    iget-object v12, v5, Ly12;->n:Landroid/widget/FrameLayout;

    .line 43
    .line 44
    iget-object v13, v2, Lcx3;->a:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v14

    .line 50
    iget-boolean v15, v0, Lni4;->s:Z

    .line 51
    .line 52
    if-eqz v15, :cond_0

    .line 53
    .line 54
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v15

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v15

    .line 63
    :goto_0
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v16

    .line 67
    move-object/from16 p1, v13

    .line 68
    .line 69
    invoke-static/range {v16 .. v16}, Le03;->g(Ljava/lang/Integer;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    move-object/from16 v16, v2

    .line 74
    .line 75
    invoke-static {v4}, Le03;->f(Lcom/eddyizm/tempus/subsonic/models/Child;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    filled-new-array {v15, v13, v2}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const v13, 0x7f13054d

    .line 84
    .line 85
    .line 86
    invoke-virtual {v14, v13, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    if-eqz v6, :cond_1

    .line 102
    .line 103
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    goto :goto_1

    .line 108
    :cond_1
    const v6, 0x7f1302aa

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    :goto_1
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    const/16 v6, 0x8

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    if-nez v2, :cond_3

    .line 126
    .line 127
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-static {v2}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {v14}, Leu0;->d(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_2

    .line 147
    .line 148
    invoke-virtual {v12, v13}, Landroid/view/View;->setVisibility(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_2
    invoke-virtual {v12, v6}, Landroid/view/View;->setVisibility(I)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_3
    invoke-static {v4}, Lg51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    if-eqz v2, :cond_4

    .line 161
    .line 162
    invoke-virtual {v12, v13}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_4
    invoke-virtual {v12, v6}, Landroid/view/View;->setVisibility(I)V

    .line 167
    .line 168
    .line 169
    :goto_2
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    const/4 v13, 0x4

    .line 174
    if-eqz v2, :cond_5

    .line 175
    .line 176
    goto/16 :goto_8

    .line 177
    .line 178
    :cond_5
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v17

    .line 189
    sget-object v6, Lko1;->n:Lko1;

    .line 190
    .line 191
    sget-object v14, Lko1;->p:Lko1;

    .line 192
    .line 193
    if-eqz v17, :cond_7

    .line 194
    .line 195
    invoke-static {v4}, Lg51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    if-eqz v2, :cond_6

    .line 200
    .line 201
    :goto_3
    move-object v2, v14

    .line 202
    goto :goto_5

    .line 203
    :cond_6
    :goto_4
    move-object v2, v6

    .line 204
    goto :goto_5

    .line 205
    :cond_7
    invoke-static {v2}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v17

    .line 213
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-static/range {v17 .. v17}, Leu0;->c(Ljava/lang/String;)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    if-eqz v2, :cond_6

    .line 221
    .line 222
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result v15

    .line 226
    if-eq v15, v13, :cond_6

    .line 227
    .line 228
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result v15

    .line 232
    const/4 v13, 0x5

    .line 233
    if-ne v15, v13, :cond_8

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    const/4 v13, 0x3

    .line 241
    if-ne v2, v13, :cond_9

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_9
    sget-object v2, Lko1;->o:Lko1;

    .line 245
    .line 246
    :goto_5
    if-ne v2, v6, :cond_a

    .line 247
    .line 248
    const/16 v6, 0x8

    .line 249
    .line 250
    invoke-virtual {v12, v6}, Landroid/view/View;->setVisibility(I)V

    .line 251
    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_a
    const/4 v6, 0x0

    .line 255
    invoke-virtual {v12, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 256
    .line 257
    .line 258
    move-result-object v13

    .line 259
    if-nez v13, :cond_b

    .line 260
    .line 261
    move-object v13, v12

    .line 262
    :cond_b
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    if-ne v2, v14, :cond_c

    .line 267
    .line 268
    const v15, 0x7f080159

    .line 269
    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_c
    const v15, 0x7f08015b

    .line 273
    .line 274
    .line 275
    :goto_6
    invoke-virtual {v6, v15}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-virtual {v13, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    if-ne v2, v14, :cond_d

    .line 287
    .line 288
    const v2, 0x7f1301a6

    .line 289
    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_d
    const v2, 0x7f1301a7

    .line 293
    .line 294
    .line 295
    :goto_7
    invoke-virtual {v6, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-virtual {v13, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 300
    .line 301
    .line 302
    :goto_8
    iget-boolean v2, v0, Lni4;->r:Z

    .line 303
    .line 304
    if-eqz v2, :cond_10

    .line 305
    .line 306
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v12

    .line 314
    invoke-static {v6}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 315
    .line 316
    .line 317
    move-result-object v13

    .line 318
    if-eqz v12, :cond_e

    .line 319
    .line 320
    invoke-static {}, Lud3;->t()I

    .line 321
    .line 322
    .line 323
    move-result v14

    .line 324
    invoke-static {v14, v12}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v14

    .line 328
    goto :goto_9

    .line 329
    :cond_e
    const/4 v14, 0x0

    .line 330
    :goto_9
    const/16 v15, 0x9

    .line 331
    .line 332
    invoke-static {v6, v12, v15, v13, v14}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 337
    .line 338
    .line 339
    move-result-object v12

    .line 340
    invoke-virtual {v6, v12}, Lvz3;->T(Lxv0;)Lvz3;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    invoke-static {}, Lud3;->R()Z

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    if-eqz v12, :cond_f

    .line 349
    .line 350
    invoke-virtual {v6}, Llq;->l()Llq;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    check-cast v6, Lvz3;

    .line 355
    .line 356
    :cond_f
    invoke-virtual {v6, v8}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 357
    .line 358
    .line 359
    :cond_10
    if-eqz v2, :cond_11

    .line 360
    .line 361
    const/4 v6, 0x4

    .line 362
    goto :goto_a

    .line 363
    :cond_11
    const/4 v6, 0x0

    .line 364
    :goto_a
    invoke-virtual {v9, v6}, Landroid/view/View;->setVisibility(I)V

    .line 365
    .line 366
    .line 367
    if-eqz v2, :cond_12

    .line 368
    .line 369
    const/4 v6, 0x0

    .line 370
    goto :goto_b

    .line 371
    :cond_12
    const/4 v6, 0x4

    .line 372
    :goto_b
    invoke-virtual {v8, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 373
    .line 374
    .line 375
    if-nez v2, :cond_15

    .line 376
    .line 377
    if-nez v1, :cond_13

    .line 378
    .line 379
    iget-object v2, v3, Lpk;->f:Ljava/util/List;

    .line 380
    .line 381
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    new-instance v6, Lc7;

    .line 386
    .line 387
    const/16 v8, 0x14

    .line 388
    .line 389
    invoke-direct {v6, v8}, Lc7;-><init>(I)V

    .line 390
    .line 391
    .line 392
    invoke-interface {v2, v6}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    new-instance v6, Lhu3;

    .line 397
    .line 398
    const/4 v13, 0x3

    .line 399
    invoke-direct {v6, v13}, Lhu3;-><init>(I)V

    .line 400
    .line 401
    .line 402
    invoke-interface {v2, v6}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    new-instance v6, Lc7;

    .line 407
    .line 408
    const/16 v8, 0x15

    .line 409
    .line 410
    invoke-direct {v6, v8}, Lc7;-><init>(I)V

    .line 411
    .line 412
    .line 413
    invoke-interface {v2, v6}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    invoke-interface {v2}, Ljava/util/stream/Stream;->distinct()Ljava/util/stream/Stream;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    invoke-interface {v2}, Ljava/util/stream/Stream;->count()J

    .line 422
    .line 423
    .line 424
    move-result-wide v8

    .line 425
    const-wide/16 v12, 0x1

    .line 426
    .line 427
    cmp-long v2, v8, v12

    .line 428
    .line 429
    if-lez v2, :cond_13

    .line 430
    .line 431
    goto :goto_c

    .line 432
    :cond_13
    if-lez v1, :cond_15

    .line 433
    .line 434
    iget-object v2, v3, Lpk;->f:Ljava/util/List;

    .line 435
    .line 436
    add-int/lit8 v6, v1, -0x1

    .line 437
    .line 438
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    if-eqz v2, :cond_15

    .line 443
    .line 444
    iget-object v2, v3, Lpk;->f:Ljava/util/List;

    .line 445
    .line 446
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 451
    .line 452
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    if-eqz v2, :cond_15

    .line 457
    .line 458
    iget-object v2, v3, Lpk;->f:Ljava/util/List;

    .line 459
    .line 460
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 465
    .line 466
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    if-eqz v2, :cond_15

    .line 471
    .line 472
    iget-object v2, v3, Lpk;->f:Ljava/util/List;

    .line 473
    .line 474
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 479
    .line 480
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    iget-object v6, v3, Lpk;->f:Ljava/util/List;

    .line 489
    .line 490
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v6

    .line 494
    check-cast v6, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 495
    .line 496
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object v6

    .line 500
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 501
    .line 502
    .line 503
    move-result v6

    .line 504
    if-ge v2, v6, :cond_15

    .line 505
    .line 506
    :goto_c
    iget-object v2, v3, Lpk;->f:Ljava/util/List;

    .line 507
    .line 508
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 513
    .line 514
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    if-eqz v2, :cond_14

    .line 519
    .line 520
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    iget-object v3, v3, Lpk;->f:Ljava/util/List;

    .line 525
    .line 526
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 531
    .line 532
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    invoke-virtual {v3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    const v6, 0x7f1300df

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2, v6, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 552
    .line 553
    .line 554
    const/4 v6, 0x0

    .line 555
    invoke-virtual {v10, v6}, Landroid/view/View;->setVisibility(I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v11, v6}, Landroid/view/View;->setVisibility(I)V

    .line 559
    .line 560
    .line 561
    iget-object v2, v5, Ly12;->d:Landroid/view/View;

    .line 562
    .line 563
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 564
    .line 565
    .line 566
    goto :goto_d

    .line 567
    :cond_14
    const/16 v6, 0x8

    .line 568
    .line 569
    invoke-virtual {v10, v6}, Landroid/view/View;->setVisibility(I)V

    .line 570
    .line 571
    .line 572
    :goto_d
    iget-object v2, v0, Lni4;->t:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 573
    .line 574
    if-eqz v2, :cond_16

    .line 575
    .line 576
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getDiscTitles()Ljava/util/List;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    if-eqz v3, :cond_16

    .line 581
    .line 582
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getDiscTitles()Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    new-instance v3, Lki4;

    .line 591
    .line 592
    invoke-direct {v3, v0, v1}, Lki4;-><init>(Lni4;I)V

    .line 593
    .line 594
    .line 595
    invoke-interface {v2, v3}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    invoke-interface {v1}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    invoke-virtual {v1}, Ljava/util/Optional;->isPresent()Z

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    if-eqz v2, :cond_16

    .line 608
    .line 609
    invoke-virtual {v1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;

    .line 614
    .line 615
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;->getDisc()Ljava/lang/Integer;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    if-eqz v2, :cond_16

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;

    .line 626
    .line 627
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;->getTitle()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    if-eqz v2, :cond_16

    .line 632
    .line 633
    invoke-virtual {v1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;

    .line 638
    .line 639
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;->getTitle()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 644
    .line 645
    .line 646
    move-result v2

    .line 647
    if-nez v2, :cond_16

    .line 648
    .line 649
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    invoke-virtual {v1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v3

    .line 657
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;

    .line 658
    .line 659
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;->getDisc()Ljava/lang/Integer;

    .line 660
    .line 661
    .line 662
    move-result-object v3

    .line 663
    invoke-virtual {v3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    invoke-virtual {v1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;

    .line 672
    .line 673
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;->getTitle()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    const v3, 0x7f1300de

    .line 682
    .line 683
    .line 684
    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    invoke-virtual {v11, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 689
    .line 690
    .line 691
    goto :goto_e

    .line 692
    :cond_15
    const/16 v6, 0x8

    .line 693
    .line 694
    invoke-virtual {v10, v6}, Landroid/view/View;->setVisibility(I)V

    .line 695
    .line 696
    .line 697
    :cond_16
    :goto_e
    const-string v1, "rating_per_item"

    .line 698
    .line 699
    const/4 v6, 0x0

    .line 700
    invoke-static {v1, v6}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 701
    .line 702
    .line 703
    move-result v1

    .line 704
    if-eqz v1, :cond_22

    .line 705
    .line 706
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    const/4 v3, 0x1

    .line 715
    if-eqz v2, :cond_17

    .line 716
    .line 717
    move v2, v3

    .line 718
    goto :goto_f

    .line 719
    :cond_17
    move v2, v6

    .line 720
    :goto_f
    invoke-static {v3, v1, v2}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 721
    .line 722
    .line 723
    move-result v1

    .line 724
    if-nez v1, :cond_19

    .line 725
    .line 726
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    if-eqz v2, :cond_18

    .line 731
    .line 732
    goto :goto_10

    .line 733
    :cond_18
    const/16 v2, 0x8

    .line 734
    .line 735
    goto :goto_11

    .line 736
    :cond_19
    :goto_10
    move v2, v6

    .line 737
    :goto_11
    invoke-virtual {v7, v2}, Landroid/view/View;->setVisibility(I)V

    .line 738
    .line 739
    .line 740
    iget-object v2, v5, Ly12;->k:Landroid/widget/ImageView;

    .line 741
    .line 742
    if-eqz v1, :cond_1a

    .line 743
    .line 744
    move v1, v6

    .line 745
    goto :goto_12

    .line 746
    :cond_1a
    const/16 v1, 0x8

    .line 747
    .line 748
    :goto_12
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 749
    .line 750
    .line 751
    iget-object v1, v5, Ly12;->l:Landroid/widget/LinearLayout;

    .line 752
    .line 753
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    if-eqz v2, :cond_1b

    .line 758
    .line 759
    goto :goto_13

    .line 760
    :cond_1b
    const/16 v6, 0x8

    .line 761
    .line 762
    :goto_13
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 766
    .line 767
    .line 768
    move-result-object v1

    .line 769
    if-eqz v1, :cond_21

    .line 770
    .line 771
    iget-object v1, v5, Ly12;->i:Landroid/widget/ImageView;

    .line 772
    .line 773
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 778
    .line 779
    .line 780
    move-result-object v6

    .line 781
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 782
    .line 783
    .line 784
    move-result v6

    .line 785
    const v7, 0x7f080224

    .line 786
    .line 787
    .line 788
    const v8, 0x7f080223

    .line 789
    .line 790
    .line 791
    if-lt v6, v3, :cond_1c

    .line 792
    .line 793
    move v3, v8

    .line 794
    goto :goto_14

    .line 795
    :cond_1c
    move v3, v7

    .line 796
    :goto_14
    invoke-static {v2, v3}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 801
    .line 802
    .line 803
    iget-object v1, v5, Ly12;->u:Landroid/widget/ImageView;

    .line 804
    .line 805
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 810
    .line 811
    .line 812
    move-result-object v3

    .line 813
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 814
    .line 815
    .line 816
    move-result v3

    .line 817
    const/4 v6, 0x2

    .line 818
    if-lt v3, v6, :cond_1d

    .line 819
    .line 820
    move v3, v8

    .line 821
    goto :goto_15

    .line 822
    :cond_1d
    move v3, v7

    .line 823
    :goto_15
    invoke-static {v2, v3}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 828
    .line 829
    .line 830
    iget-object v1, v5, Ly12;->s:Landroid/widget/ImageView;

    .line 831
    .line 832
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 837
    .line 838
    .line 839
    move-result-object v3

    .line 840
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 841
    .line 842
    .line 843
    move-result v3

    .line 844
    const/4 v13, 0x3

    .line 845
    if-lt v3, v13, :cond_1e

    .line 846
    .line 847
    move v3, v8

    .line 848
    goto :goto_16

    .line 849
    :cond_1e
    move v3, v7

    .line 850
    :goto_16
    invoke-static {v2, v3}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 851
    .line 852
    .line 853
    move-result-object v2

    .line 854
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 855
    .line 856
    .line 857
    iget-object v1, v5, Ly12;->h:Landroid/widget/ImageView;

    .line 858
    .line 859
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 864
    .line 865
    .line 866
    move-result-object v3

    .line 867
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 868
    .line 869
    .line 870
    move-result v3

    .line 871
    const/4 v6, 0x4

    .line 872
    if-lt v3, v6, :cond_1f

    .line 873
    .line 874
    move v3, v8

    .line 875
    goto :goto_17

    .line 876
    :cond_1f
    move v3, v7

    .line 877
    :goto_17
    invoke-static {v2, v3}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 878
    .line 879
    .line 880
    move-result-object v2

    .line 881
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 882
    .line 883
    .line 884
    iget-object v1, v5, Ly12;->g:Landroid/widget/ImageView;

    .line 885
    .line 886
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 891
    .line 892
    .line 893
    move-result-object v3

    .line 894
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 895
    .line 896
    .line 897
    move-result v3

    .line 898
    const/4 v13, 0x5

    .line 899
    if-lt v3, v13, :cond_20

    .line 900
    .line 901
    move v7, v8

    .line 902
    :cond_20
    invoke-static {v2, v7}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 903
    .line 904
    .line 905
    move-result-object v2

    .line 906
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 907
    .line 908
    .line 909
    :cond_21
    :goto_18
    move-object/from16 v1, v16

    .line 910
    .line 911
    goto :goto_19

    .line 912
    :cond_22
    const/16 v6, 0x8

    .line 913
    .line 914
    invoke-virtual {v7, v6}, Landroid/view/View;->setVisibility(I)V

    .line 915
    .line 916
    .line 917
    goto :goto_18

    .line 918
    :goto_19
    invoke-virtual {v0, v1, v4}, Lni4;->p(Lmi4;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 919
    .line 920
    .line 921
    iget-object v1, v5, Ly12;->o:Landroid/widget/FrameLayout;

    .line 922
    .line 923
    iget-object v0, v0, Lni4;->B:Lrm3;

    .line 924
    .line 925
    move-object/from16 v2, p1

    .line 926
    .line 927
    invoke-static {v2, v1, v0, v4}, Ljz4;->k(Landroid/view/View;Landroid/view/ViewGroup;Lrm3;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 928
    .line 929
    .line 930
    return-void
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 0

    .line 1
    iget-object p0, p0, Lni4;->C:Lo7;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lcx3;ILjava/util/List;)V
    .locals 3

    .line 1
    check-cast p1, Lmi4;

    .line 2
    .line 3
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    const-string v0, "payload_playback"

    .line 10
    .line 11
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const-string v2, "payload_homemusic_selection"

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lni4;->v:Lpk;

    .line 26
    .line 27
    iget-object v1, v1, Lpk;->f:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 34
    .line 35
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, p1, p2}, Lni4;->p(Lmi4;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-interface {p3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    if-eqz p3, :cond_2

    .line 49
    .line 50
    iget-object p3, p1, Lcx3;->a:Landroid/view/View;

    .line 51
    .line 52
    iget-object p1, p1, Lmi4;->u:Ly12;

    .line 53
    .line 54
    iget-object p1, p1, Ly12;->o:Landroid/widget/FrameLayout;

    .line 55
    .line 56
    iget-object p0, p0, Lni4;->B:Lrm3;

    .line 57
    .line 58
    invoke-static {p3, p1, p0, p2}, Ljz4;->k(Landroid/view/View;Landroid/view/ViewGroup;Lrm3;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void

    .line 62
    :cond_3
    invoke-virtual {p0, p1, p2}, Lni4;->g(Lcx3;I)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 24

    .line 1
    const v0, 0x7f0d00a7

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v0, v2, v1}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f0a017a

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    const v1, 0x7f0a017b

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    const v1, 0x7f0a01a9

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    const v1, 0x7f0a01aa

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    move-object v7, v2

    .line 46
    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 47
    .line 48
    if-eqz v7, :cond_0

    .line 49
    .line 50
    const v1, 0x7f0a01b9

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v8, v2

    .line 58
    check-cast v8, Landroid/widget/TextView;

    .line 59
    .line 60
    if-eqz v8, :cond_0

    .line 61
    .line 62
    const v1, 0x7f0a0258

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    move-object v9, v2

    .line 70
    check-cast v9, Landroid/widget/ImageView;

    .line 71
    .line 72
    if-eqz v9, :cond_0

    .line 73
    .line 74
    const v1, 0x7f0a0260

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    move-object v10, v2

    .line 82
    check-cast v10, Landroid/widget/ImageView;

    .line 83
    .line 84
    if-eqz v10, :cond_0

    .line 85
    .line 86
    const v1, 0x7f0a0434

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    move-object v11, v2

    .line 94
    check-cast v11, Landroid/widget/ImageView;

    .line 95
    .line 96
    if-eqz v11, :cond_0

    .line 97
    .line 98
    const v1, 0x7f0a0465

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    move-object v12, v2

    .line 106
    check-cast v12, Landroid/widget/ImageView;

    .line 107
    .line 108
    if-eqz v12, :cond_0

    .line 109
    .line 110
    const v1, 0x7f0a04f8

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    move-object v13, v2

    .line 118
    check-cast v13, Landroid/widget/ImageView;

    .line 119
    .line 120
    if-eqz v13, :cond_0

    .line 121
    .line 122
    const v1, 0x7f0a050b

    .line 123
    .line 124
    .line 125
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    move-object v14, v2

    .line 130
    check-cast v14, Landroid/widget/LinearLayout;

    .line 131
    .line 132
    if-eqz v14, :cond_0

    .line 133
    .line 134
    const v1, 0x7f0a050d

    .line 135
    .line 136
    .line 137
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    move-object v15, v2

    .line 142
    check-cast v15, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 143
    .line 144
    if-eqz v15, :cond_0

    .line 145
    .line 146
    const v1, 0x7f0a0543

    .line 147
    .line 148
    .line 149
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    move-object/from16 v16, v2

    .line 154
    .line 155
    check-cast v16, Landroid/widget/FrameLayout;

    .line 156
    .line 157
    if-eqz v16, :cond_0

    .line 158
    .line 159
    const v1, 0x7f0a0546

    .line 160
    .line 161
    .line 162
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    move-object/from16 v17, v2

    .line 167
    .line 168
    check-cast v17, Landroid/widget/FrameLayout;

    .line 169
    .line 170
    if-eqz v17, :cond_0

    .line 171
    .line 172
    const v1, 0x7f0a0547

    .line 173
    .line 174
    .line 175
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    move-object/from16 v18, v2

    .line 180
    .line 181
    check-cast v18, Landroid/widget/TextView;

    .line 182
    .line 183
    if-eqz v18, :cond_0

    .line 184
    .line 185
    const v1, 0x7f0a0548

    .line 186
    .line 187
    .line 188
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    move-object/from16 v19, v2

    .line 193
    .line 194
    check-cast v19, Landroid/widget/TextView;

    .line 195
    .line 196
    if-eqz v19, :cond_0

    .line 197
    .line 198
    const v1, 0x7f0a0599

    .line 199
    .line 200
    .line 201
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    move-object/from16 v20, v2

    .line 206
    .line 207
    check-cast v20, Landroid/widget/ImageView;

    .line 208
    .line 209
    if-eqz v20, :cond_0

    .line 210
    .line 211
    const v1, 0x7f0a060c

    .line 212
    .line 213
    .line 214
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    move-object/from16 v21, v2

    .line 219
    .line 220
    check-cast v21, Landroid/widget/ImageView;

    .line 221
    .line 222
    if-eqz v21, :cond_0

    .line 223
    .line 224
    const v1, 0x7f0a062a

    .line 225
    .line 226
    .line 227
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    move-object/from16 v22, v2

    .line 232
    .line 233
    check-cast v22, Landroid/widget/TextView;

    .line 234
    .line 235
    if-eqz v22, :cond_0

    .line 236
    .line 237
    const v1, 0x7f0a0643

    .line 238
    .line 239
    .line 240
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    move-object/from16 v23, v2

    .line 245
    .line 246
    check-cast v23, Landroid/widget/ImageView;

    .line 247
    .line 248
    if-eqz v23, :cond_0

    .line 249
    .line 250
    new-instance v2, Ly12;

    .line 251
    .line 252
    move-object v3, v0

    .line 253
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 254
    .line 255
    invoke-direct/range {v2 .. v23}, Ly12;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    .line 256
    .line 257
    .line 258
    new-instance v0, Lmi4;

    .line 259
    .line 260
    move-object/from16 v1, p0

    .line 261
    .line 262
    invoke-direct {v0, v1, v2}, Lmi4;-><init>(Lni4;Ly12;)V

    .line 263
    .line 264
    .line 265
    return-object v0

    .line 266
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    const-string v1, "Missing required view with ID: "

    .line 275
    .line 276
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    const/4 v0, 0x0

    .line 284
    return-object v0
.end method

.method public final n(Lcx3;)V
    .locals 1

    .line 1
    check-cast p1, Lmi4;

    .line 2
    .line 3
    iget-object p0, p1, Lcx3;->a:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p1, p1, Lmi4;->u:Ly12;

    .line 14
    .line 15
    iget-object p1, p1, Ly12;->r:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v0, La04;

    .line 21
    .line 22
    invoke-direct {v0, p1}, La04;-><init>(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lc04;->q(Lwq4;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final p(Lmi4;Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 4

    .line 1
    iget-object p1, p1, Lmi4;->u:Ly12;

    .line 2
    .line 3
    iget-object v0, p0, Lni4;->x:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v1, p0, Lni4;->r:Z

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    iget-object p2, p1, Ly12;->j:Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-virtual {p2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-boolean p0, p0, Lni4;->y:Z

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    iget-object p0, p1, Ly12;->j:Landroid/widget/ImageView;

    .line 31
    .line 32
    const p2, 0x7f080201

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object p0, p1, Ly12;->j:Landroid/widget/ImageView;

    .line 40
    .line 41
    const p2, 0x7f08020a

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 45
    .line 46
    .line 47
    :goto_0
    if-nez v1, :cond_1

    .line 48
    .line 49
    iget-object p0, p1, Ly12;->t:Landroid/widget/TextView;

    .line 50
    .line 51
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    iget-object p0, p1, Ly12;->b:Landroid/view/View;

    .line 56
    .line 57
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    iget-object p0, p1, Ly12;->j:Landroid/widget/ImageView;

    .line 62
    .line 63
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    iget-object p0, p1, Ly12;->t:Landroid/widget/TextView;

    .line 69
    .line 70
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    iget-object p0, p1, Ly12;->b:Landroid/view/View;

    .line 75
    .line 76
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final q(Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    iget-object v2, p0, Lni4;->v:Lpk;

    .line 13
    .line 14
    iget-object v3, v2, Lpk;->f:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ge v1, v3, :cond_2

    .line 21
    .line 22
    iget-object v2, v2, Lpk;->f:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    return-object v0
.end method

.method public final r(Ljava/util/List;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    :goto_0
    iput-object p1, p0, Lni4;->u:Ljava/util/List;

    .line 7
    .line 8
    iget-object p1, p0, Lni4;->C:Lo7;

    .line 9
    .line 10
    iget-object p0, p0, Lni4;->w:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final s(Ljava/lang/String;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lni4;->x:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v1, p0, Lni4;->y:Z

    .line 4
    .line 5
    iget-object v2, p0, Lni4;->z:Ljava/util/List;

    .line 6
    .line 7
    iput-object p1, p0, Lni4;->x:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p2, p0, Lni4;->y:Z

    .line 10
    .line 11
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-ne v1, p2, :cond_1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lni4;->q(Ljava/lang/String;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 27
    .line 28
    :goto_0
    invoke-interface {v2, p2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_1
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lni4;->q(Ljava/lang/String;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 43
    .line 44
    :goto_1
    iput-object p1, p0, Lni4;->z:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    const-string v0, "payload_playback"

    .line 55
    .line 56
    iget-object v1, p0, Lni4;->v:Lpk;

    .line 57
    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    check-cast p2, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-ltz p2, :cond_3

    .line 71
    .line 72
    iget-object v1, v1, Lpk;->f:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-ge p2, v1, :cond_3

    .line 79
    .line 80
    invoke-virtual {p0, p2, v0}, Ldw3;->e(ILjava/lang/Comparable;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    iget-object p1, p0, Lni4;->z:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eqz p2, :cond_6

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    check-cast p2, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-interface {v2, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-nez p2, :cond_5

    .line 111
    .line 112
    if-ltz v3, :cond_5

    .line 113
    .line 114
    iget-object p2, v1, Lpk;->f:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-ge v3, p2, :cond_5

    .line 121
    .line 122
    invoke-virtual {p0, v3, v0}, Ldw3;->e(ILjava/lang/Comparable;)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    :goto_4
    return-void
.end method

.method public final t(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p0, p0, Lni4;->v:Lpk;

    .line 4
    .line 5
    iget-object v1, p0, Lpk;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, -0x1

    .line 15
    sparse-switch v1, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :sswitch_0
    const-string v1, "MEDIA_MOST_RECENTLY_STARRED"

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x2

    .line 29
    goto :goto_0

    .line 30
    :sswitch_1
    const-string v1, "MEDIA_LEAST_RECENTLY_STARRED"

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v2, 0x1

    .line 40
    goto :goto_0

    .line 41
    :sswitch_2
    const-string v1, "MEDIA_BY_TITLE"

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v2, 0x0

    .line 51
    :goto_0
    const/4 p1, 0x5

    .line 52
    packed-switch v2, :pswitch_data_0

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :pswitch_0
    new-instance v1, Lhu3;

    .line 57
    .line 58
    invoke-direct {v1, p1}, Lhu3;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Ljava/util/Comparator;->reverseOrder()Ljava/util/Comparator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, Ljava/util/Comparator;->nullsLast(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {v1, p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_1
    new-instance v1, Lhu3;

    .line 78
    .line 79
    invoke-direct {v1, p1}, Lhu3;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-static {}, Ljava/util/Comparator;->naturalOrder()Ljava/util/Comparator;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p1}, Ljava/util/Comparator;->nullsLast(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {v1, p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :pswitch_2
    new-instance p1, Lhu3;

    .line 99
    .line 100
    const/4 v1, 0x4

    .line 101
    invoke-direct {p1, v1}, Lhu3;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-static {p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 109
    .line 110
    .line 111
    :goto_1
    const/4 p1, 0x0

    .line 112
    invoke-virtual {p0, v0, p1}, Lpk;->b(Ljava/util/List;Ljq3;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    nop

    .line 117
    :sswitch_data_0
    .sparse-switch
        -0x67911195 -> :sswitch_2
        0x42730ed9 -> :sswitch_1
        0x44ceefc9 -> :sswitch_0
    .end sparse-switch

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

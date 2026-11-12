.class public final Lhk3;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Ley;

.field public m0:Laj3;

.field public n0:Lbl2;

.field public o0:Lbj2;

.field public final p0:Landroid/os/Handler;

.field public final q0:Lzd3;

.field public r0:Ljava/util/List;

.field public final s0:Lwd3;

.field public final t0:Lzd3;

.field public final u0:Lzd3;

.field public final v0:Lzd3;

.field public w0:[I

.field public final x0:Lzd3;

.field public final y0:Lzd3;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lhk3;->p0:Landroid/os/Handler;

    .line 14
    .line 15
    sget-object v0, Lu01;->n:Lu01;

    .line 16
    .line 17
    invoke-static {v0}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Lhk3;->q0:Lzd3;

    .line 22
    .line 23
    iput-object v0, p0, Lhk3;->r0:Ljava/util/List;

    .line 24
    .line 25
    new-instance v0, Lwd3;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1}, Lwd3;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lhk3;->s0:Lwd3;

    .line 32
    .line 33
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-static {v0}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iput-object v2, p0, Lhk3;->t0:Lzd3;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static {v2}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iput-object v3, p0, Lhk3;->u0:Lzd3;

    .line 47
    .line 48
    invoke-static {v2}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, p0, Lhk3;->v0:Lzd3;

    .line 53
    .line 54
    new-array v1, v1, [I

    .line 55
    .line 56
    iput-object v1, p0, Lhk3;->w0:[I

    .line 57
    .line 58
    invoke-static {v0}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iput-object v1, p0, Lhk3;->x0:Lzd3;

    .line 63
    .line 64
    invoke-static {v0}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lhk3;->y0:Lzd3;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const p3, 0x7f0d008f

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const p2, 0x7f0a02eb

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    check-cast p3, Landroidx/constraintlayout/widget/Guideline;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz p3, :cond_5

    .line 23
    .line 24
    const p2, 0x7f0a030c

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    move-object v4, p3

    .line 32
    check-cast v4, Landroid/widget/Button;

    .line 33
    .line 34
    if-eqz v4, :cond_5

    .line 35
    .line 36
    const p2, 0x7f0a030d

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    move-object v5, p3

    .line 44
    check-cast v5, Landroid/widget/Button;

    .line 45
    .line 46
    if-eqz v5, :cond_5

    .line 47
    .line 48
    const p2, 0x7f0a030e

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    move-object v6, p3

    .line 56
    check-cast v6, Landroid/widget/Button;

    .line 57
    .line 58
    if-eqz v6, :cond_5

    .line 59
    .line 60
    const p2, 0x7f0a030f

    .line 61
    .line 62
    .line 63
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    move-object v7, p3

    .line 68
    check-cast v7, Landroid/widget/Button;

    .line 69
    .line 70
    if-eqz v7, :cond_5

    .line 71
    .line 72
    const p2, 0x7f0a0310

    .line 73
    .line 74
    .line 75
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    move-object v8, p3

    .line 80
    check-cast v8, Landroid/widget/Button;

    .line 81
    .line 82
    if-eqz v8, :cond_5

    .line 83
    .line 84
    const p2, 0x7f0a0428

    .line 85
    .line 86
    .line 87
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    move-object v9, p3

    .line 92
    check-cast v9, Landroidx/compose/ui/platform/ComposeView;

    .line 93
    .line 94
    if-eqz v9, :cond_5

    .line 95
    .line 96
    const p2, 0x7f0a042b

    .line 97
    .line 98
    .line 99
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    move-object v10, p3

    .line 104
    check-cast v10, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 105
    .line 106
    if-eqz v10, :cond_5

    .line 107
    .line 108
    const p2, 0x7f0a042e

    .line 109
    .line 110
    .line 111
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    move-object v11, p3

    .line 116
    check-cast v11, Landroid/widget/Button;

    .line 117
    .line 118
    if-eqz v11, :cond_5

    .line 119
    .line 120
    const p2, 0x7f0a064f

    .line 121
    .line 122
    .line 123
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    check-cast p3, Landroidx/constraintlayout/widget/Guideline;

    .line 128
    .line 129
    if-eqz p3, :cond_5

    .line 130
    .line 131
    new-instance v2, Ley;

    .line 132
    .line 133
    move-object v3, p1

    .line 134
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 135
    .line 136
    invoke-direct/range {v2 .. v11}, Ley;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroidx/compose/ui/platform/ComposeView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/Button;)V

    .line 137
    .line 138
    .line 139
    iput-object v2, p0, Lhk3;->l0:Ley;

    .line 140
    .line 141
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 150
    .line 151
    .line 152
    move-result-object p3

    .line 153
    invoke-static {p1, p3}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    new-instance v2, Lbq4;

    .line 158
    .line 159
    invoke-direct {v2, p2, p3, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 160
    .line 161
    .line 162
    const-class p1, Laj3;

    .line 163
    .line 164
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    if-eqz p2, :cond_4

    .line 173
    .line 174
    const-string p3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 175
    .line 176
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-virtual {v2, p1, p2}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    check-cast p1, Laj3;

    .line 185
    .line 186
    iput-object p1, p0, Lhk3;->m0:Laj3;

    .line 187
    .line 188
    sget-object p1, Lrv2;->K:Lrv2;

    .line 189
    .line 190
    invoke-virtual {v9, p1}, Lb0;->setViewCompositionStrategy(Ll65;)V

    .line 191
    .line 192
    .line 193
    new-instance p1, Lz;

    .line 194
    .line 195
    const/16 p2, 0x9

    .line 196
    .line 197
    invoke-direct {p1, p2, p0}, Lz;-><init>(ILjava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    new-instance p2, Lr70;

    .line 201
    .line 202
    const p3, 0x5f9d51ef

    .line 203
    .line 204
    .line 205
    const/4 v2, 0x1

    .line 206
    invoke-direct {p2, p3, v2, p1}, Lr70;-><init>(IZLsf1;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v9, p2}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lwf1;)V

    .line 210
    .line 211
    .line 212
    iget-object p1, p0, Lhk3;->l0:Ley;

    .line 213
    .line 214
    const/4 p2, 0x3

    .line 215
    if-eqz p1, :cond_0

    .line 216
    .line 217
    iget-object p3, p1, Ley;->g:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast p3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 220
    .line 221
    new-instance v4, Lfk3;

    .line 222
    .line 223
    const/4 v5, 0x2

    .line 224
    invoke-direct {v4, p0, v5}, Lfk3;-><init>(Lhk3;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 228
    .line 229
    .line 230
    iget-object p1, p1, Ley;->h:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p1, Landroid/widget/Button;

    .line 233
    .line 234
    new-instance p3, Lfk3;

    .line 235
    .line 236
    invoke-direct {p3, p0, p2}, Lfk3;-><init>(Lhk3;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 240
    .line 241
    .line 242
    :cond_0
    iget-object p1, p0, Lhk3;->m0:Laj3;

    .line 243
    .line 244
    const-string p3, "playerBottomSheetViewModel"

    .line 245
    .line 246
    if-eqz p1, :cond_3

    .line 247
    .line 248
    iget-object p1, p1, Laj3;->n:Lk03;

    .line 249
    .line 250
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    new-instance v5, Ldk3;

    .line 255
    .line 256
    invoke-direct {v5, p0, p2}, Ldk3;-><init>(Lhk3;I)V

    .line 257
    .line 258
    .line 259
    new-instance p2, Lht1;

    .line 260
    .line 261
    invoke-direct {p2, v5, v2}, Lht1;-><init>(Lif1;I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1, v4, p2}, Lad2;->e(Lba2;La83;)V

    .line 265
    .line 266
    .line 267
    iget-object p1, p0, Lhk3;->m0:Laj3;

    .line 268
    .line 269
    if-eqz p1, :cond_2

    .line 270
    .line 271
    iget-object p1, p1, Laj3;->f:Lvs3;

    .line 272
    .line 273
    iget-object p1, p1, Lvs3;->a:Lns3;

    .line 274
    .line 275
    iget-object p2, p1, Lns3;->o:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast p2, Ls24;

    .line 278
    .line 279
    invoke-virtual {p2}, Ls24;->i()Ls12;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    const-string v4, "queue"

    .line 284
    .line 285
    filled-new-array {v4}, [Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    new-instance v5, Lks3;

    .line 290
    .line 291
    invoke-direct {v5, p1, v2}, Lks3;-><init>(Lns3;I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p2, v4, v5}, Ls12;->a([Ljava/lang/String;Lif1;)Lt24;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 299
    .line 300
    .line 301
    move-result-object p2

    .line 302
    new-instance v4, Ldk3;

    .line 303
    .line 304
    const/4 v5, 0x4

    .line 305
    invoke-direct {v4, p0, v5}, Ldk3;-><init>(Lhk3;I)V

    .line 306
    .line 307
    .line 308
    new-instance v5, Lht1;

    .line 309
    .line 310
    invoke-direct {v5, v4, v2}, Lht1;-><init>(Lif1;I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1, p2, v5}, Lad2;->e(Lba2;La83;)V

    .line 314
    .line 315
    .line 316
    sget-object p1, Lis3;->e:Lk03;

    .line 317
    .line 318
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 319
    .line 320
    .line 321
    move-result-object p2

    .line 322
    new-instance v4, Ldk3;

    .line 323
    .line 324
    const/4 v5, 0x5

    .line 325
    invoke-direct {v4, p0, v5}, Ldk3;-><init>(Lhk3;I)V

    .line 326
    .line 327
    .line 328
    new-instance v5, Lht1;

    .line 329
    .line 330
    invoke-direct {v5, v4, v2}, Lht1;-><init>(Lif1;I)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p1, p2, v5}, Lad2;->e(Lba2;La83;)V

    .line 334
    .line 335
    .line 336
    sget-object p1, Lu52;->c:Lk03;

    .line 337
    .line 338
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 339
    .line 340
    .line 341
    move-result-object p2

    .line 342
    new-instance v4, Ldk3;

    .line 343
    .line 344
    const/4 v5, 0x6

    .line 345
    invoke-direct {v4, p0, v5}, Ldk3;-><init>(Lhk3;I)V

    .line 346
    .line 347
    .line 348
    new-instance v5, Lht1;

    .line 349
    .line 350
    invoke-direct {v5, v4, v2}, Lht1;-><init>(Lif1;I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {p1, p2, v5}, Lad2;->e(Lba2;La83;)V

    .line 354
    .line 355
    .line 356
    sget-object p1, Lu52;->b:Lk03;

    .line 357
    .line 358
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 359
    .line 360
    .line 361
    move-result-object p2

    .line 362
    new-instance v4, Ldk3;

    .line 363
    .line 364
    const/4 v5, 0x7

    .line 365
    invoke-direct {v4, p0, v5}, Ldk3;-><init>(Lhk3;I)V

    .line 366
    .line 367
    .line 368
    new-instance v5, Lht1;

    .line 369
    .line 370
    invoke-direct {v5, v4, v2}, Lht1;-><init>(Lif1;I)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p1, p2, v5}, Lad2;->e(Lba2;La83;)V

    .line 374
    .line 375
    .line 376
    iget-object p1, p0, Lhk3;->m0:Laj3;

    .line 377
    .line 378
    if-eqz p1, :cond_1

    .line 379
    .line 380
    iget-object p1, p1, Laj3;->n:Lk03;

    .line 381
    .line 382
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    new-instance p3, Ldk3;

    .line 387
    .line 388
    invoke-direct {p3, p0, v0}, Ldk3;-><init>(Lhk3;I)V

    .line 389
    .line 390
    .line 391
    new-instance p0, Lht1;

    .line 392
    .line 393
    invoke-direct {p0, p3, v2}, Lht1;-><init>(Lif1;I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p1, p2, p0}, Lad2;->e(Lba2;La83;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    return-object v3

    .line 403
    :cond_1
    invoke-static {p3}, Lh12;->Q(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    throw v1

    .line 407
    :cond_2
    invoke-static {p3}, Lh12;->Q(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v1

    .line 411
    :cond_3
    invoke-static {p3}, Lh12;->Q(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw v1

    .line 415
    :cond_4
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 416
    .line 417
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    return-object v1

    .line 421
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 422
    .line 423
    .line 424
    move-result-object p0

    .line 425
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    const-string p1, "Missing required view with ID: "

    .line 430
    .line 431
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    return-object v1
.end method

.method public final J()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lhk3;->p0:Landroid/os/Handler;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lhk3;->l0:Ley;

    .line 11
    .line 12
    return-void
.end method

.method public final R()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    new-instance v3, Lcb4;

    .line 9
    .line 10
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Landroid/content/ComponentName;

    .line 15
    .line 16
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

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
    invoke-direct {v3, v0, v1}, Lcb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 26
    .line 27
    .line 28
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 29
    .line 30
    new-instance v5, Laj2;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lf35;->x()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    new-instance v7, Lbl2;

    .line 40
    .line 41
    invoke-direct {v7, v6}, Lbl2;-><init>(Landroid/os/Looper;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v3, Lcb4;->a:Lbb4;

    .line 45
    .line 46
    invoke-interface {v0}, Lbb4;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    new-instance v0, Lxc5;

    .line 53
    .line 54
    new-instance v1, Lx7;

    .line 55
    .line 56
    invoke-direct {v1, v2}, Lx7;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    new-instance v8, Lfi0;

    .line 60
    .line 61
    invoke-direct {v8, v1}, Lfi0;-><init>(Lx7;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    invoke-direct {v0, v1, v8}, Lxc5;-><init>(ILjava/lang/Object;)V

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
    new-instance v1, Lbj2;

    .line 73
    .line 74
    invoke-direct/range {v1 .. v8}, Lsk2;-><init>(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Lqk2;Landroid/os/Looper;Lbl2;Lxc5;)V

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
    invoke-static {v7, v1, v0}, Lb11;->w(Lbl2;Lbj2;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    iput-object v7, p0, Lhk3;->n0:Lbl2;

    .line 86
    .line 87
    new-instance v0, Lur2;

    .line 88
    .line 89
    const/16 v1, 0x9

    .line 90
    .line 91
    invoke-direct {v0, v1, v7, p0}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object v1, Lgq0;->n:Lgq0;

    .line 95
    .line 96
    invoke-virtual {v7, v0, v1}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 97
    .line 98
    .line 99
    const/4 v0, 0x0

    .line 100
    invoke-virtual {p0, v0}, Lhk3;->l0(Z)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lhk3;->n0:Lbl2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lsk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lhk3;->n0:Lbl2;

    .line 10
    .line 11
    iput-object v0, p0, Lhk3;->o0:Lbj2;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 15
    .line 16
    return-void
.end method

.method public final h0()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lhk3;->q0:Lzd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final i0(Lbj2;)V
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {}, Lu52;->c()Lv52;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-boolean v2, v2, Lv52;->a:Z

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {v1}, Lis3;->d(Lqi3;)[I

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iput-object v2, v0, Lhk3;->w0:[I

    .line 19
    .line 20
    new-instance v3, Ljava/util/ArrayList;

    .line 21
    .line 22
    array-length v4, v2

    .line 23
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    array-length v4, v2

    .line 27
    const/4 v5, 0x0

    .line 28
    move v6, v5

    .line 29
    :goto_0
    if-ge v6, v4, :cond_2

    .line 30
    .line 31
    aget v7, v2, v6

    .line 32
    .line 33
    invoke-virtual {v1, v7}, Lsk2;->Y(I)Lgn2;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-static {v8}, Lgi1;->N(Lgn2;)Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    if-nez v8, :cond_1

    .line 42
    .line 43
    new-instance v9, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 44
    .line 45
    invoke-virtual {v1, v7}, Lsk2;->Y(I)Lgn2;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    iget-object v10, v7, Lgn2;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const/16 v46, 0x7

    .line 55
    .line 56
    const/16 v47, 0x0

    .line 57
    .line 58
    const/4 v11, 0x0

    .line 59
    const/4 v12, 0x0

    .line 60
    const/4 v13, 0x0

    .line 61
    const/4 v14, 0x0

    .line 62
    const/4 v15, 0x0

    .line 63
    const/16 v16, 0x0

    .line 64
    .line 65
    const/16 v17, 0x0

    .line 66
    .line 67
    const/16 v18, 0x0

    .line 68
    .line 69
    const/16 v19, 0x0

    .line 70
    .line 71
    const/16 v20, 0x0

    .line 72
    .line 73
    const/16 v21, 0x0

    .line 74
    .line 75
    const/16 v22, 0x0

    .line 76
    .line 77
    const/16 v23, 0x0

    .line 78
    .line 79
    const/16 v24, 0x0

    .line 80
    .line 81
    const/16 v25, 0x0

    .line 82
    .line 83
    const/16 v26, 0x0

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/16 v28, 0x0

    .line 88
    .line 89
    const/16 v29, 0x0

    .line 90
    .line 91
    const/16 v30, 0x0

    .line 92
    .line 93
    const/16 v31, 0x0

    .line 94
    .line 95
    const/16 v32, 0x0

    .line 96
    .line 97
    const/16 v33, 0x0

    .line 98
    .line 99
    const/16 v34, 0x0

    .line 100
    .line 101
    const/16 v35, 0x0

    .line 102
    .line 103
    const/16 v36, 0x0

    .line 104
    .line 105
    const/16 v37, 0x0

    .line 106
    .line 107
    const/16 v38, 0x0

    .line 108
    .line 109
    const/16 v39, 0x0

    .line 110
    .line 111
    const/16 v40, 0x0

    .line 112
    .line 113
    const/16 v41, 0x0

    .line 114
    .line 115
    const/16 v42, 0x0

    .line 116
    .line 117
    const/16 v43, 0x0

    .line 118
    .line 119
    const/16 v44, 0x0

    .line 120
    .line 121
    const/16 v45, -0x2

    .line 122
    .line 123
    invoke-direct/range {v9 .. v47}, Lcom/eddyizm/tempus/subsonic/models/Child;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;Ljava/lang/String;IILxj0;)V

    .line 124
    .line 125
    .line 126
    move-object v8, v9

    .line 127
    :cond_1
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    add-int/lit8 v6, v6, 0x1

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    iget-object v4, v0, Lhk3;->q0:Lzd3;

    .line 134
    .line 135
    invoke-virtual {v4, v3}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Lsk2;->o0()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    invoke-static {v2, v3}, Lti;->l0([II)I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-gez v2, :cond_3

    .line 147
    .line 148
    move v2, v5

    .line 149
    :cond_3
    invoke-virtual {v0, v2}, Lhk3;->k0(I)V

    .line 150
    .line 151
    .line 152
    iget-object v2, v0, Lhk3;->t0:Lzd3;

    .line 153
    .line 154
    invoke-virtual {v2}, Lzd3;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_7

    .line 165
    .line 166
    invoke-virtual {v1}, Lsk2;->a()Lgn2;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    if-nez v2, :cond_4

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_4
    invoke-static {v1}, Lcom/eddyizm/tempus/homemusic/b;->h(Lqi3;)Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    const/4 v4, 0x1

    .line 178
    if-eqz v3, :cond_5

    .line 179
    .line 180
    invoke-static {v1}, Lis3;->e(Lqi3;)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-nez v1, :cond_7

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_5
    invoke-static {v1}, Lcom/eddyizm/tempus/homemusic/a;->j(Lqi3;)Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-eqz v3, :cond_6

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_6
    invoke-static {v1}, Lis3;->e(Lqi3;)I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-nez v3, :cond_7

    .line 199
    .line 200
    const-string v3, "continuous_play"

    .line 201
    .line 202
    invoke-static {v3, v4}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    invoke-virtual {v1}, Lsk2;->h()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    invoke-static {v2}, Lis3;->c(Lgn2;)Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v3, :cond_7

    .line 215
    .line 216
    if-eqz v2, :cond_7

    .line 217
    .line 218
    if-nez v1, :cond_7

    .line 219
    .line 220
    sget-boolean v1, Lis3;->d:Z

    .line 221
    .line 222
    if-nez v1, :cond_7

    .line 223
    .line 224
    :goto_1
    move v5, v4

    .line 225
    :cond_7
    :goto_2
    iget-object v0, v0, Lhk3;->x0:Lzd3;

    .line 226
    .line 227
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v0, v1}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    return-void
.end method

.method public final j0()V
    .locals 3

    .line 1
    invoke-static {}, Lu52;->c()Lv52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lhk3;->t0:Lzd3;

    .line 6
    .line 7
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lu52;->k()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-static {}, Lu52;->l()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget v1, v0, Lv52;->p:I

    .line 24
    .line 25
    if-lez v1, :cond_1

    .line 26
    .line 27
    invoke-static {}, Lu52;->d()Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sget-object v1, Lu01;->n:Lu01;

    .line 37
    .line 38
    :goto_0
    iget-object v2, p0, Lhk3;->q0:Lzd3;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lu52;->k()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/4 v2, 0x0

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    iget v0, v0, Lv52;->o:I

    .line 51
    .line 52
    if-gez v0, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v2, v0

    .line 56
    :cond_3
    :goto_1
    invoke-virtual {p0, v2}, Lhk3;->k0(I)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final k0(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lhk3;->s0:Lwd3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lwd3;->h(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l0(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lhk3;->l0:Ley;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    iget-object v1, v0, Ley;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 10
    .line 11
    new-instance v2, Landroid/transition/Fade;

    .line 12
    .line 13
    invoke-direct {v2}, Landroid/transition/Fade;-><init>()V

    .line 14
    .line 15
    .line 16
    const-wide/16 v3, 0xc8

    .line 17
    .line 18
    invoke-virtual {v2, v3, v4}, Landroid/transition/Transition;->setDuration(J)Landroid/transition/Transition;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v1}, Landroid/transition/Transition;->addTarget(Landroid/view/View;)Landroid/transition/Transition;

    .line 22
    .line 23
    .line 24
    iget-object v3, v0, Ley;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 27
    .line 28
    invoke-static {v3, v2}, Landroid/transition/TransitionManager;->beginDelayedTransition(Landroid/view/ViewGroup;Landroid/transition/Transition;)V

    .line 29
    .line 30
    .line 31
    const/16 v2, 0x8

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    move v4, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v4, v2

    .line 39
    :goto_0
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v0, Ley;->h:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Landroid/widget/Button;

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    move v4, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v4, v3

    .line 51
    :goto_1
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v0, Ley;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Landroid/widget/Button;

    .line 57
    .line 58
    invoke-static {}, Lud3;->Y()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    move v4, v3

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move v4, v2

    .line 67
    :goto_2
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object v0, v0, Ley;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Landroid/widget/Button;

    .line 73
    .line 74
    invoke-static {}, Lud3;->Y()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move v2, v3

    .line 82
    :goto_3
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    if-nez p1, :cond_5

    .line 86
    .line 87
    iget-object p1, p0, Lhk3;->l0:Ley;

    .line 88
    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    iget-object p1, p1, Ley;->h:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, Landroid/widget/Button;

    .line 94
    .line 95
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 96
    .line 97
    .line 98
    const/4 p1, 0x0

    .line 99
    iget-object v0, p0, Lhk3;->p0:Landroid/os/Handler;

    .line 100
    .line 101
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance p1, Lqa1;

    .line 105
    .line 106
    const/16 v1, 0x1c

    .line 107
    .line 108
    invoke-direct {p1, v1, p0}, Lqa1;-><init>(ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    const-wide/16 v1, 0x2710

    .line 112
    .line 113
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 114
    .line 115
    .line 116
    :cond_5
    :goto_4
    return-void
.end method

.method public final m0(Ldo2;I)V
    .locals 4

    .line 1
    invoke-static {}, Lu52;->c()Lv52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lv52;->a:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p1, Ldo2;->I:Landroid/os/Bundle;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-string v2, "type"

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v3, "radio"

    .line 22
    .line 23
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v2, v1

    .line 32
    :goto_0
    iget-object v3, p0, Lhk3;->t0:Lzd3;

    .line 33
    .line 34
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v3, v2}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, Ldo2;->m:Landroid/net/Uri;

    .line 42
    .line 43
    iget-object v2, p0, Lhk3;->u0:Lzd3;

    .line 44
    .line 45
    invoke-virtual {v2, p1}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    const-string v2, "coverArtId"

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move-object v2, p1

    .line 59
    :goto_1
    iget-object v3, p0, Lhk3;->v0:Lzd3;

    .line 60
    .line 61
    invoke-virtual {v3, v2}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Lhk3;->o0:Lbj2;

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-virtual {v2}, Lsk2;->Q0()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-lez v3, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0, v2}, Lhk3;->i0(Lbj2;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    iget-object v2, p0, Lhk3;->o0:Lbj2;

    .line 79
    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    invoke-virtual {v2}, Lsk2;->a()Lgn2;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    iget-object v2, v2, Lgn2;->a:Ljava/lang/String;

    .line 89
    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object p1, v2

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    :goto_2
    if-eqz v0, :cond_6

    .line 96
    .line 97
    const-string p1, "id"

    .line 98
    .line 99
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :cond_6
    :goto_3
    if-eqz p1, :cond_9

    .line 104
    .line 105
    invoke-virtual {p0}, Lhk3;->h0()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_9

    .line 114
    .line 115
    invoke-virtual {p0}, Lhk3;->h0()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    move v2, v1

    .line 124
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_8

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 135
    .line 136
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-static {v3, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-eqz v3, :cond_7

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_8
    const/4 v2, -0x1

    .line 151
    :goto_5
    if-ltz v2, :cond_9

    .line 152
    .line 153
    invoke-virtual {p0, v2}, Lhk3;->k0(I)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_9
    if-gez p2, :cond_a

    .line 158
    .line 159
    move p2, v1

    .line 160
    :cond_a
    invoke-virtual {p0, p2}, Lhk3;->k0(I)V

    .line 161
    .line 162
    .line 163
    return-void
.end method
